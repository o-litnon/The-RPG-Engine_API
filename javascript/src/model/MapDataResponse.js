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
import Atmosphere from './Atmosphere';
import Controllable from './Controllable';
import CutoutSettingsData from './CutoutSettingsData';
import PostProcessing from './PostProcessing';
import Settings from './Settings';

/**
 * The MapDataResponse model module.
 * @module model/MapDataResponse
 * @version 1.0.0
 */
class MapDataResponse {
    /**
     * Constructs a new <code>MapDataResponse</code>.
     * @alias module:model/MapDataResponse
     */
    constructor() { 
        
        MapDataResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MapDataResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MapDataResponse} obj Optional instance to populate.
     * @return {module:model/MapDataResponse} The populated <code>MapDataResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MapDataResponse();

            if (data.hasOwnProperty('version')) {
                obj['version'] = ApiClient.convertToType(data['version'], 'Number');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('lightRotation')) {
                obj['lightRotation'] = ApiClient.convertToType(data['lightRotation'], 'Number');
            }
            if (data.hasOwnProperty('atmosphere')) {
                obj['atmosphere'] = Atmosphere.constructFromObject(data['atmosphere']);
            }
            if (data.hasOwnProperty('postProcessing')) {
                obj['postProcessing'] = PostProcessing.constructFromObject(data['postProcessing']);
            }
            if (data.hasOwnProperty('settings')) {
                obj['settings'] = Settings.constructFromObject(data['settings']);
            }
            if (data.hasOwnProperty('cutoutSettings')) {
                obj['cutoutSettings'] = CutoutSettingsData.constructFromObject(data['cutoutSettings']);
            }
            if (data.hasOwnProperty('ppu')) {
                obj['ppu'] = ApiClient.convertToType(data['ppu'], 'Number');
            }
            if (data.hasOwnProperty('controlledProps')) {
                obj['controlledProps'] = Controllable.constructFromObject(data['controlledProps']);
            }
            if (data.hasOwnProperty('controlledStates')) {
                obj['controlledStates'] = Controllable.constructFromObject(data['controlledStates']);
            }
            if (data.hasOwnProperty('turnOrderGuids')) {
                obj['turnOrderGuids'] = ApiClient.convertToType(data['turnOrderGuids'], ['String']);
            }
            if (data.hasOwnProperty('cameraViews')) {
                obj['cameraViews'] = Controllable.constructFromObject(data['cameraViews']);
            }
            if (data.hasOwnProperty('startingCamera')) {
                obj['startingCamera'] = ApiClient.convertToType(data['startingCamera'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>MapDataResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>MapDataResponse</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['title'] && !(typeof data['title'] === 'string' || data['title'] instanceof String)) {
            throw new Error("Expected the field `title` to be a primitive type in the JSON string but got " + data['title']);
        }
        // validate the optional field `atmosphere`
        if (data['atmosphere']) { // data not null
          Atmosphere.validateJSON(data['atmosphere']);
        }
        // validate the optional field `postProcessing`
        if (data['postProcessing']) { // data not null
          PostProcessing.validateJSON(data['postProcessing']);
        }
        // validate the optional field `settings`
        if (data['settings']) { // data not null
          Settings.validateJSON(data['settings']);
        }
        // validate the optional field `cutoutSettings`
        if (data['cutoutSettings']) { // data not null
          CutoutSettingsData.validateJSON(data['cutoutSettings']);
        }
        // validate the optional field `controlledProps`
        if (data['controlledProps']) { // data not null
          Controllable.validateJSON(data['controlledProps']);
        }
        // validate the optional field `controlledStates`
        if (data['controlledStates']) { // data not null
          Controllable.validateJSON(data['controlledStates']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['turnOrderGuids'])) {
            throw new Error("Expected the field `turnOrderGuids` to be an array in the JSON data but got " + data['turnOrderGuids']);
        }
        // validate the optional field `cameraViews`
        if (data['cameraViews']) { // data not null
          Controllable.validateJSON(data['cameraViews']);
        }
        // ensure the json data is a string
        if (data['startingCamera'] && !(typeof data['startingCamera'] === 'string' || data['startingCamera'] instanceof String)) {
            throw new Error("Expected the field `startingCamera` to be a primitive type in the JSON string but got " + data['startingCamera']);
        }

        return true;
    }


}



/**
 * The version of the map data
 * @member {Number} version
 */
MapDataResponse.prototype['version'] = undefined;

/**
 * The title of the map
 * @member {String} title
 */
MapDataResponse.prototype['title'] = undefined;

/**
 * The rotation of light
 * @member {Number} lightRotation
 */
MapDataResponse.prototype['lightRotation'] = undefined;

/**
 * @member {module:model/Atmosphere} atmosphere
 */
MapDataResponse.prototype['atmosphere'] = undefined;

/**
 * @member {module:model/PostProcessing} postProcessing
 */
MapDataResponse.prototype['postProcessing'] = undefined;

/**
 * @member {module:model/Settings} settings
 */
MapDataResponse.prototype['settings'] = undefined;

/**
 * @member {module:model/CutoutSettingsData} cutoutSettings
 */
MapDataResponse.prototype['cutoutSettings'] = undefined;

/**
 * Pixels per unit
 * @member {Number} ppu
 */
MapDataResponse.prototype['ppu'] = undefined;

/**
 * @member {module:model/Controllable} controlledProps
 */
MapDataResponse.prototype['controlledProps'] = undefined;

/**
 * @member {module:model/Controllable} controlledStates
 */
MapDataResponse.prototype['controlledStates'] = undefined;

/**
 * @member {Array.<String>} turnOrderGuids
 */
MapDataResponse.prototype['turnOrderGuids'] = undefined;

/**
 * @member {module:model/Controllable} cameraViews
 */
MapDataResponse.prototype['cameraViews'] = undefined;

/**
 * A uniquie identifier
 * @member {String} startingCamera
 */
MapDataResponse.prototype['startingCamera'] = undefined;






export default MapDataResponse;

