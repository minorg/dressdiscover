import {Pagination, PaginationItem, PaginationLink} from "reactstrap";
import * as React from "react";
import {DefaultPaginationProps} from "dressdiscover/cms/gui/core/components/pagination/DefaultPaginationProps";

export const DefaultPagination: React.FunctionComponent<DefaultPaginationProps> = ({currentPage, maxPage, onPageRequest}) => (
    <Pagination>
        <PaginationItem disabled={currentPage === 0}>
            <PaginationLink first onClick={() => onPageRequest(0)}/>
        </PaginationItem>
        <PaginationItem disabled={currentPage === 0}>
            <PaginationLink previous onClick={() => onPageRequest(currentPage - 1)}/>
        </PaginationItem>
        <PaginationItem active>
            <PaginationLink href="#">{currentPage + 1}</PaginationLink>
        </PaginationItem>
        <PaginationItem disabled={currentPage + 1 === maxPage}>
            <PaginationLink next onClick={() => onPageRequest(currentPage + 1)}/>
        </PaginationItem>
        <PaginationItem disabled={currentPage + 1 === maxPage}>
            <PaginationLink last onClick={() => onPageRequest(maxPage - 1)}/>
        </PaginationItem>
    </Pagination>);
