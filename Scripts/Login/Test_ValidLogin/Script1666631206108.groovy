import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.url_login)
WebUI.maximizeWindow()

def id = CustomKeywords.'katalon.utils.ts'()

def input_username = findTestObject('Object Repository/Page_Login/textField_Username')
def input_password = findTestObject('Object Repository/Page_Login/textField_Password')
def btn_login = findTestObject('Object Repository/Page_Login/button_Login')
def msg_welcome = findTestObject('Object Repository/Page_Login/message_Welcome')
WebUI.setText(input_username, Username)
WebUI.setText(input_password, Password)
WebUI.click(btn_login)
WebUI.verifyElementVisible(msg_welcome)
WebUI.takeScreenshot(('Test Evidences/Successful_Login' + id) + '.jpg')

