from net.lab1318.costume.api.models.collection import Collection, \
    CollectionEntry, CollectionId


class OmekaCollectionToCollectionMapper(object):
    def map_omeka_collection(self, collection_store_url, institution_id, omeka_collection):
        collection_id = CollectionId.parse(str(institution_id) + '/' + str(omeka_collection.id))

        collection_builder = Collection.Builder()
        collection_builder.setInstitutionId(institution_id)

        for element_text in omeka_collection.element_texts:
            if len(element_text.text) == 0:
                continue

            if element_text.element_set.name == 'Dublin Core':
                if element_text.element.name == 'Contributor':
                    pass
                elif element_text.element.name == 'Description':
                    collection_builder.setDescription(element_text.text)
                elif element_text.element.name == 'Title':
                    collection_builder.setTitle(element_text.text)

        collection_builder.setObjectStoreUrl(collection_store_url)

        collection = collection_builder.build()

        return CollectionEntry(collection_id, collection)
