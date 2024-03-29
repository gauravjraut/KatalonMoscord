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

WebUI.setText(findTestObject('Page_Moscord - login/input_Email Id_email'), 'testbuyer1@mail.com')

WebUI.setEncryptedText(findTestObject('Page_Moscord - login/input_Password_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Page_Moscord - login/button_Login'))

WebUI.delay(10)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Moscord - Product List/img_All Ports_cursor-pointer-show'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Moscord - Product List/img_All Ports_cursor-pointer-show'))

WebUI.delay(10)

WebUI.verifyElementClickable(findTestObject('Page_Moscord - Product List/button_ Add To cart'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Moscord - Product List/button_ Add To cart'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Moscord - Product List/button_ Add To cart'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Page_Moscord - Product List/select_USDEURSGDGBP'), 'string:SGD', true)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Moscord - Product List/i_CART_fa fa-shopping-cart'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Moscord - cart/button_Complete Order'), 0)

WebUI.click(findTestObject('Object Repository/Page_Moscord - cart/button_Complete Order'))

WebUI.setText(findTestObject('Object Repository/Page_Moscord - cart/input_Reference NumberText _form-control ng-untouched ng-valid ng-dirty ng-valid-parse'), 
    'a')

WebUI.click(findTestObject('Object Repository/Page_Moscord - cart/input_Delivery  _typeOfAddress'))

WebUI.click(findTestObject('Object Repository/Page_Moscord - cart/input_Alongside Ship (Incoterms DDP)_addresses'))

WebUI.click(findTestObject('Object Repository/Page_Moscord - cart/button_Finalize for download'))

WebUI.delay(15)

WebUI.waitForElementClickable(findTestObject('Page_Moscord - order-preview/button_Download order here'), 0)

WebUI.click(findTestObject('Page_Moscord - order-preview/button_Download order here'))

WebUI.click(findTestObject('Page_Moscord - order-preview/span_test buyer'))

WebUI.click(findTestObject('Page_Moscord - order-preview/a_Log out'))

WebUI.closeBrowser()

