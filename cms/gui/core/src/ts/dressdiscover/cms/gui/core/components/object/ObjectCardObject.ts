export interface ObjectCardObject {
    collectionUri: string;
    description: string | null | undefined;
    institutionUri: string;
    thumbnail: {
        url: string;
    } | null | undefined;
    title: string;
    uri: string;
}
