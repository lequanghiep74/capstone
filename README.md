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
    
    
hellohello0123456789101112131415161718192021222324252627282930313233343536373839404142434445464748495051525354555657585960616263646566676869707172737475767778798081828384858687888990919293949596979899100101102103104105106107108109110111112113114115116117118119120121122123124125126127128129130131132133134135136137138139140141142143144145146147148149150151152153154155156157158159160161162163164165166167168169170171172173174175176177178179180181182183184185186187188189190191192193194195196197198199200201202203204205206207208209210211212213214215216217218219220221222223224225226227228229230231232233234235236237238012345678910111213141516171819202122232425262728293031323334353637383940414243444546474849505152535455565758596061626364656667686970717273747576777879808182838485868788899091929394959697989910010110210310410510610710810911011111211311411511611711811912012112212312412512612712812913013113213313413513613713813914014114214314414514614714814915015115215315415515615715815916016116216316416516616716816917017117217317417517617717817918018118218318418518618718818919019119219319419519619719819920020120220320420520620720820921021121221321421521621721821922022122222322422522622722822923023123223323423523623723823924024124224324424524624724824925025125225325425525625725825926026126226326426526626726826927027127227327427527627727827928028128228328428528628728828929029129229329429529629729829930030130230330430530630730830931031131231331431531631731831932032132232332432532632732832933033133233333433533633733833934034134234334434534634734834935035135235335435535635735835936036136236336436536636736836937037137237337437537637737837938038138238338438538638738838939039139239339439539639739839940040140240340440540640740840941041141241341441541641741841942042142242342442542642742842943043143243343443543643743843944044144244344444544644744844945045145245345445545645745845946046146246346446546646746846947047147247347447547647747847948048148248348448548648748848949049149249349449549649749849950050150250350450550650750850951051151251351451551651751851952052152252352452552652752852953053153253353453553653753853954054154254354454554654754854955055155255355455555655755855956056156256356456556656756856957057157257357457557657757857958058158258358458558658758858959059159259359459559659759859960060160260360460560660760860961061161261361461561661761861962062162262362462562662762862963063163263363463563663763863964064164264364464564664764864965065165265365465565665765865966066166266366466566666766866967067167267367467567667767867968068168268368468568668768868969069169269369469569669769869970070170270370470570670770870971071171271371471571671771871972072172272372472572672772872973073173273373473573673773873974074174274374474574674774874975075175275375475575675775875976076176276376476576676776876977077177277377477577677777877978078178278378478578678778878979079179279379479579679779879980080180280380480580680780880981081181281381481581681781881982082182282382482582682782882983083183283383483583683783883984084184284384484584684784884985085185285385485585685785885986086186286386486586686786886987087187287387487587687787887988088188288388488588688788888989089189289389489589689789889990090190290390490590690790890991091191291391491591691791891992092192292392492592692792892993093193293393493593693793893994094194294394494594694794894995095195295395495595695795895996096196296396496596696796896997097197297397497597697797897998098198298398498598698798898999099199299399499599699799899910001001100210031004100510061007100810091010101110121013101410151016101710181019102010211022102310241025102610271028102910301031103210331034103510361037103810391040104110421043104410451046104710481049105010511052105310541055105610571058105910601061106210631064106510661067106810691070107110721073107410751076107710781079108010811082108310841085108610871088108910901091109210931094109510961097109810991100110111021103110411051106110711081109111011111112111311141115111611171118111911201121112211231124112511261127112811291130113111321133113411351136113711381139114011411142114311441145114611471148114911501151115211531154115511561157115811591160116111621163116411651166116711681169117011711172117311741175117611771178117911801181118211831184118511861187118811891190119111921193