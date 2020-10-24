import * as React from "react";
import {
  AppBar,
  Card,
  CardContent,
  CardHeader,
  Grid,
  Link,
  makeStyles,
  Toolbar,
  Typography,
} from "@material-ui/core";

const useStyles = makeStyles((theme) => ({
  brand: {
    marginRight: theme.spacing(4),
  },
  card: {
    marginLeft: theme.spacing(4),
    marginRight: theme.spacing(4),
  },
  cardHeader: {
    textAlign: "center",
  },
  footerParagraph: {
    textAlign: "center",
  },
  navLink: {
    color: "white",
    fontSize: "larger",
    marginRight: theme.spacing(4),
    textDecoration: "none",
  },
}));

export const Layout: React.FunctionComponent<{
  cardTitle?: React.ReactNode;
  children: React.ReactNode;
  className?: string;
}> = ({cardTitle, children}) => {
  const classes = useStyles();

  return (
    <>
      <Grid container direction="column" spacing={2}>
        <Grid item>
          <AppBar position="static">
            <Toolbar>
              <Typography variant="h6" className={classes.brand}>
                DressDiscover
              </Typography>
            </Toolbar>
          </AppBar>
        </Grid>
        <Grid item>
          <Card className={classes.card}>
            {cardTitle ? (
              <CardHeader className={classes.cardHeader} title={cardTitle} />
            ) : null}
            <CardContent>{children}</CardContent>
          </Card>
        </Grid>
        <Grid item>
          <footer>
            <p className={classes.footerParagraph}>
              <Link href="mailto:info@dressdiscover.org">Contact</Link>
              &nbsp;|&nbsp;
              <Link href="https://github.com/minorg/dressdiscover">GitHub</Link>
            </p>
          </footer>
        </Grid>
      </Grid>
    </>
  );
};
