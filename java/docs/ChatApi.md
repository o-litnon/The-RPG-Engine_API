# ChatApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**chatPost**](ChatApi.md#chatPost) | **POST** /Chat | Post a message to the chat, including roll commands |
| [**chatPrivatePost**](ChatApi.md#chatPrivatePost) | **POST** /Chat/Private | Post a message to the GM, including roll commands |


<a id="chatPost"></a>
# **chatPost**
> RollResult chatPost(body)

Post a message to the chat, including roll commands

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    ChatApi apiInstance = new ChatApi(defaultClient);
    String body = "body_example"; // String | 
    try {
      RollResult result = apiInstance.chatPost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#chatPost");
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
| **body** | **String**|  | |

### Return type

[**RollResult**](RollResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/text
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contains optional Roll Result if a Dice command was given |  -  |

<a id="chatPrivatePost"></a>
# **chatPrivatePost**
> RollResult chatPrivatePost(body)

Post a message to the GM, including roll commands

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChatApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    ChatApi apiInstance = new ChatApi(defaultClient);
    String body = "body_example"; // String | 
    try {
      RollResult result = apiInstance.chatPrivatePost(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#chatPrivatePost");
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
| **body** | **String**|  | |

### Return type

[**RollResult**](RollResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/text
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contains optional Roll Result if a Dice command was given |  -  |

