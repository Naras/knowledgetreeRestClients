# swagger_client.PersonControllerApi

All URIs are relative to *http://api.iyengarlabs.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_person**](PersonControllerApi.md#add_person) | **POST** /v1/person/add | 
[**addwork**](PersonControllerApi.md#addwork) | **PATCH** /v1/person/update/{id} | 
[**findby_legacyid**](PersonControllerApi.md#findby_legacyid) | **GET** /v1/person/findbylegacyid/{id} | 
[**get_person_by_id**](PersonControllerApi.md#get_person_by_id) | **GET** /v1/person/{id} | get root work
[**get_person_root2**](PersonControllerApi.md#get_person_root2) | **GET** /v1/person/rootperson | get root person
[**get_subject_root2**](PersonControllerApi.md#get_subject_root2) | **GET** /v1/person/rootsubject | get root subject
[**get_work_root2**](PersonControllerApi.md#get_work_root2) | **GET** /v1/person/rootwork | get root work
[**healthcheck3**](PersonControllerApi.md#healthcheck3) | **GET** /v1/person/health | 
[**remove_person**](PersonControllerApi.md#remove_person) | **DELETE** /v1/person/remove/{id} | 

# **add_person**
> PersonResource add_person(body, relation, parentid=parentid)



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
api_instance = swagger_client.PersonControllerApi(swagger_client.ApiClient(configuration))
body = swagger_client.PersonRequest() # PersonRequest | 
relation = 'relation_example' # str | 
parentid = '1001' # str |  (optional) (default to 1001)

try:
    api_response = api_instance.add_person(body, relation, parentid=parentid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PersonControllerApi->add_person: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PersonRequest**](PersonRequest.md)|  | 
 **relation** | **str**|  | 
 **parentid** | **str**|  | [optional] [default to 1001]

### Return type

[**PersonResource**](PersonResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **addwork**
> PersonResource addwork(body, id)



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
api_instance = swagger_client.PersonControllerApi(swagger_client.ApiClient(configuration))
body = swagger_client.PersonRequest() # PersonRequest | 
id = 'id_example' # str | 

try:
    api_response = api_instance.addwork(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PersonControllerApi->addwork: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PersonRequest**](PersonRequest.md)|  | 
 **id** | **str**|  | 

### Return type

[**PersonResource**](PersonResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **findby_legacyid**
> PersonResource findby_legacyid(id)



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.PersonControllerApi()
id = 'id_example' # str | 

try:
    api_response = api_instance.findby_legacyid(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PersonControllerApi->findby_legacyid: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 

### Return type

[**PersonResource**](PersonResource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_person_by_id**
> PersonResource get_person_by_id(id)

get root work

get person by id

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
api_instance = swagger_client.PersonControllerApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | 

try:
    # get root work
    api_response = api_instance.get_person_by_id(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PersonControllerApi->get_person_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 

### Return type

[**PersonResource**](PersonResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_person_root2**
> PersonResource get_person_root2()

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
api_instance = swagger_client.PersonControllerApi(swagger_client.ApiClient(configuration))

try:
    # get root person
    api_response = api_instance.get_person_root2()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PersonControllerApi->get_person_root2: %s\n" % e)
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

# **get_subject_root2**
> SubjectResource get_subject_root2()

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
api_instance = swagger_client.PersonControllerApi(swagger_client.ApiClient(configuration))

try:
    # get root subject
    api_response = api_instance.get_subject_root2()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PersonControllerApi->get_subject_root2: %s\n" % e)
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

# **get_work_root2**
> WorkResource get_work_root2()

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
api_instance = swagger_client.PersonControllerApi(swagger_client.ApiClient(configuration))

try:
    # get root work
    api_response = api_instance.get_work_root2()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PersonControllerApi->get_work_root2: %s\n" % e)
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

# **healthcheck3**
> BuildProperties healthcheck3()



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.PersonControllerApi()

try:
    api_response = api_instance.healthcheck3()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PersonControllerApi->healthcheck3: %s\n" % e)
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

# **remove_person**
> str remove_person(id, deletesubtree)



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
api_instance = swagger_client.PersonControllerApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | 
deletesubtree = true # bool | 

try:
    api_response = api_instance.remove_person(id, deletesubtree)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling PersonControllerApi->remove_person: %s\n" % e)
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

