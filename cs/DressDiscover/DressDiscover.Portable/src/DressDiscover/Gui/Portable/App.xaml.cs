using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Newtonsoft.Json;
using DressDiscover.Api.Models.Worksheet;
using Xamarin.Forms;

namespace DressDiscover.Gui.Portable
{
    public partial class App : Application
    {
        public App(string worksheetDefinitionJson)
        {
            InitializeComponent();

            var worksheetDefinitionParsed = JsonConvert.DeserializeObject<Dictionary<object, object>>(worksheetDefinitionJson);

            MainPage = new DressDiscover.Gui.Portable.MainPage();
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
