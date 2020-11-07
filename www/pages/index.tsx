import * as React from "react";
import {Layout} from "components/Layout";
import {
  Grid,
  Link,
  List,
  ListItem,
  ListItemIcon,
  ListItemText,
  Typography,
} from "@material-ui/core";
import {Hrefs} from "lib/Hrefs";
import AppsIcon from "@material-ui/icons/Apps";

const IndexPage: React.FunctionComponent = () => (
  <Layout>
    <Grid container>
      <Grid item>
        <Typography variant="h6">DressDiscover</Typography>
        <br />
        DressDiscover is a suite of web sites and web applications for digital
        collections of historic clothing:
        <List>
          <ListItem>
            <ListItemIcon>
              <AppsIcon />
            </ListItemIcon>
            <ListItemText>
              <Link href={Hrefs.collections}>
                <strong>Collections</strong> and other web sites
              </Link>
            </ListItemText>
          </ListItem>
          <ListItem>
            <ListItemIcon>
              <AppsIcon />
            </ListItemIcon>
            <ListItemText>
              <Link href={Hrefs.union}>
                <strong>Union catalog</strong> of collections
              </Link>
            </ListItemText>
          </ListItem>
          <ListItem>
            <ListItemIcon>
              <AppsIcon />
            </ListItemIcon>
            <ListItemText>
              <Link href={Hrefs.worksheet}>
                <strong>Worksheet</strong> for historic clothing artifacts using
                visual workflows
              </Link>
            </ListItemText>
          </ListItem>
        </List>
      </Grid>
    </Grid>
  </Layout>
);

export default IndexPage;
