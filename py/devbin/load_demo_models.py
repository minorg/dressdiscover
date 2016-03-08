from costume.etl.historic_dress.historic_dress_omeka_loader import HistoricDressOmekaLoader
from costume.etl.txfc.txfc_loader import TxfcLoader
from costume.etl.vccc.vccc_omeka_loader import VcccOmekaLoader
from costume.etl.wizard.wizard_loader import WizardLoader


HistoricDressOmekaLoader.main()
TxfcLoader.main()
VcccOmekaLoader.main()
WizardLoader.main()
