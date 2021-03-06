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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://buggy.justtestit.org/')

WebUI.click(findTestObject('Object Repository/Page_Buggy Cars Rating/a_Register'))

CustomKeywords.'com.cr.utilities.CommonUtilities.GenerateUniqueRandomNumber'(findTestObject('Page_Buggy Cars Rating/input_Login_username'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_Buggy Cars Rating/input_First Name_firstName'), 'CR')

WebUI.setText(findTestObject('Object Repository/Page_Buggy Cars Rating/input_Last Name_lastName'), 'CR')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Buggy Cars Rating/input_Password_password'), '3Z9vEXbPUsCXoVJvFuFLvQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Buggy Cars Rating/input_Confirm Password_confirmPassword'), 
    '3Z9vEXbPUsCXoVJvFuFLvQ==')

WebUI.click(findTestObject('Object Repository/Page_Buggy Cars Rating/button_Register'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Buggy Cars Rating/div_Registration is successful'), 'Registration is successful')

WebUI.setText(findTestObject('Object Repository/Page_Buggy Cars Rating/input_Buggy Rating_login'), GlobalVariable.UniqUserID)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Buggy Cars Rating/input_Buggy Rating_password'), '3Z9vEXbPUsCXoVJvFuFLvQ==')

WebUI.click(findTestObject('Object Repository/Page_Buggy Cars Rating/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Buggy Cars Rating/span_Hi, c'), 'Hi, CR')

