import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.moscord.com/')

WebUI.setText(findTestObject('Page_Moscord - login/input_Email Id_email'), 'super-admin@mail.com')

WebUI.setEncryptedText(findTestObject('Page_Moscord - login/input_Password_password'), 'rFXAQJa7bf4=')

WebUI.click(findTestObject('Page_Moscord - login/button_Login'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Moscord - Product List/i_Views_fa fa-eye'))

WebUI.click(findTestObject('Object Repository/Page_Moscord - Product List/span_Create View'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Moscord - Product List/a_Actions'))

WebUI.click(findTestObject('Page_Moscord - Product List/a_Actions'))

WebUI.click(findTestObject('Object Repository/Page_Moscord - Product List/div_'))

WebUI.click(findTestObject('Page_Moscord - Product List/i_Actions_fa fa-arrow-down'))

WebUI.click(findTestObject('Object Repository/Page_Moscord - Product List/a_Add view'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Moscord - Product List/input_View Name_form-control ng-valid ng-touched ng-dirty ng-valid-parse'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_Moscord - Product List/button_Save'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Moscord - Bookmarks/span_Karissa Salonga'))

WebUI.click(findTestObject('Object Repository/Page_Moscord - Bookmarks/a_Log out'))

WebUI.closeBrowser()

