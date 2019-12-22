import {RouteComponentProps} from "react-router";
import * as React from "react";
import {useState} from "react";
import {Frame} from "dressdiscover/cms/gui/core/components/frame/Frame";
import {ApolloQueryWrapper} from "dressdiscover/cms/gui/core/api/ApolloQueryWrapper";
import * as collectionOverviewQuery from "dressdiscover/cms/gui/core/api/queries/collectionOverviewQuery.graphql";
import {
    CollectionOverviewQuery,
    CollectionOverviewQueryVariables
} from "dressdiscover/cms/gui/core/api/queries/types/CollectionOverviewQuery";
import {ObjectsGallery} from "dressdiscover/cms/gui/core/components/object/ObjectsGallery";
import {Breadcrumb, BreadcrumbItem, Col, Container, Row} from "reactstrap";
import {Hrefs} from "dressdiscover/cms/gui/core/Hrefs";
import {Link} from "react-router-dom";
import {
    CollectionOverviewObjectsPaginationQuery,
    CollectionOverviewObjectsPaginationQueryVariables
} from "dressdiscover/cms/gui/core/api/queries/types/CollectionOverviewObjectsPaginationQuery";
import * as collectionOverviewObjectsPaginationQuery
    from "dressdiscover/cms/gui/core/api/queries/collectionOverviewObjectsPaginationQuery.graphql";
import {useQuery} from "@apollo/react-hooks";
import {ObjectCardObject} from "dressdiscover/cms/gui/core/components/object/ObjectCardObject";

type Object = ObjectCardObject;

export const CollectionOverview: React.FunctionComponent<RouteComponentProps<{ collectionUri: string; institutionUri: string; }>> = ({match}) => {
    const collectionUri = decodeURIComponent(match.params.collectionUri);
    const institutionUri = decodeURIComponent(match.params.institutionUri);

    const stripHtml = (html: string) => {
        var tmp = document.createElement("DIV");
        tmp.innerHTML = html;
        return tmp.textContent || tmp.innerText || "";
    }

    const [state, setState] = useState<{ currentObjectsPage: number, objects: Object[] }>({
        currentObjectsPage: 0,
        objects: []
    });

    const onObjectsPageRequest = (page: number) => {
        const {loading, error, data} = useQuery<CollectionOverviewObjectsPaginationQuery, CollectionOverviewObjectsPaginationQueryVariables>(collectionOverviewObjectsPaginationQuery);
        if (loading) {
            return;
        } else if (error) {
            return;
        }
        setState(prevState => Object.assign({}, prevState, ({objects: data!.collectionByUri.objects})));
    }

    return (
        <Frame id="collection-overview">
            <ApolloQueryWrapper<CollectionOverviewQuery, CollectionOverviewQueryVariables>
                query={collectionOverviewQuery}
                variables={{
                    collectionUri,
                    institutionUri
                }}>
                {({data}) => {
                    setState(prevState => (Object.assign({}, prevState, {objects: data.collectionByUri.objects})));

                    return (
                        <Container fluid>
                            <Row>
                                <Col xs={{offset: 1, size: 10}}>
                                    <Breadcrumb>
                                        <BreadcrumbItem><Link to={Hrefs.home}>Home</Link></BreadcrumbItem>
                                        <BreadcrumbItem>Institutions</BreadcrumbItem>
                                        <BreadcrumbItem><Link
                                            to={Hrefs.institution(institutionUri)}>{data.institutionByUri.name}</Link></BreadcrumbItem>
                                        <BreadcrumbItem>Collections</BreadcrumbItem>
                                        <BreadcrumbItem><Link
                                            to={Hrefs.collection({
                                                collectionUri,
                                                institutionUri
                                            })}>{data.collectionByUri.name}</Link></BreadcrumbItem>
                                        <BreadcrumbItem>Objects</BreadcrumbItem>
                                    </Breadcrumb>
                                </Col>
                            </Row>
                            <Row>
                                <Col xs={{offset: 1, size: 10}}>
                                    <h2 className="text-center">{data.collectionByUri.name}</h2>
                                    {data.collectionByUri.description ?
                                        <p>{stripHtml(data.collectionByUri.description)}</p> : null}
                                </Col>
                            </Row>
                            {data.institutionByUri.rights ?
                                <Row>
                                    <Col xs={{offset: 1, size: 10}}>
                                        <small>{data.institutionByUri.rights.text}</small>
                                    </Col>
                                </Row> : null}
                            <Row className="mt-4">
                                <Col xs={{offset: 1, size: 10}}>
                                    <ObjectsGallery
                                        currentPage={state.currentObjectsPage}
                                        maxPage={data.collectionByUri.objectsCount}
                                        objects={state.objects.map(object_ => ({
                                            collectionUri,
                                            institutionUri,
                                            ...object_
                                        }))}
                                        onPageRequest={onObjectsPageRequest}
                                    />
                                </Col>
                            </Row>
                        </Container>);
                }}
            </ApolloQueryWrapper>
        </Frame>);
}
