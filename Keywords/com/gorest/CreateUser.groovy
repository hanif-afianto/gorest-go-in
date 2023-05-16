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

import internal.GlobalVariable

public class CreateUser {

	JsonSlurper jsonSlurper = new JsonSlurper()

	@Keyword
	def verifyCreateUserBasicAuthPositive (ResponseObject response, String xname, String xgender, String xemail, String xstatus) {
		WS.verifyResponseStatusCode(response, 201)
		KeywordUtil.logInfo("HEADER\n"+response.getHeaderFields()+"\n\nBODY\n"+response.getResponseBodyContent())
		def jsonResp = jsonSlurper.parseText(response.getResponseText())

		if (xname == jsonResp.name && xgender == jsonResp.gender && xemail == jsonResp.email && xstatus == jsonResp.status && jsonResp.id != null) {
			KeywordUtil.markPassed("API Passed")
		}
		else {
			KeywordUtil.markFailed("API failed")
		}
	}

	@Keyword
	def verifyCreateUserNegative (ResponseObject response, String xname, String xgender, String xemail, String xstatus) {
		WS.verifyResponseStatusCode(response, 201)
		KeywordUtil.logInfo("HEADER\n"+response.getHeaderFields()+"\n\nBODY\n"+response.getResponseBodyContent())
		def jsonResp = jsonSlurper.parseText(response.getResponseText())

		if (xname == jsonResp.name && xgender == jsonResp.gender && xemail == jsonResp.email && xstatus == jsonResp.status && jsonResp.id != null) {
			KeywordUtil.markPassed("API Passed")
		}
		else {
			KeywordUtil.markFailed("API failed")
		}
	}

	@Keyword
	def verifyCreateUserNegative0 (ResponseObject response, String xname, String xgender, String xemail, String xstatus) {
		WS.verifyResponseStatusCode(response, 201)
		KeywordUtil.logInfo("HEADER\n"+response.getHeaderFields()+"\n\nBODY\n"+response.getResponseBodyContent())
		def jsonResp = jsonSlurper.parseText(response.getResponseText())

		if (xname == jsonResp.name && xgender == jsonResp.gender && xemail == jsonResp.email && xstatus == jsonResp.status && jsonResp.id != null) {
			KeywordUtil.markPassed("API Passed")
		}
		else {
			KeywordUtil.markFailed("API failed")
		}
	}
}
