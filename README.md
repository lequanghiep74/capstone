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
    
    
hellohello012345678910111213141516171819202122232425262728293031323334353637383940414243444546474849505152535455565758596061626364656667686970717273747576777879808182838485868788899091929394959697989910010110210310410510610710810911011111211311411511611711811912012112212312412512612712812913013113213313413513613713813914014114214314414514614714814915015115215315415515615715815916016116216316416516616716816917017117217317417517617717817918018118218318418518618718818919019119219319419519619719819920020120220320420520620720820921021121221321421521621721821922022122222322422522622722822923023123223323423523623723801234567891011121314151617181920212223242526272829303132333435363738394041424344454647484950515253545556575859606162636465666768697071727374757677787980818283848586878889909192939495969798991001011021031041051061071081091101111121131141151161171181191201211221231241251261271281291301311321331341351361371381391401411421431441451461471481491501511521531541551561571581591601611621631641651661671681691701711721731741751761771781791801811821831841851861871881891901911921931941951961971981992002012022032042052062072082092102112122132142152162172182192202212222232242252262272282292302312322332342352362372382392402412422432442452462472482492502512522532542552562572582592602612622632642652662672682692702712722732742752762772782792802812822832842852862872882892902912922932942952962972982993003013023033043053063073083093103113123133143153163173183193203213223233243253263273283293303313323333343353363373383393403413423433443453463473483493503513523533543553563573583593603613623633643653663673683693703713723733743753763773783793803813823833843853863873883893903913923933943953963973983994004014024034044054064074084094104114124134144154164174184194204214224234244254264274284294304314324334344354364374384394404414424434444454464474484494504514524534544554564574584594604614624634644654664674684694704714724734744754764774784794804814824834844854864874884894904914924934944954964974984995005015025035045055065075085095105115125135145155165175185195205215225235245255265275285295305315325335345355365375385395405415425435445455465475485495505515525535545555565575585595605615625635645655665675685695705715725735745755765775785795805815825835845855865875885895905915925935945955965975985996006016026036046056066076086096106116126136146156166176186196206216226236246256266276286296306316326336346356366376386396406416426436446456466476486496506516526536546556566576586596606616626636646656666676686696706716726736746756766776786796806816826836846856866876886896906916926936946956966976986997007017027037047057067077087097107117127137147157167177187197207217227237247257267277287297307317327337347357367377387397407417427437447457467477487497507517527537547557567577587597607617627637647657667677687697707717727737747757767777787797807817827837847857867877887897907917927937947957967977987998008018028038048058068078088098108118128138148158168178188198208218228238248258268278288298308318328338348358368378388398408418428438448458468478488498508518528538548558568578588598608618628638648658668678688698708718728738748758768778788798808818828838848858868878888898908918928938948958968978988999009019029039049059069079089099109119129139149159169179189199209219229239249259269279289299309319329339349359369379389399409419429439449459469479489499509519529539549559569579589599609619629639649659669679689699709719729739749759769779789799809819829839849859869879889899909919929939949959969979989991000100110021003100410051006100710081009101010111012101310141015101610171018101910201021102210231024102510261027102810291030103110321033103410351036103710381039104010411042104310441045104610471048104910501051105210531054105510561057105810591060106110621063106410651066106710681069107010711072107310741075107610771078107910801081108210831084108510861087108810891090109110921093109410951096109710981099110011011102110311041105110611071108110911101111111211131114111511161117111811191120112111221123112411251126112711281129113011311132113311341135113611371138113911401141114211431144114511461147114811491150115111521153115411551156115711581159116011611162116311641165116611671168116911701171117211731174117511761177117811791180118111821183118411851186118711881189119011911192119311941195119611971198119912001201120212031204120512061207120812091210121112121213121412151216121712181219122012211222122312241225122612271228122912301231123212331234123512361237123812391240124112421243124412451246124712481249125012511252125312541255125612571258125912601261126212631264126512661267126812691270127112721273127412751276127712781279128012811282128312841285128612871288128912901291129212931294129512961297129812991300130113021303130413051306130713081309131013111312131313141315131613171318131913201321132213231324132513261327132813291330133113321333133413351336133713381339134013411342134313441345134613471348134913501351135213531354135513561357135813591360136113621363136413651366136713681369137013711372137313741375137613771378137913801381138213831384138513861387138813891390139113921393139413951396139713981399140014011402140314041405140614071408140914101411141214131414141514161417141814191420142114221423142414251426142714281429143014311432143314341435143614371438143914401441144214431444144514461447144814491450145114521453145414551456145714581459146014611462146314641465146614671468146914701471147214731474147514761477147814791480148114821483148414851486148714881489149014911492149314941495149614971498149915001501150215031504150515061507150815091510151115121513151415151516151715181519152015211522152315241525152615271528152915301531153215331534153515361537153815391540154115421543154415451546154715481549155015511552155315541555155615571558155915601561156215631564156515661567156815691570157115721573157415751576157715781579158015811582158315841585158615871588158915901591159215931594159515961597159815991600160116021603160416051606160716081609161016111612161316141615161616171618161916201621162216231624162516261627162816291630163116321633163416351636163716381639164016411642164316441645164616471648164916501651165216531654165516561657165816591660166116621663166416651666166716681669167016711672167316741675167616771678167916801681168216831684168516861687168816891690169116921693169416951696169716981699170017011702170317041705170617071708170917101711171217131714171517161717171817191720172117221723172417251726172717281729173017311732173317341735173617371738173917401741174217431744174517461747174817491750175117521753175417551756175717581759176017611762176317641765176617671768176917701771177217731774177517761777177817791780178117821783178417851786178717881789179017911792179317941795179617971798179918001801