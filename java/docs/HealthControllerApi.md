# HealthControllerApi

All URIs are relative to *http://api.iyengarlabs.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAppConfigs**](HealthControllerApi.md#getAppConfigs) | **GET** /config | 
[**healthcheck1**](HealthControllerApi.md#healthcheck1) | **GET** /health | 

<a name="getAppConfigs"></a>
# **getAppConfigs**
> String getAppConfigs()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HealthControllerApi;


HealthControllerApi apiInstance = new HealthControllerApi();
try {
    String result = apiInstance.getAppConfigs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthControllerApi#getAppConfigs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="healthcheck1"></a>
# **healthcheck1**
> BuildProperties healthcheck1()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HealthControllerApi;


HealthControllerApi apiInstance = new HealthControllerApi();
try {
    BuildProperties result = apiInstance.healthcheck1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthControllerApi#healthcheck1");
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

