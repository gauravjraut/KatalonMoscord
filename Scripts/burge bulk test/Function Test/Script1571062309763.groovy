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

WebUI.setText(findTestObject('Page_Moscord - login/input_Email Id_email'), 'anand@berge.com')

WebUI.setEncryptedText(findTestObject('Page_Moscord - login/input_Password_password'), 'lRjbE94itQ1Uo/YgcigLEg==')

WebUI.click(findTestObject('Page_Moscord - login/span_Login'))

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('Page_Moscord - Product List/select_DefaultCodesDetailsPrices'), 'codes', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Page_Moscord - Product List/select_DefaultCodesDetailsPrices'), 'details', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Page_Moscord - Product List/select_DefaultCodesDetailsPrices'), 'prices', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Page_Moscord - Product List/select_DefaultCodesDetailsPrices'), 'mainView', true)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Moscord - Product List/img_All Ports_cursor-pointer-show'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Moscord - Product List/img_All Ports_cursor-pointer-show_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Moscord - Product List/span_Ananda Naphade'))

WebUI.click(findTestObject('Page_Moscord - Product List/a_Log out'))

WebUI.closeBrowser()

