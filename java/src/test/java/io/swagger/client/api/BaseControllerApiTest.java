/*
 * OpenAPI definition
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.BuildProperties;
import io.swagger.client.model.PersonResource;
import io.swagger.client.model.SubjectResource;
import io.swagger.client.model.WorkResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BaseControllerApi
 */
@Ignore
public class BaseControllerApiTest {

    private final BaseControllerApi api = new BaseControllerApi();

    /**
     * get root person
     *
     * get the root node for person
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPersonRootTest() throws ApiException {
        PersonResource response = api.getPersonRoot();

        // TODO: test validations
    }
    /**
     * get root subject
     *
     * get the root node for person
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubjectRootTest() throws ApiException {
        SubjectResource response = api.getSubjectRoot();

        // TODO: test validations
    }
    /**
     * get root work
     *
     * get the root node for person
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkRootTest() throws ApiException {
        WorkResource response = api.getWorkRoot();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void healthcheckTest() throws ApiException {
        BuildProperties response = api.healthcheck();

        // TODO: test validations
    }
}