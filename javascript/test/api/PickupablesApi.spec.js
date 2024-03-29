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
    instance = new TheRpgEngineApi.PickupablesApi();
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

  describe('PickupablesApi', function() {
    describe('pickupablesGet', function() {
      it('should call pickupablesGet successfully', function(done) {
        //uncomment below and update the code to test pickupablesGet
        //instance.pickupablesGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('pickupablesGuidAnimationsGet', function() {
      it('should call pickupablesGuidAnimationsGet successfully', function(done) {
        //uncomment below and update the code to test pickupablesGuidAnimationsGet
        //instance.pickupablesGuidAnimationsGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('pickupablesGuidAnimationsPut', function() {
      it('should call pickupablesGuidAnimationsPut successfully', function(done) {
        //uncomment below and update the code to test pickupablesGuidAnimationsPut
        //instance.pickupablesGuidAnimationsPut(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('pickupablesGuidChatPost', function() {
      it('should call pickupablesGuidChatPost successfully', function(done) {
        //uncomment below and update the code to test pickupablesGuidChatPost
        //instance.pickupablesGuidChatPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('pickupablesGuidDelete', function() {
      it('should call pickupablesGuidDelete successfully', function(done) {
        //uncomment below and update the code to test pickupablesGuidDelete
        //instance.pickupablesGuidDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('pickupablesGuidGet', function() {
      it('should call pickupablesGuidGet successfully', function(done) {
        //uncomment below and update the code to test pickupablesGuidGet
        //instance.pickupablesGuidGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('pickupablesGuidTransformGet', function() {
      it('should call pickupablesGuidTransformGet successfully', function(done) {
        //uncomment below and update the code to test pickupablesGuidTransformGet
        //instance.pickupablesGuidTransformGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('pickupablesGuidTransformPut', function() {
      it('should call pickupablesGuidTransformPut successfully', function(done) {
        //uncomment below and update the code to test pickupablesGuidTransformPut
        //instance.pickupablesGuidTransformPut(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
