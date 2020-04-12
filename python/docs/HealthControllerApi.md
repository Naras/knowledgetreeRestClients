# swagger_client.HealthControllerApi

All URIs are relative to *http://api.iyengarlabs.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_app_configs**](HealthControllerApi.md#get_app_configs) | **GET** /config | 
[**healthcheck1**](HealthControllerApi.md#healthcheck1) | **GET** /health | 

# **get_app_configs**
> str get_app_configs()



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.HealthControllerApi()

try:
    api_response = api_instance.get_app_configs()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling HealthControllerApi->get_app_configs: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **healthcheck1**
> BuildProperties healthcheck1()



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.HealthControllerApi()

try:
    api_response = api_instance.healthcheck1()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling HealthControllerApi->healthcheck1: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

