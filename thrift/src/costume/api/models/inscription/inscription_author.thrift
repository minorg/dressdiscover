namespace bean_java net.lab1318.costume.gui.models.inscription
namespace java net.lab1318.costume.api.models.inscription
namespace * costume.api.models.inscription

include "costume/api/models/refid.thrift"
include "costume/api/models/vocab.thrift"

struct InscriptionAuthor {
	// @validation {"minLength": 1}
	1: string text;

	2: optional refid.Refid refid;
	3: optional vocab.Vocab vocab;
}
