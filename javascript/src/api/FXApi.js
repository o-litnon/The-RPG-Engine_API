/**
 * The RPG Engine API
 * Requires The RPG Engine to be running locally.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import CreateFx from '../model/CreateFx';
import PagedResponseOfString from '../model/PagedResponseOfString';

/**
* FX service.
* @module api/FXApi
* @version 1.0.0
*/
export default class FXApi {

    /**
    * Constructs a new FXApi. 
    * @alias module:api/FXApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the fXGet operation.
     * @callback module:api/FXApi~fXGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/PagedResponseOfString} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get Available Effects
     * Get a list of available click effects.
     * @param {module:api/FXApi~fXGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/PagedResponseOfString}
     */
    fXGet(callback) {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = PagedResponseOfString;
      return this.apiClient.callApi(
        '/FX', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the fXPost operation.
     * @callback module:api/FXApi~fXPostCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Create Click Effect
     * Create a new click effect.
     * @param {module:model/CreateFx} createFx 
     * @param {module:api/FXApi~fXPostCallback} callback The callback function, accepting three arguments: error, data, response
     */
    fXPost(createFx, callback) {
      let postBody = createFx;
      // verify the required parameter 'createFx' is set
      if (createFx === undefined || createFx === null) {
        throw new Error("Missing the required parameter 'createFx' when calling fXPost");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/FX', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
