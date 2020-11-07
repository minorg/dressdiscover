import * as React from "react";
import {Layout} from "components/Layout";
import {
  Grid,
  Link,
  List,
  ListItem,
  ListItemText,
  Typography,
} from "@material-ui/core";

const COLLECTIONS = [
  ["costumecoreontology", "Costume Core Ontology"],
  ["costumecoretemplate", "Costume Core Template"],
  ["iastate-amd354", "Iowa State University AMD 354 teaching resource"],
];

const CollectionsPage: React.FunctionComponent = () => (
  <Layout>
    <Grid container>
      <Grid item>
        <Typography variant="h6">Collections</Typography>
        <List>
          {COLLECTIONS.map(([subdomain, label]) => (
            <ListItem key={subdomain}>
              <ListItemText>
                <Link href={`https://${subdomain}.dressdiscover.org`}>
                  {label}
                </Link>
              </ListItemText>
            </ListItem>
          ))}
        </List>
      </Grid>
    </Grid>
  </Layout>
);

export default CollectionsPage;
