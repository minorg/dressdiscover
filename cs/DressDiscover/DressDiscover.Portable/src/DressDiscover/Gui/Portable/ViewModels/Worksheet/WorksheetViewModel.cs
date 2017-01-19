namespace DressDiscover.Gui.Portable.ViewModels.Worksheet
{
    public class WorksheetViewModel : ViewModelBase
    {
        public string AccessionNumber
        {
            get { return accessionNumber; }
            set { SetProperty(ref accessionNumber, value); }
        }

        public WorksheetViewModel(AppServices services)
        {
            this.services = services;
        }

        private string accessionNumber;
        private AppServices services;
    }
}
