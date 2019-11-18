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

WebUI.navigateToUrl('https://dev.moscord.com/#/login')

WebUI.setText(findTestObject('Object Repository/Page_Moscord - login/input_Email Id_email'), 'anand@berge.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Moscord - login/input_Password_password'), 'lRjbE94itQ1Uo/YgcigLEg==')

WebUI.click(findTestObject('Object Repository/Page_Moscord - login/button_Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Moscord - Product List/button_ Add To cart'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Moscord - Product List/i_CART_fa fa-shopping-cart_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Moscord - cart/button_ Add Free Text Item'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Moscord - cart/input_IMPA CODE_form-control ng-untouched ng-valid ng-valid-maxlength ng-dirty ng-valid-parse_1'), 
    '7')

WebUI.setText(findTestObject('Object Repository/Page_Moscord - cart/input_IMPA CODE_form-control ng-untouched ng-valid ng-valid-maxlength ng-dirty ng-valid-parse_2'), 
    '79')

WebUI.setText(findTestObject('Object Repository/Page_Moscord - cart/input_IMPA CODE_form-control ng-untouched ng-valid ng-valid-maxlength ng-dirty ng-valid-parse_3'), 
    '792')

WebUI.setText(findTestObject('Object Repository/Page_Moscord - cart/input_IMPA CODE_form-control ng-untouched ng-valid ng-valid-maxlength ng-dirty ng-valid-parse_4'), 
    '7924')

WebUI.setText(findTestObject('Object Repository/Page_Moscord - cart/input_IMPA CODE_form-control ng-untouched ng-valid ng-valid-maxlength ng-dirty ng-valid-parse_5'), 
    '79242')

WebUI.setText(findTestObject('Object Repository/Page_Moscord - cart/input_IMPA CODE_form-control ng-untouched ng-valid ng-valid-maxlength ng-dirty ng-valid-parse_6'), 
    '792425')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Moscord - cart/button_ Add Free Text Item'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Moscord - order-preview/span_Ananda Naphade'))

WebUI.click(findTestObject('Object Repository/Page_Moscord - order-preview/a_Log out'))

WebUI.closeBrowser()

