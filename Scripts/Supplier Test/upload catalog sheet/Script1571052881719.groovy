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

WebUI.setText(findTestObject('Page_Moscord - login/input_Email Id_email'), 'testsupplier123@mail.com')

WebUI.setEncryptedText(findTestObject('Page_Moscord - login/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Moscord - login/button_Login'))

WebUI.delay(10)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Moscord - Product List/span_Upload Catalog'), 0)

WebUI.click(findTestObject('Object Repository/Page_Moscord - Product List/span_Upload Catalog'))

WebUI.uploadFile(findTestObject(null), 'C:\\Users\\Lenovo\\Desktop\\catalog\\Catalogue_Template_123 (1).xlsx')

WebUI.click(findTestObject('Object Repository/Page_Moscord - catalog/i_upload_fa fa-upload'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Moscord - catalog/i_Log out_fa fa-list'))

WebUI.click(findTestObject('Object Repository/Page_Moscord - Product List/span_test supplier'))

WebUI.click(findTestObject('Page_Moscord - Product List/a_Log out'))

WebUI.closeBrowser()

