from os.path import os
import urllib2
from xml.dom.minidom import parseString

from dressdiscover.cli.extractors._extractor import _Extractor


class _OaiPmhExtractor(_Extractor):
    def __init__(self, endpoint_url, institution_id, metadata_prefix, set_=None, **kwds):
        _Extractor.__init__(self, **kwds)
        self.__clean = False
        self.__endpoint_url = endpoint_url
        self.__institution_id = institution_id
        self.__metadata_prefix = metadata_prefix
        self.__set = set_

    def _clean(self):
        self.__clean = True

    def _extract(self):
        records_dir_path = os.path.join(self._data_dir_path, 'extracted', self.__institution_id, 'record')
        if not os.path.isdir(records_dir_path):
            os.makedirs(records_dir_path)

        base_url = self.__endpoint_url + '?verb=ListRecords'

        record_count = 0
        resumption_token = None
        while True:
            if resumption_token is not None:
                url = base_url + '&resumptionToken=' + resumption_token
            else:
                url = base_url + '&metadataPrefix=' + self.__metadata_prefix
                if self.__set is not None:
                    url = url + '&set=' + self.__set
            self._logger.debug("reading URL %s", url)
            url_f = urllib2.urlopen(url)
            try:
                xml_str = url_f.read()
            finally:
                url_f.close()
            self._logger.debug("read XML from URL %s: \n%s", url, xml_str)
            dom = parseString(xml_str)
            ListRecords_elements = dom.documentElement.getElementsByTagName('ListRecords')
            if len(ListRecords_elements) == 0:
                self._logger.error("no ListRecords element in XML: \n%s", xml_str)
                return
            ListRecords_element = ListRecords_elements[0]
            for record_element in ListRecords_element.getElementsByTagName('record'):
                record_identifier = record_element.getElementsByTagName('header')[0].getElementsByTagName('identifier')[0].childNodes[0].data
                safe_record_identifier = record_identifier.replace('/', '_').replace(':', '_')
                record_file_path = os.path.join(records_dir_path, safe_record_identifier + '.xml')
                if self.__clean or not os.path.isfile(record_file_path):
                    with open(record_file_path, 'w+b') as f:
                        f.write(record_element.toxml().encode('utf-8', 'ignore'))
                    self._logger.debug("wrote record %s to %s", record_identifier, record_file_path)
                else:
                    self._logger.debug("skipping record %s", record_identifier)
                record_count = record_count + 1
                if record_count % 50 == 0:
                    self._logger.info("read %d records", record_count)
            resumption_token = None
            for resumption_token_element in ListRecords_element.getElementsByTagName('resumptionToken'):
                resumption_token = resumption_token_element.childNodes[0].data
                break
            if resumption_token is None:
                break
