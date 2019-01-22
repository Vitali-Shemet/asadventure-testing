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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.HomeUrl)

WebUI.setText(findTestObject('asadventure/navigation_menu/search_box'), productName)

WebUI.click(findTestObject('asadventure/navigation_menu/button_search'))

WebUI.verifyTextNotPresent(GlobalVariable.NoSearchResultsText, false)

WebUI.click(findTestObject('asadventure/search_results_page/filter_colour_btn'))

WebUI.click(findTestObject('asadventure/search_results_page/label_grey'))

WebUI.click(findTestObject('asadventure/search_results_page/colour_dropdown_close_btn'))

WebUI.click(findTestObject('asadventure/search_results_page/product_tile'))

WebUI.verifyElementText(findTestObject('asadventure/product_page/product_name'), productName)

WebUI.selectOptionByLabel(findTestObject('asadventure/product_page/select_size_btn'), 'XL', false)

WebUI.click(findTestObject('asadventure/product_page/add_to_basket_btn'))

WebUI.click(findTestObject('asadventure/product_page/go_to_basket_popup'))

WebUI.click(findTestObject('asadventure/basket_page/checkout_btn'))

WebUI.setText(findTestObject('asadventure/checkout_welcome_page/email_address'), 'test.user21@mailinator.com')

WebUI.waitForElementVisible(findTestObject('asadventure/checkout_welcome_page/login_checkbox'), 1)

WebUI.check(findTestObject('asadventure/checkout_welcome_page/login_checkbox'))

WebUI.setText(findTestObject('asadventure/checkout_welcome_page/input_password'), 'DSNYktEjpD9MTMA')

WebUI.click(findTestObject('asadventure/checkout_welcome_page/continue_to_checkout_btn'))

WebUI.waitForElementVisible(findTestObject('asadventure/basket_page/buy_steps_section'), 1)

WebUI.click(findTestObject('asadventure/navigation_menu/continue_shopping_btn'))

WebUI.verifyElementText(findTestObject('asadventure/navigation_menu/basket_badge'), '1')

WebUI.click(findTestObject('asadventure/navigation_menu/basket_badge'))

sleep(1000)

WebUI.click(findTestObject('asadventure/navigation_menu/go_to_basket_btn'))

WebUI.verifyElementText(findTestObject('asadventure/basket_page/product_name'), productName)

WebUI.verifyElementText(findTestObject('asadventure/basket_page/product_size'), 'XL')

WebUI.click(findTestObject('asadventure/basket_page/remove_product_btn'))

WebUI.waitForElementVisible(findTestObject('asadventure/basket_page/empty_basket_message'), 0)

WebUI.click(findTestObject('asadventure/navigation_menu/div_Account'))

sleep(1000)

WebUI.click(findTestObject('asadventure/accountPanel/button_Logout'))

WebUI.closeBrowser()

