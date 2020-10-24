import * as React from "react";

export class Headline extends React.Component<{children: React.ReactNode}> {
  render() {
    return (
      <h4 className="headline mt-2 pb-2 pl-4 pt-2 text-center">
        {this.props.children}
      </h4>
    );
  }
}
