using DressDiscover.Api.Models.Worksheet;
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

        public App(string worksheetDefinitionJson)
        {
            InitializeComponent();

            ParseWorksheetDefinitionJson(worksheetDefinitionJson);
            MainPage = new DressDiscover.Gui.Portable.Views.Worksheet.WorksheetPage();
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
