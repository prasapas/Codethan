import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Codeathon {

	@Given("I want to open browser")
	def i_want_to_open_github_application_Browser() {
		WebUI.openBrowser('')
		WebUI.delay(6)
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.url)
	}

	@When("user wants to enter the email address and password and click on login button")
	def i_want_enter_the_email_address() {
		WebUI.delay(4)
		WebUI.setText(findTestObject('Object Repository/loginpage/email'), 'prasannapasupuleti94@gmail.com')
	    WebUI.setText(findTestObject('Object Repository/loginpage/emailpassword'), 'HKps12#@')
		WebUI.click(findTestObject('Object Repository/loginpage/login'))
	}
	
	@Then("user wants to click on sing up button and needs to enter name email and password and confirmpassword")
	def user_wants_to_enter_name_email_password_confirmpassword() {
	   WebUI.delay(5)
	   WebUI.click(findTestObject('Object Repository/loginpage/signup'))
	   WebUI.setText(findTestObject('Object Repository/loginpage/name'), 'prasannapasupuleti')
	   WebUI.delay(3)
	   WebUI.setText(findTestObject('Object Repository/loginpage/signupemail'), 'prasannapasupuleti94@gmail.com')
	   WebUI.delay(3)
	   WebUI.setText(findTestObject('Object Repository/loginpage/signuppassword'), 'HKps12#@')
	   WebUI.delay(3)
	   WebUI.setText(findTestObject('Object Repository/loginpage/confirmpassword'), 'HKps12#@')
	   WebUI.delay(3)
	   WebUI.click(findTestObject('Object Repository/loginpage/submit'))
	}

	@Then("User wants to enter any invaild email id and invalid password and click on login button")
	def user_wnats_toenter_ivalid_username_password() {
		WebUI.delay(4)
		WebUI.setText(findTestObject('Object Repository/loginpage/email'), 'abcd@gmail.com')
		
		WebUI.setText(findTestObject('Object Repository/loginpage/emailpassword'), '122345')
		WebUI.click(findTestObject('Object Repository/loginpage/login'))
	}
	
	@Then("User should be able to see an error message is displayed indicating that both fields are required to login.")
	def user_wants_to_enter_blankemail_and_password_and_error_meassage() {
		WebUI.delay(3)
		WebUI.setText(findTestObject('Object Repository/loginpage/email'), '')
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/loginpage/emailpassword'), '')
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/loginpage/login'))
	}
	
	@Then("user should be able to enter name email id and password confirm password and click submit button")
	def user_should_be_enter_name_email_password_confirm_password() {
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/loginpage/signup'))
		WebUI.setText(findTestObject('Object Repository/loginpage/name'), 'prasannapasupuleti')
		WebUI.delay(3)
		WebUI.setText(findTestObject('Object Repository/loginpage/signupemail'), 'prasannapasupuleti94@gmail.com')
		WebUI.delay(3)
		WebUI.setText(findTestObject('Object Repository/loginpage/signuppassword'), 'HKps12#@')
		WebUI.delay(3)
		WebUI.setText(findTestObject('Object Repository/loginpage/confirmpassword'), 'HKps12#@')
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/loginpage/submit'))
		
	}
	
	

	
}