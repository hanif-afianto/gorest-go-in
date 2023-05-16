<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create User (Basic Auth)</name>
   <tag></tag>
   <elementGuidId>04e70577-6a26-43cd-8579-3db30d11350f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>true</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;name\&quot;:\&quot;${name}\&quot;, \n    \&quot;gender\&quot;:\&quot;${gender}\&quot;, \n    \&quot;email\&quot;:\&quot;${email}\&quot;, \n    \&quot;status\&quot;:\&quot;${status}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>ead8c1d8-b8ca-4013-a431-3c0dab9b6fd2</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${baseUrl}/users?access-token=${access-token}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'33f362a99b0538ac3b0799681d1ecd933f1f103abe0152615c41547ba8211492'</defaultValue>
      <description></description>
      <id>7a349f75-5b4f-4b4c-92cd-bd0602de09a9</id>
      <masked>false</masked>
      <name>access-token</name>
   </variables>
   <variables>
      <defaultValue>'sumarno'</defaultValue>
      <description></description>
      <id>4e984da6-b6af-45ee-bde3-649138f4d65b</id>
      <masked>false</masked>
      <name>name</name>
   </variables>
   <variables>
      <defaultValue>'male'</defaultValue>
      <description></description>
      <id>d5221d88-d3e5-4afa-b589-0405133e45a7</id>
      <masked>false</masked>
      <name>gender</name>
   </variables>
   <variables>
      <defaultValue>'test001@sum.com'</defaultValue>
      <description></description>
      <id>5d1b933b-7d3c-431a-8fbc-bd56c49348ba</id>
      <masked>false</masked>
      <name>email</name>
   </variables>
   <variables>
      <defaultValue>'inactive'</defaultValue>
      <description></description>
      <id>8246dae2-3134-4e58-bbd8-a8572db0897c</id>
      <masked>false</masked>
      <name>status</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.baseUrl_v1</defaultValue>
      <description></description>
      <id>a281cdcd-bd48-4250-af1b-b22b658c4aab</id>
      <masked>false</masked>
      <name>baseUrl</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
