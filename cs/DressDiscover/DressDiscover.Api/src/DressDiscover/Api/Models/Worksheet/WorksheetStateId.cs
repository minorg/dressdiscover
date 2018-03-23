namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetStateId {
        public static WorksheetStateId Parse(string value) {
            if (value.Length == 0) {
                throw new System.ArgumentException("id is empty", "WorksheetStateId");
            }
            return new WorksheetStateId(value);
        }

        private WorksheetStateId(string value) {
            this.value = value;
        }

        public override string ToString() {
            return this.value;
        }

        private string value;
    }
}
