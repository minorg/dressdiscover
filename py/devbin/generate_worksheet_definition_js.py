from worksheet_definition import WORKSHEET_DEFINITION
import json
import os.path
from thryft.protocol.builtins_output_protocol import BuiltinsOutputProtocol


assert __name__ == '__main__'
with open(os.path.join(os.path.dirname(__file__), '..', '..', 'ts', 'assets', 'js', 'worksheet_definition.js'), 'w+b') as f:
    oprot = BuiltinsOutputProtocol()
    WORKSHEET_DEFINITION.write(oprot)
    f.write('var WORKSHEET_DEFINITION = ' + json.dumps(oprot.value, indent=4) + "\n")
