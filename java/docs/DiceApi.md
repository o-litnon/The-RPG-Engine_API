# DiceApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**rollGet**](DiceApi.md#rollGet) | **GET** /Roll | Get the documentation describing the full capabilities of running a dice command |
| [**rollPost**](DiceApi.md#rollPost) | **POST** /Roll | Roll a dice and get the result (Doesn&#39;t show in chat) |


<a id="rollGet"></a>
# **rollGet**
> String rollGet()

Get the documentation describing the full capabilities of running a dice command

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    DiceApi apiInstance = new DiceApi(defaultClient);
    try {
      String result = apiInstance.rollGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiceApi#rollGet");
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
 - **Accept**: application/text

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="rollPost"></a>
# **rollPost**
> RollResult rollPost(rollRequest)

Roll a dice and get the result (Doesn&#39;t show in chat)

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    DiceApi apiInstance = new DiceApi(defaultClient);
    RollRequest rollRequest = new RollRequest(); // RollRequest | Dice roll request
    try {
      RollResult result = apiInstance.rollPost(rollRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiceApi#rollPost");
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
| **rollRequest** | [**RollRequest**](RollRequest.md)| Dice roll request | |

### Return type

[**RollResult**](RollResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

