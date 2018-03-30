using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace DressDiscover.Server.src.DressDiscover.Server.Controllers.Login
{
    [Route("api/login")]
    public class LoginController : Controller
    {
        [Route("callback")]
        public ActionResult Callback(string code, string state)
        {
            if (state != null && state.Length > 0)
            {
                return Redirect(state);
            } else
            {
                return new StatusCodeResult(404);
            }
        }

        public ActionResult Index(string state)
        {
            var redirectUrl = COGNITO_LOGIN_URL;
            redirectUrl += "?response_type=code";
            redirectUrl += "&client_id=" + COGNITO_CLIENT_ID;
            redirectUrl += "&redirect_uri=" + (Request.Host.Host == "localhost" ? "http://localhost:9000" : "https://api.dressdiscover.org") + "/api/login/callback";
            if (state == null || state.Length == 0)
            {
                var referer = Request.Headers["Referer"];
                if (referer.Count != 0)
                {
                    state = referer[0];
                }
            }
            if (state != null && state.Length > 0)
            {
                redirectUrl += "&state=";
            }

            return Redirect(redirectUrl);
        }

        private static readonly string COGNITO_CLIENT_ID = "4vbo86jc954d9ps7gc81gtfkqo";
        private static readonly string COGNITO_LOGIN_URL = "https://dressdiscover.auth.us-east-1.amazoncognito.com/login";
    }
}