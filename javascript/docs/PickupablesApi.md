# TheRpgEngineApi.PickupablesApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pickupablesGet**](PickupablesApi.md#pickupablesGet) | **GET** /Pickupables | Retrieve all pickupables
[**pickupablesGuidAnimationsGet**](PickupablesApi.md#pickupablesGuidAnimationsGet) | **GET** /Pickupables/{guid}/Animations | Get animations for a specific pickupable by GUID.
[**pickupablesGuidAnimationsPut**](PickupablesApi.md#pickupablesGuidAnimationsPut) | **PUT** /Pickupables/{guid}/Animations | Update Pickupable Animations
[**pickupablesGuidChatPost**](PickupablesApi.md#pickupablesGuidChatPost) | **POST** /Pickupables/{guid}/Chat | Update Pickupable Chat
[**pickupablesGuidDelete**](PickupablesApi.md#pickupablesGuidDelete) | **DELETE** /Pickupables/{guid} | Delete Pickupable
[**pickupablesGuidFocusAllPost**](PickupablesApi.md#pickupablesGuidFocusAllPost) | **POST** /Pickupables/{guid}/FocusAll | Focus everyone on the pickupable
[**pickupablesGuidFocusPost**](PickupablesApi.md#pickupablesGuidFocusPost) | **POST** /Pickupables/{guid}/Focus | Focus on the pickupable
[**pickupablesGuidGet**](PickupablesApi.md#pickupablesGuidGet) | **GET** /Pickupables/{guid} | Retrieve a specific pickupable by its GUID
[**pickupablesGuidMoveToGlobalLocationPost**](PickupablesApi.md#pickupablesGuidMoveToGlobalLocationPost) | **POST** /Pickupables/{guid}/MoveToGlobalLocation | Move the pickupable to the target global location
[**pickupablesGuidTransformGet**](PickupablesApi.md#pickupablesGuidTransformGet) | **GET** /Pickupables/{guid}/Transform | Get Pickupable Transform
[**pickupablesGuidTransformPut**](PickupablesApi.md#pickupablesGuidTransformPut) | **PUT** /Pickupables/{guid}/Transform | Update Pickupable Transform



## pickupablesGet

> PagedResponseOfProp pickupablesGet()

Retrieve all pickupables

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.PickupablesApi();
apiInstance.pickupablesGet((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## pickupablesGuidAnimationsGet

> [PagedResponseOfAnimations] pickupablesGuidAnimationsGet(guid)

Get animations for a specific pickupable by GUID.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.PickupablesApi();
let guid = "guid_example"; // String | 
apiInstance.pickupablesGuidAnimationsGet(guid, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**|  | 

### Return type

[**[PagedResponseOfAnimations]**](PagedResponseOfAnimations.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


## pickupablesGuidAnimationsPut

> pickupablesGuidAnimationsPut(guid, animation)

Update Pickupable Animations

Update animations for a specific Pickupable object.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.PickupablesApi();
let guid = "guid_example"; // String | The unique identifier of the Pickupable.
let animation = new TheRpgEngineApi.Animation(); // Animation | Dice roll request
apiInstance.pickupablesGuidAnimationsPut(guid, animation, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| The unique identifier of the Pickupable. | 
 **animation** | [**Animation**](Animation.md)| Dice roll request | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain


## pickupablesGuidChatPost

> pickupablesGuidChatPost(guid, body)

Update Pickupable Chat

Update chat for a pickupable item.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.PickupablesApi();
let guid = "guid_example"; // String | The GUID of the pickupable.
let body = "body_example"; // String | 
apiInstance.pickupablesGuidChatPost(guid, body, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| The GUID of the pickupable. | 
 **body** | **String**|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/text
- **Accept**: Not defined


## pickupablesGuidDelete

> pickupablesGuidDelete(guid)

Delete Pickupable

Delete a pickupable item by its GUID.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.PickupablesApi();
let guid = "guid_example"; // String | The GUID of the pickupable to delete.
apiInstance.pickupablesGuidDelete(guid, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| The GUID of the pickupable to delete. | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## pickupablesGuidFocusAllPost

> pickupablesGuidFocusAllPost(guid)

Focus everyone on the pickupable

Focus everyone on the pickupable.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.PickupablesApi();
let guid = "guid_example"; // String | The GUID of the pickupable.
apiInstance.pickupablesGuidFocusAllPost(guid, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| The GUID of the pickupable. | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## pickupablesGuidFocusPost

> pickupablesGuidFocusPost(guid)

Focus on the pickupable

Focus on the pickupable.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.PickupablesApi();
let guid = "guid_example"; // String | The GUID of the pickupable.
apiInstance.pickupablesGuidFocusPost(guid, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| The GUID of the pickupable. | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## pickupablesGuidGet

> String pickupablesGuidGet(guid)

Retrieve a specific pickupable by its GUID

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.PickupablesApi();
let guid = "guid_example"; // String | The GUID of the pickupable
apiInstance.pickupablesGuidGet(guid, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| The GUID of the pickupable | 

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


## pickupablesGuidMoveToGlobalLocationPost

> pickupablesGuidMoveToGlobalLocationPost(guid, vector3)

Move the pickupable to the target global location

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.PickupablesApi();
let guid = "guid_example"; // String | 
let vector3 = new TheRpgEngineApi.Vector3(); // Vector3 | Position to move to
apiInstance.pickupablesGuidMoveToGlobalLocationPost(guid, vector3, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**|  | 
 **vector3** | [**Vector3**](Vector3.md)| Position to move to | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


## pickupablesGuidTransformGet

> PropTransform pickupablesGuidTransformGet(guid)

Get Pickupable Transform

Retrieve the transform of a specific Pickupable object.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.PickupablesApi();
let guid = "guid_example"; // String | The unique identifier of the Pickupable.
apiInstance.pickupablesGuidTransformGet(guid, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| The unique identifier of the Pickupable. | 

### Return type

[**PropTransform**](PropTransform.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


## pickupablesGuidTransformPut

> pickupablesGuidTransformPut(guid, propTransform)

Update Pickupable Transform

Update the transform of a specific Pickupable object.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.PickupablesApi();
let guid = "guid_example"; // String | The unique identifier of the Pickupable.
let propTransform = new TheRpgEngineApi.PropTransform(); // PropTransform | 
apiInstance.pickupablesGuidTransformPut(guid, propTransform, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guid** | **String**| The unique identifier of the Pickupable. | 
 **propTransform** | [**PropTransform**](PropTransform.md)|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain

