# CurrentCampaignCurrentMapApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**currentCampaignCurrentMapFilePathGet**](CurrentCampaignCurrentMapApi.md#currentCampaignCurrentMapFilePathGet) | **GET** /CurrentCampaign/CurrentMap/FilePath | Retrieve file path of the current map |
| [**currentCampaignCurrentMapGet**](CurrentCampaignCurrentMapApi.md#currentCampaignCurrentMapGet) | **GET** /CurrentCampaign/CurrentMap | Retrieve current map data |
| [**currentCampaignCurrentMapPickupablesGet**](CurrentCampaignCurrentMapApi.md#currentCampaignCurrentMapPickupablesGet) | **GET** /CurrentCampaign/CurrentMap/Pickupables | Retrieve pickupables on the current map |
| [**currentCampaignCurrentMapPickupablesPost**](CurrentCampaignCurrentMapApi.md#currentCampaignCurrentMapPickupablesPost) | **POST** /CurrentCampaign/CurrentMap/Pickupables | Create Pickupables |
| [**currentCampaignCurrentMapSendAllPlayersPost**](CurrentCampaignCurrentMapApi.md#currentCampaignCurrentMapSendAllPlayersPost) | **POST** /CurrentCampaign/CurrentMap/SendAllPlayers | Sends all players to a map |
| [**currentCampaignCurrentMapTerrainDataGet**](CurrentCampaignCurrentMapApi.md#currentCampaignCurrentMapTerrainDataGet) | **GET** /CurrentCampaign/CurrentMap/TerrainData | Retrieve terrain data on the current map |


<a id="currentCampaignCurrentMapFilePathGet"></a>
# **currentCampaignCurrentMapFilePathGet**
> String currentCampaignCurrentMapFilePathGet()

Retrieve file path of the current map

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentCampaignCurrentMapApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CurrentCampaignCurrentMapApi apiInstance = new CurrentCampaignCurrentMapApi(defaultClient);
    try {
      String result = apiInstance.currentCampaignCurrentMapFilePathGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentCampaignCurrentMapApi#currentCampaignCurrentMapFilePathGet");
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

**String**

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

<a id="currentCampaignCurrentMapGet"></a>
# **currentCampaignCurrentMapGet**
> MapDataResponse currentCampaignCurrentMapGet()

Retrieve current map data

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentCampaignCurrentMapApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CurrentCampaignCurrentMapApi apiInstance = new CurrentCampaignCurrentMapApi(defaultClient);
    try {
      MapDataResponse result = apiInstance.currentCampaignCurrentMapGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentCampaignCurrentMapApi#currentCampaignCurrentMapGet");
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

<a id="currentCampaignCurrentMapPickupablesGet"></a>
# **currentCampaignCurrentMapPickupablesGet**
> PagedResponseOfProp currentCampaignCurrentMapPickupablesGet()

Retrieve pickupables on the current map

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentCampaignCurrentMapApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CurrentCampaignCurrentMapApi apiInstance = new CurrentCampaignCurrentMapApi(defaultClient);
    try {
      PagedResponseOfProp result = apiInstance.currentCampaignCurrentMapPickupablesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentCampaignCurrentMapApi#currentCampaignCurrentMapPickupablesGet");
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

<a id="currentCampaignCurrentMapPickupablesPost"></a>
# **currentCampaignCurrentMapPickupablesPost**
> List&lt;Prop&gt; currentCampaignCurrentMapPickupablesPost(prop)

Create Pickupables

Create new pickupable items for the current map.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentCampaignCurrentMapApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CurrentCampaignCurrentMapApi apiInstance = new CurrentCampaignCurrentMapApi(defaultClient);
    List<Prop> prop = Arrays.asList(); // List<Prop> | The collection of pickupable items to create.
    try {
      List<Prop> result = apiInstance.currentCampaignCurrentMapPickupablesPost(prop);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentCampaignCurrentMapApi#currentCampaignCurrentMapPickupablesPost");
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
| **prop** | [**List&lt;Prop&gt;**](Prop.md)| The collection of pickupable items to create. | |

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

<a id="currentCampaignCurrentMapSendAllPlayersPost"></a>
# **currentCampaignCurrentMapSendAllPlayersPost**
> currentCampaignCurrentMapSendAllPlayersPost(mapName)

Sends all players to a map

Sends all players to a map if it exists

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentCampaignCurrentMapApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CurrentCampaignCurrentMapApi apiInstance = new CurrentCampaignCurrentMapApi(defaultClient);
    String mapName = "mapName_example"; // String | The name of the map to retrieve
    try {
      apiInstance.currentCampaignCurrentMapSendAllPlayersPost(mapName);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentCampaignCurrentMapApi#currentCampaignCurrentMapSendAllPlayersPost");
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
| **mapName** | **String**| The name of the map to retrieve | |

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
| **202** | Accepted |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |

<a id="currentCampaignCurrentMapTerrainDataGet"></a>
# **currentCampaignCurrentMapTerrainDataGet**
> PagedResponseOfTerrainDataPoint currentCampaignCurrentMapTerrainDataGet()

Retrieve terrain data on the current map

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentCampaignCurrentMapApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CurrentCampaignCurrentMapApi apiInstance = new CurrentCampaignCurrentMapApi(defaultClient);
    try {
      PagedResponseOfTerrainDataPoint result = apiInstance.currentCampaignCurrentMapTerrainDataGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentCampaignCurrentMapApi#currentCampaignCurrentMapTerrainDataGet");
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

