import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.navigateToUrl('https://buggy.justtestit.org/')

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('h2_Popular Model'), 5)

WebUI.click(findTestObject('Object Repository/img_Popular Model_img-fluid center-block'))


if (WebUI.verifyElementPresent(findTestObject('button_Vote'), 1, FailureHandling.CONTINUE_ON_FAILURE)== true) {	
	WebUI.sendKeys(findTestObject('textarea_(optional)_comment'), 'Comment added by registered user - ' + GlobalVariable.UniqUserID)
	WebUI.click(findTestObject('button_Vote'))	
}
else if (WebUI.verifyElementPresent(findTestObject('Object Repository/button_Login'), 1, FailureHandling.CONTINUE_ON_FAILURE) == true) {
		WebUI.verifyElementText(findTestObject('Object Repository/p_You need to be logged in to vote'), 'You need to be logged in to vote.')
}
WebUI.click(findTestObject('Object Repository/a_Buggy Rating'))