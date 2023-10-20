# TheRpgEngineApi.CurrentCampaignCurrentMapApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

Method | HTTP request | Description
------------- | ------------- | -------------
[**currentCampaignCurrentMapFilePathGet**](CurrentCampaignCurrentMapApi.md#currentCampaignCurrentMapFilePathGet) | **GET** /CurrentCampaign/CurrentMap/FilePath | Retrieve file path of the current map
[**currentCampaignCurrentMapGet**](CurrentCampaignCurrentMapApi.md#currentCampaignCurrentMapGet) | **GET** /CurrentCampaign/CurrentMap | Retrieve current map data
[**currentCampaignCurrentMapPickupablesGet**](CurrentCampaignCurrentMapApi.md#currentCampaignCurrentMapPickupablesGet) | **GET** /CurrentCampaign/CurrentMap/Pickupables | Retrieve pickupables on the current map
[**currentCampaignCurrentMapPickupablesPost**](CurrentCampaignCurrentMapApi.md#currentCampaignCurrentMapPickupablesPost) | **POST** /CurrentCampaign/CurrentMap/Pickupables | Create Pickupables
[**currentCampaignCurrentMapSendAllPlayersPost**](CurrentCampaignCurrentMapApi.md#currentCampaignCurrentMapSendAllPlayersPost) | **POST** /CurrentCampaign/CurrentMap/SendAllPlayers | Sends all players to a map
[**currentCampaignCurrentMapTerrainDataGet**](CurrentCampaignCurrentMapApi.md#currentCampaignCurrentMapTerrainDataGet) | **GET** /CurrentCampaign/CurrentMap/TerrainData | Retrieve terrain data on the current map



## currentCampaignCurrentMapFilePathGet

> String currentCampaignCurrentMapFilePathGet()

Retrieve file path of the current map

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CurrentCampaignCurrentMapApi();
apiInstance.currentCampaignCurrentMapFilePathGet((error, data, response) => {
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
- **Accept**: text/plain


## currentCampaignCurrentMapGet

> MapDataResponse currentCampaignCurrentMapGet()

Retrieve current map data

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CurrentCampaignCurrentMapApi();
apiInstance.currentCampaignCurrentMapGet((error, data, response) => {
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

[**MapDataResponse**](MapDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


## currentCampaignCurrentMapPickupablesGet

> PagedResponseOfProp currentCampaignCurrentMapPickupablesGet()

Retrieve pickupables on the current map

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CurrentCampaignCurrentMapApi();
apiInstance.currentCampaignCurrentMapPickupablesGet((error, data, response) => {
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
- **Accept**: application/json, text/plain


## currentCampaignCurrentMapPickupablesPost

> [Prop] currentCampaignCurrentMapPickupablesPost(prop)

Create Pickupables

Create new pickupable items for the current map.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CurrentCampaignCurrentMapApi();
let prop = [new TheRpgEngineApi.Prop()]; // [Prop] | The collection of pickupable items to create.
apiInstance.currentCampaignCurrentMapPickupablesPost(prop, (error, data, response) => {
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
 **prop** | [**[Prop]**](Prop.md)| The collection of pickupable items to create. | 

### Return type

[**[Prop]**](Prop.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, text/plain


## currentCampaignCurrentMapSendAllPlayersPost

> currentCampaignCurrentMapSendAllPlayersPost(mapName)

Sends all players to a map

Sends all players to a map if it exists

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CurrentCampaignCurrentMapApi();
let mapName = "mapName_example"; // String | The name of the map to retrieve
apiInstance.currentCampaignCurrentMapSendAllPlayersPost(mapName, (error, data, response) => {
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


## currentCampaignCurrentMapTerrainDataGet

> PagedResponseOfTerrainDataPoint currentCampaignCurrentMapTerrainDataGet()

Retrieve terrain data on the current map

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CurrentCampaignCurrentMapApi();
apiInstance.currentCampaignCurrentMapTerrainDataGet((error, data, response) => {
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

[**PagedResponseOfTerrainDataPoint**](PagedResponseOfTerrainDataPoint.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain

