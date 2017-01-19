using DressDiscover.Api.Models.Worksheet;
using DressDiscover.Gui.Portable.ViewModels.Worksheet;
using Newtonsoft.Json.Linq;
using Xamarin.Forms;

namespace DressDiscover.Gui.Portable
{
    public partial class App : Application
    {
        public static WorksheetDefinition ParseWorksheetDefinitionJson(string worksheetDefinitionJson)
        {
            return WorksheetDefinition.FromJson(JObject.Parse(worksheetDefinitionJson));
        }

        public AppServices Services { get; private set; }

        public App(string worksheetDefinitionJson)
        {
            InitializeComponent();

            var worksheetDefinition = ParseWorksheetDefinitionJson(worksheetDefinitionJson);
            Services = new AppServices(Properties, worksheetDefinition);

            MainPage = new NavigationPage(new DressDiscover.Gui.Portable.Views.Worksheet.WorksheetPage(new WorksheetViewModel(Services)));
        }

        protected override void OnStart()
        {
            // Handle when your app starts
        }

        protected override void OnSleep()
        {
            // Handle when your app sleeps
        }

        protected override void OnResume()
        {
            // Handle when your app resumes
        }
    }
}
