package tests;

import io.restassured.response.Response;
import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//http://acceptinc.cloud.testinsights.io/app/#!/model-engine/guid/becea9f4-22e2-4306-83a9-f1290635f6f0
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 258, profileId = 100185)
public class ZeroAPI_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"78264ef8-7c9d-470d-9ec7-5de7d23fbaa4","ZeroAPI","ZeroAPI - Default Profile"})
    @TestModellerPath(guid = "78264ef8-7c9d-470d-9ec7-5de7d23fbaa4")
    public void NegativePostNegativeEnd1()
    {
        
        utilities.AIAPIUtils _utilitiesAIAPIUtils = new utilities.AIAPIUtils(driver);
    TestModellerLogger.SetLastNodeGuid("42124f38-262a-43e4-8c56-d04ed1ef857a");
    Response ZeroAPI_ResultStatus = _utilitiesAIAPIUtils.Post("", "{}");

    }

    @Test  (groups= {"240afa74-fe1d-49e3-ad2b-68ace045d2cc","ZeroAPI","ZeroAPI - Default Profile"})
    @TestModellerPath(guid = "240afa74-fe1d-49e3-ad2b-68ace045d2cc")
    public void NegativePostNegativeEnd2()
    {
        
        utilities.AIAPIUtils _utilitiesAIAPIUtils = new utilities.AIAPIUtils(driver);
    TestModellerLogger.SetLastNodeGuid("42124f38-262a-43e4-8c56-d04ed1ef857a");
    Response ZeroAPI_ResultStatus = _utilitiesAIAPIUtils.Post("https://possfasfast", "{}");

    }

    @Test  (groups= {"de7d1074-bb6a-4bdc-b053-a98a57ca9a6f","ZeroAPI","ZeroAPI - Default Profile"})
    @TestModellerPath(guid = "de7d1074-bb6a-4bdc-b053-a98a57ca9a6f")
    public void PositivePostPositiveEnd3()
    {
        
        utilities.AIAPIUtils _utilitiesAIAPIUtils = new utilities.AIAPIUtils(driver);
    TestModellerLogger.SetLastNodeGuid("9f84a4da-931d-48ca-853d-087b5bccbde1");
    Response ZeroAPI_ResultStatus = _utilitiesAIAPIUtils.Post("https://postman-echo.com/post", "{}");

    }

}
