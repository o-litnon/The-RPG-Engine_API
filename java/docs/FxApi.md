# FxApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fXGet**](FxApi.md#fXGet) | **GET** /FX | Get Available Effects |
| [**fXPost**](FxApi.md#fXPost) | **POST** /FX | Create Click Effect |


<a id="fXGet"></a>
# **fXGet**
> PagedResponseOfString fXGet()

Get Available Effects

Get a list of available click effects.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    FxApi apiInstance = new FxApi(defaultClient);
    try {
      PagedResponseOfString result = apiInstance.fXGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FxApi#fXGet");
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

<a id="fXPost"></a>
# **fXPost**
> fXPost(createFx)

Create Click Effect

Create a new click effect.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    FxApi apiInstance = new FxApi(defaultClient);
    CreateFx createFx = new CreateFx(); // CreateFx | 
    try {
      apiInstance.fXPost(createFx);
    } catch (ApiException e) {
      System.err.println("Exception when calling FxApi#fXPost");
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
| **createFx** | [**CreateFx**](CreateFx.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **409** | Conflict |  -  |

