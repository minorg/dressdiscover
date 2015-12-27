import csv
import os.path
from pprint import pformat


CSV_FILE_NAME = 'Costume Core Controlled Vocabularies - 2nd draft, Jan 2013.csv'
CSV_FILE_PATH = os.path.join(os.path.dirname(__file__), '..', '..', 'devdata', CSV_FILE_NAME)
assert os.path.exists(CSV_FILE_PATH), CSV_FILE_PATH
OUT_FILE_PATH = os.path.join(os.path.dirname(__file__), '..', 'src', 'costume', 'etl', 'costume_core_controlled_vocabularies.py')


out = {}
header_row = {}
with open(CSV_FILE_PATH, 'rb') as f:
    for row_i, row in enumerate(csv.reader(f)):
        for column_i, column in enumerate(row):
            if column_i == 0:
                continue
            column = column.strip()
            if len(column) == 0:
                continue

            if row_i == 0:
                header_row[column_i] = column
                out[column] = {}
                continue
            elif row_i == 1:
                # Description of the column
                continue
            elif row_i == 2:
                # Source of the vocabulary
                continue

            out[header_row[column_i]][column] = None


with open(OUT_FILE_PATH, 'w+b') as f:
    f.write(pformat(out))
