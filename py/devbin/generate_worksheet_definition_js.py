from definitions import definitions
import json
import os.path

assert __name__ == '__main__'
with open(os.path.join(os.path.dirname(__file__), '..', 'assets', 'js', 'definitions.json'), 'w+b') as f:
    f.write(json.dumps(definitions, indent=4) + "\n")
