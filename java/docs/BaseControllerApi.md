# BaseControllerApi

All URIs are relative to *http://api.iyengarlabs.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPersonRoot**](BaseControllerApi.md#getPersonRoot) | **GET** /v1/rootperson | get root person
[**getSubjectRoot**](BaseControllerApi.md#getSubjectRoot) | **GET** /v1/rootsubject | get root subject
[**getWorkRoot**](BaseControllerApi.md#getWorkRoot) | **GET** /v1/rootwork | get root work
[**healthcheck**](BaseControllerApi.md#healthcheck) | **GET** /v1/health | 

<a name="getPersonRoot"></a>
# **getPersonRoot**
> PersonResource getPersonRoot()

get root person

get the root node for person

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BaseControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

BaseControllerApi apiInstance = new BaseControllerApi();
try {
    PersonResource result = apiInstance.getPersonRoot();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaseControllerApi#getPersonRoot");
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

<a name="getSubjectRoot"></a>
# **getSubjectRoot**
> SubjectResource getSubjectRoot()

get root subject

get the root node for person

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BaseControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

BaseControllerApi apiInstance = new BaseControllerApi();
try {
    SubjectResource result = apiInstance.getSubjectRoot();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaseControllerApi#getSubjectRoot");
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

<a name="getWorkRoot"></a>
# **getWorkRoot**
> WorkResource getWorkRoot()

get root work

get the root node for person

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BaseControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: kapi auth
OAuth kapi auth = (OAuth) defaultClient.getAuthentication("kapi auth");
kapi auth.setAccessToken("YOUR ACCESS TOKEN");

BaseControllerApi apiInstance = new BaseControllerApi();
try {
    WorkResource result = apiInstance.getWorkRoot();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaseControllerApi#getWorkRoot");
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

<a name="healthcheck"></a>
# **healthcheck**
> BuildProperties healthcheck()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BaseControllerApi;


BaseControllerApi apiInstance = new BaseControllerApi();
try {
    BuildProperties result = apiInstance.healthcheck();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BaseControllerApi#healthcheck");
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

