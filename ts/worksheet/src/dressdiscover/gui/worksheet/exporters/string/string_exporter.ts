import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';

export abstract class StringExporter {
    download(worksheetDefinition: WorksheetDefinition, worksheetState: WorksheetState): boolean {
        const content = this.export(worksheetDefinition, worksheetState);

        var a = document.createElement('a')
        const fileName = worksheetState.id + '.' + this.fileExtension;
        const mimeType = this.mimeType;

        if (navigator.msSaveBlob) { // IE10
            return navigator.msSaveBlob(new Blob([content], { type: mimeType }), fileName);
        } else if ('download' in a) { //html5 A[download]
            a.href = 'data:' + mimeType + ',' + encodeURIComponent(content);
            a.setAttribute('download', fileName);
            document.body.appendChild(a);
            a.click();
            document.body.removeChild(a);
            return true;
        } else { //do iframe dataURL download (old ch+FF):
            var f = document.createElement('iframe');
            document.body.appendChild(f);
            f.src = 'data:' + mimeType + ',' + encodeURIComponent(content);
            setTimeout(function () {
                document.body.removeChild(f);
            }, 333);
            return true;
        }
    }

    email(worksheetDefinition: WorksheetDefinition, worksheetState: WorksheetState): void {
        const content = this.export(worksheetDefinition, worksheetState);
        window.open("mailto:?to=&subject=" + encodeURIComponent(worksheetState.id.toString()) + "&body=" + encodeURIComponent(content));
    }

    abstract export(worksheetDefinition: WorksheetDefinition, worksheetState: WorksheetState): string;

    abstract readonly fileExtension: string;
    abstract readonly mimeType: string;
}
