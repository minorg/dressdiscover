namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureSetId {
        public static WorksheetFeatureSetId Parse(string value) {
            if (value.Length == 0) {
                throw new System.ArgumentException("id is empty", "WorksheetFeatureSetId");
            }
            return new WorksheetFeatureSetId(value);
        }

        private WorksheetFeatureSetId(string value) {
            this.value = value;
        }

        public override string ToString() {
            return this.value;
        }

        private string value;
    }
}
