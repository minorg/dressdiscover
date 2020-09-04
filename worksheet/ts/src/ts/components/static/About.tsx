import { Frame } from '~/components/frame/Frame';
import { Headline } from '~/components/frame/Headline';
import { ActiveNavbarItem } from '~/components/navbar/ActiveNavbarItem';
import * as React from 'react';
import { Col, Container, Row } from 'reactstrap';
import Card from 'reactstrap/lib/Card';
import CardBody from 'reactstrap/lib/CardBody';

export class About extends React.Component {
    render() {
        return (
            <Frame
                activeNavItem={ActiveNavbarItem.Home}
                id="credits"
            >
                <Container fluid>
                    <Row>
                        <Col md="12">
                            <Headline>About</Headline>
                        </Col>
                    </Row>
                    <Row />
                    <Row>
                        <Col sm={{ size: 8, offset: 2 }}>
                            <Card>
                                <CardBody>
                                    <Container fluid>
                                        <p><b>DressDiscover</b> is a suite of web applications for digital collections of historic clothing.</p>
                                        <p>Historic clothing is the first type of material culture to be explored using this model. The larger goal is to provide a visual workflow for museum patrons, students, volunteers, and professionals to describe and to search for museum objects of all kinds, using images rather than text in order to transcend differences in vocabulary across different languages, time periods, or expertise.</p>
                                        <h4>Background</h4>
                                        <p>This project grew out of work on HistoricDress.org, where a multi-disciplinary, multi-institutional team outlined significant barriers preventing students and other public users from engaging with digital collections of fine and decorative arts. The question that emerged was &quot;How can we help users who don’t know the 'proper' vocabulary to search for examples of art?&quot; The team identified a major disconnect between the way decorative art objects are described and organized in digital collections versus the way that users seek to find and engage with them. Instead of worrying about the right search term, what if we turn to images to represent concepts instead? If we associate images with terms and synonyms in our controlled vocabularies, we can develop visual workflows for both the description process (catalogers) and the search process (users). Many kinds of artifacts in our collections would benefit from this approach.</p>
                                        <p>Ms. Kirkland has consulted with professionals in a variety of museums, universities, art schools, and private collections to collect existing controlled vocabulary terms related to historic clothing, collect datasets from existing collections to compare uncontrolled terms in current use, and identify the differences and similarities in their cataloging and publishing workflows. The application profile CostumeCore (http://www.ardenkirkland.com/costumecore/) has been developed to apply several existing metadata standards and controlled vocabularies to historic fashion. It builds on structural elements from both Dublin Core and VRA Core and uses vocabulary from both the AAT and Europeana Fashion Thesaurus.</p>
                                        <p>The feature groupings in CostumeCore, used in the worksheet app, follow up on Marcia Zeng’s work with &quot;micro thesauri,&quot;  taking thesauri such as the AAT that are available as Linked Data and breaking them into smaller groupings to make them usable for those who aren’t subject experts. Paper prototypes were tested with students at Vassar College, recorded manually in a worksheet while going through the workflow with grids of images on pages in a binder instead of the proposed screens of thumbnail images.</p>
                                        <p>The digital prototype worksheet has been implemented as a single-page web application. A student employee from the costume collection at Smith College helped to collect openly-licensed images for this prototype.</p>
                                        <br/>
                                        <h4>Audience</h4>
                                        <b>Non-experts</b>:
                                        <ul>
                                            <li>Museum patrons interested in learning more about museum objects and helping museums enrich their records</li>
                                            <li>Students of art and design history, learning material culture methods</li>
                                            <li>Volunteers who contribute their time to work behind the scenes at museums</li>
                                        </ul>
                                        <p>Non-expert users, including students, volunteers, and museum patrons, will engage with an artwork at length by examining multiple features in detail, as opposed to a brief glance. From this analytical process, users will learn what features are important to look for and what vocabulary terms can be used to describe them. Their observations can be contributed back to the owning institutions, providing better descriptions for future users.</p>
                                        <b>Experts</b>:
                                        <ul>
                                            <li>Museum professionals with subject expertise, using the app as a checklist to supplement freetext object descriptions</li>
                                            <li>Faculty who are looking for assignments for students to engage with a wider range of materials than typical textbooks</li>
                                        </ul>
                                        <br/>
                                        <h4>Research Questions</h4>
                                        <ul>
                                            <li>What level of specificity is needed for the tool to be useful?</li>
                                            <li>Which elements need to be described as individual features from controlled vocabularies?</li>
                                            <li>Which elements are sufficient in a free text description, not singled out for controlled vocabularies?</li>
                                            <li>How many choices are too many / too few?</li>
                                            <li>What features are needed to make the workflow efficient for both expert and non-expert users?</li>
                                            <li>What is the best way to add feature sets and values, so that in the future a wider community can participate and add more object types?</li>
                                            <li>How can this workflow incorporate elements and vocabularies to allow the results to be published as Linked Data?</li>
                                            <li>How can the app be incorporated in a modular way into existing collection/content management systems? Museum Collection Management Systems (CMSs) such as PastPerfect or SharedShelf</li>
                                            <li>What are the most useful description export formats and metadata standards to follow? CSV, RDF, JSON-LD?</li>
                                            <li>How can the app be used as a crowdsourcing tool to benefit from public interest in historic fashion?</li>
                                            <li>Once expert answers have been identified, would it be useful to provide a game to engage museum patrons or students: earn points for how many right answers you can get?</li>
                                            <li>How can the visual workflow form a cross-collection search query composed of synonyms and translations related to the concept represented?</li>
                                            <li>How can these tools be adapted for other kinds of objects?</li>
                                            {/* Static web pages, to share collections that are not already online
    Email, for teachers to grade as an assignment */}
                                        </ul>
                                    </Container>
                                </CardBody>
                            </Card>
                        </Col>
                    </Row>
                </Container>
            </Frame>
        );
    }
}
