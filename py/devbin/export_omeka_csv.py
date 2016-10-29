import unicodecsv as csv
from dressdiscover.cli.omeka.omeka_loader import OmekaLoader


class OmekaCsvExporter(OmekaLoader):
    def __init__(self, o, **kwds):
        OmekaLoader.__init__(
            self,
            endpoint_url='http://example.com',
            institution_title=kwds['institution_id'],
            institution_url='http://example.com',
            **kwds
        )
        self.__output_file_path = o

    @classmethod
    def _add_institution_arguments(cls, argument_parser):
        argument_parser.add_argument('--institution-id', required=True)
        argument_parser.add_argument('-o', required=True)

    def _load_institution(self):
        self._load_collections(omeka_collections=self._read_omeka_collections(), skip_private=False)

    def _load_collection(self, omeka_collection):
        omeka_items = self._read_omeka_items(omeka_collection=omeka_collection)

        for omeka_item in omeka_items:
            csv_row = {'Collection ID': [str(omeka_collection.id)], 'Item ID': [str(omeka_item.id)], 'Tags': []}
            for element_text in omeka_item.element_texts:
                csv_column_header = element_text.element_set.name + ': ' + element_text.element.name
                self.__csv_column_headers.setdefault(csv_column_header, None)
                csv_row.setdefault(csv_column_header, []).append(element_text.text)

            for omeka_tag in omeka_item.tags:
                csv_row['Tags'].append(omeka_tag.name)

            self.__csv_rows.append(csv_row)

    def _run(self, **kwds):
        self.__csv_rows = []
        self.__csv_column_headers = {}
        OmekaLoader._run(self, **kwds)
        sorted_csv_column_headers = ['Collection ID', 'Item ID', 'Tags'] + list(sorted(self.__csv_column_headers.keys()))
        with open(self.__output_file_path, 'w+b') as csv_file:
            csv_writer = csv.writer(csv_file)
            csv_writer.writerow(sorted_csv_column_headers)
            for csv_row in self.__csv_rows:
                out_csv_row = []
                for csv_column_header in sorted_csv_column_headers:
                    value = csv_row.get(csv_column_header)
                    if value is None or len(value) == 0:
                        out_csv_row.append('')
                        continue
                    value = '|'.join(value)
                    out_csv_row.append(value)
                csv_writer.writerow(out_csv_row)


OmekaCsvExporter.main()