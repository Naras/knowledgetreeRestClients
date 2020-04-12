# swagger_client.LinkControllerApi

All URIs are relative to *http://api.iyengarlabs.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_person_root1**](LinkControllerApi.md#get_person_root1) | **GET** /v1/linker/rootperson | get root person
[**get_subject_root1**](LinkControllerApi.md#get_subject_root1) | **GET** /v1/linker/rootsubject | get root subject
[**get_work_root1**](LinkControllerApi.md#get_work_root1) | **GET** /v1/linker/rootwork | get root work
[**healthcheck2**](LinkControllerApi.md#healthcheck2) | **GET** /v1/linker/health | 
[**persontopersonlink**](LinkControllerApi.md#persontopersonlink) | **PUT** /v1/linker/persontoperson/addlink | 
[**persontoworklink**](LinkControllerApi.md#persontoworklink) | **PUT** /v1/linker/persontowork/addlink | 
[**persontoworklink1**](LinkControllerApi.md#persontoworklink1) | **PUT** /v1/linker/subjecttowork/addlink | 
[**removepersontopersonlink**](LinkControllerApi.md#removepersontopersonlink) | **DELETE** /v1/linker/persontoperson/removelink | 
[**removepersontoworklink**](LinkControllerApi.md#removepersontoworklink) | **DELETE** /v1/linker/persontowork/removelink | 
[**removesubjecttopersonlink**](LinkControllerApi.md#removesubjecttopersonlink) | **DELETE** /v1/linker/subjecttowork/removelink | 
[**removesubjecttosubjectlink**](LinkControllerApi.md#removesubjecttosubjectlink) | **DELETE** /v1/linker/subjecttosubject/removelink | 
[**removeworktoworklink**](LinkControllerApi.md#removeworktoworklink) | **DELETE** /v1/linker/worktowork/removelink | 
[**subjecttosubjectlink**](LinkControllerApi.md#subjecttosubjectlink) | **PUT** /v1/linker/subjecttosubject/addlink | 
[**subjecttosubjectlink1**](LinkControllerApi.md#subjecttosubjectlink1) | **PUT** /v1/linker/worktowork/addlink | 

# **get_person_root1**
> PersonResource get_person_root1()

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
api_instance = swagger_client.LinkControllerApi(swagger_client.ApiClient(configuration))

try:
    # get root person
    api_response = api_instance.get_person_root1()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LinkControllerApi->get_person_root1: %s\n" % e)
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

# **get_subject_root1**
> SubjectResource get_subject_root1()

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
api_instance = swagger_client.LinkControllerApi(swagger_client.ApiClient(configuration))

try:
    # get root subject
    api_response = api_instance.get_subject_root1()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LinkControllerApi->get_subject_root1: %s\n" % e)
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

# **get_work_root1**
> WorkResource get_work_root1()

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
api_instance = swagger_client.LinkControllerApi(swagger_client.ApiClient(configuration))

try:
    # get root work
    api_response = api_instance.get_work_root1()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LinkControllerApi->get_work_root1: %s\n" % e)
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

# **healthcheck2**
> BuildProperties healthcheck2()



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.LinkControllerApi()

try:
    api_response = api_instance.healthcheck2()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LinkControllerApi->healthcheck2: %s\n" % e)
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

# **persontopersonlink**
> PersonResource persontopersonlink(body, linktype)



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
api_instance = swagger_client.LinkControllerApi(swagger_client.ApiClient(configuration))
body = swagger_client.LinkRequest() # LinkRequest | 
linktype = 'linktype_example' # str | 

try:
    api_response = api_instance.persontopersonlink(body, linktype)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LinkControllerApi->persontopersonlink: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  | 
 **linktype** | **str**|  | 

### Return type

[**PersonResource**](PersonResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **persontoworklink**
> PersonResource persontoworklink(body, linktype)



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
api_instance = swagger_client.LinkControllerApi(swagger_client.ApiClient(configuration))
body = swagger_client.LinkRequest() # LinkRequest | 
linktype = 'linktype_example' # str | 

try:
    api_response = api_instance.persontoworklink(body, linktype)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LinkControllerApi->persontoworklink: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  | 
 **linktype** | **str**|  | 

### Return type

[**PersonResource**](PersonResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **persontoworklink1**
> SubjectResource persontoworklink1(body, linktype)



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
api_instance = swagger_client.LinkControllerApi(swagger_client.ApiClient(configuration))
body = swagger_client.LinkRequest() # LinkRequest | 
linktype = 'linktype_example' # str | 

try:
    api_response = api_instance.persontoworklink1(body, linktype)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LinkControllerApi->persontoworklink1: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  | 
 **linktype** | **str**|  | 

### Return type

[**SubjectResource**](SubjectResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **removepersontopersonlink**
> PersonResource removepersontopersonlink(body)



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
api_instance = swagger_client.LinkControllerApi(swagger_client.ApiClient(configuration))
body = swagger_client.LinkRequest() # LinkRequest | 

try:
    api_response = api_instance.removepersontopersonlink(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LinkControllerApi->removepersontopersonlink: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  | 

### Return type

[**PersonResource**](PersonResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **removepersontoworklink**
> PersonResource removepersontoworklink(body)



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
api_instance = swagger_client.LinkControllerApi(swagger_client.ApiClient(configuration))
body = swagger_client.LinkRequest() # LinkRequest | 

try:
    api_response = api_instance.removepersontoworklink(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LinkControllerApi->removepersontoworklink: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  | 

### Return type

[**PersonResource**](PersonResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **removesubjecttopersonlink**
> SubjectResource removesubjecttopersonlink(body)



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
api_instance = swagger_client.LinkControllerApi(swagger_client.ApiClient(configuration))
body = swagger_client.LinkRequest() # LinkRequest | 

try:
    api_response = api_instance.removesubjecttopersonlink(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LinkControllerApi->removesubjecttopersonlink: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  | 

### Return type

[**SubjectResource**](SubjectResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **removesubjecttosubjectlink**
> SubjectResource removesubjecttosubjectlink(body)



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
api_instance = swagger_client.LinkControllerApi(swagger_client.ApiClient(configuration))
body = swagger_client.LinkRequest() # LinkRequest | 

try:
    api_response = api_instance.removesubjecttosubjectlink(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LinkControllerApi->removesubjecttosubjectlink: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  | 

### Return type

[**SubjectResource**](SubjectResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **removeworktoworklink**
> WorkResource removeworktoworklink(body)



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
api_instance = swagger_client.LinkControllerApi(swagger_client.ApiClient(configuration))
body = swagger_client.LinkRequest() # LinkRequest | 

try:
    api_response = api_instance.removeworktoworklink(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LinkControllerApi->removeworktoworklink: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  | 

### Return type

[**WorkResource**](WorkResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **subjecttosubjectlink**
> SubjectResource subjecttosubjectlink(body, linktype)



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
api_instance = swagger_client.LinkControllerApi(swagger_client.ApiClient(configuration))
body = swagger_client.LinkRequest() # LinkRequest | 
linktype = 'linktype_example' # str | 

try:
    api_response = api_instance.subjecttosubjectlink(body, linktype)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LinkControllerApi->subjecttosubjectlink: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  | 
 **linktype** | **str**|  | 

### Return type

[**SubjectResource**](SubjectResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **subjecttosubjectlink1**
> WorkResource subjecttosubjectlink1(body, linktype)



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
api_instance = swagger_client.LinkControllerApi(swagger_client.ApiClient(configuration))
body = swagger_client.LinkRequest() # LinkRequest | 
linktype = 'linktype_example' # str | 

try:
    api_response = api_instance.subjecttosubjectlink1(body, linktype)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LinkControllerApi->subjecttosubjectlink1: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LinkRequest**](LinkRequest.md)|  | 
 **linktype** | **str**|  | 

### Return type

[**WorkResource**](WorkResource.md)

### Authorization

[kapi auth](../README.md#kapi auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

