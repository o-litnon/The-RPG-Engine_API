# TheRpgEngineApi.FXApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fXGet**](FXApi.md#fXGet) | **GET** /FX | Get Available Effects
[**fXPost**](FXApi.md#fXPost) | **POST** /FX | Create Click Effect



## fXGet

> PagedResponseOfString fXGet()

Get Available Effects

Get a list of available click effects.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.FXApi();
apiInstance.fXGet((error, data, response) => {
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

[**PagedResponseOfString**](PagedResponseOfString.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## fXPost

> fXPost(createFx)

Create Click Effect

Create a new click effect.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.FXApi();
let createFx = new TheRpgEngineApi.CreateFx(); // CreateFx | 
apiInstance.fXPost(createFx, (error, data, response) => {
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
 **createFx** | [**CreateFx**](CreateFx.md)|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

