import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//generate token-access
yaccess_token = CustomKeywords.'com.gorest.Utils.getToken'()

//run test cases
switch(xcase) {
	
	case 0:
	
		//generate random email
		String yemail = CustomKeywords.'com.gorest.Utils.randomVariable'('xemail')
		
		//generate random name
		String yname = CustomKeywords.'com.gorest.Utils.randomVariable'('xname')
		
		//Hit API Create User
		RequestObject objectRepo = findTestObject('Create User/Create User (Basic Auth)',
			[('baseUrl') : GlobalVariable.baseUrl_v2, ('access-token') : yaccess_token, ('name') : yname, ('gender') : 'male', ('email') : yemail, ('status') : 'active'])
		objectResp = WS.sendRequest(objectRepo, FailureHandling.STOP_ON_FAILURE)
		
		//Verify case positive
		CustomKeywords.'com.gorest.CreateUser.verifyCreateUserBasicAuthPositive'(objectResp, yname, 'male', yemail, 'active')
		break
	
		
	case 1:
	
		//generate random email
		String yemail = CustomKeywords.'com.gorest.Utils.randomVariable'('xemail')
		
		//generate random name
		String yname = CustomKeywords.'com.gorest.Utils.randomVariable'('xname')
	
		//Hit API Create User
		RequestObject objectRepo = findTestObject('Create User/Create User (Basic Auth)',
			[('access-token') : yaccess_token, ('name') : yname, ('gender') : 'female', ('email') : yemail, ('status') : 'inactive'])
		objectResp = WS.sendRequest(objectRepo, FailureHandling.STOP_ON_FAILURE)
		
		//Verify case positive
		CustomKeywords.'com.gorest.CreateUser.verifyCreateUserBasicAuthPositive'(objectResp, yname, 'female', yemail, 'inactive')
		break
		
		
	case 2:
	
		//generate random email
		String yemail = CustomKeywords.'com.gorest.Utils.randomVariable'('xemail')
		
		//generate random name
		String yname = CustomKeywords.'com.gorest.Utils.randomVariable'('xname')
		
		//Hit API Create User
		RequestObject objectRepo = findTestObject('Create User/Create User (Basic Auth)',
			[('access-token') : yaccess_token, ('name') : yname, ('gender') : 'male', ('email') : yemail, ('status') : 'inactive'])
		objectResp = WS.sendRequest(objectRepo, FailureHandling.STOP_ON_FAILURE)
		
		//Verify case positive
		CustomKeywords.'com.gorest.CreateUser.verifyCreateUserBasicAuthPositive'(objectResp, yname, 'male', yemail, 'inactive')
		break
		
		
	case 3:
	
		//generate random email
		String yemail = CustomKeywords.'com.gorest.Utils.randomVariable'('xemail')
		
		//generate random name
		String yname = CustomKeywords.'com.gorest.Utils.randomVariable'('xname')
	
		//Hit API Create User
		RequestObject objectRepo = findTestObject('Create User/Create User (Basic Auth)',
			[('access-token') : yaccess_token, ('name') : yname, ('gender') : 'female', ('email') : yemail, ('status') : 'inactive'])
		objectResp = WS.sendRequest(objectRepo, FailureHandling.STOP_ON_FAILURE)
		
		//Verify case positive
		CustomKeywords.'com.gorest.CreateUser.verifyCreateUserBasicAuthPositive'(objectResp, yname, 'female', yemail, 'inactive')
		break
		
				
	case 4:
	
		//generate random email
		String yemail = CustomKeywords.'com.gorest.Utils.randomVariable'('xemail')
		
		//generate random name
		String yname = CustomKeywords.'com.gorest.Utils.randomVariable'('xname')
		
		//generate random gender
		String ygender = CustomKeywords.'com.gorest.Utils.randomVariable'('xname')
	
		//Hit API Create User
		RequestObject objectRepo = findTestObject('Create User/Create User (Basic Auth)',
			[('access-token') : yaccess_token, ('name') : yname, ('gender') : ygender, ('email') : yemail, ('status') : 'inactive'])
		objectResp = WS.sendRequest(objectRepo, FailureHandling.STOP_ON_FAILURE)
		
		//Verify case negative 1
		CustomKeywords.'com.gorest.CreateUser.verifyCreateUserBasicAuthPositive'(objectResp, yname, 'helicopter', yemail, 'inactive')
		break
		
		
	case 5:
	
		//generate random email
		String yemail = CustomKeywords.'com.gorest.Utils.randomVariable'('xemail')
		
		//generate random name
		String yname = CustomKeywords.'com.gorest.Utils.randomVariable'('xname')
		
		//generate random status
		String ystatus = CustomKeywords.'com.gorest.Utils.randomVariable'('xname')
	
		//Hit API Create User
		RequestObject objectRepo = findTestObject('Create User/Create User (Basic Auth)',
			[('access-token') : yaccess_token, ('name') : yname, ('gender') : 'female', ('email') : yemail, ('status') : ystatus])
		objectResp = WS.sendRequest(objectRepo, FailureHandling.STOP_ON_FAILURE)
		
		//Verify case negative
		CustomKeywords.'com.gorest.CreateUser.verifyCreateUserBasicAuthPositive'(objectResp, yname, 'female', yemail, ystatus)
		break		
	
					
	case 6:
	
		//generate random email
		String yemail = CustomKeywords.'com.gorest.Utils.randomVariable'('xemail')
		
		//generate random name
		String yname = CustomKeywords.'com.gorest.Utils.randomVariable'('xname')
	
		//generate random invalid email
		String yInvalidEmail = CustomKeywords.'com.gorest.Utils.randomVariable'('xInvalidEmail')
	
		//Hit API Create User
		RequestObject objectRepo = findTestObject('Create User/Create User (Basic Auth)',
			[('access-token') : yaccess_token, ('name') : yname, ('gender') : 'male', ('email') : yInvalidEmail, ('status') : 'inactive'])
		objectResp = WS.sendRequest(objectRepo, FailureHandling.STOP_ON_FAILURE)
		
		//Verify case negative 1
		CustomKeywords.'com.gorest.CreateUser.verifyCreateUserBasicAuthPositive'(objectResp, yname, 'helicopter', yemail, 'inactive')
		break
		
		
	case 7:
		
		//generate random name
		String yname = CustomKeywords.'com.gorest.Utils.randomVariable'('xname')
		
		//get email from other another user existing
		yDuplicateEmail = CustomKeywords.'com.gorest.Utils.getDuplicateEmail'()
	
		//Hit API Create User
		RequestObject objectRepo = findTestObject('Create User/Create User (Basic Auth)',
			[('access-token') : yaccess_token, ('name') : yname, ('gender') : 'female', ('email') : yDuplicateEmail, ('status') : 'active'])
		objectResp = WS.sendRequest(objectRepo, FailureHandling.STOP_ON_FAILURE)
		
		//Verify case negative
		CustomKeywords.'com.gorest.CreateUser.verifyCreateUserBasicAuthPositive'(objectResp, yname, 'female', yemail, 'active')
		break		
		
		
	case 8:
	
		//generate random email
		String yemail = CustomKeywords.'com.gorest.Utils.randomVariable'('xemail')
		
		//generate random name
		String yname = CustomKeywords.'com.gorest.Utils.randomVariable'('xname')
	
		//Hit API Create User
		RequestObject objectRepo = findTestObject('Create User/Create User (Basic Auth)',
			[('access-token') : yaccess_token, ('name') : yname, ('gender') : 'female', ('email') : yemail, ('status') : 'inactive'])
		objectResp = WS.sendRequest(objectRepo, FailureHandling.STOP_ON_FAILURE)
		
		//Verify case positive
		CustomKeywords.'com.gorest.CreateUser.verifyCreateUserBasicAuthPositive'(objectResp, yname, 'female', yemail, 'inactive')
		break
		
				
	case 9:
	
		//generate random email
		String yemail = CustomKeywords.'com.gorest.Utils.randomVariable'('xemail')
		
		//generate random name
		String yname = CustomKeywords.'com.gorest.Utils.randomVariable'('xname')
		
		//generate random gender
		String ygender = CustomKeywords.'com.gorest.Utils.randomVariable'('xname')
	
		//Hit API Create User
		RequestObject objectRepo = findTestObject('Create User/Create User (Basic Auth)',
			[('access-token') : yaccess_token, ('name') : yname, ('gender') : ygender, ('email') : yemail, ('status') : 'inactive'])
		objectResp = WS.sendRequest(objectRepo, FailureHandling.STOP_ON_FAILURE)
		
		//Verify case negative 1
		CustomKeywords.'com.gorest.CreateUser.verifyCreateUserBasicAuthPositive'(objectResp, yname, 'helicopter', yemail, 'inactive')
		break
		
		
	case 10:
	
		//generate random email
		String yemail = CustomKeywords.'com.gorest.Utils.randomVariable'('xemail')
		
		//generate random name
		String yname = CustomKeywords.'com.gorest.Utils.randomVariable'('xname')
		
		//generate random status
		String ystatus = CustomKeywords.'com.gorest.Utils.randomVariable'('xname')
	
		//Hit API Create User
		RequestObject objectRepo = findTestObject('Create User/Create User (Basic Auth)',
			[('access-token') : yaccess_token, ('name') : yname, ('gender') : 'female', ('email') : yemail, ('status') : ystatus])
		objectResp = WS.sendRequest(objectRepo, FailureHandling.STOP_ON_FAILURE)
		
		//Verify case negative
		CustomKeywords.'com.gorest.CreateUser.verifyCreateUserBasicAuthPositive'(objectResp, yname, 'female', yemail, 'single')
		break		
	
					
	case 11:
	
		//generate random email
		String yemail = CustomKeywords.'com.gorest.Utils.randomVariable'('xemail')
		
		//generate random name
		String yname = CustomKeywords.'com.gorest.Utils.randomVariable'('xname')
	
		//generate random invalid email
		String yInvalidEmail = CustomKeywords.'com.gorest.Utils.randomVariable'('xInvalidEmail')
	
		//Hit API Create User
		RequestObject objectRepo = findTestObject('Create User/Create User (Basic Auth)',
			[('access-token') : yaccess_token, ('name') : yname, ('gender') : 'male', ('email') : yInvalidEmail, ('status') : 'inactive'])
		objectResp = WS.sendRequest(objectRepo, FailureHandling.STOP_ON_FAILURE)
		
		//Verify case negative 1
		CustomKeywords.'com.gorest.CreateUser.verifyCreateUserBasicAuthPositive'(objectResp, yname, 'helicopter', yemail, 'inactive')
		break
		
		
	case 12:
		
		//generate random email
		String yemail = CustomKeywords.'com.gorest.Utils.randomVariable'('xemail')
		
		//generate random name
		String yname = CustomKeywords.'com.gorest.Utils.randomVariable'('xname')
		
		//generate invalid token-access
		yinvalid_access_token = yaccess_token + '1'
	
		//Hit API Create User
		RequestObject objectRepo = findTestObject('Create User/Create User (Basic Auth)',
			[('access-token') : yinvalid_access_token, ('name') : yname, ('gender') : 'female', ('email') : yname, ('status') : 'active'])
		objectResp = WS.sendRequest(objectRepo, FailureHandling.STOP_ON_FAILURE)
		
		//Verify case negative
		CustomKeywords.'com.gorest.CreateUser.verifyCreateUserBasicAuthPositive'(objectResp, yname, 'female', yemail, 'active')
		break
}