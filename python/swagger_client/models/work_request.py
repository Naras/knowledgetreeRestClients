# coding: utf-8

"""
    OpenAPI definition

    No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)  # noqa: E501

    OpenAPI spec version: v0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

import pprint
import re  # noqa: F401

import six


class WorkRequest(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """
    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'title': 'str',
        'tags': 'list[str]',
        'components': 'list[WorkComponent]'
    }

    attribute_map = {
        'title': 'title',
        'tags': 'tags',
        'components': 'components'
    }

    def __init__(self, title=None, tags=None, components=None):  # noqa: E501
        """WorkRequest - a model defined in Swagger"""  # noqa: E501
        self._title = None
        self._tags = None
        self._components = None
        self.discriminator = None
        if title is not None:
            self.title = title
        if tags is not None:
            self.tags = tags
        if components is not None:
            self.components = components

    @property
    def title(self):
        """Gets the title of this WorkRequest.  # noqa: E501


        :return: The title of this WorkRequest.  # noqa: E501
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title):
        """Sets the title of this WorkRequest.


        :param title: The title of this WorkRequest.  # noqa: E501
        :type: str
        """

        self._title = title

    @property
    def tags(self):
        """Gets the tags of this WorkRequest.  # noqa: E501


        :return: The tags of this WorkRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._tags

    @tags.setter
    def tags(self, tags):
        """Sets the tags of this WorkRequest.


        :param tags: The tags of this WorkRequest.  # noqa: E501
        :type: list[str]
        """

        self._tags = tags

    @property
    def components(self):
        """Gets the components of this WorkRequest.  # noqa: E501


        :return: The components of this WorkRequest.  # noqa: E501
        :rtype: list[WorkComponent]
        """
        return self._components

    @components.setter
    def components(self, components):
        """Sets the components of this WorkRequest.


        :param components: The components of this WorkRequest.  # noqa: E501
        :type: list[WorkComponent]
        """

        self._components = components

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(WorkRequest, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, WorkRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
