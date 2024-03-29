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
 * The Vector3Int model module.
 * @module model/Vector3Int
 * @version 1.0.0
 */
class Vector3Int {
    /**
     * Constructs a new <code>Vector3Int</code>.
     * @alias module:model/Vector3Int
     */
    constructor() { 
        
        Vector3Int.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Vector3Int</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Vector3Int} obj Optional instance to populate.
     * @return {module:model/Vector3Int} The populated <code>Vector3Int</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Vector3Int();

            if (data.hasOwnProperty('x')) {
                obj['x'] = ApiClient.convertToType(data['x'], 'Number');
            }
            if (data.hasOwnProperty('y')) {
                obj['y'] = ApiClient.convertToType(data['y'], 'Number');
            }
            if (data.hasOwnProperty('z')) {
                obj['z'] = ApiClient.convertToType(data['z'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Vector3Int</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Vector3Int</code>.
     */
    static validateJSON(data) {

        return true;
    }


}



/**
 * The x-coordinate
 * @member {Number} x
 */
Vector3Int.prototype['x'] = undefined;

/**
 * The y-coordinate
 * @member {Number} y
 */
Vector3Int.prototype['y'] = undefined;

/**
 * The z-coordinate
 * @member {Number} z
 */
Vector3Int.prototype['z'] = undefined;






export default Vector3Int;

