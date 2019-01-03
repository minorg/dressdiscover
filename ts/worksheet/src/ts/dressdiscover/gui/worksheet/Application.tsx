import './Application.scss';
import 'style-loader!css-loader!react-bootstrap-table/dist/react-bootstrap-table.min.css';

import { Routes } from 'dressdiscover/gui/worksheet/Routes';
import * as React from 'react';

export class Application extends React.Component {
  render() {
    return <Routes />;
  }
}
