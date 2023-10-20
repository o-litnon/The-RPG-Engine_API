# Org.OpenAPITools.Api.CurrentCampaignCurrentMapApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CurrentCampaignCurrentMapFilePathGet**](CurrentCampaignCurrentMapApi.md#currentcampaigncurrentmapfilepathget) | **GET** /CurrentCampaign/CurrentMap/FilePath | Retrieve file path of the current map |
| [**CurrentCampaignCurrentMapGet**](CurrentCampaignCurrentMapApi.md#currentcampaigncurrentmapget) | **GET** /CurrentCampaign/CurrentMap | Retrieve current map data |
| [**CurrentCampaignCurrentMapPickupablesGet**](CurrentCampaignCurrentMapApi.md#currentcampaigncurrentmappickupablesget) | **GET** /CurrentCampaign/CurrentMap/Pickupables | Retrieve pickupables on the current map |
| [**CurrentCampaignCurrentMapPickupablesPost**](CurrentCampaignCurrentMapApi.md#currentcampaigncurrentmappickupablespost) | **POST** /CurrentCampaign/CurrentMap/Pickupables | Create Pickupables |
| [**CurrentCampaignCurrentMapSendAllPlayersPost**](CurrentCampaignCurrentMapApi.md#currentcampaigncurrentmapsendallplayerspost) | **POST** /CurrentCampaign/CurrentMap/SendAllPlayers | Sends all players to a map |
| [**CurrentCampaignCurrentMapTerrainDataGet**](CurrentCampaignCurrentMapApi.md#currentcampaigncurrentmapterraindataget) | **GET** /CurrentCampaign/CurrentMap/TerrainData | Retrieve terrain data on the current map |

<a id="currentcampaigncurrentmapfilepathget"></a>
# **CurrentCampaignCurrentMapFilePathGet**
> string CurrentCampaignCurrentMapFilePathGet ()

Retrieve file path of the current map

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CurrentCampaignCurrentMapFilePathGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CurrentCampaignCurrentMapApi(config);

            try
            {
                // Retrieve file path of the current map
                string result = apiInstance.CurrentCampaignCurrentMapFilePathGet();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CurrentCampaignCurrentMapApi.CurrentCampaignCurrentMapFilePathGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CurrentCampaignCurrentMapFilePathGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieve file path of the current map
    ApiResponse<string> response = apiInstance.CurrentCampaignCurrentMapFilePathGetWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CurrentCampaignCurrentMapApi.CurrentCampaignCurrentMapFilePathGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
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
| **200** | The file path of the current map |  -  |
| **403** | Forbidden |  -  |
| **409** | Map not loaded |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="currentcampaigncurrentmapget"></a>
# **CurrentCampaignCurrentMapGet**
> MapDataResponse CurrentCampaignCurrentMapGet ()

Retrieve current map data

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CurrentCampaignCurrentMapGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CurrentCampaignCurrentMapApi(config);

            try
            {
                // Retrieve current map data
                MapDataResponse result = apiInstance.CurrentCampaignCurrentMapGet();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CurrentCampaignCurrentMapApi.CurrentCampaignCurrentMapGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CurrentCampaignCurrentMapGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieve current map data
    ApiResponse<MapDataResponse> response = apiInstance.CurrentCampaignCurrentMapGetWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CurrentCampaignCurrentMapApi.CurrentCampaignCurrentMapGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
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
| **200** | OK |  -  |
| **409** | Map not loaded |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="currentcampaigncurrentmappickupablesget"></a>
# **CurrentCampaignCurrentMapPickupablesGet**
> PagedResponseOfProp CurrentCampaignCurrentMapPickupablesGet ()

Retrieve pickupables on the current map

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CurrentCampaignCurrentMapPickupablesGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CurrentCampaignCurrentMapApi(config);

            try
            {
                // Retrieve pickupables on the current map
                PagedResponseOfProp result = apiInstance.CurrentCampaignCurrentMapPickupablesGet();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CurrentCampaignCurrentMapApi.CurrentCampaignCurrentMapPickupablesGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CurrentCampaignCurrentMapPickupablesGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieve pickupables on the current map
    ApiResponse<PagedResponseOfProp> response = apiInstance.CurrentCampaignCurrentMapPickupablesGetWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CurrentCampaignCurrentMapApi.CurrentCampaignCurrentMapPickupablesGetWithHttpInfo: " + e.Message);
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
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **409** | Map not loaded |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="currentcampaigncurrentmappickupablespost"></a>
# **CurrentCampaignCurrentMapPickupablesPost**
> List&lt;Prop&gt; CurrentCampaignCurrentMapPickupablesPost (List<Prop> prop)

Create Pickupables

Create new pickupable items for the current map.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CurrentCampaignCurrentMapPickupablesPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CurrentCampaignCurrentMapApi(config);
            var prop = new List<Prop>(); // List<Prop> | The collection of pickupable items to create.

            try
            {
                // Create Pickupables
                List<Prop> result = apiInstance.CurrentCampaignCurrentMapPickupablesPost(prop);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CurrentCampaignCurrentMapApi.CurrentCampaignCurrentMapPickupablesPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CurrentCampaignCurrentMapPickupablesPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create Pickupables
    ApiResponse<List<Prop>> response = apiInstance.CurrentCampaignCurrentMapPickupablesPostWithHttpInfo(prop);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CurrentCampaignCurrentMapApi.CurrentCampaignCurrentMapPickupablesPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **prop** | [**List&lt;Prop&gt;**](Prop.md) | The collection of pickupable items to create. |  |

### Return type

[**List&lt;Prop&gt;**](Prop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **409** | Map not loaded |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="currentcampaigncurrentmapsendallplayerspost"></a>
# **CurrentCampaignCurrentMapSendAllPlayersPost**
> void CurrentCampaignCurrentMapSendAllPlayersPost (string mapName)

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
    public class CurrentCampaignCurrentMapSendAllPlayersPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CurrentCampaignCurrentMapApi(config);
            var mapName = "mapName_example";  // string | The name of the map to retrieve

            try
            {
                // Sends all players to a map
                apiInstance.CurrentCampaignCurrentMapSendAllPlayersPost(mapName);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CurrentCampaignCurrentMapApi.CurrentCampaignCurrentMapSendAllPlayersPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CurrentCampaignCurrentMapSendAllPlayersPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Sends all players to a map
    apiInstance.CurrentCampaignCurrentMapSendAllPlayersPostWithHttpInfo(mapName);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CurrentCampaignCurrentMapApi.CurrentCampaignCurrentMapSendAllPlayersPostWithHttpInfo: " + e.Message);
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

<a id="currentcampaigncurrentmapterraindataget"></a>
# **CurrentCampaignCurrentMapTerrainDataGet**
> PagedResponseOfTerrainDataPoint CurrentCampaignCurrentMapTerrainDataGet ()

Retrieve terrain data on the current map

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CurrentCampaignCurrentMapTerrainDataGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CurrentCampaignCurrentMapApi(config);

            try
            {
                // Retrieve terrain data on the current map
                PagedResponseOfTerrainDataPoint result = apiInstance.CurrentCampaignCurrentMapTerrainDataGet();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CurrentCampaignCurrentMapApi.CurrentCampaignCurrentMapTerrainDataGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CurrentCampaignCurrentMapTerrainDataGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Retrieve terrain data on the current map
    ApiResponse<PagedResponseOfTerrainDataPoint> response = apiInstance.CurrentCampaignCurrentMapTerrainDataGetWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CurrentCampaignCurrentMapApi.CurrentCampaignCurrentMapTerrainDataGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**PagedResponseOfTerrainDataPoint**](PagedResponseOfTerrainDataPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **409** | Map not loaded |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

