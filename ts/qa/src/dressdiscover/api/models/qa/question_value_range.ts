export class QuestionValueRange {
    private _start: number;

    private _step: number;

    private _stop: number;

    constructor(kwds: {start: number, step: number, stop: number}) {
        this.start = kwds.start;
        this.step = kwds.step;
        this.stop = kwds.stop;
    }

    get start(): number {
        return this._start;
    }

    set start(start: number) {
        this._start = start;
    }

    get step(): number {
        return this._step;
    }

    set step(step: number) {
        this._step = step;
    }

    get stop(): number {
        return this._stop;
    }

    set stop(stop: number) {
        this._stop = stop;
    }

    static fromThryftJSON(json: any): QuestionValueRange {
        var start: number | undefined;
        var step: number | undefined;
        var stop: number | undefined;
        for (var fieldName in json) {
            if (fieldName == "start") {
                start = json[fieldName];
            } else if (fieldName == "step") {
                step = json[fieldName];
            } else if (fieldName == "stop") {
                stop = json[fieldName];
            }
        }
        if (start == null) {
            throw new TypeError('start is required');
        }
        if (step == null) {
            throw new TypeError('step is required');
        }
        if (stop == null) {
            throw new TypeError('stop is required');
        }
        return new QuestionValueRange({start: start, step: step, stop: stop});
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["start"] = this.start;
        json["step"] = this.step;
        json["stop"] = this.stop;
        return json;
    }
}
