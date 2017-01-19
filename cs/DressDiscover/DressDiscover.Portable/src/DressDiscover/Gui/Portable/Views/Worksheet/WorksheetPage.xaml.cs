using DressDiscover.Gui.Portable.ViewModels.Worksheet;
using System.Diagnostics;
using Xamarin.Forms;

namespace DressDiscover.Gui.Portable.Views.Worksheet
{
    public partial class WorksheetPage : ContentPage
    {
        public WorksheetPage(WorksheetViewModel viewModel)
        {
            this.viewModel = viewModel;
            Resources["viewModel"] = viewModel;

            InitializeComponent();
        }

        protected async override void OnAppearing()
        {
            while (viewModel.AccessionNumber == null)
            {
                await Navigation.PushModalAsync(new WorksheetAccessionNumberPage(viewModel));
            }
            Debug.WriteLine("New accession number is " + viewModel.AccessionNumber);
        }

        private WorksheetViewModel viewModel;
    }
}
