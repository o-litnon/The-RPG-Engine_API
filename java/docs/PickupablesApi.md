# PickupablesApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pickupablesGet**](PickupablesApi.md#pickupablesGet) | **GET** /Pickupables | Retrieve all pickupables |
| [**pickupablesGuidAnimationsGet**](PickupablesApi.md#pickupablesGuidAnimationsGet) | **GET** /Pickupables/{guid}/Animations | Get animations for a specific pickupable by GUID. |
| [**pickupablesGuidAnimationsPut**](PickupablesApi.md#pickupablesGuidAnimationsPut) | **PUT** /Pickupables/{guid}/Animations | Update Pickupable Animations |
| [**pickupablesGuidChatPost**](PickupablesApi.md#pickupablesGuidChatPost) | **POST** /Pickupables/{guid}/Chat | Update Pickupable Chat |
| [**pickupablesGuidDelete**](PickupablesApi.md#pickupablesGuidDelete) | **DELETE** /Pickupables/{guid} | Delete Pickupable |
| [**pickupablesGuidFocusAllPost**](PickupablesApi.md#pickupablesGuidFocusAllPost) | **POST** /Pickupables/{guid}/FocusAll | Focus everyone on the pickupable |
| [**pickupablesGuidFocusPost**](PickupablesApi.md#pickupablesGuidFocusPost) | **POST** /Pickupables/{guid}/Focus | Focus on the pickupable |
| [**pickupablesGuidGet**](PickupablesApi.md#pickupablesGuidGet) | **GET** /Pickupables/{guid} | Retrieve a specific pickupable by its GUID |
| [**pickupablesGuidMoveToGlobalLocationPost**](PickupablesApi.md#pickupablesGuidMoveToGlobalLocationPost) | **POST** /Pickupables/{guid}/MoveToGlobalLocation | Move the pickupable to the target global location |
| [**pickupablesGuidTransformGet**](PickupablesApi.md#pickupablesGuidTransformGet) | **GET** /Pickupables/{guid}/Transform | Get Pickupable Transform |
| [**pickupablesGuidTransformPut**](PickupablesApi.md#pickupablesGuidTransformPut) | **PUT** /Pickupables/{guid}/Transform | Update Pickupable Transform |


<a id="pickupablesGet"></a>
# **pickupablesGet**
> PagedResponseOfProp pickupablesGet()

Retrieve all pickupables

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PickupablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    PickupablesApi apiInstance = new PickupablesApi(defaultClient);
    try {
      PagedResponseOfProp result = apiInstance.pickupablesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickupablesApi#pickupablesGet");
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
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="pickupablesGuidAnimationsGet"></a>
# **pickupablesGuidAnimationsGet**
> List&lt;PagedResponseOfAnimations&gt; pickupablesGuidAnimationsGet(guid)

Get animations for a specific pickupable by GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PickupablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    PickupablesApi apiInstance = new PickupablesApi(defaultClient);
    String guid = "guid_example"; // String | 
    try {
      List<PagedResponseOfAnimations> result = apiInstance.pickupablesGuidAnimationsGet(guid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickupablesApi#pickupablesGuidAnimationsGet");
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
| **guid** | **String**|  | |

### Return type

[**List&lt;PagedResponseOfAnimations&gt;**](PagedResponseOfAnimations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with animations. |  -  |
| **403** | Forbidden |  -  |
| **404** | Pickupable not found. |  -  |

<a id="pickupablesGuidAnimationsPut"></a>
# **pickupablesGuidAnimationsPut**
> pickupablesGuidAnimationsPut(guid, animation)

Update Pickupable Animations

Update animations for a specific Pickupable object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PickupablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    PickupablesApi apiInstance = new PickupablesApi(defaultClient);
    String guid = "guid_example"; // String | The unique identifier of the Pickupable.
    Animation animation = new Animation(); // Animation | Dice roll request
    try {
      apiInstance.pickupablesGuidAnimationsPut(guid, animation);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickupablesApi#pickupablesGuidAnimationsPut");
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
| **guid** | **String**| The unique identifier of the Pickupable. | |
| **animation** | [**Animation**](Animation.md)| Dice roll request | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Animation updated successfully. |  -  |
| **400** | Bad request. Invalid data or type. |  -  |
| **403** | Forbidden |  -  |
| **404** | Pickupable not found. |  -  |

<a id="pickupablesGuidChatPost"></a>
# **pickupablesGuidChatPost**
> pickupablesGuidChatPost(guid, body)

Update Pickupable Chat

Update chat for a pickupable item.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PickupablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    PickupablesApi apiInstance = new PickupablesApi(defaultClient);
    String guid = "guid_example"; // String | The GUID of the pickupable.
    String body = "body_example"; // String | 
    try {
      apiInstance.pickupablesGuidChatPost(guid, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickupablesApi#pickupablesGuidChatPost");
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
| **guid** | **String**| The GUID of the pickupable. | |
| **body** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/text
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="pickupablesGuidDelete"></a>
# **pickupablesGuidDelete**
> pickupablesGuidDelete(guid)

Delete Pickupable

Delete a pickupable item by its GUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PickupablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    PickupablesApi apiInstance = new PickupablesApi(defaultClient);
    String guid = "guid_example"; // String | The GUID of the pickupable to delete.
    try {
      apiInstance.pickupablesGuidDelete(guid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickupablesApi#pickupablesGuidDelete");
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
| **guid** | **String**| The GUID of the pickupable to delete. | |

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

<a id="pickupablesGuidFocusAllPost"></a>
# **pickupablesGuidFocusAllPost**
> pickupablesGuidFocusAllPost(guid)

Focus everyone on the pickupable

Focus everyone on the pickupable.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PickupablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    PickupablesApi apiInstance = new PickupablesApi(defaultClient);
    String guid = "guid_example"; // String | The GUID of the pickupable.
    try {
      apiInstance.pickupablesGuidFocusAllPost(guid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickupablesApi#pickupablesGuidFocusAllPost");
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
| **guid** | **String**| The GUID of the pickupable. | |

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

<a id="pickupablesGuidFocusPost"></a>
# **pickupablesGuidFocusPost**
> pickupablesGuidFocusPost(guid)

Focus on the pickupable

Focus on the pickupable.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PickupablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    PickupablesApi apiInstance = new PickupablesApi(defaultClient);
    String guid = "guid_example"; // String | The GUID of the pickupable.
    try {
      apiInstance.pickupablesGuidFocusPost(guid);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickupablesApi#pickupablesGuidFocusPost");
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
| **guid** | **String**| The GUID of the pickupable. | |

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

<a id="pickupablesGuidGet"></a>
# **pickupablesGuidGet**
> String pickupablesGuidGet(guid)

Retrieve a specific pickupable by its GUID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PickupablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    PickupablesApi apiInstance = new PickupablesApi(defaultClient);
    String guid = "guid_example"; // String | The GUID of the pickupable
    try {
      String result = apiInstance.pickupablesGuidGet(guid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickupablesApi#pickupablesGuidGet");
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
| **guid** | **String**| The GUID of the pickupable | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Pickupable not found. |  -  |

<a id="pickupablesGuidMoveToGlobalLocationPost"></a>
# **pickupablesGuidMoveToGlobalLocationPost**
> pickupablesGuidMoveToGlobalLocationPost(guid, vector3)

Move the pickupable to the target global location

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PickupablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    PickupablesApi apiInstance = new PickupablesApi(defaultClient);
    String guid = "guid_example"; // String | 
    Vector3 vector3 = new Vector3(); // Vector3 | Position to move to
    try {
      apiInstance.pickupablesGuidMoveToGlobalLocationPost(guid, vector3);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickupablesApi#pickupablesGuidMoveToGlobalLocationPost");
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
| **guid** | **String**|  | |
| **vector3** | [**Vector3**](Vector3.md)| Position to move to | |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a id="pickupablesGuidTransformGet"></a>
# **pickupablesGuidTransformGet**
> PropTransform pickupablesGuidTransformGet(guid)

Get Pickupable Transform

Retrieve the transform of a specific Pickupable object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PickupablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    PickupablesApi apiInstance = new PickupablesApi(defaultClient);
    String guid = "guid_example"; // String | The unique identifier of the Pickupable.
    try {
      PropTransform result = apiInstance.pickupablesGuidTransformGet(guid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickupablesApi#pickupablesGuidTransformGet");
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
| **guid** | **String**| The unique identifier of the Pickupable. | |

### Return type

[**PropTransform**](PropTransform.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Pickupable not found. |  -  |

<a id="pickupablesGuidTransformPut"></a>
# **pickupablesGuidTransformPut**
> pickupablesGuidTransformPut(guid, propTransform)

Update Pickupable Transform

Update the transform of a specific Pickupable object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PickupablesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8001/TheRpgEngine");

    PickupablesApi apiInstance = new PickupablesApi(defaultClient);
    String guid = "guid_example"; // String | The unique identifier of the Pickupable.
    PropTransform propTransform = new PropTransform(); // PropTransform | 
    try {
      apiInstance.pickupablesGuidTransformPut(guid, propTransform);
    } catch (ApiException e) {
      System.err.println("Exception when calling PickupablesApi#pickupablesGuidTransformPut");
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
| **guid** | **String**| The unique identifier of the Pickupable. | |
| **propTransform** | [**PropTransform**](PropTransform.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **403** | Forbidden |  -  |
| **404** | Pickupable not found. |  -  |

