import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

WS.sendRequestAndVerify(findTestObject('SOAP Service/CalculatorSoap/Add'))

WS.sendRequest(findTestObject('REST/CreateUser'))

WS.sendRequest(findTestObject('SOAP Service/CalculatorSoap/Subtract'))

WS.sendRequest(findTestObject('REST/GetUser'))

