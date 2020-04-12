# swagger_client.BaseControllerApi

All URIs are relative to *http://api.iyengarlabs.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_person_root**](BaseControllerApi.md#get_person_root) | **GET** /v1/rootperson | get root person
[**get_subject_root**](BaseControllerApi.md#get_subject_root) | **GET** /v1/rootsubject | get root subject
[**get_work_root**](BaseControllerApi.md#get_work_root) | **GET** /v1/rootwork | get root work
[**healthcheck**](BaseControllerApi.md#healthcheck) | **GET** /v1/health | 

# **get_person_root**
> PersonResource get_person_root()

get root person

get the root node for person

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: kapi auth
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.BaseControllerApi(swagger_client.ApiClient(configuration))

try:
    # get root person
    api_response = api_instance.get_person_root()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BaseControllerApi->get_person_root: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_subject_root**
> SubjectResource get_subject_root()

get root subject

get the root node for person

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: kapi auth
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.BaseControllerApi(swagger_client.ApiClient(configuration))

try:
    # get root subject
    api_response = api_instance.get_subject_root()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BaseControllerApi->get_subject_root: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_work_root**
> WorkResource get_work_root()

get root work

get the root node for person

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: kapi auth
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.BaseControllerApi(swagger_client.ApiClient(configuration))

try:
    # get root work
    api_response = api_instance.get_work_root()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BaseControllerApi->get_work_root: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **healthcheck**
> BuildProperties healthcheck()



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.BaseControllerApi()

try:
    api_response = api_instance.healthcheck()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BaseControllerApi->healthcheck: %s\n" % e)
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

