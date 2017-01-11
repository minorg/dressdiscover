namespace DressDiscover.Api.Models.Worksheet
{
    public sealed class WorksheetFeatureValueImage
    {
        WorksheetFeatureValueImage()
        {
        }

        public string FullSizeUrl { get; set; }

        public DressDiscover.Api.Models.Worksheet.WorksheetFeatureValueImageRights Rights { get; set; }

        public string ThumbnailUrl { get; set; }
    }
}
