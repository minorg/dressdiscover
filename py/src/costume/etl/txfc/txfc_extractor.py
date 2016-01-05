import os.path
import urllib2
from xml.dom.minidom import parseString

from costume.etl._extractor import _Extractor


class TxfcExtractor(_Extractor):
    def _extract(self):
        records_dir_path = os.path.join(self._data_dir_path, 'extracted', 'txfc', 'record')
        if not os.path.isdir(records_dir_path):
            os.makedirs(records_dir_path)

        url = 'http://digital.library.unt.edu/explore/collections/TXFC/oai/?verb=ListRecords'

        resumption_token = None
        while True:
            if resumption_token is not None:
                url = url + '&resumptionToken=' + resumption_token
            else:
                url = url + '&metadataPrefix=untl'
            url_f = urllib2.urlopen(url)
            try:
                xml = url_f.read()
            finally:
                url_f.close()
            xml = parseString(xml)
            ListRecords_element = xml.documentElement.getElementsByTagName('ListRecords')[0]
            for record_element in ListRecords_element.getElementsByTagName('record'):
                record_identifier = record_element.getElementsByTagName('header')[0].getElementsByTagName('identifier')[0].childNodes[0].data
                safe_record_identifier = record_identifier.replace('/', '_').replace(':', '_')
                record_file_path = os.path.join(records_dir_path, safe_record_identifier)
                if os.path.isfile(record_file_path):
                    print 'skipping', record_identifier
                    continue
                with open(record_file_path, 'w+b') as f:
                    f.write(record_element.toxml().encode('utf-8', 'ignore'))
                print 'wrote', record_identifier
            resumption_token = None
            for resumption_token_element in ListRecords_element.getElementsByTagName('resumptionToken'):
                resumption_token = resumption_token_element.childNodes[0].data
                break
            if resumption_token is None:
                break
