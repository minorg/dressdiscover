namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureValueId {
        public static WorksheetFeatureValueId Parse(string value) {
            if (value.Length == 0) {
                throw new System.ArgumentException("id is empty", "WorksheetFeatureValueId");
            }
            return new WorksheetFeatureValueId(value);
        }

        private WorksheetFeatureValueId(string value) {
            this.value = value;
        }

        public override string ToString() {
            return this.value;
        }

        private string value;
    }
}
