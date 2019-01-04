import argparse
import base64
import csv
import os.path
import pathvalidate
import sys
from urllib.parse import urlparse
from urllib.request import unquote, urlopen


argument_parser = argparse.ArgumentParser()
argument_parser.add_argument("in_csv_file", help="CSV file with URLs in the first column")
args = argument_parser.parse_args()


ROOT_DIR_PATH = os.path.abspath(os.path.join(os.path.dirname(__file__), "..", ".."))
IMAGE_DIR_PATH = os.path.join(ROOT_DIR_PATH, "ts", "worksheet", "wwwroot", "img")
UNSORTED_IMAGES_DIR_PATH = os.path.join(IMAGE_DIR_PATH, "unsorted_full_size")
if not os.path.isdir(UNSORTED_IMAGES_DIR_PATH):
    os.mkdir(UNSORTED_IMAGES_DIR_PATH)


csv_writer = csv.writer(sys.stdout)
csv_writer.writerow(("URL", "FilePath"))
with open(args.in_csv_file) as in_csv_file:
    csv_reader = csv.reader(in_csv_file)
    for row_i, row in enumerate(csv_reader):
        if row_i == 0:
            continue
        elif not row:
            continue
        url = row[0].strip()
        if not url:
            continue

        parsed_url = urlparse(url)
        url_file_name = unquote(parsed_url.path.split('/')[-1]).encode("ascii", "replace").decode("ascii")
        image_file_name = pathvalidate.sanitize_filename(url_file_name)
        image_file_stem, image_file_ext = os.path.splitext(image_file_name)
        image_file_name = pathvalidate.replace_symbol(image_file_stem, '_') + image_file_ext
        image_file_path = os.path.join(UNSORTED_IMAGES_DIR_PATH, image_file_name)
        if os.path.isfile(image_file_path):
            csv_writer.writerow((url, image_file_path))
            continue

        url_obj = urlopen(url)
        try:
            url_contents = url_obj.read()
        finally:
            url_obj.close()

        with open(image_file_path, "w+b") as image_file:
            image_file.write(url_contents)
        csv_writer.writerow((url, image_file_path))
