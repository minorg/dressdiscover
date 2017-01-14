namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureValueDefinition
    {
        public WorksheetFeatureValueDefinition(string id)
        {
            this.Id = id;
        }

        public WorksheetFeatureValueDefinition(string id, string displayName, DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImage image) {
            this.Id = id;
            this.DisplayName = displayName;
            this.Image = image;
        }

        public string DisplayName
        {
            get { return displayName; }
            set { this.displayName = value; }
        }

        public string Id
        {
            get { return id; }
            set
            {
                if (value == null)
                {
                    throw new System.NullReferenceException("WorksheetFeatureValueDefinition.Id");
                }
                this.id = value;
            }
        }

        public DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImage Image
        {
            get { return image; }
            set { this.image = value; }
        }

        public static WorksheetFeatureValueDefinition FromBuiltins(System.Collections.Generic.IDictionary<string, object> _dictionary)
        {
            string id= null;
            string displayName= null;
            DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImage image= null;

            foreach (var _item in _dictionary)
            {
                switch (_item.Key)
                {
                case "id":
                    id = ((string)_item.Value);
                    break;
                case "display_name":
                    displayName = ((string)_item.Value);
                    break;
                case "image":
                    image = DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImage.FromBuiltins((System.Collections.Generic.IDictionary<string, object>)_item.Value);
                    break;
                }
            }

            return new WorksheetFeatureValueDefinition(id, displayName, image);
        }

        public System.Collections.Generic.IDictionary<string, object> ToBuiltins()
        {
            var _builtins = new System.Collections.Generic.Dictionary<string, object>();
            _builtins["id"] = this.Id;
            if (!(this.DisplayName != null))
            {
                _builtins["display_name"] = this.DisplayName;
            }
            if (!(this.Image != null))
            {
                _builtins["image"] = this.Image.ToBuiltins();
            }
            return _builtins;
        }

        private string displayName;
        private string id;
        private DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImage image;
    }
}
