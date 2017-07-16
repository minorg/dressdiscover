# dressdiscover

Union catalog:
Java+Jython web application for browsing metadata and images from historic apparel collections such as 
the Victoria and Albert Museum, the Powerhouse Museum, the Texas Fashion Collection, the Europeana
Fashion Project, the Vassar College Costume Collection, and historicdress.org.
Design:
• Union metadata schema based on VRA Core, Dublin Core, and Costume Core and defined as Thrift
models to facilitate code generation
• Model-View-Controller web application architecture
Implementation:
• Guice-injected Java micro-services that encapsulate file systems, H2 tables, and ElasticSearch indices
• Metadata ingestion via OAI-PMH, the Omeka API, and custom clients
• Vaadin user interface with OAuth2 login
Worksheet:
Backbone.js+Marionette.js+TypeScript+localStorage web application for describing historic apparel artifacts
using a visual workflow
Developed in Visual Studio and bundled with webpack
Q&A:
Knockout.js+TypeScript+server-backed web application for material culture analysis
Developed in Visual Studio and bundled with webpack