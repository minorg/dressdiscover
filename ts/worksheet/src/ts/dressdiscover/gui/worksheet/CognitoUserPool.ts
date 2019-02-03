import * as AWS from 'aws-sdk';

export class CognitoUserPool {
    static readonly CLIENT_ID = "4vbo86jc954d9ps7gc81gtfkqo";
    static readonly ID = "us-east-1_EHF1IQGjJ";

    constructor() {
        AWS.config.credentials = new AWS.CognitoIdentityCredentials({
            IdentityPoolId: CognitoUserPool.ID,
            // Logins: { // optional tokens, used for authenticated login
            //     'graph.facebook.com': 'FBTOKEN',
            //     'www.amazon.com': 'AMAZONTOKEN',
            //     'accounts.google.com': 'GOOGLETOKEN'
            // }
        });
    }

    // private readonly delegate: AmazonCognitoIdentity.CognitoUserPool;
}
