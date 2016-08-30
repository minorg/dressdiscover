assert __name__ == '__main__'
import csv
from os.path import os

from sklearn.feature_extraction.text import CountVectorizer
import numpy

my_dir_path = os.path.abspath(os.path.dirname(__file__))
csv_file_path = os.path.join(my_dir_path, '..', '..', 'devdata', 'dig-cost-coll.csv')



descriptions = []
with open(csv_file_path, 'rb') as csv_file:
    for csv_row in csv.DictReader(csv_file):
        if len(csv_row['Description']) > 0:
            descriptions.append(csv_row['Description'])

# CountVectorizer takes a list of strings, tokenizes each string into words, removes stopwords,
# and counts the words
count_vectorizer = CountVectorizer(min_df=0,
                         stop_words="english", max_features=200)
count_vectorizer.fit_transform(descriptions)
words = numpy.array(count_vectorizer.get_feature_names())
print 'Top words:'
print "\n".join(words)
