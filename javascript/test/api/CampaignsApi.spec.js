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
    instance = new TheRpgEngineApi.CampaignsApi();
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

  describe('CampaignsApi', function() {
    describe('campaignsCampaignDelete', function() {
      it('should call campaignsCampaignDelete successfully', function(done) {
        //uncomment below and update the code to test campaignsCampaignDelete
        //instance.campaignsCampaignDelete(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('campaignsCampaignMapsGet', function() {
      it('should call campaignsCampaignMapsGet successfully', function(done) {
        //uncomment below and update the code to test campaignsCampaignMapsGet
        //instance.campaignsCampaignMapsGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('campaignsCampaignOpenPost', function() {
      it('should call campaignsCampaignOpenPost successfully', function(done) {
        //uncomment below and update the code to test campaignsCampaignOpenPost
        //instance.campaignsCampaignOpenPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('campaignsCampaignPost', function() {
      it('should call campaignsCampaignPost successfully', function(done) {
        //uncomment below and update the code to test campaignsCampaignPost
        //instance.campaignsCampaignPost(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('campaignsGet', function() {
      it('should call campaignsGet successfully', function(done) {
        //uncomment below and update the code to test campaignsGet
        //instance.campaignsGet(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
