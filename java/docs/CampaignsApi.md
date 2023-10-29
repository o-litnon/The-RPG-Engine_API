# CampaignsApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**campaignsCampaignDelete**](CampaignsApi.md#campaignsCampaignDelete) | **DELETE** /Campaigns/{campaign} | Delete a Campaign |
| [**campaignsCampaignMapsGet**](CampaignsApi.md#campaignsCampaignMapsGet) | **GET** /Campaigns/{campaign}/Maps | Get Maps of a Campaign |
| [**campaignsCampaignOpenPost**](CampaignsApi.md#campaignsCampaignOpenPost) | **POST** /Campaigns/{campaign}/Open | Load Campaign |
| [**campaignsCampaignPost**](CampaignsApi.md#campaignsCampaignPost) | **POST** /Campaigns/{campaign} | Create a Campaign |
| [**campaignsGet**](CampaignsApi.md#campaignsGet) | **GET** /Campaigns | Get Campaigns |


<a id="campaignsCampaignDelete"></a>
# **campaignsCampaignDelete**
> campaignsCampaignDelete(campaign)

Delete a Campaign

Delete a campaign.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String campaign = "campaign_example"; // String | The name of the campaign to delete.
    try {
      apiInstance.campaignsCampaignDelete(campaign);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#campaignsCampaignDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaign** | **String**| The name of the campaign to delete. | |

### Return type

null (empty response body)

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

<a id="campaignsCampaignMapsGet"></a>
# **campaignsCampaignMapsGet**
> PagedResponseOfString campaignsCampaignMapsGet(campaign)

Get Maps of a Campaign

Get a list of maps for a specific campaign.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String campaign = "campaign_example"; // String | The name of the campaign to retrieve maps from.
    try {
      PagedResponseOfString result = apiInstance.campaignsCampaignMapsGet(campaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#campaignsCampaignMapsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaign** | **String**| The name of the campaign to retrieve maps from. | |

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

<a id="campaignsCampaignOpenPost"></a>
# **campaignsCampaignOpenPost**
> campaignsCampaignOpenPost(campaign)

Load Campaign

Load a campaign and open it.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String campaign = "campaign_example"; // String | The name of the campaign to load.
    try {
      apiInstance.campaignsCampaignOpenPost(campaign);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#campaignsCampaignOpenPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaign** | **String**| The name of the campaign to load. | |

### Return type

null (empty response body)

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

<a id="campaignsCampaignPost"></a>
# **campaignsCampaignPost**
> campaignsCampaignPost(campaign)

Create a Campaign

Create a campaign.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String campaign = "campaign_example"; // String | The name of the campaign to load.
    try {
      apiInstance.campaignsCampaignPost(campaign);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#campaignsCampaignPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaign** | **String**| The name of the campaign to load. | |

### Return type

null (empty response body)

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

<a id="campaignsGet"></a>
# **campaignsGet**
> PagedResponseOfString campaignsGet()

Get Campaigns

Get a list of available campaigns.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    try {
      PagedResponseOfString result = apiInstance.campaignsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#campaignsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

