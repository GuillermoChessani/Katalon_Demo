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

// 1. Arrange
WebUI.openBrowser(GlobalVariable.url_form)
WebUI.maximizeWindow()
WebUI.disableSmartWait()

def input_FirstName = findTestObject('Object Repository/Page_FillUpForm/input_FirstName')
def input_LastName = findTestObject('Object Repository/Page_FillUpForm/input_Last name_lastname')
def input_Date = findTestObject('Object Repository/Page_FillUpForm/input_Date_datepicker')
def input_Gender = findTestObject('Object Repository/Page_FillUpForm/input_Gender_sex')
def radio_YoE = findTestObject('Object Repository/Page_FillUpForm/input_Years of Experience_exp')
def radio_Automation = findTestObject('Object Repository/Page_FillUpForm/input_Profession_profession')
def radio_Manual = findTestObject('Object Repository/Page_FillUpForm/input_Profession_profession_1')
def radio_Selenium = findTestObject('Object Repository/Page_FillUpForm/input_Automation Tools_tool')
def sel_Region = findTestObject('Object Repository/Page_FillUpForm/select_AsiaEuropeAfricaAustraliaSouth Ameri_982c86')
def sel_skills = findTestObject('Object Repository/Page_FillUpForm/select_Browser CommandsNavigation CommandsS_69f390')
def btn_Submit = findTestObject('Object Repository/Page_FillUpForm/btnSubmit')

// 2. Act
WebUI.setText(input_FirstName, first_name)
WebUI.setText(input_LastName, last_name)
WebUI.click(input_Gender)
WebUI.click(radio_YoE)
WebUI.setText(input_Date, date)
WebUI.click(radio_Automation)
WebUI.click(radio_Manual)
WebUI.click(radio_Selenium)
WebUI.selectOptionByValue(sel_Region, 'North America', true)
WebUI.selectOptionByValue(sel_skills, 'Browser Commands', true)
WebUI.click(btn_Submit)

// 3. Assert
WebUI.verifyElementPresent(btn_Submit, 3)

// Close
WebUI.closeBrowser()


