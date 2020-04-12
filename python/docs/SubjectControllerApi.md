# swagger_client.SubjectControllerApi

All URIs are relative to *http://api.iyengarlabs.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addsubject**](SubjectControllerApi.md#addsubject) | **POST** /v1/subject/add | 
[**addwork1**](SubjectControllerApi.md#addwork1) | **PATCH** /v1/subject/update/{id} | 
[**get_person_root3**](SubjectControllerApi.md#get_person_root3) | **GET** /v1/subject/rootperson | get root person
[**get_subject_root3**](SubjectControllerApi.md#get_subject_root3) | **GET** /v1/subject/rootsubject | get root subject
[**get_work_root3**](SubjectControllerApi.md#get_work_root3) | **GET** /v1/subject/rootwork | get root work
[**getsubjectbyid**](SubjectControllerApi.md#getsubjectbyid) | **GET** /v1/subject/{id} | 
[**getsubjectbylegacyid**](SubjectControllerApi.md#getsubjectbylegacyid) | **GET** /v1/subject/findbylegacyid/{id} | 
[**healthcheck4**](SubjectControllerApi.md#healthcheck4) | **GET** /v1/subject/health | 
[**removefromlist**](SubjectControllerApi.md#removefromlist) | **DELETE** /v1/subject/remove/{id} | 

# **addsubject**
> SubjectResource addsubject(body, relation, parentid=parentid)



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
api_instance = swagger_client.SubjectControllerApi(swagger_client.ApiClient(configuration))
body = swagger_client.SubjectRequest() # SubjectRequest | 
relation = 'relation_example' # str | 
parentid = '1001' # str |  (optional) (default to 1001)

try:
    api_response = api_instance.addsubject(body, relation, parentid=parentid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SubjectControllerApi->addsubject: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubjectRequest**](SubjectRequest.md)|  | 
 **relation** | **str**|  | 
 **parentid** | **str**|  | [optional] [default to 1001]

### Return type

[**SubjectResource**](SubjectResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **addwork1**
> SubjectResource addwork1(body, id)



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
api_instance = swagger_client.SubjectControllerApi(swagger_client.ApiClient(configuration))
body = swagger_client.SubjectRequest() # SubjectRequest | 
id = 'id_example' # str | 

try:
    api_response = api_instance.addwork1(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SubjectControllerApi->addwork1: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubjectRequest**](SubjectRequest.md)|  | 
 **id** | **str**|  | 

### Return type

[**SubjectResource**](SubjectResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_person_root3**
> PersonResource get_person_root3()

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
api_instance = swagger_client.SubjectControllerApi(swagger_client.ApiClient(configuration))

try:
    # get root person
    api_response = api_instance.get_person_root3()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SubjectControllerApi->get_person_root3: %s\n" % e)
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

# **get_subject_root3**
> SubjectResource get_subject_root3()

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
api_instance = swagger_client.SubjectControllerApi(swagger_client.ApiClient(configuration))

try:
    # get root subject
    api_response = api_instance.get_subject_root3()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SubjectControllerApi->get_subject_root3: %s\n" % e)
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

# **get_work_root3**
> WorkResource get_work_root3()

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
api_instance = swagger_client.SubjectControllerApi(swagger_client.ApiClient(configuration))

try:
    # get root work
    api_response = api_instance.get_work_root3()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SubjectControllerApi->get_work_root3: %s\n" % e)
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

# **getsubjectbyid**
> SubjectResource getsubjectbyid(id)



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
api_instance = swagger_client.SubjectControllerApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | 

try:
    api_response = api_instance.getsubjectbyid(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SubjectControllerApi->getsubjectbyid: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 

### Return type

[**SubjectResource**](SubjectResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getsubjectbylegacyid**
> SubjectResource getsubjectbylegacyid(id)



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
api_instance = swagger_client.SubjectControllerApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | 

try:
    api_response = api_instance.getsubjectbylegacyid(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SubjectControllerApi->getsubjectbylegacyid: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 

### Return type

[**SubjectResource**](SubjectResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **healthcheck4**
> BuildProperties healthcheck4()



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.SubjectControllerApi()

try:
    api_response = api_instance.healthcheck4()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SubjectControllerApi->healthcheck4: %s\n" % e)
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

# **removefromlist**
> str removefromlist(id, deletesubtree)



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
api_instance = swagger_client.SubjectControllerApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | 
deletesubtree = true # bool | 

try:
    api_response = api_instance.removefromlist(id, deletesubtree)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SubjectControllerApi->removefromlist: %s\n" % e)
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

