import * as React from "react";
import {Layout} from "components/Layout";
import {Grid, Link} from "@material-ui/core";

const IndexPage: React.FunctionComponent = () => (
  <Layout>
    <Grid container>
      <Grid item>
        <strong>DressDiscover</strong> is a suite of web applications for
        digital collections of historic clothing:
        <ul>
          <li>
            <Link href="https://worksheet.dressdiscover.org">
              <strong>Worksheet</strong>
            </Link>
          </li>
          <li>
            <Link href="https://union.dressdiscover.org">
              <strong>Union catalog</strong>
            </Link>
          </li>
        </ul>
      </Grid>
    </Grid>
  </Layout>
);

export default IndexPage;
