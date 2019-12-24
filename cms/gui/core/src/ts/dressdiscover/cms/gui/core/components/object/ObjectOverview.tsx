import {RouteComponentProps} from "react-router";
import * as React from "react";
import {InstitutionCollectionObjectOverview} from "dressdiscover/cms/gui/core/components/frame/InstitutionCollectionObjectOverview";
import {ApolloQueryWrapper} from "dressdiscover/cms/gui/core/api/ApolloQueryWrapper";
import {
    ObjectOverviewQuery,
    ObjectOverviewQueryVariables
} from "dressdiscover/cms/gui/core/api/queries/types/ObjectOverviewQuery";
import * as objectOverviewQuery from "dressdiscover/cms/gui/core/api/queries/objectOverviewQuery.graphql";
import {Card, CardBody, CardHeader, CardTitle, Container, Row} from "reactstrap";
import {ObjectImagesCarousel} from "dressdiscover/cms/gui/core/components/object/ObjectImagesCarousel";

// type Object = ObjectCardObject;

export const ObjectOverview: React.FunctionComponent<RouteComponentProps<{ collectionUri: string; institutionUri: string; objectUri: string; }>> = ({match}) => {
    const collectionUri = decodeURIComponent(match.params.collectionUri);
    const institutionUri = decodeURIComponent(match.params.institutionUri);
    const objectUri = decodeURIComponent(match.params.objectUri);


    return (
        <ApolloQueryWrapper<ObjectOverviewQuery, ObjectOverviewQueryVariables>
            query={objectOverviewQuery}
            variables={{collectionUri, institutionUri, objectUri}}>
            {({data}) => {
                const object_ = data.objectByUri;
                return (
                    <InstitutionCollectionObjectOverview
                        collectionName={data.collectionByUri.name} collectionUri={collectionUri}
                        institutionName={data.institutionByUri.name} institutionUri={institutionUri}
                        objectTitle={data.objectByUri.title} objectUri={objectUri}
                        rights={data.objectByUri.rights ? data.objectByUri.rights : (data.collectionByUri.rights ? data.collectionByUri.rights : data.institutionByUri.rights)}
                        title={data.objectByUri.title}
                    >
                        <Container fluid>
                            {object_.images.length > 0 ?
                                <Row className="pb-4">
                                    <Card>
                                        <CardBody>
                                            <ObjectImagesCarousel images={object_.images}/>
                                        </CardBody>
                                    </Card>
                                </Row> : null}
                            {object_.description ?
                                <Row className="pb-4">
                                    <Card>
                                        <CardHeader><CardTitle><h5>Description</h5></CardTitle></CardHeader>
                                        <CardBody>{object_.description}</CardBody>
                                    </Card>
                                </Row> : null}
                        </Container>
                    </InstitutionCollectionObjectOverview>);
            }
            }
        </ApolloQueryWrapper>
    );
}
