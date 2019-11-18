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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.moscord.com/#/login')

WebUI.setText(findTestObject('Page_Moscord - login/input_Email Id_email'), 'testbuyer1@mail.com')

WebUI.setEncryptedText(findTestObject('Page_Moscord - login/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Moscord - login/span_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Moscord - Product List/button_ Add To cart'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Moscord - Product List/i_CART_fa fa-shopping-cart'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Moscord - cart/button_Complete Availability Request'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_Moscord - cart/input_Reference NumberText  _reference'), 'test')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Moscord - cart/button_Availability Request for Download'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Moscord - order-preview/button_Download availability request now'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Moscord - order-preview/span_test buyer'))

WebUI.click(findTestObject('Page_Moscord - order-preview/a_Log out'))

WebUI.closeBrowser()

