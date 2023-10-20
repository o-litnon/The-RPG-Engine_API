/*
 * The RPG Engine API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing ChatApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ChatApiTests : IDisposable
    {
        private ChatApi instance;

        public ChatApiTests()
        {
            instance = new ChatApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ChatApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ChatApi
            //Assert.IsType<ChatApi>(instance);
        }

        /// <summary>
        /// Test ChatPost
        /// </summary>
        [Fact]
        public void ChatPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string body = null;
            //instance.ChatPost(body);
        }
    }
}
