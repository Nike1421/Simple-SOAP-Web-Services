using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace CalculatorServiceApplication
{
    /// <summary>
    /// Summary description for CalculatorService
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // To allow this Web Service to be called from script, using ASP.NET AJAX, uncomment the following line. 
    // [System.Web.Script.Services.ScriptService]
    public class CalculatorService : System.Web.Services.WebService
    {

        [WebMethod]
        public string addIntegers(int firstInteger, int secondInteger)
        {
            int result = firstInteger + secondInteger;
            return result.ToString();
        }

        [WebMethod]
        public string subtractIntegers(int firstInteger, int secondInteger)
        {
            int result = firstInteger - secondInteger;
            return result.ToString();
        }
    }
}
