using System;
using System.ComponentModel;
using Xamarin.Forms;

namespace DressDiscover.Portable
{
    public class MainPageViewModel : INotifyPropertyChanged
    {
        public event PropertyChangedEventHandler PropertyChanged;

        public MainPageViewModel()
        {
            Device.StartTimer(TimeSpan.FromMilliseconds(15), OnTimerTick);
        }

        bool OnTimerTick()
        {
            DateTime = DateTime.Now;
            return true;
        }

        public DateTime DateTime
        {
            get
            {
                return dateTime;
            }

            private set
            {
                if (dateTime != value)
                {
                    dateTime = value;
                    PropertyChanged?.Invoke(this, new PropertyChangedEventArgs("DateTime"));
                }
            }
        }

        DateTime dateTime = DateTime.Now;
    }
}
