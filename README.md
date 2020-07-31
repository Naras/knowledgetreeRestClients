# swagger-client
No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)

This Python package is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: v0
- Package version: 1.0.0
- Build package: io.swagger.codegen.v3.generators.python.PythonClientCodegen

## Requirements.

Python 2.7 and 3.4+

## Installation & Usage
### pip install

If the python package is hosted on Github, you can install directly from Github

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import swagger_client 
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import swagger_client
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

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

# create an instance of the API class
api_instance = swagger_client.BaseControllerApi(swagger_client.ApiClient(configuration))

try:
    api_response = api_instance.healthcheck()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BaseControllerApi->healthcheck: %s\n" % e)
```

## Documentation for API Endpoints

All URIs are relative to *http://api.iyengarlabs.org*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BaseControllerApi* | [**get_person_root**](docs/BaseControllerApi.md#get_person_root) | **GET** /v1/rootperson | get root person
*BaseControllerApi* | [**get_subject_root**](docs/BaseControllerApi.md#get_subject_root) | **GET** /v1/rootsubject | get root subject
*BaseControllerApi* | [**get_work_root**](docs/BaseControllerApi.md#get_work_root) | **GET** /v1/rootwork | get root work
*BaseControllerApi* | [**healthcheck**](docs/BaseControllerApi.md#healthcheck) | **GET** /v1/health | 
*HealthControllerApi* | [**get_app_configs**](docs/HealthControllerApi.md#get_app_configs) | **GET** /config | 
*HealthControllerApi* | [**healthcheck1**](docs/HealthControllerApi.md#healthcheck1) | **GET** /health | 
*LinkControllerApi* | [**get_person_root1**](docs/LinkControllerApi.md#get_person_root1) | **GET** /v1/linker/rootperson | get root person
*LinkControllerApi* | [**get_subject_root1**](docs/LinkControllerApi.md#get_subject_root1) | **GET** /v1/linker/rootsubject | get root subject
*LinkControllerApi* | [**get_work_root1**](docs/LinkControllerApi.md#get_work_root1) | **GET** /v1/linker/rootwork | get root work
*LinkControllerApi* | [**healthcheck2**](docs/LinkControllerApi.md#healthcheck2) | **GET** /v1/linker/health | 
*LinkControllerApi* | [**persontopersonlink**](docs/LinkControllerApi.md#persontopersonlink) | **PUT** /v1/linker/persontoperson/addlink | 
*LinkControllerApi* | [**persontoworklink**](docs/LinkControllerApi.md#persontoworklink) | **PUT** /v1/linker/persontowork/addlink | 
*LinkControllerApi* | [**persontoworklink1**](docs/LinkControllerApi.md#persontoworklink1) | **PUT** /v1/linker/subjecttowork/addlink | 
*LinkControllerApi* | [**removepersontopersonlink**](docs/LinkControllerApi.md#removepersontopersonlink) | **DELETE** /v1/linker/persontoperson/removelink | 
*LinkControllerApi* | [**removepersontoworklink**](docs/LinkControllerApi.md#removepersontoworklink) | **DELETE** /v1/linker/persontowork/removelink | 
*LinkControllerApi* | [**removesubjecttopersonlink**](docs/LinkControllerApi.md#removesubjecttopersonlink) | **DELETE** /v1/linker/subjecttowork/removelink | 
*LinkControllerApi* | [**removesubjecttosubjectlink**](docs/LinkControllerApi.md#removesubjecttosubjectlink) | **DELETE** /v1/linker/subjecttosubject/removelink | 
*LinkControllerApi* | [**removeworktoworklink**](docs/LinkControllerApi.md#removeworktoworklink) | **DELETE** /v1/linker/worktowork/removelink | 
*LinkControllerApi* | [**subjecttosubjectlink**](docs/LinkControllerApi.md#subjecttosubjectlink) | **PUT** /v1/linker/subjecttosubject/addlink | 
*LinkControllerApi* | [**subjecttosubjectlink1**](docs/LinkControllerApi.md#subjecttosubjectlink1) | **PUT** /v1/linker/worktowork/addlink | 
*PersonControllerApi* | [**add_person**](docs/PersonControllerApi.md#add_person) | **POST** /v1/person/add | 
*PersonControllerApi* | [**addwork**](docs/PersonControllerApi.md#addwork) | **PATCH** /v1/person/update/{id} | 
*PersonControllerApi* | [**findby_legacyid**](docs/PersonControllerApi.md#findby_legacyid) | **GET** /v1/person/findbylegacyid/{id} | 
*PersonControllerApi* | [**get_person_by_id**](docs/PersonControllerApi.md#get_person_by_id) | **GET** /v1/person/{id} | get root work
*PersonControllerApi* | [**get_person_root2**](docs/PersonControllerApi.md#get_person_root2) | **GET** /v1/person/rootperson | get root person
*PersonControllerApi* | [**get_subject_root2**](docs/PersonControllerApi.md#get_subject_root2) | **GET** /v1/person/rootsubject | get root subject
*PersonControllerApi* | [**get_work_root2**](docs/PersonControllerApi.md#get_work_root2) | **GET** /v1/person/rootwork | get root work
*PersonControllerApi* | [**healthcheck3**](docs/PersonControllerApi.md#healthcheck3) | **GET** /v1/person/health | 
*PersonControllerApi* | [**remove_person**](docs/PersonControllerApi.md#remove_person) | **DELETE** /v1/person/remove/{id} | 
*SubjectControllerApi* | [**addsubject**](docs/SubjectControllerApi.md#addsubject) | **POST** /v1/subject/add | 
*SubjectControllerApi* | [**addwork1**](docs/SubjectControllerApi.md#addwork1) | **PATCH** /v1/subject/update/{id} | 
*SubjectControllerApi* | [**get_person_root3**](docs/SubjectControllerApi.md#get_person_root3) | **GET** /v1/subject/rootperson | get root person
*SubjectControllerApi* | [**get_subject_root3**](docs/SubjectControllerApi.md#get_subject_root3) | **GET** /v1/subject/rootsubject | get root subject
*SubjectControllerApi* | [**get_work_root3**](docs/SubjectControllerApi.md#get_work_root3) | **GET** /v1/subject/rootwork | get root work
*SubjectControllerApi* | [**getsubjectbyid**](docs/SubjectControllerApi.md#getsubjectbyid) | **GET** /v1/subject/{id} | 
*SubjectControllerApi* | [**getsubjectbylegacyid**](docs/SubjectControllerApi.md#getsubjectbylegacyid) | **GET** /v1/subject/findbylegacyid/{id} | 
*SubjectControllerApi* | [**healthcheck4**](docs/SubjectControllerApi.md#healthcheck4) | **GET** /v1/subject/health | 
*SubjectControllerApi* | [**removefromlist**](docs/SubjectControllerApi.md#removefromlist) | **DELETE** /v1/subject/remove/{id} | 
*WorkControllerApi* | [**addwork2**](docs/WorkControllerApi.md#addwork2) | **PATCH** /v1/work/update/{id} | 
*WorkControllerApi* | [**addwork3**](docs/WorkControllerApi.md#addwork3) | **POST** /v1/work/add | 
*WorkControllerApi* | [**get_person_root4**](docs/WorkControllerApi.md#get_person_root4) | **GET** /v1/work/rootperson | get root person
*WorkControllerApi* | [**get_subject_root4**](docs/WorkControllerApi.md#get_subject_root4) | **GET** /v1/work/rootsubject | get root subject
*WorkControllerApi* | [**get_work_root4**](docs/WorkControllerApi.md#get_work_root4) | **GET** /v1/work/rootwork | get root work
*WorkControllerApi* | [**getworkbyid**](docs/WorkControllerApi.md#getworkbyid) | **GET** /v1/work/{id} | 
*WorkControllerApi* | [**getworkbymysqlid**](docs/WorkControllerApi.md#getworkbymysqlid) | **GET** /v1/work/findbylegacyid/{id} | 
*WorkControllerApi* | [**healthcheck5**](docs/WorkControllerApi.md#healthcheck5) | **GET** /v1/work/health | 
*WorkControllerApi* | [**removefromlist1**](docs/WorkControllerApi.md#removefromlist1) | **DELETE** /v1/work/remove/{id} | 

## Documentation For Models

 - [Address](docs/Address.md)
 - [BuildProperties](docs/BuildProperties.md)
 - [Link](docs/Link.md)
 - [LinkRequest](docs/LinkRequest.md)
 - [Person](docs/Person.md)
 - [PersonRequest](docs/PersonRequest.md)
 - [PersonResource](docs/PersonResource.md)
 - [Problem](docs/Problem.md)
 - [Subject](docs/Subject.md)
 - [SubjectRequest](docs/SubjectRequest.md)
 - [SubjectResource](docs/SubjectResource.md)
 - [Work](docs/Work.md)
 - [WorkComponent](docs/WorkComponent.md)
 - [WorkRequest](docs/WorkRequest.md)
 - [WorkResource](docs/WorkResource.md)

## Documentation For Authorization


## kapi auth

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://knowledgetreesecure.auth0.com/authorize
- **Scopes**: 
 - ****: 


## Author


