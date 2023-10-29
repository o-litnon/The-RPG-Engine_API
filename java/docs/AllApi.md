# AllApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pathOptions**](AllApi.md#pathOptions) | **OPTIONS** /{path} | Get the API capabilities |


<a id="pathOptions"></a>
# **pathOptions**
> String pathOptions(path)

Get the API capabilities

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AllApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    AllApi apiInstance = new AllApi(defaultClient);
    String path = "Roll"; // String | 
    try {
      String result = apiInstance.pathOptions(path);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AllApi#pathOptions");
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
| **path** | **String**|  | |

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
| **200** | OK |  -  |

