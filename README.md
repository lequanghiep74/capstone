# DEMO Reniec Document
# 1. Protocol
* Use SOAP protocol.

# 2. Request
* Request URL: https://wsbiometricold.reniec.gob.pe/svbiometrica/BiometricVerificationService?wsdl
* Method: POST
* Header:
    * Host: wsbiometricold.reniec.gob.pe
    * Content-Type: text/xml;charset=UTF-8
* Parameter:
    * http.socket.timeout
    * http.connection.timeout
* Content:
    * Format:
    ```xml
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:impl="https://impl.ws.svb.biometric.reniec.gob.pe/">
        <soapenv:Header/>
        <soapenv:Body>
            <impl:verificarIdentidad>
                <wsqRight>wsqRight</wsqRight>
                <wsqLeft>wsqLeft</wsqLeft>
                <nuRuc>nuRuc</nuRuc>
                <nuDni>nuDni</nuDni>
                <codUsuario>codUsuario</codUsuario>
                <ipCliente>ipCliente</ipCliente>
                <macCliente>macCliente</macCliente>
            </impl:verificarIdentidad>
        </soapenv:Body>
    </soapenv:Envelope>
    ```
    
    * Input parameters:
    
    |   | Parameter Name | Description | Type | Size | Example |
    | --- | --- | --- | --- | --- | --- |
    | **1** | wsqRight | Right fingerprint in WSQ format | byte[] | Uncertain | Bytes |
    | **2** | wsqLeft | Left fingerprint in WSQ format | byte[] | Uncertain | Bytes |
    | **3** | nuRuc | RUC number of the entity (Company, Institution) | String | 11 | 10456234572 |
    | **4** | nuDni | DNI (ID Card) number of citizen | String | 8 | 46235986 |
    | **5** | codUsuario | DNI (ID Card) of the user who performs the biometric consultation. | String | 8 | 43652415 |
    | **6** | ipCliente | IP address of customer | String | Uncertain | 10.50.28.170 |
    | **7** | macCliente | MAC address of customer | String | Uncertain | D4-C9-EHD6-4B-0C |
       
    * Example: 
    ```xml
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:impl="https://impl.ws.svb.biometric.reniec.gob.pe/">
        <soapenv:Header/>
        <soapenv:Body>
            <impl:verificarIdentidad>
                <wsqRight>
                    /6D/qAB6TklTVF9DT00gOQpQSVhfV0lEVEggNTEyC...
                </wsqRight>
                <wsqLeft>
                    /6D/qAB6TklTVF9DT00gOQpQSVhfV0lEVEggNT...
                </wsqLeft>
                <nuRuc>20543254798</nuRuc>
                <nuDni>71851914</nuDni>
                <codUsuario>72725051</codUsuario>
                <ipCliente>10.121.8.133</ipCliente>
                <macCliente>84-98-66-EF-04-A3</macCliente>
            </impl:verificarIdentidad>
        </soapenv:Body>
    </soapenv:Envelope>
    ```
    
# 3. Result
* Output parameters:

|   | SOAP Response | Description | Type | 
| --- | --- | --- | --- |
| **1** | Code of result of checkBiometric (Corresponds, No Corresponds and Error). | This code and/or message represents the returned value of the biometric query, the returned values ​​can be:<br/>- If Corresponds (70006) <br/>- Not Corresponding (70007) <br/>- ERROR (Error code of Tables 3 and 4) | byte[] |
| **2** | DNI | DNI of citizen | byte[] |
| **3** | Names | Names of the consulted citizen. | String |
| **4** | Last Name | Last Name of citizen | String |
| **5** | Mother's last name | Mother's last name of citizen | String |
| **6** | Date DNI expiration | Expiration date of the DNI consulted. | String |
| **7** | Restriction |  Restriction Code. (Table 5) | String |

* Result codes of some problem in the fingerprint sent to the service:

