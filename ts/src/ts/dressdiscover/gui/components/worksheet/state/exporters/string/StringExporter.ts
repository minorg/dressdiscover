import { Exporter } from '../Exporter';

export interface StringExporter extends Exporter<string> {
    readonly fileExtension: string;
    readonly mimeType: string;
}
