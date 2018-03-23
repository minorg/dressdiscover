namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetExtentId {
        public static WorksheetExtentId Parse(string value) {
            if (value.Length == 0) {
                throw new System.ArgumentException("id is empty", "WorksheetExtentId");
            }
            return new WorksheetExtentId(value);
        }

        private WorksheetExtentId(string value) {
            this.value = value;
        }

        public override string ToString() {
            return this.value;
        }

        private string value;
    }
}
