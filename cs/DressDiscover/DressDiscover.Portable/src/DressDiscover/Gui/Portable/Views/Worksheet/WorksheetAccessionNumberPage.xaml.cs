using DressDiscover.Gui.Portable.ViewModels.Worksheet;
using System.Windows.Input;
using Xamarin.Forms;

namespace DressDiscover.Gui.Portable.Views.Worksheet
{
    public partial class WorksheetAccessionNumberPage : ContentPage
    {
        public WorksheetAccessionNumberPage(WorksheetViewModel viewModel)
        {
            InitializeComponent();

            Resources["viewModel"] = viewModel;
            SubmitCommand = new Command(Submit);
            BindingContext = this;
        }

        void Submit()
        {
            Navigation.PopModalAsync();
        }

        public ICommand SubmitCommand { private set; get; }
    }
}
