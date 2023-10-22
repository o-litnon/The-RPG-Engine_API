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
 * The Quaternion model module.
 * @module model/Quaternion
 * @version 1.0.0
 */
class Quaternion {
    /**
     * Constructs a new <code>Quaternion</code>.
     * @alias module:model/Quaternion
     */
    constructor() { 
        
        Quaternion.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Quaternion</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Quaternion} obj Optional instance to populate.
     * @return {module:model/Quaternion} The populated <code>Quaternion</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Quaternion();

            if (data.hasOwnProperty('x')) {
                obj['x'] = ApiClient.convertToType(data['x'], 'Number');
            }
            if (data.hasOwnProperty('y')) {
                obj['y'] = ApiClient.convertToType(data['y'], 'Number');
            }
            if (data.hasOwnProperty('z')) {
                obj['z'] = ApiClient.convertToType(data['z'], 'Number');
            }
            if (data.hasOwnProperty('w')) {
                obj['w'] = ApiClient.convertToType(data['w'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Quaternion</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Quaternion</code>.
     */
    static validateJSON(data) {

        return true;
    }


}



/**
 * X-coordinate
 * @member {Number} x
 */
Quaternion.prototype['x'] = undefined;

/**
 * Y-coordinate
 * @member {Number} y
 */
Quaternion.prototype['y'] = undefined;

/**
 * Z-coordinate
 * @member {Number} z
 */
Quaternion.prototype['z'] = undefined;

/**
 * W-coordinate
 * @member {Number} w
 */
Quaternion.prototype['w'] = undefined;






export default Quaternion;
