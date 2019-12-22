import * as React from "react";
import {useState} from "react";
import {Card, CardBody, CardHeader, CardTitle, Collapse} from "reactstrap";
import * as classnames from "classnames";

interface Object {
    description: string | null | undefined;
    thumbnail: {
        url: string;
    } | null | undefined;
    title: string;
    uri: string;
}

export const ObjectCard: React.FunctionComponent<{ object: Object }> = ({object}) => {
    const [state, setState] = useState<{ descriptionShown: boolean }>({descriptionShown: false});

    const onToggleDescription = () => setState((prevState) => ({descriptionShown: !prevState.descriptionShown}));

    return (
        <Card>
            <CardHeader>
                <CardTitle><strong>{object.title}</strong></CardTitle>
            </CardHeader>
            <CardBody>
                {object.thumbnail ?
                    <figure className="figure text-center w-100">
                        <img className="figure-img rounded" src={object.thumbnail!.url}
                             style={{height: "200px", width: "200px"}}/>
                    </figure> : null}
                {object.description ?
                    <div className="card-text w-100">
                        <div>
                            <a onClick={onToggleDescription} className="description-toggle">Description</a>
                            <div className="float-right">
                                <a onClick={onToggleDescription} className="description-toggle">
                                    <i className={classnames({
                                        fas: true,
                                        "fa-chevron-down": state.descriptionShown,
                                        "fa-chevron-right": !state.descriptionShown
                                    })}></i>
                                </a>
                            </div>
                            <br/>
                            <Collapse isOpen={state.descriptionShown}>
                                <div className="text-left"
                                     style={{fontSize: "small", maxWidth: "200px"}}>{object.description}</div>
                            </Collapse>
                        </div>
                    </div> : null}
            </CardBody>
        </Card>);
}

// <figure className="figure">
//     <a onClick={this.onToggleSelected}>
//         <img
//             className="figure-img rounded"
//             src={thumbnailImgSrc}
//             style={{ height: "200px", width: "200px" }}
//         />
//     </a>
//     {definition.image ? (
//         <figcaption className="figure-caption" style={{ fontSize: "xx-small" }}>
//             Image&nbsp;&copy;
//             <span>{definition.image.rights.author}</span>
//             <br />License:&nbsp;
//             <span ><WorksheetRightsLicenseComponent license={definition.image.rights.license}></WorksheetRightsLicenseComponent></span>
//         </figcaption>
//     ) : null}
// </figure>
// {definition.description ? (
//     <div className="card-text">
//         <a onClick={this.onToggleDescription} className="description-toggle">Description</a>
//         <div className="float-right">
//             <a onClick={this.onToggleDescription} className="description-toggle">
//                 <i className={classnames({ fas: true, "fa-chevron-down": this.state.descriptionShown, "fa-chevron-right": !this.state.descriptionShown })}></i>
//             </a>
//         </div>
//         <br />
//         <Collapse isOpen={this.state.descriptionShown}>
//             <WorksheetDescriptionComponent description={definition.description}></WorksheetDescriptionComponent>
//         </Collapse>
//     </div>
// ) : null}
