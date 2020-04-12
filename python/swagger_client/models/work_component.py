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


class WorkComponent(object):
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
        'type': 'str',
        'langcode': 'str',
        'scriptcode': 'str',
        'body': 'str',
        'hyperlink': 'str'
    }

    attribute_map = {
        'type': 'type',
        'langcode': 'langcode',
        'scriptcode': 'scriptcode',
        'body': 'body',
        'hyperlink': 'hyperlink'
    }

    def __init__(self, type=None, langcode=None, scriptcode=None, body=None, hyperlink=None):  # noqa: E501
        """WorkComponent - a model defined in Swagger"""  # noqa: E501
        self._type = None
        self._langcode = None
        self._scriptcode = None
        self._body = None
        self._hyperlink = None
        self.discriminator = None
        if type is not None:
            self.type = type
        if langcode is not None:
            self.langcode = langcode
        if scriptcode is not None:
            self.scriptcode = scriptcode
        if body is not None:
            self.body = body
        if hyperlink is not None:
            self.hyperlink = hyperlink

    @property
    def type(self):
        """Gets the type of this WorkComponent.  # noqa: E501


        :return: The type of this WorkComponent.  # noqa: E501
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this WorkComponent.


        :param type: The type of this WorkComponent.  # noqa: E501
        :type: str
        """
        allowed_values = ["TEXT", "AUDIO", "VIDEO"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"  # noqa: E501
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def langcode(self):
        """Gets the langcode of this WorkComponent.  # noqa: E501


        :return: The langcode of this WorkComponent.  # noqa: E501
        :rtype: str
        """
        return self._langcode

    @langcode.setter
    def langcode(self, langcode):
        """Sets the langcode of this WorkComponent.


        :param langcode: The langcode of this WorkComponent.  # noqa: E501
        :type: str
        """

        self._langcode = langcode

    @property
    def scriptcode(self):
        """Gets the scriptcode of this WorkComponent.  # noqa: E501


        :return: The scriptcode of this WorkComponent.  # noqa: E501
        :rtype: str
        """
        return self._scriptcode

    @scriptcode.setter
    def scriptcode(self, scriptcode):
        """Sets the scriptcode of this WorkComponent.


        :param scriptcode: The scriptcode of this WorkComponent.  # noqa: E501
        :type: str
        """

        self._scriptcode = scriptcode

    @property
    def body(self):
        """Gets the body of this WorkComponent.  # noqa: E501


        :return: The body of this WorkComponent.  # noqa: E501
        :rtype: str
        """
        return self._body

    @body.setter
    def body(self, body):
        """Sets the body of this WorkComponent.


        :param body: The body of this WorkComponent.  # noqa: E501
        :type: str
        """

        self._body = body

    @property
    def hyperlink(self):
        """Gets the hyperlink of this WorkComponent.  # noqa: E501


        :return: The hyperlink of this WorkComponent.  # noqa: E501
        :rtype: str
        """
        return self._hyperlink

    @hyperlink.setter
    def hyperlink(self, hyperlink):
        """Sets the hyperlink of this WorkComponent.


        :param hyperlink: The hyperlink of this WorkComponent.  # noqa: E501
        :type: str
        """

        self._hyperlink = hyperlink

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
        if issubclass(WorkComponent, dict):
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
        if not isinstance(other, WorkComponent):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
