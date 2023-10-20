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
 * The Prop model module.
 * @module model/Prop
 * @version 1.0.0
 */
class Prop {
    /**
     * Constructs a new <code>Prop</code>.
     * @alias module:model/Prop
     * @param id {String} The prefab ID of the prop
     * @param guid {String} A uniquie identifier
     */
    constructor(id, guid) { 
        
        Prop.initialize(this, id, guid);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, guid) { 
        obj['id'] = id;
        obj['guid'] = guid;
    }

    /**
     * Constructs a <code>Prop</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Prop} obj Optional instance to populate.
     * @return {module:model/Prop} The populated <code>Prop</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Prop();

            if (data.hasOwnProperty('version')) {
                obj['version'] = ApiClient.convertToType(data['version'], 'Number');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'Number');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('guid')) {
                obj['guid'] = ApiClient.convertToType(data['guid'], 'String');
            }
            if (data.hasOwnProperty('inGameName')) {
                obj['inGameName'] = ApiClient.convertToType(data['inGameName'], 'String');
            }
            if (data.hasOwnProperty('parentGuid')) {
                obj['parentGuid'] = ApiClient.convertToType(data['parentGuid'], 'String');
            }
            if (data.hasOwnProperty('holderPosId')) {
                obj['holderPosId'] = ApiClient.convertToType(data['holderPosId'], 'Number');
            }
            if (data.hasOwnProperty('isLocked')) {
                obj['isLocked'] = ApiClient.convertToType(data['isLocked'], 'Boolean');
            }
            if (data.hasOwnProperty('isHidden')) {
                obj['isHidden'] = ApiClient.convertToType(data['isHidden'], 'Boolean');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Prop</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Prop</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of Prop.RequiredProperties) {
            if (!data[property]) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['guid'] && !(typeof data['guid'] === 'string' || data['guid'] instanceof String)) {
            throw new Error("Expected the field `guid` to be a primitive type in the JSON string but got " + data['guid']);
        }
        // ensure the json data is a string
        if (data['inGameName'] && !(typeof data['inGameName'] === 'string' || data['inGameName'] instanceof String)) {
            throw new Error("Expected the field `inGameName` to be a primitive type in the JSON string but got " + data['inGameName']);
        }
        // ensure the json data is a string
        if (data['parentGuid'] && !(typeof data['parentGuid'] === 'string' || data['parentGuid'] instanceof String)) {
            throw new Error("Expected the field `parentGuid` to be a primitive type in the JSON string but got " + data['parentGuid']);
        }

        return true;
    }


}

Prop.RequiredProperties = ["id", "guid"];

/**
 * The version of the prop data
 * @member {Number} version
 */
Prop.prototype['version'] = undefined;

/**
 * The type of the prop
 * @member {module:model/Prop.TypeEnum} type
 */
Prop.prototype['type'] = undefined;

/**
 * The prefab ID of the prop
 * @member {String} id
 */
Prop.prototype['id'] = undefined;

/**
 * A uniquie identifier
 * @member {String} guid
 */
Prop.prototype['guid'] = undefined;

/**
 * The in-game name of the prop
 * @member {String} inGameName
 */
Prop.prototype['inGameName'] = undefined;

/**
 * A uniquie identifier
 * @member {String} parentGuid
 */
Prop.prototype['parentGuid'] = undefined;

/**
 * The holder position ID
 * @member {Number} holderPosId
 * @default -1
 */
Prop.prototype['holderPosId'] = -1;

/**
 * Whether the prop is locked
 * @member {Boolean} isLocked
 */
Prop.prototype['isLocked'] = undefined;

/**
 * Whether the prop is hidden
 * @member {Boolean} isHidden
 */
Prop.prototype['isHidden'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {Number}
 * @readonly
 */
Prop['TypeEnum'] = {

    /**
     * value: 1
     * @const
     */
    "1": 1,

    /**
     * value: 2
     * @const
     */
    "2": 2,

    /**
     * value: 3
     * @const
     */
    "3": 3,

    /**
     * value: 4
     * @const
     */
    "4": 4,

    /**
     * value: 5
     * @const
     */
    "5": 5,

    /**
     * value: 6
     * @const
     */
    "6": 6,

    /**
     * value: 7
     * @const
     */
    "7": 7,

    /**
     * value: 8
     * @const
     */
    "8": 8,

    /**
     * value: 9
     * @const
     */
    "9": 9,

    /**
     * value: 10
     * @const
     */
    "10": 10,

    /**
     * value: 11
     * @const
     */
    "11": 11
};



export default Prop;

