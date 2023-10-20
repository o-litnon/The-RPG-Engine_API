# Org.OpenAPITools.Api.DiceApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**RollGet**](DiceApi.md#rollget) | **GET** /Roll | Get the documentation describing the full capabilities of running a dice command |
| [**RollPost**](DiceApi.md#rollpost) | **POST** /Roll | Roll a dice and get the result (Doesn&#39;t show in chat) |

<a id="rollget"></a>
# **RollGet**
> string RollGet ()

Get the documentation describing the full capabilities of running a dice command

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RollGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new DiceApi(config);

            try
            {
                // Get the documentation describing the full capabilities of running a dice command
                string result = apiInstance.RollGet();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiceApi.RollGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RollGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get the documentation describing the full capabilities of running a dice command
    ApiResponse<string> response = apiInstance.RollGetWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DiceApi.RollGetWithHttpInfo: " + e.Message);
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
 - **Accept**: application/text


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="rollpost"></a>
# **RollPost**
> RollResult RollPost (RollRequest rollRequest)

Roll a dice and get the result (Doesn't show in chat)

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RollPostExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new DiceApi(config);
            var rollRequest = new RollRequest(); // RollRequest | Dice roll request

            try
            {
                // Roll a dice and get the result (Doesn't show in chat)
                RollResult result = apiInstance.RollPost(rollRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiceApi.RollPost: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RollPostWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Roll a dice and get the result (Doesn't show in chat)
    ApiResponse<RollResult> response = apiInstance.RollPostWithHttpInfo(rollRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DiceApi.RollPostWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **rollRequest** | [**RollRequest**](RollRequest.md) | Dice roll request |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

