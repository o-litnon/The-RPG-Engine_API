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
import Color from './Color';
import Quaternion from './Quaternion';
import Vector2 from './Vector2';
import Vector3 from './Vector3';
import Vector4 from './Vector4';

/**
 * The GenericPropData model module.
 * @module model/GenericPropData
 * @version 1.0.0
 */
class GenericPropData {
    /**
     * Constructs a new <code>GenericPropData</code>.
     * A class for storing generic property data
     * @alias module:model/GenericPropData
     */
    constructor() { 
        
        GenericPropData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GenericPropData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GenericPropData} obj Optional instance to populate.
     * @return {module:model/GenericPropData} The populated <code>GenericPropData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GenericPropData();

            if (data.hasOwnProperty('version')) {
                obj['version'] = ApiClient.convertToType(data['version'], 'Number');
            }
            if (data.hasOwnProperty('bools')) {
                obj['bools'] = ApiClient.convertToType(data['bools'], {'String': 'Boolean'});
            }
            if (data.hasOwnProperty('ints')) {
                obj['ints'] = ApiClient.convertToType(data['ints'], {'String': 'Number'});
            }
            if (data.hasOwnProperty('floats')) {
                obj['floats'] = ApiClient.convertToType(data['floats'], {'String': 'Number'});
            }
            if (data.hasOwnProperty('strings')) {
                obj['strings'] = ApiClient.convertToType(data['strings'], {'String': 'String'});
            }
            if (data.hasOwnProperty('colors')) {
                obj['colors'] = ApiClient.convertToType(data['colors'], {'String': Color});
            }
            if (data.hasOwnProperty('vector2s')) {
                obj['vector2s'] = ApiClient.convertToType(data['vector2s'], {'String': Vector2});
            }
            if (data.hasOwnProperty('vector3s')) {
                obj['vector3s'] = ApiClient.convertToType(data['vector3s'], {'String': Vector3});
            }
            if (data.hasOwnProperty('vector4s')) {
                obj['vector4s'] = ApiClient.convertToType(data['vector4s'], {'String': Vector4});
            }
            if (data.hasOwnProperty('quaternions')) {
                obj['quaternions'] = ApiClient.convertToType(data['quaternions'], {'String': Quaternion});
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>GenericPropData</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>GenericPropData</code>.
     */
    static validateJSON(data) {

        return true;
    }


}



/**
 * The version of the GenericPropData
 * @member {Number} version
 */
GenericPropData.prototype['version'] = undefined;

/**
 * A dictionary mapping string keys to boolean values
 * @member {Object.<String, Boolean>} bools
 */
GenericPropData.prototype['bools'] = undefined;

/**
 * A dictionary mapping string keys to integer values
 * @member {Object.<String, Number>} ints
 */
GenericPropData.prototype['ints'] = undefined;

/**
 * A dictionary mapping string keys to float values
 * @member {Object.<String, Number>} floats
 */
GenericPropData.prototype['floats'] = undefined;

/**
 * A dictionary mapping string keys to string values
 * @member {Object.<String, String>} strings
 */
GenericPropData.prototype['strings'] = undefined;

/**
 * A dictionary mapping string keys to Color objects
 * @member {Object.<String, module:model/Color>} colors
 */
GenericPropData.prototype['colors'] = undefined;

/**
 * A dictionary mapping string keys to Vector2 objects
 * @member {Object.<String, module:model/Vector2>} vector2s
 */
GenericPropData.prototype['vector2s'] = undefined;

/**
 * A dictionary mapping string keys to Vector3 objects
 * @member {Object.<String, module:model/Vector3>} vector3s
 */
GenericPropData.prototype['vector3s'] = undefined;

/**
 * A dictionary mapping string keys to Vector4 objects
 * @member {Object.<String, module:model/Vector4>} vector4s
 */
GenericPropData.prototype['vector4s'] = undefined;

/**
 * A dictionary mapping string keys to Quaternion objects
 * @member {Object.<String, module:model/Quaternion>} quaternions
 */
GenericPropData.prototype['quaternions'] = undefined;






export default GenericPropData;
