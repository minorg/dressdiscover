declare module 'hammerjs';
declare module 'react-clipboard.js';
declare module 'react-hammerjs';

interface Exception {
    toJsonObject(): any;

    toString(): string;
}
