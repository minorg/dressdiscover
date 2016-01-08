import csv
import os.path

from costume.etl.costume_core_controlled_vocabularies import COSTUME_CORE_CONTROLLED_VOCABULARIES


DATA_DIR_PATH = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..', 'data', 'wizard'))
assert os.path.isdir(DATA_DIR_PATH), DATA_DIR_PATH


csv_rows = []
csv_rows.append(['Feature name', 'Feature value', 'Image file name', 'Credit line', 'License', 'Image URL', 'Metadata URL'])
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
        feature_value_file_name = feature_value.replace('/', 'X')
        images_dir_path = os.path.join(DATA_DIR_PATH, 'images', feature_name, feature_value_file_name)
        if not os.path.isdir(images_dir_path):
            os.makedirs(images_dir_path)
        with open(os.path.join(images_dir_path, 'README.txt'), 'w+b') as f:
            f.write("Images for %(feature_name)s = %(feature_value)s\n\n" % locals())
        csv_row.append('') # Image file name
        csv_rows.append(csv_row)

    csv_rows.append([''] * len(csv_rows[0]))

with open(os.path.join(DATA_DIR_PATH, 'features_template.csv'), 'w+b') as f:
    writer = csv.writer(f)
    for csv_row in csv_rows:
        writer.writerow(csv_row)
