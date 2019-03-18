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




import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

'Get full directory\'s path of android application'
def appPath = RunConfiguration.getProjectDir() + '/androidapp/APIDemos.apk'

Mobile.startApplication(appPath, false)

Mobile.tap(findTestObject('Application/android.widget.TextView - Graphics'), 10)

Mobile.scrollToText('Xfermodes')

def objectGetTextXfermodes = 'Application/Graphics/android.widget.TextView - Xfermodes'

'Get item\'s label'
def itemText = Mobile.getText(findTestObject(objectGetTextXfermodes), 10)

Mobile.verifyEqual(itemText, 'Xfermodes')

Mobile.closeApplication()