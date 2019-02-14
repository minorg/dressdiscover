import * as React from 'react';
import { Modal, ModalBody, ModalHeader } from 'reactstrap';

interface Props {
    error: Error;
    onExit?: () => void;
}

export class FatalErrorModal extends React.Component<Props> {
    render() {
        let { onExit } = this.props;
        if (!onExit) {
            onExit = () => { return; };
        }

        return (
            <div>
                <Modal isOpen={true} onExit={onExit}>
                    <ModalHeader>Fatal error</ModalHeader>
                    <ModalBody>{this.props.error.toString()}</ModalBody>
                </Modal>
            </div>
        );
    }
}
