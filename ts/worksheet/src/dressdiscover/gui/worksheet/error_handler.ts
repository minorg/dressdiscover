import { AsyncError } from 'dressdiscover/gui/worksheet/services/async_error';
import { ErrorModalView } from 'dressdiscover/gui/worksheet/views/modal/error_modal_view';

export class ErrorHandler {
    handleAsyncError(errorKwds: AsyncError) {
        ErrorModalView.fromAsyncError(errorKwds).show();
    }

    handleSyncError(errorThrown: object) {
        ErrorModalView.fromSyncError(errorThrown).show();
    }
}