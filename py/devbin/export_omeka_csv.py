import unicodecsv as csv
from costume.etl.omeka.omeka_loader import OmekaLoader


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
        self._load_collections(collection_dicts=self._read_collection_dicts(), skip_private=False)

    def _load_collection(self, collection_dict):
        omeka_collection_id = collection_dict['id']

        item_dicts = self._read_item_dicts(collection_dict=collection_dict)

        for item_dict in item_dicts:
            omeka_item_id = item_dict['id']

            csv_row = {'Collection ID': [str(omeka_collection_id)], 'Item ID': [str(omeka_item_id)], 'Tags': []}
            for element_text_dict in item_dict['element_texts']:
                element_set_name = element_text_dict['element_set']['name']
                element_name = element_text_dict['element']['name']
                text = element_text_dict['text']

                csv_column_header = element_set_name + ': ' + element_name
                self.__csv_column_headers.setdefault(csv_column_header, None)
                csv_row.setdefault(csv_column_header, []).append(text)

            for tag_dict in item_dict.get('tags', []):
                csv_row['Tags'].append(tag_dict['name'])

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