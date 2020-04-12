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
import io.swagger.client.model.PersonRequest;
import io.swagger.client.model.PersonResource;
import io.swagger.client.model.Problem;
import io.swagger.client.model.SubjectResource;
import io.swagger.client.model.WorkResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PersonControllerApi
 */
@Ignore
public class PersonControllerApiTest {

    private final PersonControllerApi api = new PersonControllerApi();

    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPersonTest() throws ApiException {
        PersonRequest body = null;
        String relation = null;
        String parentid = null;
        PersonResource response = api.addPerson(body, relation, parentid);

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
    public void addworkTest() throws ApiException {
        PersonRequest body = null;
        String id = null;
        PersonResource response = api.addwork(body, id);

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
    public void findbyLegacyidTest() throws ApiException {
        String id = null;
        PersonResource response = api.findbyLegacyid(id);

        // TODO: test validations
    }
    /**
     * get root work
     *
     * get person by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPersonByIdTest() throws ApiException {
        String id = null;
        PersonResource response = api.getPersonById(id);

        // TODO: test validations
    }
    /**
     * get root person
     *
     * get the root node for person
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPersonRoot2Test() throws ApiException {
        PersonResource response = api.getPersonRoot2();

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
    public void getSubjectRoot2Test() throws ApiException {
        SubjectResource response = api.getSubjectRoot2();

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
    public void getWorkRoot2Test() throws ApiException {
        WorkResource response = api.getWorkRoot2();

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
    public void healthcheck3Test() throws ApiException {
        BuildProperties response = api.healthcheck3();

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
    public void removePersonTest() throws ApiException {
        String id = null;
        Boolean deletesubtree = null;
        String response = api.removePerson(id, deletesubtree);

        // TODO: test validations
    }
}
