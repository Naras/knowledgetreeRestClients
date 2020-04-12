# SubjectControllerApi

All URIs are relative to *http://api.iyengarlabs.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addsubject**](SubjectControllerApi.md#addsubject) | **POST** /v1/subject/add | 
[**addwork1**](SubjectControllerApi.md#addwork1) | **PATCH** /v1/subject/update/{id} | 
[**getPersonRoot3**](SubjectControllerApi.md#getPersonRoot3) | **GET** /v1/subject/rootperson | get root person
[**getSubjectRoot3**](SubjectControllerApi.md#getSubjectRoot3) | **GET** /v1/subject/rootsubject | get root subject
[**getWorkRoot3**](SubjectControllerApi.md#getWorkRoot3) | **GET** /v1/subject/rootwork | get root work
[**getsubjectbyid**](SubjectControllerApi.md#getsubjectbyid) | **GET** /v1/subject/{id} | 
[**getsubjectbylegacyid**](SubjectControllerApi.md#getsubjectbylegacyid) | **GET** /v1/subject/findbylegacyid/{id} | 
[**healthcheck4**](SubjectControllerApi.md#healthcheck4) | **GET** /v1/subject/health | 
[**removefromlist**](SubjectControllerApi.md#removefromlist) | **DELETE** /v1/subject/remove/{id} | 

<a name="addsubject"></a>
# **addsubject**
> SubjectResource addsubject(body, relation, parentid)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

SubjectControllerApi apiInstance = new SubjectControllerApi();
SubjectRequest body = new SubjectRequest(); // SubjectRequest | 
String relation = "relation_example"; // String | 
String parentid = "1001"; // String | 
try {
    SubjectResource result = apiInstance.addsubject(body, relation, parentid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubjectControllerApi#addsubject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubjectRequest**](SubjectRequest.md)|  |
 **relation** | **String**|  | [enum: ADHAARA_ADHAARI, ANGA_ANGI, ANONYA_ASHRAYA, ASHRAYA_ASHREYI, AVAYAVI, DARSHANA, DHARMA_DHARMI, JANYA_JANAKA, KAARYA_KAARANA, NIRUPYA_NIRUPAKA, ANGA, PRAKAARA_PRAKAARI, COMMON_PARENT, UDDHESHYA_VIDHEYA, UPAVEDA, UPABRAHMYA_UPABRAHMANA, UPANISHAD, VISHAYA_VISHAYI]
 **parentid** | **String**|  | [optional] [default to 1001]

### Return type

[**SubjectResource**](SubjectResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="addwork1"></a>
# **addwork1**
> SubjectResource addwork1(body, id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

SubjectControllerApi apiInstance = new SubjectControllerApi();
SubjectRequest body = new SubjectRequest(); // SubjectRequest | 
String id = "id_example"; // String | 
try {
    SubjectResource result = apiInstance.addwork1(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubjectControllerApi#addwork1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubjectRequest**](SubjectRequest.md)|  |
 **id** | **String**|  |

### Return type

[**SubjectResource**](SubjectResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getPersonRoot3"></a>
# **getPersonRoot3**
> PersonResource getPersonRoot3()

get root person

get the root node for person

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

SubjectControllerApi apiInstance = new SubjectControllerApi();
try {
    PersonResource result = apiInstance.getPersonRoot3();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubjectControllerApi#getPersonRoot3");
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

<a name="getSubjectRoot3"></a>
# **getSubjectRoot3**
> SubjectResource getSubjectRoot3()

get root subject

get the root node for person

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

SubjectControllerApi apiInstance = new SubjectControllerApi();
try {
    SubjectResource result = apiInstance.getSubjectRoot3();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubjectControllerApi#getSubjectRoot3");
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

<a name="getWorkRoot3"></a>
# **getWorkRoot3**
> WorkResource getWorkRoot3()

get root work

get the root node for person

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

SubjectControllerApi apiInstance = new SubjectControllerApi();
try {
    WorkResource result = apiInstance.getWorkRoot3();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubjectControllerApi#getWorkRoot3");
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

<a name="getsubjectbyid"></a>
# **getsubjectbyid**
> SubjectResource getsubjectbyid(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

SubjectControllerApi apiInstance = new SubjectControllerApi();
String id = "id_example"; // String | 
try {
    SubjectResource result = apiInstance.getsubjectbyid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubjectControllerApi#getsubjectbyid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**SubjectResource**](SubjectResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getsubjectbylegacyid"></a>
# **getsubjectbylegacyid**
> SubjectResource getsubjectbylegacyid(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

SubjectControllerApi apiInstance = new SubjectControllerApi();
String id = "id_example"; // String | 
try {
    SubjectResource result = apiInstance.getsubjectbylegacyid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubjectControllerApi#getsubjectbylegacyid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**SubjectResource**](SubjectResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="healthcheck4"></a>
# **healthcheck4**
> BuildProperties healthcheck4()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubjectControllerApi;


SubjectControllerApi apiInstance = new SubjectControllerApi();
try {
    BuildProperties result = apiInstance.healthcheck4();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubjectControllerApi#healthcheck4");
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

<a name="removefromlist"></a>
# **removefromlist**
> String removefromlist(id, deletesubtree)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SubjectControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

SubjectControllerApi apiInstance = new SubjectControllerApi();
String id = "id_example"; // String | 
Boolean deletesubtree = true; // Boolean | 
try {
    String result = apiInstance.removefromlist(id, deletesubtree);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubjectControllerApi#removefromlist");
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

