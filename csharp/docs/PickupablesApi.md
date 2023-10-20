# Org.OpenAPITools.Api.PickupablesApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**PickupablesGet**](PickupablesApi.md#pickupablesget) | **GET** /Pickupables | Retrieve all pickupables |
| [**PickupablesGuidAnimationsGet**](PickupablesApi.md#pickupablesguidanimationsget) | **GET** /Pickupables/{guid}/Animations | Get animations for a specific pickupable by GUID. |
| [**PickupablesGuidAnimationsPut**](PickupablesApi.md#pickupablesguidanimationsput) | **PUT** /Pickupables/{guid}/Animations | Update Pickupable Animations |
| [**PickupablesGuidChatPost**](PickupablesApi.md#pickupablesguidchatpost) | **POST** /Pickupables/{guid}/Chat | Update Pickupable Chat |
| [**PickupablesGuidDelete**](PickupablesApi.md#pickupablesguiddelete) | **DELETE** /Pickupables/{guid} | Delete Pickupable |
| [**PickupablesGuidFocusAllPost**](PickupablesApi.md#pickupablesguidfocusallpost) | **POST** /Pickupables/{guid}/FocusAll | Focus everyone on the pickupable |
| [**PickupablesGuidFocusPost**](PickupablesApi.md#pickupablesguidfocuspost) | **POST** /Pickupables/{guid}/Focus | Focus on the pickupable |
| [**PickupablesGuidGet**](PickupablesApi.md#pickupablesguidget) | **GET** /Pickupables/{guid} | Retrieve a specific pickupable by its GUID |
| [**PickupablesGuidMoveToGlobalLocationPost**](PickupablesApi.md#pickupablesguidmovetogloballocationpost) | **POST** /Pickupables/{guid}/MoveToGlobalLocation | Move the pickupable to the target global location |
| [**PickupablesGuidTransformGet**](PickupablesApi.md#pickupablesguidtransformget) | **GET** /Pickupables/{guid}/Transform | Get Pickupable Transform |
| [**PickupablesGuidTransformPut**](PickupablesApi.md#pickupablesguidtransformput) | **PUT** /Pickupables/{guid}/Transform | Update Pickupable Transform |

<a id="pickupablesget"></a>
# **PickupablesGet**
> PagedResponseOfProp PickupablesGet ()

Retrieve all pickupables

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PickupablesGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new PickupablesApi(config);

            try
            {
                // Retrieve all pickupables
                PagedResponseOfProp result = apiInstance.PickupablesGet();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PickupablesApi.PickupablesGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PickupablesGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieve all pickupables
    ApiResponse<PagedResponseOfProp> response = apiInstance.PickupablesGetWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PickupablesApi.PickupablesGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**PagedResponseOfProp**](PagedResponseOfProp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="pickupablesguidanimationsget"></a>
# **PickupablesGuidAnimationsGet**
> List&lt;PagedResponseOfAnimations&gt; PickupablesGuidAnimationsGet (string guid)

Get animations for a specific pickupable by GUID.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PickupablesGuidAnimationsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new PickupablesApi(config);
            var guid = "guid_example";  // string | 

            try
            {
                // Get animations for a specific pickupable by GUID.
                List<PagedResponseOfAnimations> result = apiInstance.PickupablesGuidAnimationsGet(guid);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PickupablesApi.PickupablesGuidAnimationsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PickupablesGuidAnimationsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get animations for a specific pickupable by GUID.
    ApiResponse<List<PagedResponseOfAnimations>> response = apiInstance.PickupablesGuidAnimationsGetWithHttpInfo(guid);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PickupablesApi.PickupablesGuidAnimationsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **guid** | **string** |  |  |

### Return type

[**List&lt;PagedResponseOfAnimations&gt;**](PagedResponseOfAnimations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with animations. |  -  |
| **403** | Forbidden |  -  |
| **404** | Pickupable not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="pickupablesguidanimationsput"></a>
# **PickupablesGuidAnimationsPut**
> void PickupablesGuidAnimationsPut (string guid, Animation animation)

Update Pickupable Animations

Update animations for a specific Pickupable object.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PickupablesGuidAnimationsPutExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new PickupablesApi(config);
            var guid = "guid_example";  // string | The unique identifier of the Pickupable.
            var animation = new Animation(); // Animation | Dice roll request

            try
            {
                // Update Pickupable Animations
                apiInstance.PickupablesGuidAnimationsPut(guid, animation);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PickupablesApi.PickupablesGuidAnimationsPut: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PickupablesGuidAnimationsPutWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update Pickupable Animations
    apiInstance.PickupablesGuidAnimationsPutWithHttpInfo(guid, animation);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PickupablesApi.PickupablesGuidAnimationsPutWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **guid** | **string** | The unique identifier of the Pickupable. |  |
| **animation** | [**Animation**](Animation.md) | Dice roll request |  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Animation updated successfully. |  -  |
| **400** | Bad request. Invalid data or type. |  -  |
| **403** | Forbidden |  -  |
| **404** | Pickupable not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="pickupablesguidchatpost"></a>
# **PickupablesGuidChatPost**
> void PickupablesGuidChatPost (string guid, string body)

Update Pickupable Chat

Update chat for a pickupable item.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PickupablesGuidChatPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new PickupablesApi(config);
            var guid = "guid_example";  // string | The GUID of the pickupable.
            var body = "body_example";  // string | 

            try
            {
                // Update Pickupable Chat
                apiInstance.PickupablesGuidChatPost(guid, body);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PickupablesApi.PickupablesGuidChatPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PickupablesGuidChatPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update Pickupable Chat
    apiInstance.PickupablesGuidChatPostWithHttpInfo(guid, body);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PickupablesApi.PickupablesGuidChatPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **guid** | **string** | The GUID of the pickupable. |  |
| **body** | **string** |  |  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/text
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="pickupablesguiddelete"></a>
# **PickupablesGuidDelete**
> void PickupablesGuidDelete (string guid)

Delete Pickupable

Delete a pickupable item by its GUID.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PickupablesGuidDeleteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new PickupablesApi(config);
            var guid = "guid_example";  // string | The GUID of the pickupable to delete.

            try
            {
                // Delete Pickupable
                apiInstance.PickupablesGuidDelete(guid);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PickupablesApi.PickupablesGuidDelete: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PickupablesGuidDeleteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete Pickupable
    apiInstance.PickupablesGuidDeleteWithHttpInfo(guid);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PickupablesApi.PickupablesGuidDeleteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **guid** | **string** | The GUID of the pickupable to delete. |  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="pickupablesguidfocusallpost"></a>
# **PickupablesGuidFocusAllPost**
> void PickupablesGuidFocusAllPost (string guid)

Focus everyone on the pickupable

Focus everyone on the pickupable.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PickupablesGuidFocusAllPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new PickupablesApi(config);
            var guid = "guid_example";  // string | The GUID of the pickupable.

            try
            {
                // Focus everyone on the pickupable
                apiInstance.PickupablesGuidFocusAllPost(guid);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PickupablesApi.PickupablesGuidFocusAllPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PickupablesGuidFocusAllPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Focus everyone on the pickupable
    apiInstance.PickupablesGuidFocusAllPostWithHttpInfo(guid);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PickupablesApi.PickupablesGuidFocusAllPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **guid** | **string** | The GUID of the pickupable. |  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="pickupablesguidfocuspost"></a>
# **PickupablesGuidFocusPost**
> void PickupablesGuidFocusPost (string guid)

Focus on the pickupable

Focus on the pickupable.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PickupablesGuidFocusPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new PickupablesApi(config);
            var guid = "guid_example";  // string | The GUID of the pickupable.

            try
            {
                // Focus on the pickupable
                apiInstance.PickupablesGuidFocusPost(guid);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PickupablesApi.PickupablesGuidFocusPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PickupablesGuidFocusPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Focus on the pickupable
    apiInstance.PickupablesGuidFocusPostWithHttpInfo(guid);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PickupablesApi.PickupablesGuidFocusPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **guid** | **string** | The GUID of the pickupable. |  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="pickupablesguidget"></a>
# **PickupablesGuidGet**
> string PickupablesGuidGet (string guid)

Retrieve a specific pickupable by its GUID

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PickupablesGuidGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new PickupablesApi(config);
            var guid = "guid_example";  // string | The GUID of the pickupable

            try
            {
                // Retrieve a specific pickupable by its GUID
                string result = apiInstance.PickupablesGuidGet(guid);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PickupablesApi.PickupablesGuidGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PickupablesGuidGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieve a specific pickupable by its GUID
    ApiResponse<string> response = apiInstance.PickupablesGuidGetWithHttpInfo(guid);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PickupablesApi.PickupablesGuidGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **guid** | **string** | The GUID of the pickupable |  |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Pickupable not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="pickupablesguidmovetogloballocationpost"></a>
# **PickupablesGuidMoveToGlobalLocationPost**
> void PickupablesGuidMoveToGlobalLocationPost (string guid, Vector3 vector3)

Move the pickupable to the target global location

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PickupablesGuidMoveToGlobalLocationPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new PickupablesApi(config);
            var guid = "guid_example";  // string | 
            var vector3 = new Vector3(); // Vector3 | Position to move to

            try
            {
                // Move the pickupable to the target global location
                apiInstance.PickupablesGuidMoveToGlobalLocationPost(guid, vector3);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PickupablesApi.PickupablesGuidMoveToGlobalLocationPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PickupablesGuidMoveToGlobalLocationPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Move the pickupable to the target global location
    apiInstance.PickupablesGuidMoveToGlobalLocationPostWithHttpInfo(guid, vector3);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PickupablesApi.PickupablesGuidMoveToGlobalLocationPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **guid** | **string** |  |  |
| **vector3** | [**Vector3**](Vector3.md) | Position to move to |  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="pickupablesguidtransformget"></a>
# **PickupablesGuidTransformGet**
> PropTransform PickupablesGuidTransformGet (string guid)

Get Pickupable Transform

Retrieve the transform of a specific Pickupable object.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PickupablesGuidTransformGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new PickupablesApi(config);
            var guid = "guid_example";  // string | The unique identifier of the Pickupable.

            try
            {
                // Get Pickupable Transform
                PropTransform result = apiInstance.PickupablesGuidTransformGet(guid);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PickupablesApi.PickupablesGuidTransformGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PickupablesGuidTransformGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Pickupable Transform
    ApiResponse<PropTransform> response = apiInstance.PickupablesGuidTransformGetWithHttpInfo(guid);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PickupablesApi.PickupablesGuidTransformGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **guid** | **string** | The unique identifier of the Pickupable. |  |

### Return type

[**PropTransform**](PropTransform.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Pickupable not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="pickupablesguidtransformput"></a>
# **PickupablesGuidTransformPut**
> void PickupablesGuidTransformPut (string guid, PropTransform propTransform)

Update Pickupable Transform

Update the transform of a specific Pickupable object.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PickupablesGuidTransformPutExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new PickupablesApi(config);
            var guid = "guid_example";  // string | The unique identifier of the Pickupable.
            var propTransform = new PropTransform(); // PropTransform | 

            try
            {
                // Update Pickupable Transform
                apiInstance.PickupablesGuidTransformPut(guid, propTransform);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling PickupablesApi.PickupablesGuidTransformPut: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the PickupablesGuidTransformPutWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Update Pickupable Transform
    apiInstance.PickupablesGuidTransformPutWithHttpInfo(guid, propTransform);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling PickupablesApi.PickupablesGuidTransformPutWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **guid** | **string** | The unique identifier of the Pickupable. |  |
| **propTransform** | [**PropTransform**](PropTransform.md) |  |  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **403** | Forbidden |  -  |
| **404** | Pickupable not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

