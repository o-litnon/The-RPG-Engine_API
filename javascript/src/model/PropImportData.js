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

import ApiClient from '../ApiClient';

/**
 * The PropImportData model module.
 * @module model/PropImportData
 * @version 1.0.0
 */
class PropImportData {
    /**
     * Constructs a new <code>PropImportData</code>.
     * @alias module:model/PropImportData
     */
    constructor() { 
        
        PropImportData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PropImportData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PropImportData} obj Optional instance to populate.
     * @return {module:model/PropImportData} The populated <code>PropImportData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PropImportData();

            if (data.hasOwnProperty('icon')) {
                obj['icon'] = ApiClient.convertToType(data['icon'], 'String');
            }
            if (data.hasOwnProperty('meshId')) {
                obj['meshId'] = ApiClient.convertToType(data['meshId'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>PropImportData</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>PropImportData</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['icon'] && !(typeof data['icon'] === 'string' || data['icon'] instanceof String)) {
            throw new Error("Expected the field `icon` to be a primitive type in the JSON string but got " + data['icon']);
        }
        // ensure the json data is a string
        if (data['meshId'] && !(typeof data['meshId'] === 'string' || data['meshId'] instanceof String)) {
            throw new Error("Expected the field `meshId` to be a primitive type in the JSON string but got " + data['meshId']);
        }

        return true;
    }


}



/**
 * The icon data for the prop
 * @member {String} icon
 */
PropImportData.prototype['icon'] = undefined;

/**
 * The mesh ID for the prop
 * @member {String} meshId
 */
PropImportData.prototype['meshId'] = undefined;






export default PropImportData;
