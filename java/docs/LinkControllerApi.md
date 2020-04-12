# LinkControllerApi

All URIs are relative to *http://api.iyengarlabs.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPersonRoot1**](LinkControllerApi.md#getPersonRoot1) | **GET** /v1/linker/rootperson | get root person
[**getSubjectRoot1**](LinkControllerApi.md#getSubjectRoot1) | **GET** /v1/linker/rootsubject | get root subject
[**getWorkRoot1**](LinkControllerApi.md#getWorkRoot1) | **GET** /v1/linker/rootwork | get root work
[**healthcheck2**](LinkControllerApi.md#healthcheck2) | **GET** /v1/linker/health | 
[**persontopersonlink**](LinkControllerApi.md#persontopersonlink) | **PUT** /v1/linker/persontoperson/addlink | 
[**persontoworklink**](LinkControllerApi.md#persontoworklink) | **PUT** /v1/linker/persontowork/addlink | 
[**persontoworklink1**](LinkControllerApi.md#persontoworklink1) | **PUT** /v1/linker/subjecttowork/addlink | 
[**removepersontopersonlink**](LinkControllerApi.md#removepersontopersonlink) | **DELETE** /v1/linker/persontoperson/removelink | 
[**removepersontoworklink**](LinkControllerApi.md#removepersontoworklink) | **DELETE** /v1/linker/persontowork/removelink | 
[**removesubjecttopersonlink**](LinkControllerApi.md#removesubjecttopersonlink) | **DELETE** /v1/linker/subjecttowork/removelink | 
[**removesubjecttosubjectlink**](LinkControllerApi.md#removesubjecttosubjectlink) | **DELETE** /v1/linker/subjecttosubject/removelink | 
[**removeworktoworklink**](LinkControllerApi.md#removeworktoworklink) | **DELETE** /v1/linker/worktowork/removelink | 
[**subjecttosubjectlink**](LinkControllerApi.md#subjecttosubjectlink) | **PUT** /v1/linker/subjecttosubject/addlink | 
[**subjecttosubjectlink1**](LinkControllerApi.md#subjecttosubjectlink1) | **PUT** /v1/linker/worktowork/addlink | 

<a name="getPersonRoot1"></a>
# **getPersonRoot1**
> PersonResource getPersonRoot1()

get root person

get the root node for person

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

LinkControllerApi apiInstance = new LinkControllerApi();
try {
    PersonResource result = apiInstance.getPersonRoot1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkControllerApi#getPersonRoot1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PersonResource**](PersonResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSubjectRoot1"></a>
# **getSubjectRoot1**
> SubjectResource getSubjectRoot1()

get root subject

get the root node for person

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

LinkControllerApi apiInstance = new LinkControllerApi();
try {
    SubjectResource result = apiInstance.getSubjectRoot1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkControllerApi#getSubjectRoot1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SubjectResource**](SubjectResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWorkRoot1"></a>
# **getWorkRoot1**
> WorkResource getWorkRoot1()

get root work

get the root node for person

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

LinkControllerApi apiInstance = new LinkControllerApi();
try {
    WorkResource result = apiInstance.getWorkRoot1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkControllerApi#getWorkRoot1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WorkResource**](WorkResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="healthcheck2"></a>
# **healthcheck2**
> BuildProperties healthcheck2()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LinkControllerApi;


LinkControllerApi apiInstance = new LinkControllerApi();
try {
    BuildProperties result = apiInstance.healthcheck2();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkControllerApi#healthcheck2");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BuildProperties**](BuildProperties.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="persontopersonlink"></a>
# **persontopersonlink**
> PersonResource persontopersonlink(body, linktype)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

LinkControllerApi apiInstance = new LinkControllerApi();
LinkRequest body = new LinkRequest(); // LinkRequest | 
String linktype = "linktype_example"; // String | 
try {
    PersonResource result = apiInstance.persontopersonlink(body, linktype);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkControllerApi#persontopersonlink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  |
 **linktype** | **String**|  | [enum: GURUSHISHYA, CONTEMPORARY]

### Return type

[**PersonResource**](PersonResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="persontoworklink"></a>
# **persontoworklink**
> PersonResource persontoworklink(body, linktype)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

LinkControllerApi apiInstance = new LinkControllerApi();
LinkRequest body = new LinkRequest(); // LinkRequest | 
String linktype = "linktype_example"; // String | 
try {
    PersonResource result = apiInstance.persontoworklink(body, linktype);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkControllerApi#persontoworklink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  |
 **linktype** | **String**|  | [enum: COMMENTATOR, CREATOR, EDITOR, PRAMAANA_PRAMATHA, REVIEWER]

### Return type

[**PersonResource**](PersonResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="persontoworklink1"></a>
# **persontoworklink1**
> SubjectResource persontoworklink1(body, linktype)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

LinkControllerApi apiInstance = new LinkControllerApi();
LinkRequest body = new LinkRequest(); // LinkRequest | 
String linktype = "linktype_example"; // String | 
try {
    SubjectResource result = apiInstance.persontoworklink1(body, linktype);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkControllerApi#persontoworklink1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  |
 **linktype** | **String**|  | [enum: COMMENTARY_ON_COMMENTARY, COMMENTARY, COMPILATION, ORIGINAL_WORK, PRAMANA_PRAMEYA, RECITATION, SUB_COMMENTARY, TRANSLATION, TREATISE, UPABRAHMYA_UPABRAHMANA, VRITTHI]

### Return type

[**SubjectResource**](SubjectResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="removepersontopersonlink"></a>
# **removepersontopersonlink**
> PersonResource removepersontopersonlink(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

LinkControllerApi apiInstance = new LinkControllerApi();
LinkRequest body = new LinkRequest(); // LinkRequest | 
try {
    PersonResource result = apiInstance.removepersontopersonlink(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkControllerApi#removepersontopersonlink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  |

### Return type

[**PersonResource**](PersonResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="removepersontoworklink"></a>
# **removepersontoworklink**
> PersonResource removepersontoworklink(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

LinkControllerApi apiInstance = new LinkControllerApi();
LinkRequest body = new LinkRequest(); // LinkRequest | 
try {
    PersonResource result = apiInstance.removepersontoworklink(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkControllerApi#removepersontoworklink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  |

### Return type

[**PersonResource**](PersonResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="removesubjecttopersonlink"></a>
# **removesubjecttopersonlink**
> SubjectResource removesubjecttopersonlink(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

LinkControllerApi apiInstance = new LinkControllerApi();
LinkRequest body = new LinkRequest(); // LinkRequest | 
try {
    SubjectResource result = apiInstance.removesubjecttopersonlink(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkControllerApi#removesubjecttopersonlink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  |

### Return type

[**SubjectResource**](SubjectResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="removesubjecttosubjectlink"></a>
# **removesubjecttosubjectlink**
> SubjectResource removesubjecttosubjectlink(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

LinkControllerApi apiInstance = new LinkControllerApi();
LinkRequest body = new LinkRequest(); // LinkRequest | 
try {
    SubjectResource result = apiInstance.removesubjecttosubjectlink(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkControllerApi#removesubjecttosubjectlink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  |

### Return type

[**SubjectResource**](SubjectResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="removeworktoworklink"></a>
# **removeworktoworklink**
> WorkResource removeworktoworklink(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

LinkControllerApi apiInstance = new LinkControllerApi();
LinkRequest body = new LinkRequest(); // LinkRequest | 
try {
    WorkResource result = apiInstance.removeworktoworklink(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkControllerApi#removeworktoworklink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  |

### Return type

[**WorkResource**](WorkResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="subjecttosubjectlink"></a>
# **subjecttosubjectlink**
> SubjectResource subjecttosubjectlink(body, linktype)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

LinkControllerApi apiInstance = new LinkControllerApi();
LinkRequest body = new LinkRequest(); // LinkRequest | 
String linktype = "linktype_example"; // String | 
try {
    SubjectResource result = apiInstance.subjecttosubjectlink(body, linktype);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkControllerApi#subjecttosubjectlink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  |
 **linktype** | **String**|  | [enum: ADHAARA_ADHAARI, ANGA_ANGI, ANONYA_ASHRAYA, ASHRAYA_ASHREYI, AVAYAVI, DARSHANA, DHARMA_DHARMI, JANYA_JANAKA, KAARYA_KAARANA, NIRUPYA_NIRUPAKA, ANGA, PRAKAARA_PRAKAARI, COMMON_PARENT, UDDHESHYA_VIDHEYA, UPAVEDA, UPABRAHMYA_UPABRAHMANA, UPANISHAD, VISHAYA_VISHAYI]

### Return type

[**SubjectResource**](SubjectResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="subjecttosubjectlink1"></a>
# **subjecttosubjectlink1**
> WorkResource subjecttosubjectlink1(body, linktype)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LinkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

LinkControllerApi apiInstance = new LinkControllerApi();
LinkRequest body = new LinkRequest(); // LinkRequest | 
String linktype = "linktype_example"; // String | 
try {
    WorkResource result = apiInstance.subjecttosubjectlink1(body, linktype);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LinkControllerApi#subjecttosubjectlink1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  |
 **linktype** | **String**|  | [enum: ADHAARA_ADHAARI, ANGA_ANGI, ANONYA_ASHRAYA, ASHRAYA_ASHREYI, AVAYAVI, CHAPTER, COMMENTARY_ON_COMMENTARY, COMMENTARY, DARSHANA, DERIVED, DHARMA_DHARMI, JANYA_JANAKA, KAARYA_KAARANA, NIRUPYA_NIRUPAKA, ORIGINAL, ANGA, PART_WHOLE_RELATION, PRAKAARA_PRAKAARI, REVIEW, SECTION, COMMON_PARENT, SUB_COMMENTARY, SUB_SECTION, UDDHESHYA_VIDHEYA, UPAVEDA, UPABRAHMYA_UPABRAHMANA, UPANISHAD, VISHAYA_VISHAYI, VOLUME]

### Return type

[**WorkResource**](WorkResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