|   | SOAP Response (Code) | Description | Type | Size | Example |
| --- | --- | --- | --- | --- | --- |
| **1** | 100 | Object sent for the biometric query is null. | String | Uncertain | resp [0]: 100 <br/>resp [1]: It has found data null in the object sent for query biometric |
| **2** | 101 | Null data was found in the object sent for the query biometric | String | Uncertain | resp [0]: 101 <br/>resp [1]: It has found data invalid in the object sent for the consultationbiometric |
| **3** | 102 | Invalid data foundin the object sent for the querybiometric | String | Uncertain | resp [0]: 102 <br/>resp [1]: It has found data invalid in the object sent for the consultationbiometric |
| **4** | 109 | An exception was generated in the biometric comparison process of the biometric templates | String | Uncertain | resp [0]: 109 <br/>resp [1]: Generated an exception in the process of comparison biometric templates biometrics |
| **5** | 110 | Error in fingerprintsWSQ sent for the query biometric | String | Uncertain | resp [0]: 110 <br/>resp [1]: Error in the images WSQ fingerprints sent for query biometric |
| **6** | 111 | The templates could not be obtainedbiometric of the citizen from theWSQ images | String | Uncertain | resp [0]: 111 <br/>resp [1]: I do not know managed to get the templates biometric citizen from the imagesWSQ |
| **7** | 112 | WSQ fingerprintssent for the biometric queryThey are of low quality | String | Uncertain | resp [0]: 112 <br/>resp [1]: The images WSQ fingerprints sent for query biometric are from low quality |
| **8** | 120 | Error in the WSQ fingerprintsent for the biometric query | String | Uncertain | resp [0]: 120 <br/>resp [1]: Error in the fingerprint WSQ sent for the consultation biomedical |
| **9** | 121 | The template could not be obtainedbiometric of the citizen from theWSQ image | String | Uncertain | resp [0]: 121 <br/>resp [1]: I do not know managed to get the biometric template of the citizen from the image WSQ. |
| **10** | 122 | The WSQ fingerprint sent for the biometric query is low quality | String | Uncertain | resp [0]: 122 <br/>resp [1]: The image WSQ fingerprint sent for query biometric is of low quality |
| **11** | 200 | The DLL library for the biometric consultation service in the MOO. | String | Uncertain | resp [0]: 200 <br/>resp [1]: I do not know loaded the bookstore DLL for the Service query biometric in the MOO |
| **12** | 202 | No records of the number were foundof DNI in the AFIS | String | Uncertain | resp [0]: 202 <br/>resp [1]: I do not know found records of the number of DNI in the AFIS |
| **13** | 203 | No biometric templates found of the DNI number in the AFIS. | String | Uncertain | resp [0]: 203 <br/>resp [1]: I do not know found templates biometric ID number in the AFIS |
| **14** | 206 | Biometric template format declared in the object is not valid | String | Uncertain | resp [0]: 206 <br/>resp [1]: Format of template biometric declared in the object is not valid |
| **15** | 207 | More than one record found of active biometric templates for the DNI number in the AFIS. | String | Uncertain | resp [0]: 207 <br/>resp [1]: It has found more of a record of templates biometrics active for ID number in the AFIS |
| **16** | 208 | Identifier in the AFIS for the DNI number is null or empty. | String | Uncertain | resp [0]: 208 <br/>resp [1]: Identifier in the AFIS for the ID number is null or empty |
| **17** | 209 | The record corresponding to DNI number in the AFIS no contains the biometric templates, it found null values | String | Uncertain | resp [0]: 209 <br/>resp [1]: The record corresponding to ID number in the AFIS does not contains the templates biometric found values null |
| **18** | 210 | The record corresponding to DNI number in the AFIS no contains a biometric template, it found one of the templates with zero value | String | Uncertain | resp [0]: 210 <br/>resp [1]: The record corresponding to ID number in the AFIS does not contains one template biometric found one of the templates with zero value |
| **19** | 212 | No image obtained WSQ fingerprint from the client to the biometric consultation | String | Uncertain | resp [0]: 212 <br/>resp [1]: It has not been obtained none fingerprint WSQ from the client for query biometric  |
| **20** | 213 | An exception was generated at the level of communication with the component MOO. | String | Uncertain | resp [0]: 213 <br/>resp [1]: Generated an exception to level of communication with the component MOO |

* Result codes of some problem in validation, entity or user verification:

