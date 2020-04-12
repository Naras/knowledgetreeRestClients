# PersonControllerApi

All URIs are relative to *http://api.iyengarlabs.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPerson**](PersonControllerApi.md#addPerson) | **POST** /v1/person/add | 
[**addwork**](PersonControllerApi.md#addwork) | **PATCH** /v1/person/update/{id} | 
[**findbyLegacyid**](PersonControllerApi.md#findbyLegacyid) | **GET** /v1/person/findbylegacyid/{id} | 
[**getPersonById**](PersonControllerApi.md#getPersonById) | **GET** /v1/person/{id} | get root work
[**getPersonRoot2**](PersonControllerApi.md#getPersonRoot2) | **GET** /v1/person/rootperson | get root person
[**getSubjectRoot2**](PersonControllerApi.md#getSubjectRoot2) | **GET** /v1/person/rootsubject | get root subject
[**getWorkRoot2**](PersonControllerApi.md#getWorkRoot2) | **GET** /v1/person/rootwork | get root work
[**healthcheck3**](PersonControllerApi.md#healthcheck3) | **GET** /v1/person/health | 
[**removePerson**](PersonControllerApi.md#removePerson) | **DELETE** /v1/person/remove/{id} | 

<a name="addPerson"></a>
# **addPerson**
> PersonResource addPerson(body, relation, parentid)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

PersonControllerApi apiInstance = new PersonControllerApi();
PersonRequest body = new PersonRequest(); // PersonRequest | 
String relation = "relation_example"; // String | 
String parentid = "1001"; // String | 
try {
    PersonResource result = apiInstance.addPerson(body, relation, parentid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonControllerApi#addPerson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PersonRequest**](PersonRequest.md)|  |
 **relation** | **String**|  | [enum: GURUSHISHYA, CONTEMPORARY]
 **parentid** | **String**|  | [optional] [default to 1001]

### Return type

[**PersonResource**](PersonResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="addwork"></a>
# **addwork**
> PersonResource addwork(body, id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

PersonControllerApi apiInstance = new PersonControllerApi();
PersonRequest body = new PersonRequest(); // PersonRequest | 
String id = "id_example"; // String | 
try {
    PersonResource result = apiInstance.addwork(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonControllerApi#addwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PersonRequest**](PersonRequest.md)|  |
 **id** | **String**|  |

### Return type

[**PersonResource**](PersonResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findbyLegacyid"></a>
# **findbyLegacyid**
> PersonResource findbyLegacyid(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PersonControllerApi;


PersonControllerApi apiInstance = new PersonControllerApi();
String id = "id_example"; // String | 
try {
    PersonResource result = apiInstance.findbyLegacyid(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonControllerApi#findbyLegacyid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**PersonResource**](PersonResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPersonById"></a>
# **getPersonById**
> PersonResource getPersonById(id)

get root work

get person by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

PersonControllerApi apiInstance = new PersonControllerApi();
String id = "id_example"; // String | 
try {
    PersonResource result = apiInstance.getPersonById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonControllerApi#getPersonById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**PersonResource**](PersonResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPersonRoot2"></a>
# **getPersonRoot2**
> PersonResource getPersonRoot2()

get root person

get the root node for person

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

PersonControllerApi apiInstance = new PersonControllerApi();
try {
    PersonResource result = apiInstance.getPersonRoot2();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonControllerApi#getPersonRoot2");
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

<a name="getSubjectRoot2"></a>
# **getSubjectRoot2**
> SubjectResource getSubjectRoot2()

get root subject

get the root node for person

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

PersonControllerApi apiInstance = new PersonControllerApi();
try {
    SubjectResource result = apiInstance.getSubjectRoot2();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonControllerApi#getSubjectRoot2");
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

<a name="getWorkRoot2"></a>
# **getWorkRoot2**
> WorkResource getWorkRoot2()

get root work

get the root node for person

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

PersonControllerApi apiInstance = new PersonControllerApi();
try {
    WorkResource result = apiInstance.getWorkRoot2();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonControllerApi#getWorkRoot2");
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

<a name="healthcheck3"></a>
# **healthcheck3**
> BuildProperties healthcheck3()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PersonControllerApi;


PersonControllerApi apiInstance = new PersonControllerApi();
try {
    BuildProperties result = apiInstance.healthcheck3();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonControllerApi#healthcheck3");
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

<a name="removePerson"></a>
# **removePerson**
> String removePerson(id, deletesubtree)



### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PersonControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

PersonControllerApi apiInstance = new PersonControllerApi();
String id = "id_example"; // String | 
Boolean deletesubtree = true; // Boolean | 
try {
    String result = apiInstance.removePerson(id, deletesubtree);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PersonControllerApi#removePerson");
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

