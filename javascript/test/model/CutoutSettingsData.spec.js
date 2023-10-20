/**
 * The RPG Engine API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.TheRpgEngineApi);
  }
}(this, function(expect, TheRpgEngineApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new TheRpgEngineApi.CutoutSettingsData();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('CutoutSettingsData', function() {
    it('should create an instance of CutoutSettingsData', function() {
      // uncomment below and update the code to test CutoutSettingsData
      //var instance = new TheRpgEngineApi.CutoutSettingsData();
      //expect(instance).to.be.a(TheRpgEngineApi.CutoutSettingsData);
    });

    it('should have the property enabled (base name: "enabled")', function() {
      // uncomment below and update the code to test the property enabled
      //var instance = new TheRpgEngineApi.CutoutSettingsData();
      //expect(instance).to.be();
    });

    it('should have the property hideFloor (base name: "hideFloor")', function() {
      // uncomment below and update the code to test the property hideFloor
      //var instance = new TheRpgEngineApi.CutoutSettingsData();
      //expect(instance).to.be();
    });

    it('should have the property position (base name: "position")', function() {
      // uncomment below and update the code to test the property position
      //var instance = new TheRpgEngineApi.CutoutSettingsData();
      //expect(instance).to.be();
    });

    it('should have the property rotation (base name: "rotation")', function() {
      // uncomment below and update the code to test the property rotation
      //var instance = new TheRpgEngineApi.CutoutSettingsData();
      //expect(instance).to.be();
    });

    it('should have the property scale (base name: "scale")', function() {
      // uncomment below and update the code to test the property scale
      //var instance = new TheRpgEngineApi.CutoutSettingsData();
      //expect(instance).to.be();
    });

  });

}));
