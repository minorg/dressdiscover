import {Pagination, PaginationItem, PaginationLink} from "reactstrap";
import * as React from "react";
import {DefaultPaginationProps} from "dressdiscover/cms/gui/core/components/pagination/DefaultPaginationProps";
import * as _ from "lodash";

export const DefaultPagination: React.FunctionComponent<DefaultPaginationProps> = ({currentPage, maxPage, onPageRequest}) => (
    <Pagination>
        <PaginationItem disabled={currentPage === 0}>
            <PaginationLink first onClick={() => onPageRequest(0)}/>
        </PaginationItem>
        <PaginationItem disabled={currentPage === 0}>
            <PaginationLink previous onClick={() => onPageRequest(currentPage - 1)}/>
        </PaginationItem>
        {currentPage > 0 ? _.range(currentPage - 1, (currentPage - 5 >= 0 ? currentPage - 5 : 0) - 1, -1).reverse().map(page =>
                <PaginationItem>
                    <PaginationLink onClick={() => onPageRequest(page)}>{page + 1}</PaginationLink>
                </PaginationItem>)
            : null}
        <PaginationItem active>
            <PaginationLink href="#">{currentPage + 1}</PaginationLink>
        </PaginationItem>
        {currentPage + 1 <= maxPage ? _.range(currentPage + 1, (currentPage + 5 <= maxPage ? currentPage + 5 : maxPage) + 1).map(page =>
                <PaginationItem>
                    <PaginationLink onClick={() => onPageRequest(page)}>{page + 1}</PaginationLink>
                </PaginationItem>)
            : null}
        <PaginationItem disabled={currentPage + 1 === maxPage}>
            <PaginationLink next onClick={() => onPageRequest(currentPage + 1)}/>
        </PaginationItem>
        <PaginationItem disabled={currentPage + 1 === maxPage}>
            <PaginationLink last onClick={() => onPageRequest(maxPage - 1)}/>
        </PaginationItem>
    </Pagination>);
