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


class LinkRequest(object):
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
        'sourceid': 'str',
        'targetid': 'str'
    }

    attribute_map = {
        'sourceid': 'sourceid',
        'targetid': 'targetid'
    }

    def __init__(self, sourceid=None, targetid=None):  # noqa: E501
        """LinkRequest - a model defined in Swagger"""  # noqa: E501
        self._sourceid = None
        self._targetid = None
        self.discriminator = None
        if sourceid is not None:
            self.sourceid = sourceid
        if targetid is not None:
            self.targetid = targetid

    @property
    def sourceid(self):
        """Gets the sourceid of this LinkRequest.  # noqa: E501


        :return: The sourceid of this LinkRequest.  # noqa: E501
        :rtype: str
        """
        return self._sourceid

    @sourceid.setter
    def sourceid(self, sourceid):
        """Sets the sourceid of this LinkRequest.


        :param sourceid: The sourceid of this LinkRequest.  # noqa: E501
        :type: str
        """

        self._sourceid = sourceid

    @property
    def targetid(self):
        """Gets the targetid of this LinkRequest.  # noqa: E501


        :return: The targetid of this LinkRequest.  # noqa: E501
        :rtype: str
        """
        return self._targetid

    @targetid.setter
    def targetid(self, targetid):
        """Sets the targetid of this LinkRequest.


        :param targetid: The targetid of this LinkRequest.  # noqa: E501
        :type: str
        """

        self._targetid = targetid

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
        if issubclass(LinkRequest, dict):
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
        if not isinstance(other, LinkRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
