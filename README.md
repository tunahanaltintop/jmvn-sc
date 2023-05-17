# jmvn-sc
Sample Java SOAP Client with Maven Structure for Teaching Purpose

<pre> Thanks for http://www.dneonline.com/calculator.asmx?wsdl </pre>

<pre> For creating SOAP client jar simply type maven "clean install". </pre>

<pre> If "Caused by: org.xml.sax.SAXParseException; systemId: Failed to read schema document 'xjc.xsd', because 'file' access is not allowed due to restriction set by the accessExternalSchema property." 
 exception is thrown while maven clean install then edit "yourJDKPath/jre/lib/jaxp.properties" file with "javax.xml.accessExternalSchema = all" row.
 If there is no file then create it.</pre>

<pre> Unit Test is in "src/test/java/com.tun.test.SampleTest.java" file.</pre>
