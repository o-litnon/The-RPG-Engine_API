# TheRpgEngineApi.DiceApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

Method | HTTP request | Description
------------- | ------------- | -------------
[**rollGet**](DiceApi.md#rollGet) | **GET** /Roll | Get the documentation describing the full capabilities of running a dice command
[**rollPost**](DiceApi.md#rollPost) | **POST** /Roll | Roll a dice and get the result (Doesn&#39;t show in chat)



## rollGet

> String rollGet()

Get the documentation describing the full capabilities of running a dice command

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.DiceApi();
apiInstance.rollGet((error, data, response) => {
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

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/text


## rollPost

> RollResult rollPost(rollRequest)

Roll a dice and get the result (Doesn&#39;t show in chat)

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.DiceApi();
let rollRequest = new TheRpgEngineApi.RollRequest(); // RollRequest | Dice roll request
apiInstance.rollPost(rollRequest, (error, data, response) => {
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
 **rollRequest** | [**RollRequest**](RollRequest.md)| Dice roll request | 

### Return type

[**RollResult**](RollResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

