﻿using DressDiscover.Api.Models.Worksheet;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace DressDiscover.Gui.Portable
{
    public partial class MainPage : ContentPage
    {
        public MainPage(WorksheetDefinition worksheetDefinition)
        {
            InitializeComponent();
        }
    }
}
