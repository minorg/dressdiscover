export interface ObjectSummary {
    collectionName?: string;
    collectionUri: string;
    description: string | null | undefined;
    institutionName?: string;
    institutionUri: string;
    thumbnail: {
        url: string;
    } | null | undefined;
    title: string;
    uri: string;
}
