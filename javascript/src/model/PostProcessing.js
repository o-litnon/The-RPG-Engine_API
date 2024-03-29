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

/**
 * The PostProcessing model module.
 * @module model/PostProcessing
 * @version 1.0.0
 */
class PostProcessing {
    /**
     * Constructs a new <code>PostProcessing</code>.
     * @alias module:model/PostProcessing
     */
    constructor() { 
        
        PostProcessing.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PostProcessing</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PostProcessing} obj Optional instance to populate.
     * @return {module:model/PostProcessing} The populated <code>PostProcessing</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PostProcessing();

            if (data.hasOwnProperty('tiltShiftBlurAmount')) {
                obj['tiltShiftBlurAmount'] = ApiClient.convertToType(data['tiltShiftBlurAmount'], 'Number');
            }
            if (data.hasOwnProperty('edgeDetectionEnabled')) {
                obj['edgeDetectionEnabled'] = ApiClient.convertToType(data['edgeDetectionEnabled'], 'Boolean');
            }
            if (data.hasOwnProperty('edgeDetectionColor')) {
                obj['edgeDetectionColor'] = Color.constructFromObject(data['edgeDetectionColor']);
            }
            if (data.hasOwnProperty('ditheringThreshold')) {
                obj['ditheringThreshold'] = ApiClient.convertToType(data['ditheringThreshold'], 'Number');
            }
            if (data.hasOwnProperty('tubeDistortionStrength')) {
                obj['tubeDistortionStrength'] = ApiClient.convertToType(data['tubeDistortionStrength'], 'Number');
            }
            if (data.hasOwnProperty('pixelizationResolution')) {
                obj['pixelizationResolution'] = ApiClient.convertToType(data['pixelizationResolution'], 'Number');
            }
            if (data.hasOwnProperty('colorSplitStrength')) {
                obj['colorSplitStrength'] = ApiClient.convertToType(data['colorSplitStrength'], 'Number');
            }
            if (data.hasOwnProperty('waterRipplesStrength')) {
                obj['waterRipplesStrength'] = ApiClient.convertToType(data['waterRipplesStrength'], 'Number');
            }
            if (data.hasOwnProperty('waterRipplesSpeed')) {
                obj['waterRipplesSpeed'] = ApiClient.convertToType(data['waterRipplesSpeed'], 'Number');
            }
            if (data.hasOwnProperty('sketchEnabled')) {
                obj['sketchEnabled'] = ApiClient.convertToType(data['sketchEnabled'], 'Boolean');
            }
            if (data.hasOwnProperty('radialBlurAmount')) {
                obj['radialBlurAmount'] = ApiClient.convertToType(data['radialBlurAmount'], 'Number');
            }
            if (data.hasOwnProperty('bloomThreshhold')) {
                obj['bloomThreshhold'] = ApiClient.convertToType(data['bloomThreshhold'], 'Number');
            }
            if (data.hasOwnProperty('bloomIntensity')) {
                obj['bloomIntensity'] = ApiClient.convertToType(data['bloomIntensity'], 'Number');
            }
            if (data.hasOwnProperty('vignetteIntensity')) {
                obj['vignetteIntensity'] = ApiClient.convertToType(data['vignetteIntensity'], 'Number');
            }
            if (data.hasOwnProperty('vignetteColor')) {
                obj['vignetteColor'] = Color.constructFromObject(data['vignetteColor']);
            }
            if (data.hasOwnProperty('postExposure')) {
                obj['postExposure'] = ApiClient.convertToType(data['postExposure'], 'Number');
            }
            if (data.hasOwnProperty('saturation')) {
                obj['saturation'] = ApiClient.convertToType(data['saturation'], 'Number');
            }
            if (data.hasOwnProperty('hue')) {
                obj['hue'] = ApiClient.convertToType(data['hue'], 'Number');
            }
            if (data.hasOwnProperty('temperature')) {
                obj['temperature'] = ApiClient.convertToType(data['temperature'], 'Number');
            }
            if (data.hasOwnProperty('sharpenEnabled')) {
                obj['sharpenEnabled'] = ApiClient.convertToType(data['sharpenEnabled'], 'Boolean');
            }
            if (data.hasOwnProperty('blackBars')) {
                obj['blackBars'] = ApiClient.convertToType(data['blackBars'], 'Number');
            }
            if (data.hasOwnProperty('ScanLinesEnabled')) {
                obj['ScanLinesEnabled'] = ApiClient.convertToType(data['ScanLinesEnabled'], 'Boolean');
            }
            if (data.hasOwnProperty('scanlinesAmount')) {
                obj['scanlinesAmount'] = ApiClient.convertToType(data['scanlinesAmount'], 'Number');
            }
            if (data.hasOwnProperty('scanlinesSpeed')) {
                obj['scanlinesSpeed'] = ApiClient.convertToType(data['scanlinesSpeed'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>PostProcessing</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>PostProcessing</code>.
     */
    static validateJSON(data) {
        // validate the optional field `edgeDetectionColor`
        if (data['edgeDetectionColor']) { // data not null
          Color.validateJSON(data['edgeDetectionColor']);
        }
        // validate the optional field `vignetteColor`
        if (data['vignetteColor']) { // data not null
          Color.validateJSON(data['vignetteColor']);
        }

        return true;
    }


}



/**
 * Tilt-shift blur amount
 * @member {Number} tiltShiftBlurAmount
 */
PostProcessing.prototype['tiltShiftBlurAmount'] = undefined;

/**
 * Whether edge detection is enabled
 * @member {Boolean} edgeDetectionEnabled
 */
PostProcessing.prototype['edgeDetectionEnabled'] = undefined;

/**
 * @member {module:model/Color} edgeDetectionColor
 */
PostProcessing.prototype['edgeDetectionColor'] = undefined;

/**
 * Dithering threshold
 * @member {Number} ditheringThreshold
 */
PostProcessing.prototype['ditheringThreshold'] = undefined;

/**
 * Tube distortion strength
 * @member {Number} tubeDistortionStrength
 */
PostProcessing.prototype['tubeDistortionStrength'] = undefined;

/**
 * Pixelization resolution
 * @member {Number} pixelizationResolution
 */
PostProcessing.prototype['pixelizationResolution'] = undefined;

/**
 * Color split strength
 * @member {Number} colorSplitStrength
 */
PostProcessing.prototype['colorSplitStrength'] = undefined;

/**
 * Water ripples strength
 * @member {Number} waterRipplesStrength
 */
PostProcessing.prototype['waterRipplesStrength'] = undefined;

/**
 * Water ripples speed
 * @member {Number} waterRipplesSpeed
 */
PostProcessing.prototype['waterRipplesSpeed'] = undefined;

/**
 * Whether sketch is enabled
 * @member {Boolean} sketchEnabled
 */
PostProcessing.prototype['sketchEnabled'] = undefined;

/**
 * Radial blur amount
 * @member {Number} radialBlurAmount
 */
PostProcessing.prototype['radialBlurAmount'] = undefined;

/**
 * Bloom threshold
 * @member {Number} bloomThreshhold
 */
PostProcessing.prototype['bloomThreshhold'] = undefined;

/**
 * Bloom intensity
 * @member {Number} bloomIntensity
 */
PostProcessing.prototype['bloomIntensity'] = undefined;

/**
 * Vignette intensity
 * @member {Number} vignetteIntensity
 */
PostProcessing.prototype['vignetteIntensity'] = undefined;

/**
 * @member {module:model/Color} vignetteColor
 */
PostProcessing.prototype['vignetteColor'] = undefined;

/**
 * Post-exposure
 * @member {Number} postExposure
 */
PostProcessing.prototype['postExposure'] = undefined;

/**
 * Saturation
 * @member {Number} saturation
 */
PostProcessing.prototype['saturation'] = undefined;

/**
 * Hue
 * @member {Number} hue
 */
PostProcessing.prototype['hue'] = undefined;

/**
 * Temperature
 * @member {Number} temperature
 */
PostProcessing.prototype['temperature'] = undefined;

/**
 * Whether sharpen is enabled
 * @member {Boolean} sharpenEnabled
 */
PostProcessing.prototype['sharpenEnabled'] = undefined;

/**
 * Black bars
 * @member {Number} blackBars
 */
PostProcessing.prototype['blackBars'] = undefined;

/**
 * Whether scan lines are enabled
 * @member {Boolean} ScanLinesEnabled
 */
PostProcessing.prototype['ScanLinesEnabled'] = undefined;

/**
 * Scan lines amount
 * @member {Number} scanlinesAmount
 */
PostProcessing.prototype['scanlinesAmount'] = undefined;

/**
 * Scan lines speed
 * @member {Number} scanlinesSpeed
 */
PostProcessing.prototype['scanlinesSpeed'] = undefined;






export default PostProcessing;

