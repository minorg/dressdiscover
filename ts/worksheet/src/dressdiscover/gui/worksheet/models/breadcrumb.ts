export class Breadcrumb {
    constructor(public readonly text: string, kwds?: { active?: boolean, href?: string }) {
        this.active = !!kwds && !!kwds.active;
        this.href = kwds ? kwds.href : undefined;
    }

    readonly active: boolean;
    readonly href?: string;
}
