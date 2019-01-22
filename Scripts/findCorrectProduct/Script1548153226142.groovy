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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.HomeUrl)

WebUI.setText(findTestObject('asadventure/navigation_menu/search_box'), 'Pullover Nordic Wood II')

WebUI.click(findTestObject('asadventure/navigation_menu/button_search'))

WebUI.verifyTextNotPresent(GlobalVariable.NoSearchResultsText, false)

WebUI.click(findTestObject('asadventure/search_results_page/filter_gender_btn'))

WebUI.waitForElementVisible(findTestObject('asadventure/search_results_page/gender_dropdown'), 1)

WebUI.click(findTestObject('asadventure/search_results_page/label_Women'))

WebUI.click(findTestObject('asadventure/search_results_page/gender_dropdown_close_btn'))

WebUI.click(findTestObject('asadventure/search_results_page/filter_colour_btn'))

WebUI.waitForElementVisible(findTestObject('asadventure/search_results_page/colour_dropdown'), 1)

WebUI.click(findTestObject('asadventure/search_results_page/label_grey'))

WebUI.click(findTestObject('asadventure/search_results_page/colour_dropdown_close_btn'))

WebUI.click(findTestObject('asadventure/search_results_page/product_tile'))

WebUI.verifyElementText(findTestObject('asadventure/product_page/product_name'), 'Pullover Nordic Wood II')

WebUI.closeBrowser()

