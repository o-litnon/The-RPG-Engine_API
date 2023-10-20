# TheRpgEngineApi.CurrentCampaignMapsApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

Method | HTTP request | Description
------------- | ------------- | -------------
[**currentCampaignMapsGet**](CurrentCampaignMapsApi.md#currentCampaignMapsGet) | **GET** /CurrentCampaign/Maps | Get a list of map names
[**currentCampaignMapsMapNameFilePathGet**](CurrentCampaignMapsApi.md#currentCampaignMapsMapNameFilePathGet) | **GET** /CurrentCampaign/Maps/{mapName}/FilePath | Retrieve file path of the given map
[**currentCampaignMapsMapNameGet**](CurrentCampaignMapsApi.md#currentCampaignMapsMapNameGet) | **GET** /CurrentCampaign/Maps/{mapName} | Get map details by name
[**currentCampaignMapsMapNameLoadIntoMemoryPost**](CurrentCampaignMapsApi.md#currentCampaignMapsMapNameLoadIntoMemoryPost) | **POST** /CurrentCampaign/Maps/{mapName}/LoadIntoMemory | Load a map into memory
[**currentCampaignMapsMapNameOpenPost**](CurrentCampaignMapsApi.md#currentCampaignMapsMapNameOpenPost) | **POST** /CurrentCampaign/Maps/{mapName}/Open | Load a map
[**currentCampaignMapsMapNamePickupablesGet**](CurrentCampaignMapsApi.md#currentCampaignMapsMapNamePickupablesGet) | **GET** /CurrentCampaign/Maps/{mapName}/Pickupables | Get pickupables for a specific map.
[**currentCampaignMapsMapNamePickupablesPost**](CurrentCampaignMapsApi.md#currentCampaignMapsMapNamePickupablesPost) | **POST** /CurrentCampaign/Maps/{mapName}/Pickupables | Create Pickupables
[**currentCampaignMapsMapNameSendAllPlayersPost**](CurrentCampaignMapsApi.md#currentCampaignMapsMapNameSendAllPlayersPost) | **POST** /CurrentCampaign/Maps/{mapName}/SendAllPlayers | Sends all players to a map
[**currentCampaignMapsMapNameTerrainDataGet**](CurrentCampaignMapsApi.md#currentCampaignMapsMapNameTerrainDataGet) | **GET** /CurrentCampaign/Maps/{mapName}/TerrainData | Get terrain data for a specific map.



## currentCampaignMapsGet

> PagedResponseOfString currentCampaignMapsGet()

Get a list of map names

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CurrentCampaignMapsApi();
apiInstance.currentCampaignMapsGet((error, data, response) => {
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


## currentCampaignMapsMapNameFilePathGet

> String currentCampaignMapsMapNameFilePathGet(mapName)

Retrieve file path of the given map

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CurrentCampaignMapsApi();
let mapName = "mapName_example"; // String | The name of the map to get the file path of
apiInstance.currentCampaignMapsMapNameFilePathGet(mapName, (error, data, response) => {
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
 **mapName** | **String**| The name of the map to get the file path of | 

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


## currentCampaignMapsMapNameGet

> MapDataResponse currentCampaignMapsMapNameGet(mapName)

Get map details by name

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CurrentCampaignMapsApi();
let mapName = "mapName_example"; // String | The name of the map to retrieve
apiInstance.currentCampaignMapsMapNameGet(mapName, (error, data, response) => {
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
 **mapName** | **String**| The name of the map to retrieve | 

### Return type

[**MapDataResponse**](MapDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


## currentCampaignMapsMapNameLoadIntoMemoryPost

> currentCampaignMapsMapNameLoadIntoMemoryPost(mapName)

Load a map into memory

Load a map if it exists

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CurrentCampaignMapsApi();
let mapName = "mapName_example"; // String | The name of the map to load in to memory
apiInstance.currentCampaignMapsMapNameLoadIntoMemoryPost(mapName, (error, data, response) => {
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
 **mapName** | **String**| The name of the map to load in to memory | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## currentCampaignMapsMapNameOpenPost

> currentCampaignMapsMapNameOpenPost(mapName)

Load a map

Load a map if it exists

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CurrentCampaignMapsApi();
let mapName = "mapName_example"; // String | The name of the map to retrieve
apiInstance.currentCampaignMapsMapNameOpenPost(mapName, (error, data, response) => {
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
 **mapName** | **String**| The name of the map to retrieve | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## currentCampaignMapsMapNamePickupablesGet

> [PagedResponseOfProp] currentCampaignMapsMapNamePickupablesGet(mapName)

Get pickupables for a specific map.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CurrentCampaignMapsApi();
let mapName = "mapName_example"; // String | 
apiInstance.currentCampaignMapsMapNamePickupablesGet(mapName, (error, data, response) => {
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
 **mapName** | **String**|  | 

### Return type

[**[PagedResponseOfProp]**](PagedResponseOfProp.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


## currentCampaignMapsMapNamePickupablesPost

> [Prop] currentCampaignMapsMapNamePickupablesPost(mapName, prop)

Create Pickupables

Create new pickupable items for a specific map.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CurrentCampaignMapsApi();
let mapName = "mapName_example"; // String | The name of the map where the pickupables should be created.
let prop = [new TheRpgEngineApi.Prop()]; // [Prop] | The collection of pickupable items to create.
apiInstance.currentCampaignMapsMapNamePickupablesPost(mapName, prop, (error, data, response) => {
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
 **mapName** | **String**| The name of the map where the pickupables should be created. | 
 **prop** | [**[Prop]**](Prop.md)| The collection of pickupable items to create. | 

### Return type

[**[Prop]**](Prop.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## currentCampaignMapsMapNameSendAllPlayersPost

> currentCampaignMapsMapNameSendAllPlayersPost(mapName)

Sends all players to a map

Sends all players to a map if it exists

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CurrentCampaignMapsApi();
let mapName = "mapName_example"; // String | The name of the map to retrieve
apiInstance.currentCampaignMapsMapNameSendAllPlayersPost(mapName, (error, data, response) => {
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
 **mapName** | **String**| The name of the map to retrieve | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## currentCampaignMapsMapNameTerrainDataGet

> Object currentCampaignMapsMapNameTerrainDataGet(mapName)

Get terrain data for a specific map.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CurrentCampaignMapsApi();
let mapName = "mapName_example"; // String | 
apiInstance.currentCampaignMapsMapNameTerrainDataGet(mapName, (error, data, response) => {
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
 **mapName** | **String**|  | 

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

