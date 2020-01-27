/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.client.activiti_rest_api.api;

import com.bytatech.ayoos.client.activiti_rest_api.model.DataResponse;
import com.bytatech.ayoos.client.activiti_rest_api.model.UserInfoRequest;
import com.bytatech.ayoos.client.activiti_rest_api.model.UserInfoResponse;
import com.bytatech.ayoos.client.activiti_rest_api.model.UserRequest;
import com.bytatech.ayoos.client.activiti_rest_api.model.UserResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-04-16T17:01:52.038+05:30[Asia/Kolkata]")

@Api(value = "Users", description = "the Users API")
public interface UsersApi {

    @ApiOperation(value = "Create a user", nickname = "createUser", notes = "", response = UserResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = UserResponse.class),
        @ApiResponse(code = 201, message = "Indicates the user was created."),
        @ApiResponse(code = 400, message = "Indicates the id of the user was missing.") })
    @RequestMapping(value = "/identity/users",
        produces = "application/json", 
        method = RequestMethod.POST)
    ResponseEntity<UserResponse> createUser(@ApiParam(value = ""  )  @Valid @RequestBody UserRequest userRequest);


    @ApiOperation(value = "Create a new user�s info entry", nickname = "createUserInfo", notes = "", response = UserInfoResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = UserInfoResponse.class),
        @ApiResponse(code = 201, message = "Indicates the user was found and the info has been created."),
        @ApiResponse(code = 400, message = "Indicates the key or value was missing from the request body. Status description contains additional information about the error."),
        @ApiResponse(code = 404, message = "Indicates the requested user was not found."),
        @ApiResponse(code = 409, message = "Indicates there is already an info-entry with the given key for the user, update the resource instance (PUT).") })
    @RequestMapping(value = "/identity/users/{userId}/info",
        produces = "application/json", 
        method = RequestMethod.POST)
    ResponseEntity<UserInfoResponse> createUserInfo(@ApiParam(value = "The id of the user to create the info for.",required=true) @PathVariable("userId") String userId,@ApiParam(value = ""  )  @Valid @RequestBody UserInfoRequest userInfoRequest);


    @ApiOperation(value = "Delete a user", nickname = "deleteUser", notes = "", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Indicates the user was found and  has been deleted. Response-body is intentionally empty."),
        @ApiResponse(code = 404, message = "Indicates the requested user was not found.") })
    @RequestMapping(value = "/identity/users/{userId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUser(@ApiParam(value = "The id of the user to delete.",required=true) @PathVariable("userId") String userId);


    @ApiOperation(value = "Delete a user�s info", nickname = "deleteUserInfo", notes = "", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Indicates the user was found and the info for the given key has been deleted. Response body is left empty intentionally."),
        @ApiResponse(code = 404, message = "Indicates the requested user was not found or the user doesn�t have info for the given key. Status description contains additional information about the error.") })
    @RequestMapping(value = "/identity/users/{userId}/info/{key}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUserInfo(@ApiParam(value = "The id of the user to delete the info for.",required=true) @PathVariable("userId") String userId,@ApiParam(value = "The key of the user info to delete.",required=true) @PathVariable("key") String key);


    @ApiOperation(value = "Get a single user", nickname = "getUser", notes = "", response = UserResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the user exists and is returned.", response = UserResponse.class),
        @ApiResponse(code = 404, message = "Indicates the requested user does not exist.") })
    @RequestMapping(value = "/identity/users/{userId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<UserResponse> getUser(@ApiParam(value = "The id of the user to get.",required=true) @PathVariable("userId") String userId);


    @ApiOperation(value = "Get a user�s info", nickname = "getUserInfo", notes = "", response = UserInfoResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the user was found and the user has info for the given key.", response = UserInfoResponse.class),
        @ApiResponse(code = 404, message = "Indicates the requested user was not found or the user doesn�t have info for the given key. Status description contains additional information about the error.") })
    @RequestMapping(value = "/identity/users/{userId}/info/{key}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<UserInfoResponse> getUserInfo(@ApiParam(value = "The id of the user to get the info for.",required=true) @PathVariable("userId") String userId,@ApiParam(value = "The key of the user info to get.",required=true) @PathVariable("key") String key);


    @ApiOperation(value = "Get a user�s picture", nickname = "getUserPicture", notes = "The response body contains the raw picture data, representing the user�s picture. The Content-type of the response corresponds to the mimeType that was set when creating the picture.", response = byte[].class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the user was found and has a picture, which is returned in the body.", response = byte[].class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Indicates the requested user was not found or the user does not have a profile picture. Status-description contains additional information about the error.") })
    @RequestMapping(value = "/identity/users/{userId}/picture",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<List<byte[]>> getUserPicture(@ApiParam(value = "The id of the user to get the picture for.",required=true) @PathVariable("userId") String userId);


    @ApiOperation(value = "Get a list of users", nickname = "getUsers", notes = "", response = DataResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the group exists and is returned.", response = DataResponse.class) })
    @RequestMapping(value = "/identity/users",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<DataResponse> getUsers(@ApiParam(value = "Only return group with the given id") @Valid @RequestParam(value = "id", required = false) String id,@ApiParam(value = "Only return users with the given firstname") @Valid @RequestParam(value = "firstName", required = false) String firstName,@ApiParam(value = "Only return users with the given lastname") @Valid @RequestParam(value = "lastName", required = false) String lastName,@ApiParam(value = "Only return users with the given email") @Valid @RequestParam(value = "email", required = false) String email,@ApiParam(value = "Only return userswith a firstname like the given value. Use % as wildcard-character.") @Valid @RequestParam(value = "firstNameLike", required = false) String firstNameLike,@ApiParam(value = "Only return users with a lastname like the given value. Use % as wildcard-character.") @Valid @RequestParam(value = "lastNameLike", required = false) String lastNameLike,@ApiParam(value = "Only return users with an email like the given value. Use % as wildcard-character.") @Valid @RequestParam(value = "emailLike", required = false) String emailLike,@ApiParam(value = "Only return users which are a member of the given group.") @Valid @RequestParam(value = "memberOfGroup", required = false) String memberOfGroup,@ApiParam(value = "Only return users  which members are potential starters for a process-definition with the given id.") @Valid @RequestParam(value = "potentialStarter", required = false) String potentialStarter,@ApiParam(value = "Field  to sort on, to be used together with the order.", allowableValues = "id, firstName, lastname, email") @Valid @RequestParam(value = "sort", required = false) String sort);


    @ApiOperation(value = "List a user�s info", nickname = "listUsersInfo", notes = "", response = UserInfoResponse.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the user was found and list of info (key and url) is returned.", response = UserInfoResponse.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Indicates the requested user was not found.") })
    @RequestMapping(value = "/identity/users/{userId}/info",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<List<UserInfoResponse>> listUsersInfo(@ApiParam(value = "The id of the user to get the info for.",required=true) @PathVariable("userId") String userId);


    @ApiOperation(value = "Update a user", nickname = "updateUser", notes = "All request values are optional. For example, you can only include the firstName attribute in the request body JSON-object, only updating the firstName of the user, leaving all other fields unaffected. When an attribute is explicitly included and is set to null, the user-value will be updated to null. Example: {\"firstName\" : null} will clear the firstName of the user).", response = UserResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the user was updated.", response = UserResponse.class),
        @ApiResponse(code = 404, message = "Indicates the requested user was not found."),
        @ApiResponse(code = 409, message = "Indicates the requested user was updated simultaneously.") })
    @RequestMapping(value = "/identity/users/{userId}",
        produces = "application/json", 
        method = RequestMethod.PUT)
    ResponseEntity<UserResponse> updateUser(@ApiParam(value = "",required=true) @PathVariable("userId") String userId,@ApiParam(value = ""  )  @Valid @RequestBody UserRequest userRequest);


    @ApiOperation(value = "Update a user�s info", nickname = "updateUserInfo", notes = "", response = UserInfoResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the user was found and the info has been updated.", response = UserInfoResponse.class),
        @ApiResponse(code = 400, message = "Indicates the value was missing from the request body."),
        @ApiResponse(code = 404, message = "Indicates the requested user was not found or the user doesn�t have info for the given key. Status description contains additional information about the error.") })
    @RequestMapping(value = "/identity/users/{userId}/info/{key}",
        produces = "application/json", 
        method = RequestMethod.PUT)
    ResponseEntity<UserInfoResponse> updateUserInfo(@ApiParam(value = "The id of the user to update the info for.",required=true) @PathVariable("userId") String userId,@ApiParam(value = "The key of the user info to update.",required=true) @PathVariable("key") String key,@ApiParam(value = ""  )  @Valid @RequestBody UserInfoRequest userInfoRequest);


    @ApiOperation(value = "Updating a user�s picture", nickname = "updateUserPicture", notes = "The request should be of type multipart/form-data. There should be a single file-part included with the binary value of the picture. On top of that, the following additional form-fields can be present:  mimeType: Optional mime-type for the uploaded picture. If omitted, the default of image/jpeg is used as a mime-type for the picture.", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the user was found and the picture has been updated. The response-body is left empty intentionally."),
        @ApiResponse(code = 404, message = "Indicates the requested user was not found.") })
    @RequestMapping(value = "/identity/users/{userId}/picture",
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateUserPicture(@ApiParam(value = "The id of the user to get the picture for.",required=true) @PathVariable("userId") String userId);

}
