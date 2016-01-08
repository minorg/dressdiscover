import csv
import os.path

from costume.etl.costume_core_controlled_vocabularies import COSTUME_CORE_CONTROLLED_VOCABULARIES


DATA_DIR_PATH = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', 'data', 'wizard'))
assert os.path.isdir(DATA_DIR_PATH), DATA_DIR_PATH


csv_rows = []
csv_rows.append(['Feature name', 'Feature value', 'Credit line', 'License', 'Image URL', 'Metadata URL'])
for feature_name in sorted(COSTUME_CORE_CONTROLLED_VOCABULARIES.iterkeys()):
    if feature_name in (
        'Age',
        'Condition Term',
        'Function',
        'Gender',
        'Main Color',
        'Record Type',
        'Secondary Color',
        'Socio-Economic Class',
    ):
        continue

    feature_values = COSTUME_CORE_CONTROLLED_VOCABULARIES[feature_name].keys()

    for feature_value in sorted(feature_values):
        csv_row = [feature_name, feature_value]
        csv_rows.append(csv_row)

    csv_rows.append([''] * len(csv_rows[0]))

with open(os.path.join(DATA_DIR_PATH, 'features_template.csv'), 'w+b') as f:
    writer = csv.writer(f)
    for csv_row in csv_rows:
        writer.writerow(csv_row)
