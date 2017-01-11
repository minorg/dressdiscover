namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureState
    {
        WorksheetFeatureState()
        {
        }

        public System.Collections.Generic.List<string> SelectedValues
        {
            get { return selectedValues; }
            set { this.selectedValues = value; }
        }

        public string Text
        {
            get { return text; }
            set { this.text = value; }
        }

        private System.Collections.Generic.List<string> selectedValues;
        private string text;
    }
}
