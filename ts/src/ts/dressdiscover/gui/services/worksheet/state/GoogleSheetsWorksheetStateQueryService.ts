// export class GoogleSheetsWorksheetStateQueryService implements WorksheetStateQueryService {
//     constructor(private readonly configuration: GoogleSheetsWorksheetStateConfiguration) {
//     }

//     // getWorksheetState(kwds: { id: WorksheetStateId; }): Promise<WorksheetState> {
//     //     return new Promise((resolve, reject) => {
//     //         const jsonString = localStorage.getItem(LocalStorageWorksheetStateQueryService.getWorksheetStateItemKey(kwds.id));
//     //         if (jsonString == null) {
//     //             reject(new NoSuchWorksheetStateException({ id: kwds.id }));
//     //             return;
//     //         }
//     //         resolve(WorksheetState.fromThryftJsonObject(JSON.parse(jsonString)));
//     //     });
//     // }

//     // getWorksheetStateIds(): Promise<WorksheetStateId[]> {
//     //     let result: WorksheetStateId[] = [];
//     //     for (var keyI = 0; ; keyI++) {
//     //         const key = localStorage.key(keyI);
//     //         if (key == null) {
//     //             break;
//     //         }
//     //         if (!key.match("^" + LocalStorageWorksheetStateQueryService._WORKSHEET_ITEM_KEY_PREFIX)) {
//     //             continue;
//     //         } else if (key.length == LocalStorageWorksheetStateQueryService._WORKSHEET_ITEM_KEY_PREFIX.length) {
//     //             continue;
//     //         }
//     //         result.push(WorksheetStateId.parse(key.substr(LocalStorageWorksheetStateQueryService._WORKSHEET_ITEM_KEY_PREFIX.length)));
//     //     }
//     //     return new Promise((resolve, reject) => resolve(result));
//     // }
// }
