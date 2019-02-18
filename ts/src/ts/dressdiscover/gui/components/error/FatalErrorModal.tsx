import * as React from 'react';
import { Modal, ModalBody, ModalHeader } from 'reactstrap';

interface Props {
    error?: Error;
    message?: string;
    onExit?: () => void;
}

export class FatalErrorModal extends React.Component<Props> {
    render() {
        let { message, onExit } = this.props;
        if (!onExit) {
            onExit = () => { return; };
        }
        const { error } = this.props;
        if (!message) {
            if (error) {
                message = error.toString();
            } else {
                message = "";
            }
        }

        return (
            <div>
                <Modal isOpen={true} onExit={onExit}>
                    <ModalHeader>Fatal error</ModalHeader>
                    <ModalBody>{message}</ModalBody>
                </Modal>
            </div>
        );
    }
}
