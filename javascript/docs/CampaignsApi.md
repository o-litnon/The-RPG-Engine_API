# TheRpgEngineApi.CampaignsApi

All URIs are relative to *http://localhost:8001/TheRpgEngine*

Method | HTTP request | Description
------------- | ------------- | -------------
[**campaignsCampaignDelete**](CampaignsApi.md#campaignsCampaignDelete) | **DELETE** /Campaigns/{campaign} | Delete a Campaign
[**campaignsCampaignMapsGet**](CampaignsApi.md#campaignsCampaignMapsGet) | **GET** /Campaigns/{campaign}/Maps | Get Maps of a Campaign
[**campaignsCampaignOpenPost**](CampaignsApi.md#campaignsCampaignOpenPost) | **POST** /Campaigns/{campaign}/Open | Load Campaign
[**campaignsCampaignPost**](CampaignsApi.md#campaignsCampaignPost) | **POST** /Campaigns/{campaign} | Create a Campaign
[**campaignsGet**](CampaignsApi.md#campaignsGet) | **GET** /Campaigns | Get Campaigns



## campaignsCampaignDelete

> campaignsCampaignDelete(campaign)

Delete a Campaign

Delete a campaign.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CampaignsApi();
let campaign = "campaign_example"; // String | The name of the campaign to delete.
apiInstance.campaignsCampaignDelete(campaign, (error, data, response) => {
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
 **campaign** | **String**| The name of the campaign to delete. | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## campaignsCampaignMapsGet

> PagedResponseOfString campaignsCampaignMapsGet(campaign)

Get Maps of a Campaign

Get a list of maps for a specific campaign.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CampaignsApi();
let campaign = "campaign_example"; // String | The name of the campaign to retrieve maps from.
apiInstance.campaignsCampaignMapsGet(campaign, (error, data, response) => {
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
 **campaign** | **String**| The name of the campaign to retrieve maps from. | 

### Return type

[**PagedResponseOfString**](PagedResponseOfString.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## campaignsCampaignOpenPost

> campaignsCampaignOpenPost(campaign)

Load Campaign

Load a campaign and open it.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CampaignsApi();
let campaign = "campaign_example"; // String | The name of the campaign to load.
apiInstance.campaignsCampaignOpenPost(campaign, (error, data, response) => {
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
 **campaign** | **String**| The name of the campaign to load. | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## campaignsCampaignPost

> campaignsCampaignPost(campaign)

Create a Campaign

Create a campaign.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CampaignsApi();
let campaign = "campaign_example"; // String | The name of the campaign to load.
apiInstance.campaignsCampaignPost(campaign, (error, data, response) => {
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
 **campaign** | **String**| The name of the campaign to load. | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## campaignsGet

> PagedResponseOfString campaignsGet()

Get Campaigns

Get a list of available campaigns.

### Example

```javascript
import TheRpgEngineApi from 'the_rpg_engine_api';

let apiInstance = new TheRpgEngineApi.CampaignsApi();
apiInstance.campaignsGet((error, data, response) => {
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

