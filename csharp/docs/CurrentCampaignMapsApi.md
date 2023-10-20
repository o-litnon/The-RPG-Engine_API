# Org.OpenAPITools.Api.CurrentCampaignMapsApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CurrentCampaignMapsGet**](CurrentCampaignMapsApi.md#currentcampaignmapsget) | **GET** /CurrentCampaign/Maps | Get a list of map names |
| [**CurrentCampaignMapsMapNameFilePathGet**](CurrentCampaignMapsApi.md#currentcampaignmapsmapnamefilepathget) | **GET** /CurrentCampaign/Maps/{mapName}/FilePath | Retrieve file path of the given map |
| [**CurrentCampaignMapsMapNameGet**](CurrentCampaignMapsApi.md#currentcampaignmapsmapnameget) | **GET** /CurrentCampaign/Maps/{mapName} | Get map details by name |
| [**CurrentCampaignMapsMapNameLoadIntoMemoryPost**](CurrentCampaignMapsApi.md#currentcampaignmapsmapnameloadintomemorypost) | **POST** /CurrentCampaign/Maps/{mapName}/LoadIntoMemory | Load a map into memory |
| [**CurrentCampaignMapsMapNameOpenPost**](CurrentCampaignMapsApi.md#currentcampaignmapsmapnameopenpost) | **POST** /CurrentCampaign/Maps/{mapName}/Open | Load a map |
| [**CurrentCampaignMapsMapNamePickupablesGet**](CurrentCampaignMapsApi.md#currentcampaignmapsmapnamepickupablesget) | **GET** /CurrentCampaign/Maps/{mapName}/Pickupables | Get pickupables for a specific map. |
| [**CurrentCampaignMapsMapNamePickupablesPost**](CurrentCampaignMapsApi.md#currentcampaignmapsmapnamepickupablespost) | **POST** /CurrentCampaign/Maps/{mapName}/Pickupables | Create Pickupables |
| [**CurrentCampaignMapsMapNameSendAllPlayersPost**](CurrentCampaignMapsApi.md#currentcampaignmapsmapnamesendallplayerspost) | **POST** /CurrentCampaign/Maps/{mapName}/SendAllPlayers | Sends all players to a map |
| [**CurrentCampaignMapsMapNameTerrainDataGet**](CurrentCampaignMapsApi.md#currentcampaignmapsmapnameterraindataget) | **GET** /CurrentCampaign/Maps/{mapName}/TerrainData | Get terrain data for a specific map. |

<a id="currentcampaignmapsget"></a>
# **CurrentCampaignMapsGet**
> PagedResponseOfString CurrentCampaignMapsGet ()

Get a list of map names

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CurrentCampaignMapsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CurrentCampaignMapsApi(config);

            try
            {
                // Get a list of map names
                PagedResponseOfString result = apiInstance.CurrentCampaignMapsGet();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CurrentCampaignMapsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get a list of map names
    ApiResponse<PagedResponseOfString> response = apiInstance.CurrentCampaignMapsGetWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**PagedResponseOfString**](PagedResponseOfString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of map names |  -  |
| **403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="currentcampaignmapsmapnamefilepathget"></a>
# **CurrentCampaignMapsMapNameFilePathGet**
> string CurrentCampaignMapsMapNameFilePathGet (string mapName)

Retrieve file path of the given map

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CurrentCampaignMapsMapNameFilePathGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CurrentCampaignMapsApi(config);
            var mapName = "mapName_example";  // string | The name of the map to get the file path of

            try
            {
                // Retrieve file path of the given map
                string result = apiInstance.CurrentCampaignMapsMapNameFilePathGet(mapName);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsMapNameFilePathGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CurrentCampaignMapsMapNameFilePathGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieve file path of the given map
    ApiResponse<string> response = apiInstance.CurrentCampaignMapsMapNameFilePathGetWithHttpInfo(mapName);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsMapNameFilePathGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **mapName** | **string** | The name of the map to get the file path of |  |

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The file path of the given map |  -  |
| **403** | Forbidden |  -  |
| **409** | Map not loaded |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="currentcampaignmapsmapnameget"></a>
# **CurrentCampaignMapsMapNameGet**
> MapDataResponse CurrentCampaignMapsMapNameGet (string mapName)

Get map details by name

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CurrentCampaignMapsMapNameGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CurrentCampaignMapsApi(config);
            var mapName = "mapName_example";  // string | The name of the map to retrieve

            try
            {
                // Get map details by name
                MapDataResponse result = apiInstance.CurrentCampaignMapsMapNameGet(mapName);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsMapNameGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CurrentCampaignMapsMapNameGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get map details by name
    ApiResponse<MapDataResponse> response = apiInstance.CurrentCampaignMapsMapNameGetWithHttpInfo(mapName);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsMapNameGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **mapName** | **string** | The name of the map to retrieve |  |

### Return type

[**MapDataResponse**](MapDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Map details |  -  |
| **403** | Forbidden |  -  |
| **404** | Map not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="currentcampaignmapsmapnameloadintomemorypost"></a>
# **CurrentCampaignMapsMapNameLoadIntoMemoryPost**
> void CurrentCampaignMapsMapNameLoadIntoMemoryPost (string mapName)

Load a map into memory

Load a map if it exists

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CurrentCampaignMapsMapNameLoadIntoMemoryPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CurrentCampaignMapsApi(config);
            var mapName = "mapName_example";  // string | The name of the map to load in to memory

            try
            {
                // Load a map into memory
                apiInstance.CurrentCampaignMapsMapNameLoadIntoMemoryPost(mapName);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsMapNameLoadIntoMemoryPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CurrentCampaignMapsMapNameLoadIntoMemoryPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load a map into memory
    apiInstance.CurrentCampaignMapsMapNameLoadIntoMemoryPostWithHttpInfo(mapName);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsMapNameLoadIntoMemoryPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **mapName** | **string** | The name of the map to load in to memory |  |

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
| **409** | Conflict |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="currentcampaignmapsmapnameopenpost"></a>
# **CurrentCampaignMapsMapNameOpenPost**
> void CurrentCampaignMapsMapNameOpenPost (string mapName)

Load a map

Load a map if it exists

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CurrentCampaignMapsMapNameOpenPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CurrentCampaignMapsApi(config);
            var mapName = "mapName_example";  // string | The name of the map to retrieve

            try
            {
                // Load a map
                apiInstance.CurrentCampaignMapsMapNameOpenPost(mapName);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsMapNameOpenPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CurrentCampaignMapsMapNameOpenPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load a map
    apiInstance.CurrentCampaignMapsMapNameOpenPostWithHttpInfo(mapName);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsMapNameOpenPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **mapName** | **string** | The name of the map to retrieve |  |

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
| **409** | Conflict |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="currentcampaignmapsmapnamepickupablesget"></a>
# **CurrentCampaignMapsMapNamePickupablesGet**
> List&lt;PagedResponseOfProp&gt; CurrentCampaignMapsMapNamePickupablesGet (string mapName)

Get pickupables for a specific map.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CurrentCampaignMapsMapNamePickupablesGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CurrentCampaignMapsApi(config);
            var mapName = "mapName_example";  // string | 

            try
            {
                // Get pickupables for a specific map.
                List<PagedResponseOfProp> result = apiInstance.CurrentCampaignMapsMapNamePickupablesGet(mapName);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsMapNamePickupablesGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CurrentCampaignMapsMapNamePickupablesGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get pickupables for a specific map.
    ApiResponse<List<PagedResponseOfProp>> response = apiInstance.CurrentCampaignMapsMapNamePickupablesGetWithHttpInfo(mapName);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsMapNamePickupablesGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **mapName** | **string** |  |  |

### Return type

[**List&lt;PagedResponseOfProp&gt;**](PagedResponseOfProp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with pickupables. |  -  |
| **404** | Map not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="currentcampaignmapsmapnamepickupablespost"></a>
# **CurrentCampaignMapsMapNamePickupablesPost**
> List&lt;Prop&gt; CurrentCampaignMapsMapNamePickupablesPost (string mapName, List<Prop> prop)

Create Pickupables

Create new pickupable items for a specific map.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CurrentCampaignMapsMapNamePickupablesPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CurrentCampaignMapsApi(config);
            var mapName = "mapName_example";  // string | The name of the map where the pickupables should be created.
            var prop = new List<Prop>(); // List<Prop> | The collection of pickupable items to create.

            try
            {
                // Create Pickupables
                List<Prop> result = apiInstance.CurrentCampaignMapsMapNamePickupablesPost(mapName, prop);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsMapNamePickupablesPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CurrentCampaignMapsMapNamePickupablesPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create Pickupables
    ApiResponse<List<Prop>> response = apiInstance.CurrentCampaignMapsMapNamePickupablesPostWithHttpInfo(mapName, prop);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsMapNamePickupablesPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **mapName** | **string** | The name of the map where the pickupables should be created. |  |
| **prop** | [**List&lt;Prop&gt;**](Prop.md) | The collection of pickupable items to create. |  |

### Return type

[**List&lt;Prop&gt;**](Prop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="currentcampaignmapsmapnamesendallplayerspost"></a>
# **CurrentCampaignMapsMapNameSendAllPlayersPost**
> void CurrentCampaignMapsMapNameSendAllPlayersPost (string mapName)

Sends all players to a map

Sends all players to a map if it exists

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CurrentCampaignMapsMapNameSendAllPlayersPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CurrentCampaignMapsApi(config);
            var mapName = "mapName_example";  // string | The name of the map to retrieve

            try
            {
                // Sends all players to a map
                apiInstance.CurrentCampaignMapsMapNameSendAllPlayersPost(mapName);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsMapNameSendAllPlayersPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CurrentCampaignMapsMapNameSendAllPlayersPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Sends all players to a map
    apiInstance.CurrentCampaignMapsMapNameSendAllPlayersPostWithHttpInfo(mapName);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsMapNameSendAllPlayersPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **mapName** | **string** | The name of the map to retrieve |  |

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
| **409** | Conflict |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="currentcampaignmapsmapnameterraindataget"></a>
# **CurrentCampaignMapsMapNameTerrainDataGet**
> Object CurrentCampaignMapsMapNameTerrainDataGet (string mapName)

Get terrain data for a specific map.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CurrentCampaignMapsMapNameTerrainDataGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CurrentCampaignMapsApi(config);
            var mapName = "mapName_example";  // string | 

            try
            {
                // Get terrain data for a specific map.
                Object result = apiInstance.CurrentCampaignMapsMapNameTerrainDataGet(mapName);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsMapNameTerrainDataGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CurrentCampaignMapsMapNameTerrainDataGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get terrain data for a specific map.
    ApiResponse<Object> response = apiInstance.CurrentCampaignMapsMapNameTerrainDataGetWithHttpInfo(mapName);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CurrentCampaignMapsApi.CurrentCampaignMapsMapNameTerrainDataGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **mapName** | **string** |  |  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with terrain data. |  -  |
| **404** | Map not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

