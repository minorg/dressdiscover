from dressdiscover.etl.historic_dress.historic_dress_omeka_loader import HistoricDressOmekaLoader
from dressdiscover.etl.txfc.txfc_loader import TxfcLoader
from dressdiscover.etl.vccc.vccc_omeka_loader import VcccOmekaLoader
from dressdiscover.etl.wizard.wizard_loader import WizardLoader


HistoricDressOmekaLoader.main()
TxfcLoader.main()
VcccOmekaLoader.main()
WizardLoader.main()
