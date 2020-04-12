# swagger_client.WorkControllerApi

All URIs are relative to *http://api.iyengarlabs.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addwork2**](WorkControllerApi.md#addwork2) | **PATCH** /v1/work/update/{id} | 
[**addwork3**](WorkControllerApi.md#addwork3) | **POST** /v1/work/add | 
[**get_person_root4**](WorkControllerApi.md#get_person_root4) | **GET** /v1/work/rootperson | get root person
[**get_subject_root4**](WorkControllerApi.md#get_subject_root4) | **GET** /v1/work/rootsubject | get root subject
[**get_work_root4**](WorkControllerApi.md#get_work_root4) | **GET** /v1/work/rootwork | get root work
[**getworkbyid**](WorkControllerApi.md#getworkbyid) | **GET** /v1/work/{id} | 
[**getworkbymysqlid**](WorkControllerApi.md#getworkbymysqlid) | **GET** /v1/work/{findbylegacyid}/{id} | 
[**healthcheck5**](WorkControllerApi.md#healthcheck5) | **GET** /v1/work/health | 
[**removefromlist1**](WorkControllerApi.md#removefromlist1) | **DELETE** /v1/work/remove/{id} | 

# **addwork2**
> WorkResource addwork2(body, id)



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
api_instance = swagger_client.WorkControllerApi(swagger_client.ApiClient(configuration))
body = swagger_client.WorkRequest() # WorkRequest | 
id = 'id_example' # str | 

try:
    api_response = api_instance.addwork2(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WorkControllerApi->addwork2: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WorkRequest**](WorkRequest.md)|  | 
 **id** | **str**|  | 

### Return type

[**WorkResource**](WorkResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **addwork3**
> WorkResource addwork3(body, relation, parentid=parentid)



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
api_instance = swagger_client.WorkControllerApi(swagger_client.ApiClient(configuration))
body = swagger_client.WorkRequest() # WorkRequest | 
relation = 'relation_example' # str | 
parentid = '1001' # str |  (optional) (default to 1001)

try:
    api_response = api_instance.addwork3(body, relation, parentid=parentid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WorkControllerApi->addwork3: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WorkRequest**](WorkRequest.md)|  | 
 **relation** | **str**|  | 
 **parentid** | **str**|  | [optional] [default to 1001]

### Return type

[**WorkResource**](WorkResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_person_root4**
> PersonResource get_person_root4()

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
api_instance = swagger_client.WorkControllerApi(swagger_client.ApiClient(configuration))

try:
    # get root person
    api_response = api_instance.get_person_root4()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WorkControllerApi->get_person_root4: %s\n" % e)
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

# **get_subject_root4**
> SubjectResource get_subject_root4()

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
api_instance = swagger_client.WorkControllerApi(swagger_client.ApiClient(configuration))

try:
    # get root subject
    api_response = api_instance.get_subject_root4()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WorkControllerApi->get_subject_root4: %s\n" % e)
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

# **get_work_root4**
> WorkResource get_work_root4()

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
api_instance = swagger_client.WorkControllerApi(swagger_client.ApiClient(configuration))

try:
    # get root work
    api_response = api_instance.get_work_root4()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WorkControllerApi->get_work_root4: %s\n" % e)
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

# **getworkbyid**
> WorkResource getworkbyid(id)



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
api_instance = swagger_client.WorkControllerApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | 

try:
    api_response = api_instance.getworkbyid(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WorkControllerApi->getworkbyid: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 

### Return type

[**WorkResource**](WorkResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getworkbymysqlid**
> WorkResource getworkbymysqlid(id)



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
api_instance = swagger_client.WorkControllerApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | 

try:
    api_response = api_instance.getworkbymysqlid(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WorkControllerApi->getworkbymysqlid: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 

### Return type

[**WorkResource**](WorkResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **healthcheck5**
> BuildProperties healthcheck5()



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.WorkControllerApi()

try:
    api_response = api_instance.healthcheck5()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WorkControllerApi->healthcheck5: %s\n" % e)
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

# **removefromlist1**
> str removefromlist1(id, deletesubtree)



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
api_instance = swagger_client.WorkControllerApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | 
deletesubtree = true # bool | 

try:
    api_response = api_instance.removefromlist1(id, deletesubtree)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WorkControllerApi->removefromlist1: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **deletesubtree** | **bool**|  | 

### Return type

**str**

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

