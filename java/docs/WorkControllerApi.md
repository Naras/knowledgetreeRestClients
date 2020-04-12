# WorkControllerApi

All URIs are relative to *http://api.iyengarlabs.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addwork2**](WorkControllerApi.md#addwork2) | **PATCH** /v1/work/update/{id} | 
[**addwork3**](WorkControllerApi.md#addwork3) | **POST** /v1/work/add | 
[**getPersonRoot4**](WorkControllerApi.md#getPersonRoot4) | **GET** /v1/work/rootperson | get root person
[**getSubjectRoot4**](WorkControllerApi.md#getSubjectRoot4) | **GET** /v1/work/rootsubject | get root subject
[**getWorkRoot4**](WorkControllerApi.md#getWorkRoot4) | **GET** /v1/work/rootwork | get root work
[**getworkbyid**](WorkControllerApi.md#getworkbyid) | **GET** /v1/work/{id} | 
[**getworkbymysqlid**](WorkControllerApi.md#getworkbymysqlid) | **GET** /v1/work/{findbylegacyid}/{id} | 
[**healthcheck5**](WorkControllerApi.md#healthcheck5) | **GET** /v1/work/health | 
[**removefromlist1**](WorkControllerApi.md#removefromlist1) | **DELETE** /v1/work/remove/{id} | 

<a name="addwork2"></a>
# **addwork2**
> WorkResource addwork2(body, id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

WorkControllerApi apiInstance = new WorkControllerApi();
WorkRequest body = new WorkRequest(); // WorkRequest | 
String id = "id_example"; // String | 
try {
    WorkResource result = apiInstance.addwork2(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkControllerApi#addwork2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WorkRequest**](WorkRequest.md)|  |
 **id** | **String**|  |

### Return type

[**WorkResource**](WorkResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="addwork3"></a>
# **addwork3**
> WorkResource addwork3(body, relation, parentid)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

WorkControllerApi apiInstance = new WorkControllerApi();
WorkRequest body = new WorkRequest(); // WorkRequest | 
String relation = "relation_example"; // String | 
String parentid = "1001"; // String | 
try {
    WorkResource result = apiInstance.addwork3(body, relation, parentid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkControllerApi#addwork3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WorkRequest**](WorkRequest.md)|  |
 **relation** | **String**|  | [enum: ADHAARA_ADHAARI, ANGA_ANGI, ANONYA_ASHRAYA, ASHRAYA_ASHREYI, AVAYAVI, CHAPTER, COMMENTARY_ON_COMMENTARY, COMMENTARY, DARSHANA, DERIVED, DHARMA_DHARMI, JANYA_JANAKA, KAARYA_KAARANA, NIRUPYA_NIRUPAKA, ORIGINAL, ANGA, PART_WHOLE_RELATION, PRAKAARA_PRAKAARI, REVIEW, SECTION, COMMON_PARENT, SUB_COMMENTARY, SUB_SECTION, UDDHESHYA_VIDHEYA, UPAVEDA, UPABRAHMYA_UPABRAHMANA, UPANISHAD, VISHAYA_VISHAYI, VOLUME]
 **parentid** | **String**|  | [optional] [default to 1001]

### Return type

[**WorkResource**](WorkResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getPersonRoot4"></a>
# **getPersonRoot4**
> PersonResource getPersonRoot4()

get root person

get the root node for person

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

WorkControllerApi apiInstance = new WorkControllerApi();
try {
    PersonResource result = apiInstance.getPersonRoot4();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkControllerApi#getPersonRoot4");
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

<a name="getSubjectRoot4"></a>
# **getSubjectRoot4**
> SubjectResource getSubjectRoot4()

get root subject

get the root node for person

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

WorkControllerApi apiInstance = new WorkControllerApi();
try {
    SubjectResource result = apiInstance.getSubjectRoot4();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkControllerApi#getSubjectRoot4");
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

<a name="getWorkRoot4"></a>
# **getWorkRoot4**
> WorkResource getWorkRoot4()

get root work

get the root node for person

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

WorkControllerApi apiInstance = new WorkControllerApi();
try {
    WorkResource result = apiInstance.getWorkRoot4();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkControllerApi#getWorkRoot4");
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

<a name="getworkbyid"></a>
# **getworkbyid**
> WorkResource getworkbyid(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

WorkControllerApi apiInstance = new WorkControllerApi();
String id = "id_example"; // String | 
try {
    WorkResource result = apiInstance.getworkbyid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkControllerApi#getworkbyid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**WorkResource**](WorkResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getworkbymysqlid"></a>
# **getworkbymysqlid**
> WorkResource getworkbymysqlid(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

WorkControllerApi apiInstance = new WorkControllerApi();
String id = "id_example"; // String | 
try {
    WorkResource result = apiInstance.getworkbymysqlid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkControllerApi#getworkbymysqlid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**WorkResource**](WorkResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="healthcheck5"></a>
# **healthcheck5**
> BuildProperties healthcheck5()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WorkControllerApi;


WorkControllerApi apiInstance = new WorkControllerApi();
try {
    BuildProperties result = apiInstance.healthcheck5();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkControllerApi#healthcheck5");
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

<a name="removefromlist1"></a>
# **removefromlist1**
> String removefromlist1(id, deletesubtree)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WorkControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

WorkControllerApi apiInstance = new WorkControllerApi();
String id = "id_example"; // String | 
Boolean deletesubtree = true; // Boolean | 
try {
    String result = apiInstance.removefromlist1(id, deletesubtree);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkControllerApi#removefromlist1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **deletesubtree** | **Boolean**|  |

### Return type

**String**

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

