# Org.OpenAPITools.Api.CampaignsApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CampaignsCampaignDelete**](CampaignsApi.md#campaignscampaigndelete) | **DELETE** /Campaigns/{campaign} | Delete a Campaign |
| [**CampaignsCampaignMapsGet**](CampaignsApi.md#campaignscampaignmapsget) | **GET** /Campaigns/{campaign}/Maps | Get Maps of a Campaign |
| [**CampaignsCampaignOpenPost**](CampaignsApi.md#campaignscampaignopenpost) | **POST** /Campaigns/{campaign}/Open | Load Campaign |
| [**CampaignsCampaignPost**](CampaignsApi.md#campaignscampaignpost) | **POST** /Campaigns/{campaign} | Create a Campaign |
| [**CampaignsGet**](CampaignsApi.md#campaignsget) | **GET** /Campaigns | Get Campaigns |

<a id="campaignscampaigndelete"></a>
# **CampaignsCampaignDelete**
> void CampaignsCampaignDelete (string campaign)

Delete a Campaign

Delete a campaign.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CampaignsCampaignDeleteExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CampaignsApi(config);
            var campaign = "campaign_example";  // string | The name of the campaign to delete.

            try
            {
                // Delete a Campaign
                apiInstance.CampaignsCampaignDelete(campaign);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CampaignsApi.CampaignsCampaignDelete: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CampaignsCampaignDeleteWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Delete a Campaign
    apiInstance.CampaignsCampaignDeleteWithHttpInfo(campaign);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CampaignsApi.CampaignsCampaignDeleteWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **campaign** | **string** | The name of the campaign to delete. |  |

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
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="campaignscampaignmapsget"></a>
# **CampaignsCampaignMapsGet**
> PagedResponseOfString CampaignsCampaignMapsGet (string campaign)

Get Maps of a Campaign

Get a list of maps for a specific campaign.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CampaignsCampaignMapsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CampaignsApi(config);
            var campaign = "campaign_example";  // string | The name of the campaign to retrieve maps from.

            try
            {
                // Get Maps of a Campaign
                PagedResponseOfString result = apiInstance.CampaignsCampaignMapsGet(campaign);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CampaignsApi.CampaignsCampaignMapsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CampaignsCampaignMapsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Maps of a Campaign
    ApiResponse<PagedResponseOfString> response = apiInstance.CampaignsCampaignMapsGetWithHttpInfo(campaign);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CampaignsApi.CampaignsCampaignMapsGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **campaign** | **string** | The name of the campaign to retrieve maps from. |  |

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
| **200** | OK |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="campaignscampaignopenpost"></a>
# **CampaignsCampaignOpenPost**
> void CampaignsCampaignOpenPost (string campaign)

Load Campaign

Load a campaign and open it.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CampaignsCampaignOpenPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CampaignsApi(config);
            var campaign = "campaign_example";  // string | The name of the campaign to load.

            try
            {
                // Load Campaign
                apiInstance.CampaignsCampaignOpenPost(campaign);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CampaignsApi.CampaignsCampaignOpenPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CampaignsCampaignOpenPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Load Campaign
    apiInstance.CampaignsCampaignOpenPostWithHttpInfo(campaign);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CampaignsApi.CampaignsCampaignOpenPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **campaign** | **string** | The name of the campaign to load. |  |

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
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="campaignscampaignpost"></a>
# **CampaignsCampaignPost**
> void CampaignsCampaignPost (string campaign)

Create a Campaign

Create a campaign.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CampaignsCampaignPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CampaignsApi(config);
            var campaign = "campaign_example";  // string | The name of the campaign to load.

            try
            {
                // Create a Campaign
                apiInstance.CampaignsCampaignPost(campaign);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CampaignsApi.CampaignsCampaignPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CampaignsCampaignPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Create a Campaign
    apiInstance.CampaignsCampaignPostWithHttpInfo(campaign);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CampaignsApi.CampaignsCampaignPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **campaign** | **string** | The name of the campaign to load. |  |

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
| **200** | OK |  -  |
| **409** | Conflict |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="campaignsget"></a>
# **CampaignsGet**
> PagedResponseOfString CampaignsGet ()

Get Campaigns

Get a list of available campaigns.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CampaignsGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new CampaignsApi(config);

            try
            {
                // Get Campaigns
                PagedResponseOfString result = apiInstance.CampaignsGet();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CampaignsApi.CampaignsGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CampaignsGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Campaigns
    ApiResponse<PagedResponseOfString> response = apiInstance.CampaignsGetWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CampaignsApi.CampaignsGetWithHttpInfo: " + e.Message);
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
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

