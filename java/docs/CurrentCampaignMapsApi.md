# CurrentCampaignMapsApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**currentCampaignMapsGet**](CurrentCampaignMapsApi.md#currentCampaignMapsGet) | **GET** /CurrentCampaign/Maps | Get a list of map names |
| [**currentCampaignMapsMapNameFilePathGet**](CurrentCampaignMapsApi.md#currentCampaignMapsMapNameFilePathGet) | **GET** /CurrentCampaign/Maps/{mapName}/FilePath | Retrieve file path of the given map |
| [**currentCampaignMapsMapNameGet**](CurrentCampaignMapsApi.md#currentCampaignMapsMapNameGet) | **GET** /CurrentCampaign/Maps/{mapName} | Get map details by name |
| [**currentCampaignMapsMapNameLoadIntoMemoryPost**](CurrentCampaignMapsApi.md#currentCampaignMapsMapNameLoadIntoMemoryPost) | **POST** /CurrentCampaign/Maps/{mapName}/LoadIntoMemory | Load a map into memory |
| [**currentCampaignMapsMapNameOpenPost**](CurrentCampaignMapsApi.md#currentCampaignMapsMapNameOpenPost) | **POST** /CurrentCampaign/Maps/{mapName}/Open | Load a map |
| [**currentCampaignMapsMapNamePickupablesGet**](CurrentCampaignMapsApi.md#currentCampaignMapsMapNamePickupablesGet) | **GET** /CurrentCampaign/Maps/{mapName}/Pickupables | Get pickupables for a specific map. |
| [**currentCampaignMapsMapNamePickupablesPost**](CurrentCampaignMapsApi.md#currentCampaignMapsMapNamePickupablesPost) | **POST** /CurrentCampaign/Maps/{mapName}/Pickupables | Create Pickupables |
| [**currentCampaignMapsMapNameSendAllPlayersPost**](CurrentCampaignMapsApi.md#currentCampaignMapsMapNameSendAllPlayersPost) | **POST** /CurrentCampaign/Maps/{mapName}/SendAllPlayers | Sends all players to a map |
| [**currentCampaignMapsMapNameTerrainDataGet**](CurrentCampaignMapsApi.md#currentCampaignMapsMapNameTerrainDataGet) | **GET** /CurrentCampaign/Maps/{mapName}/TerrainData | Get terrain data for a specific map. |


<a id="currentCampaignMapsGet"></a>
# **currentCampaignMapsGet**
> PagedResponseOfString currentCampaignMapsGet()

Get a list of map names

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentCampaignMapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CurrentCampaignMapsApi apiInstance = new CurrentCampaignMapsApi(defaultClient);
    try {
      PagedResponseOfString result = apiInstance.currentCampaignMapsGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentCampaignMapsApi#currentCampaignMapsGet");
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
| **200** | A list of map names |  -  |
| **403** | Forbidden |  -  |

<a id="currentCampaignMapsMapNameFilePathGet"></a>
# **currentCampaignMapsMapNameFilePathGet**
> String currentCampaignMapsMapNameFilePathGet(mapName)

Retrieve file path of the given map

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentCampaignMapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CurrentCampaignMapsApi apiInstance = new CurrentCampaignMapsApi(defaultClient);
    String mapName = "mapName_example"; // String | The name of the map to get the file path of
    try {
      String result = apiInstance.currentCampaignMapsMapNameFilePathGet(mapName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentCampaignMapsApi#currentCampaignMapsMapNameFilePathGet");
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
| **mapName** | **String**| The name of the map to get the file path of | |

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
| **200** | The file path of the given map |  -  |
| **403** | Forbidden |  -  |
| **409** | Map not loaded |  -  |

<a id="currentCampaignMapsMapNameGet"></a>
# **currentCampaignMapsMapNameGet**
> MapDataResponse currentCampaignMapsMapNameGet(mapName)

Get map details by name

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentCampaignMapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CurrentCampaignMapsApi apiInstance = new CurrentCampaignMapsApi(defaultClient);
    String mapName = "mapName_example"; // String | The name of the map to retrieve
    try {
      MapDataResponse result = apiInstance.currentCampaignMapsMapNameGet(mapName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentCampaignMapsApi#currentCampaignMapsMapNameGet");
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

<a id="currentCampaignMapsMapNameLoadIntoMemoryPost"></a>
# **currentCampaignMapsMapNameLoadIntoMemoryPost**
> currentCampaignMapsMapNameLoadIntoMemoryPost(mapName)

Load a map into memory

Load a map if it exists

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentCampaignMapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CurrentCampaignMapsApi apiInstance = new CurrentCampaignMapsApi(defaultClient);
    String mapName = "mapName_example"; // String | The name of the map to load in to memory
    try {
      apiInstance.currentCampaignMapsMapNameLoadIntoMemoryPost(mapName);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentCampaignMapsApi#currentCampaignMapsMapNameLoadIntoMemoryPost");
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
| **mapName** | **String**| The name of the map to load in to memory | |

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

<a id="currentCampaignMapsMapNameOpenPost"></a>
# **currentCampaignMapsMapNameOpenPost**
> currentCampaignMapsMapNameOpenPost(mapName)

Load a map

Load a map if it exists

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentCampaignMapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CurrentCampaignMapsApi apiInstance = new CurrentCampaignMapsApi(defaultClient);
    String mapName = "mapName_example"; // String | The name of the map to retrieve
    try {
      apiInstance.currentCampaignMapsMapNameOpenPost(mapName);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentCampaignMapsApi#currentCampaignMapsMapNameOpenPost");
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

<a id="currentCampaignMapsMapNamePickupablesGet"></a>
# **currentCampaignMapsMapNamePickupablesGet**
> List&lt;PagedResponseOfProp&gt; currentCampaignMapsMapNamePickupablesGet(mapName)

Get pickupables for a specific map.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentCampaignMapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CurrentCampaignMapsApi apiInstance = new CurrentCampaignMapsApi(defaultClient);
    String mapName = "mapName_example"; // String | 
    try {
      List<PagedResponseOfProp> result = apiInstance.currentCampaignMapsMapNamePickupablesGet(mapName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentCampaignMapsApi#currentCampaignMapsMapNamePickupablesGet");
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
| **mapName** | **String**|  | |

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

<a id="currentCampaignMapsMapNamePickupablesPost"></a>
# **currentCampaignMapsMapNamePickupablesPost**
> List&lt;Prop&gt; currentCampaignMapsMapNamePickupablesPost(mapName, prop)

Create Pickupables

Create new pickupable items for a specific map.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentCampaignMapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CurrentCampaignMapsApi apiInstance = new CurrentCampaignMapsApi(defaultClient);
    String mapName = "mapName_example"; // String | The name of the map where the pickupables should be created.
    List<Prop> prop = Arrays.asList(); // List<Prop> | The collection of pickupable items to create.
    try {
      List<Prop> result = apiInstance.currentCampaignMapsMapNamePickupablesPost(mapName, prop);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentCampaignMapsApi#currentCampaignMapsMapNamePickupablesPost");
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
| **mapName** | **String**| The name of the map where the pickupables should be created. | |
| **prop** | [**List&lt;Prop&gt;**](Prop.md)| The collection of pickupable items to create. | |

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

<a id="currentCampaignMapsMapNameSendAllPlayersPost"></a>
# **currentCampaignMapsMapNameSendAllPlayersPost**
> currentCampaignMapsMapNameSendAllPlayersPost(mapName)

Sends all players to a map

Sends all players to a map if it exists

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentCampaignMapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CurrentCampaignMapsApi apiInstance = new CurrentCampaignMapsApi(defaultClient);
    String mapName = "mapName_example"; // String | The name of the map to retrieve
    try {
      apiInstance.currentCampaignMapsMapNameSendAllPlayersPost(mapName);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentCampaignMapsApi#currentCampaignMapsMapNameSendAllPlayersPost");
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

<a id="currentCampaignMapsMapNameTerrainDataGet"></a>
# **currentCampaignMapsMapNameTerrainDataGet**
> Object currentCampaignMapsMapNameTerrainDataGet(mapName)

Get terrain data for a specific map.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CurrentCampaignMapsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    CurrentCampaignMapsApi apiInstance = new CurrentCampaignMapsApi(defaultClient);
    String mapName = "mapName_example"; // String | 
    try {
      Object result = apiInstance.currentCampaignMapsMapNameTerrainDataGet(mapName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentCampaignMapsApi#currentCampaignMapsMapNameTerrainDataGet");
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
| **mapName** | **String**|  | |

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

