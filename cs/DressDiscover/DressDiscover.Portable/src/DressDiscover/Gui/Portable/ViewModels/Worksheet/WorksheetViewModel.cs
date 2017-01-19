using System;
using System.Diagnostics;
using Xamarin.Forms;

namespace DressDiscover.Gui.Portable.ViewModels.Worksheet
{
    public class WorksheetViewModel : ViewModelBase
    {
        public WorksheetViewModel()
        {
            Device.StartTimer(TimeSpan.FromMilliseconds(15), OnTimerTick);
        }

        bool OnTimerTick()
        {
            DateTime = DateTime.Now;
            return true;
        }

        public DateTime DateTime {
            get { return dateTime; }
            set { SetProperty(ref dateTime, value); }
        }

        DateTime dateTime = DateTime.Now;
    }
}
