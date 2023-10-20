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
 * The PropMotion model module.
 * @module model/PropMotion
 * @version 1.0.0
 */
class PropMotion {
    /**
     * Constructs a new <code>PropMotion</code>.
     * @alias module:model/PropMotion
     */
    constructor() { 
        
        PropMotion.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PropMotion</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PropMotion} obj Optional instance to populate.
     * @return {module:model/PropMotion} The populated <code>PropMotion</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PropMotion();

            if (data.hasOwnProperty('moveSpeed')) {
                obj['moveSpeed'] = ApiClient.convertToType(data['moveSpeed'], 'Number');
            }
            if (data.hasOwnProperty('rotateSpeed')) {
                obj['rotateSpeed'] = ApiClient.convertToType(data['rotateSpeed'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>PropMotion</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>PropMotion</code>.
     */
    static validateJSON(data) {

        return true;
    }


}



/**
 * The move speed of the prop
 * @member {Number} moveSpeed
 */
PropMotion.prototype['moveSpeed'] = undefined;

/**
 * The rotate speed of the prop
 * @member {Number} rotateSpeed
 */
PropMotion.prototype['rotateSpeed'] = undefined;






export default PropMotion;

