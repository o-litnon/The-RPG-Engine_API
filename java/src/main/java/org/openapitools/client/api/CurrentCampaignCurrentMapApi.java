/*
 * The RPG Engine API
 * Requires The RPG Engine to be running locally.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.MapDataResponse;
import org.openapitools.client.model.PagedResponseOfProp;
import org.openapitools.client.model.PagedResponseOfTerrainDataPoint;
import org.openapitools.client.model.Prop;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrentCampaignCurrentMapApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CurrentCampaignCurrentMapApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CurrentCampaignCurrentMapApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for currentCampaignCurrentMapFilePathGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The file path of the current map </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call currentCampaignCurrentMapFilePathGetCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/CurrentCampaign/CurrentMap/FilePath";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call currentCampaignCurrentMapFilePathGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return currentCampaignCurrentMapFilePathGetCall(_callback);

    }

    /**
     * Retrieve file path of the current map
     * 
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The file path of the current map </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public String currentCampaignCurrentMapFilePathGet() throws ApiException {
        ApiResponse<String> localVarResp = currentCampaignCurrentMapFilePathGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Retrieve file path of the current map
     * 
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The file path of the current map </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> currentCampaignCurrentMapFilePathGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = currentCampaignCurrentMapFilePathGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve file path of the current map (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The file path of the current map </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call currentCampaignCurrentMapFilePathGetAsync(final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = currentCampaignCurrentMapFilePathGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for currentCampaignCurrentMapGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call currentCampaignCurrentMapGetCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/CurrentCampaign/CurrentMap";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call currentCampaignCurrentMapGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return currentCampaignCurrentMapGetCall(_callback);

    }

    /**
     * Retrieve current map data
     * 
     * @return MapDataResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public MapDataResponse currentCampaignCurrentMapGet() throws ApiException {
        ApiResponse<MapDataResponse> localVarResp = currentCampaignCurrentMapGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Retrieve current map data
     * 
     * @return ApiResponse&lt;MapDataResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<MapDataResponse> currentCampaignCurrentMapGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = currentCampaignCurrentMapGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<MapDataResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve current map data (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call currentCampaignCurrentMapGetAsync(final ApiCallback<MapDataResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = currentCampaignCurrentMapGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<MapDataResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for currentCampaignCurrentMapPickupablesGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call currentCampaignCurrentMapPickupablesGetCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/CurrentCampaign/CurrentMap/Pickupables";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call currentCampaignCurrentMapPickupablesGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return currentCampaignCurrentMapPickupablesGetCall(_callback);

    }

    /**
     * Retrieve pickupables on the current map
     * 
     * @return PagedResponseOfProp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public PagedResponseOfProp currentCampaignCurrentMapPickupablesGet() throws ApiException {
        ApiResponse<PagedResponseOfProp> localVarResp = currentCampaignCurrentMapPickupablesGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Retrieve pickupables on the current map
     * 
     * @return ApiResponse&lt;PagedResponseOfProp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PagedResponseOfProp> currentCampaignCurrentMapPickupablesGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = currentCampaignCurrentMapPickupablesGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<PagedResponseOfProp>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve pickupables on the current map (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call currentCampaignCurrentMapPickupablesGetAsync(final ApiCallback<PagedResponseOfProp> _callback) throws ApiException {

        okhttp3.Call localVarCall = currentCampaignCurrentMapPickupablesGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<PagedResponseOfProp>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for currentCampaignCurrentMapPickupablesPost
     * @param prop The collection of pickupable items to create. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call currentCampaignCurrentMapPickupablesPostCall(List<Prop> prop, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = prop;

        // create path and map variables
        String localVarPath = "/CurrentCampaign/CurrentMap/Pickupables";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call currentCampaignCurrentMapPickupablesPostValidateBeforeCall(List<Prop> prop, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'prop' is set
        if (prop == null) {
            throw new ApiException("Missing the required parameter 'prop' when calling currentCampaignCurrentMapPickupablesPost(Async)");
        }

        return currentCampaignCurrentMapPickupablesPostCall(prop, _callback);

    }

    /**
     * Create Pickupables
     * Create new pickupable items for the current map.
     * @param prop The collection of pickupable items to create. (required)
     * @return List&lt;Prop&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public List<Prop> currentCampaignCurrentMapPickupablesPost(List<Prop> prop) throws ApiException {
        ApiResponse<List<Prop>> localVarResp = currentCampaignCurrentMapPickupablesPostWithHttpInfo(prop);
        return localVarResp.getData();
    }

    /**
     * Create Pickupables
     * Create new pickupable items for the current map.
     * @param prop The collection of pickupable items to create. (required)
     * @return ApiResponse&lt;List&lt;Prop&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Prop>> currentCampaignCurrentMapPickupablesPostWithHttpInfo(List<Prop> prop) throws ApiException {
        okhttp3.Call localVarCall = currentCampaignCurrentMapPickupablesPostValidateBeforeCall(prop, null);
        Type localVarReturnType = new TypeToken<List<Prop>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Pickupables (asynchronously)
     * Create new pickupable items for the current map.
     * @param prop The collection of pickupable items to create. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call currentCampaignCurrentMapPickupablesPostAsync(List<Prop> prop, final ApiCallback<List<Prop>> _callback) throws ApiException {

        okhttp3.Call localVarCall = currentCampaignCurrentMapPickupablesPostValidateBeforeCall(prop, _callback);
        Type localVarReturnType = new TypeToken<List<Prop>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for currentCampaignCurrentMapSendAllPlayersPost
     * @param mapName The name of the map to retrieve (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call currentCampaignCurrentMapSendAllPlayersPostCall(String mapName, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/CurrentCampaign/CurrentMap/SendAllPlayers"
            .replace("{" + "mapName" + "}", localVarApiClient.escapeString(mapName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call currentCampaignCurrentMapSendAllPlayersPostValidateBeforeCall(String mapName, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'mapName' is set
        if (mapName == null) {
            throw new ApiException("Missing the required parameter 'mapName' when calling currentCampaignCurrentMapSendAllPlayersPost(Async)");
        }

        return currentCampaignCurrentMapSendAllPlayersPostCall(mapName, _callback);

    }

    /**
     * Sends all players to a map
     * Sends all players to a map if it exists
     * @param mapName The name of the map to retrieve (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     </table>
     */
    public void currentCampaignCurrentMapSendAllPlayersPost(String mapName) throws ApiException {
        currentCampaignCurrentMapSendAllPlayersPostWithHttpInfo(mapName);
    }

    /**
     * Sends all players to a map
     * Sends all players to a map if it exists
     * @param mapName The name of the map to retrieve (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> currentCampaignCurrentMapSendAllPlayersPostWithHttpInfo(String mapName) throws ApiException {
        okhttp3.Call localVarCall = currentCampaignCurrentMapSendAllPlayersPostValidateBeforeCall(mapName, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Sends all players to a map (asynchronously)
     * Sends all players to a map if it exists
     * @param mapName The name of the map to retrieve (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call currentCampaignCurrentMapSendAllPlayersPostAsync(String mapName, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = currentCampaignCurrentMapSendAllPlayersPostValidateBeforeCall(mapName, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for currentCampaignCurrentMapTerrainDataGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call currentCampaignCurrentMapTerrainDataGetCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/CurrentCampaign/CurrentMap/TerrainData";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call currentCampaignCurrentMapTerrainDataGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return currentCampaignCurrentMapTerrainDataGetCall(_callback);

    }

    /**
     * Retrieve terrain data on the current map
     * 
     * @return PagedResponseOfTerrainDataPoint
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public PagedResponseOfTerrainDataPoint currentCampaignCurrentMapTerrainDataGet() throws ApiException {
        ApiResponse<PagedResponseOfTerrainDataPoint> localVarResp = currentCampaignCurrentMapTerrainDataGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Retrieve terrain data on the current map
     * 
     * @return ApiResponse&lt;PagedResponseOfTerrainDataPoint&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PagedResponseOfTerrainDataPoint> currentCampaignCurrentMapTerrainDataGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = currentCampaignCurrentMapTerrainDataGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<PagedResponseOfTerrainDataPoint>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve terrain data on the current map (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Map not loaded </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call currentCampaignCurrentMapTerrainDataGetAsync(final ApiCallback<PagedResponseOfTerrainDataPoint> _callback) throws ApiException {

        okhttp3.Call localVarCall = currentCampaignCurrentMapTerrainDataGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<PagedResponseOfTerrainDataPoint>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
