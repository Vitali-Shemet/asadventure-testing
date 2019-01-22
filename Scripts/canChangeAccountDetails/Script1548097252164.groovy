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

Random random = new Random()

newPhoneNum = random.nextInt(999999999).toString()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.HomeUrl)

WebUI.click(findTestObject('asadventure/navigation_menu/div_Account'))

WebUI.setText(findTestObject('asadventure/accountPanel/input_Account_email'), GlobalVariable.Login)

WebUI.setText(findTestObject('asadventure/accountPanel/input_Account_password'), GlobalVariable.Password)

WebUI.click(findTestObject('asadventure/accountPanel/button_Login'))

WebUI.waitForElementVisible(findTestObject('asadventure/accountPanel/a_Profile details'), 3)

WebUI.click(findTestObject('asadventure/accountPanel/a_Profile details'))

WebUI.setText(findTestObject('asadventure/profile_details_page/input_Phone number_phone'), newPhoneNum)

WebUI.click(findTestObject('asadventure/profile_details_page/button_update your account'))

WebUI.waitForElementVisible(findTestObject('asadventure/profile_details_page/div_Your details were successf'), 3)

WebUI.refresh()

text = WebUI.getAttribute(findTestObject('asadventure/profile_details_page/input_Phone number_phone'), 'value')

WebUI.verifyMatch(text, newPhoneNum, false)

WebUI.click(findTestObject('asadventure/navigation_menu/div_Account'))

sleep(1000)

WebUI.click(findTestObject('asadventure/accountPanel/button_Logout'))

WebUI.closeBrowser()

