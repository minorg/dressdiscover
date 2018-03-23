namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureState
    {
        public WorksheetFeatureState(string id)
        {
            this.Id = id;
        }

        public WorksheetFeatureState(string id, System.Collections.Generic.IList<string> selectedValueIds, string text) {
            this.Id = id;
            this.SelectedValueIds = selectedValueIds;
            this.Text = text;
        }

        public string Id
        {
            get { return id; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureState.Id");
                }
                this.id = value;
            }
        }

        public System.Collections.Generic.IList<string> SelectedValueIds
        {
            get { return selectedValueIds; }
            set { this.selectedValueIds = value; }
        }

        public string Text
        {
            get { return text; }
            set { this.text = value; }
        }

        private string id;
        private System.Collections.Generic.IList<string> selectedValueIds;
        private string text;
    }
}
