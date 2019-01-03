import * as React from "react";
import { Modal, ModalHeader, ModalBody } from "reactstrap";

interface Props {
    error: Error;
}

export class FatalErrorModal extends React.Component<Props> {
    render() {
        return (
            <div>
                <Modal isOpen={true}>
                    <ModalHeader>Fatal error</ModalHeader>
                    <ModalBody>{this.props.error.toString()}</ModalBody>
                </Modal>
            </div>
        )
    }
}
