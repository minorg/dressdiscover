import {AppProps} from "next/app";
import Head from "next/head";
import React from "react";
import CssBaseline from "@material-ui/core/CssBaseline";

const App: React.FunctionComponent<AppProps> = ({Component, pageProps}) => {
  React.useEffect(() => {
    // Remove the server-side injected CSS.
    const jssStyles = document.querySelector("#jss-server-side");
    if (jssStyles) {
      jssStyles.parentElement!.removeChild(jssStyles);
    }
  }, []);

  return (
    <>
      <Head>
        <meta
          name="viewport"
          content="minimum-scale=1, initial-scale=1, width=device-width"
        />
        <title>DressDiscover</title>
      </Head>
      <CssBaseline />
      <Component {...pageProps} />
    </>
  );
};

export default App;
