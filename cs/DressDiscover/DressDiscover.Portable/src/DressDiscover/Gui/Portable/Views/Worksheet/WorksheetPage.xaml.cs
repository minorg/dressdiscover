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

            InitializeComponent();

            Resources["viewModel"] = viewModel;
        }

        protected override void OnAppearing()
        {
            if (viewModel.AccessionNumber == null)
            {
                Navigation.PushModalAsync(new WorksheetAccessionNumberPage(viewModel));
                return;
            }
        }

        private WorksheetViewModel viewModel;
    }
}
