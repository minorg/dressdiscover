namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureId {
        public static WorksheetFeatureId Parse(string value) {
            if (value.Length == 0) {
                throw new System.ArgumentException("id is empty", "WorksheetFeatureId");
            }
            return new WorksheetFeatureId(value);
        }

        private WorksheetFeatureId(string value) {
            this.value = value;
        }

        public override string ToString() {
            return this.value;
        }

        private string value;
    }
}
