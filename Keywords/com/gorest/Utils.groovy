package com.gorest

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import groovy.json.JsonSlurper
import com.kms.katalon.core.util.KeywordUtil

public class Utils {

	JsonSlurper jsonSlurper = new JsonSlurper()

	private static randomStringGenerator(int length, int type) {
		switch(type) {
			case 0:
				String alphabet = (('A'..'Z')+('a'..'z')+('0'..'9')).join()
				def randomString = new Random().with {
					(1..length).collect {
						alphabet[ nextInt( alphabet.length() ) ]
					}.join()
				}
				return randomString
				break
			case 1:
				String alphabet = (('A'..'Z')+('a'..'z')).join()
				def randomString = new Random().with {
					(1..length).collect {
						alphabet[ nextInt( alphabet.length() ) ]
					}.join()
				}
				return randomString
				break
		}
	}

	@Keyword
	def randomVariable(String field) {
		switch(field) {
			case 'xname':
				randomStringGenerator(10, 1)
				break
			case 'xemail':
				String xmail = randomStringGenerator(10, 0) + '@test.com'
				break
			case 'xInvalidEmail':
				String xmail = randomStringGenerator(10, 0) + '_test@com'
				break
		}
	}

	@Keyword
	def getToken () {
		RequestObject objectRepo = findTestObject('Object Repository/Get Token/Get Token')
		def objectResp = WS.sendRequest(objectRepo, FailureHandling.STOP_ON_FAILURE)
		String resp = objectResp.getResponseBodyContent()
		String token = (resp.substring(0, resp.length()-990)).substring(4147)
		return token
	}

	@Keyword
	def get() {
	}

	@Keyword
	def getDuplicateEmail() {
		getToken()
		RequestObject objectRepo = findTestObject('Get User/User Detail (Basic Auth)')
		def objectResp = WS.sendRequest(objectRepo, FailureHandling.STOP_ON_FAILURE)
		KeywordUtil.logInfo("HEADER\n"+objectResp.getHeaderFields()+"\n\nBODY\n"+objectResp.getResponseBodyContent())
		def jsonResp = jsonSlurper.parseText(objectResp.getResponseText())
		String getEmail = jsonResp.email
		return getEmail
	}
}