|   | SOAP Response (Code) | Description | Type | Size | Example |
| --- | --- | --- | --- | --- | --- |
| **1** | 2 | The user doesn't exist | String | Uncertain | resp [0]: 2 <br/>resp [1]: "The user does not exist" |
| **2** | 3 | Entity is not registeredand / or does not have agreements with RENIEC | String | Uncertain | resp [0]: 3 <br/>resp [1]: "Entity Is not found registered and/or not has agreementswith RENIEC" |
| **3** | 4 | Entity does not have this service | String | Uncertain | resp [0]: 4 <br/>resp [1]: "Entity it does not count with this service" |
| **4** | 5 | The agreement of the entity with RENIEC is disabled | String | Uncertain | resp [0]: 5 <br/>resp [1]: "The agreement of the entity with RENIEC find disabled" |
| **5** | 6 | The service is disabled for this entity | String | Uncertain | resp [0]: 6 <br/>resp [1]: "The service it's found disabled for this entity" |
| **6** | 7 | The service is not valid for this entity | String | Uncertain | resp [0]: 7 <br/>resp [1]: "The service is not available for this entity" |
| **7** | 8 | The user is disabled for this service the entity | String | Uncertain | resp [0]: 8 <br/>resp [1]: "The user it's found disabled for this service of the entity" |
| **8** | 9 | The user is canceled in the agreement | String | Uncertain | resp [0]: 9 <br/>resp [1]: "The user it's found canceled in theagreement" |
| **9** | 10 | The user is deleted | String | Uncertain | resp [0]: 10 <br/>resp [1]: "The user is eliminated" |
| **10** | 11 | The user is not found registered in the agreement | String | Uncertain | resp [0]: 11 <br/>resp [1]: "The user Is not found registered in agreement" |
| **11** | 12 | RUC of the entity is locatedinactive for debt | String | Uncertain | resp [0]: 12 <br/>resp [1]: "RUC of the entity is find inactive for debt" |
| **12** | 13 | RUC of the entity is canceled | String | Uncertain | resp [0]: 13 <br/>resp [1]: "RUC of the entity is canceled" |
| **13** | 14 | User canceled in RENIEC | String | Uncertain | resp [0]: 14 <br/>resp [1]: "User canceled in RENIEC" |
| **14** | 301 | DNI does not exist in the database ofRENIEC  | String | Uncertain | resp [0]: 301 <br/>resp [1]: "DNI no exists at the base data RENIEC" |
| **15** | 302 | The DNI <DNI_number> corresponds to a minor | String | Uncertain | resp [0]: 302 <br/>resp [1]: "The DNI <DNI_number> corresponds to a younger" |
| **16** | 303 | The DNI <DNI_number> is cancelled | String | Uncertain | resp [0]: 303 <br/>resp [1]: "The DNI &lt;DNI\_number&gt; It is canceled" |
| **17** | 304 | DNI &lt;DNI number&gt; does not register fingerprints in the system of RENIEC | String | Uncertain | resp [0]: 304 <br/>resp [1]: "DNI <DNI_number> does not register impressions fingerprints in the system of RENIEC " |
| **18** | 306 | RUC number is not valid | String | Uncertain | resp [0]: 306 <br/>resp [1]: "Number of RUC is not valid" |
| **19** | 307 | DNI (User ID) is not valid | String | Uncertain | resp [0]: 307 <br/>resp [1]: "DNI de user is not valid" |
| **20** | 308 | DNI of citizen is not valid | String | Uncertain | resp [0]: 308 <br/>resp [1]: DNI of the citizen is not valid" |
| **21** | 309 | IP address of the client is not valid | String | Uncertain | resp [0]: 309 <br/>resp [1]: "Address IP of the client no it is valid" |
| **22** | 310 | MAC address of the client is not valid | String | Uncertain | resp [0]: 310 <br/>resp [1]: "Address Customer MAC It's not valid" |
| **23** | 999 | No information found show, review the configuration of parameters | String | Uncertain | resp [0]: 999 <br/>resp [1]: "I do not know find information for show, review the configuration of parameters " |

* Example:
    * Correct data:
    ```xml
    <?xml version='1.0' encoding='UTF-8'?>
    <S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
        <S:Body>
            <ns0:verificarIdentidadResponse xmlns:ns0="https://impl.ws.svb.biometric.reniec.gob.pe/">
                <verificarIdentidad>70006</verificarIdentidad>
                <verificarIdentidad>71851914</verificarIdentidad>
                <verificarIdentidad>JEFRY ENRIQUE</verificarIdentidad>
                <verificarIdentidad>COBOS</verificarIdentidad>
                <verificarIdentidad>OLIVARES</verificarIdentidad>
                <verificarIdentidad>11-11-2021</verificarIdentidad>
                <verificarIdentidad>null</verificarIdentidad>
            </ns0:verificarIdentidadResponse>
        </S:Body>
    </S:Envelope>
    ```
    
    * Error in the fingerprint sent to the service:
    ```xml
    <?xml version='1.0' encoding='UTF-8'?>
    <S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
        <S:Body>
            <ns0:verificarIdentidadResponse xmlns:ns0="https://impl.ws.svb.biometric.reniec.gob.pe/">
                <verificarIdentidad>301</verificarIdentidad>
                <verificarIdentidad>DNI does not exist in the RENIEC database</verificarIdentidad>
            </ns0:verificarIdentidadResponse>
        </S:Body>
    </S:Envelope>
    ```
        
    * Error in validation, entity or user verification:
    ```xml
    <?xml version='1.0' encoding='UTF-8'?>
        <S:Envelope xmlns:S="http://schemas.xmlsoap.org/soap/envelope/">
            <S:Body>
                <ns0:verificarIdentidadResponse xmlns:ns0="https://impl.ws.svb.biometric.reniec.gob.pe/">
                    <verificarIdentidad>11</verificarIdentidad>
                    <verificarIdentidad>The user is not registered in the agreement</verificarIdentidad>
                </ns0:verificarIdentidadResponse>
            </S:Body>
        </S:Envelope>
    ```
    
    
hellohello012345678910111213141516