# TheRpgEngineApi.ChatApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

Method | HTTP request | Description
------------- | ------------- | -------------
[**chatPost**](ChatApi.md#chatPost) | **POST** /Chat | Post a message to the chat, including roll commands
[**chatPrivatePost**](ChatApi.md#chatPrivatePost) | **POST** /Chat/Private | Post a message to the GM, including roll commands



## chatPost

> RollResult chatPost(body)

Post a message to the chat, including roll commands

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.ChatApi();
let body = "body_example"; // String | 
apiInstance.chatPost(body, (error, data, response) => {
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
 **body** | **String**|  | 

### Return type

[**RollResult**](RollResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/text
- **Accept**: application/json


## chatPrivatePost

> RollResult chatPrivatePost(body)

Post a message to the GM, including roll commands

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.ChatApi();
let body = "body_example"; // String | 
apiInstance.chatPrivatePost(body, (error, data, response) => {
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
 **body** | **String**|  | 

### Return type

[**RollResult**](RollResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/text
- **Accept**: application/json

