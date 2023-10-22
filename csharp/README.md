# Org.OpenAPITools - the C# library for the The RPG Engine API

Requires The RPG Engine to be running locally.

This C# SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- SDK version: 1.0.0
- Build package: org.openapitools.codegen.languages.CSharpClientCodegen

<a id="frameworks-supported"></a>
## Frameworks supported

<a id="dependencies"></a>
## Dependencies

- [RestSharp](https://www.nuget.org/packages/RestSharp) - 106.13.0 or later
- [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) - 13.0.2 or later
- [JsonSubTypes](https://www.nuget.org/packages/JsonSubTypes/) - 1.8.0 or later
- [System.ComponentModel.Annotations](https://www.nuget.org/packages/System.ComponentModel.Annotations) - 5.0.0 or later

The DLLs included in the package may not be the latest version. We recommend using [NuGet](https://docs.nuget.org/consume/installing-nuget) to obtain the latest version of the packages:
```
Install-Package RestSharp
Install-Package Newtonsoft.Json
Install-Package JsonSubTypes
Install-Package System.ComponentModel.Annotations
```

NOTE: RestSharp versions greater than 105.1.0 have a bug which causes file uploads to fail. See [RestSharp#742](https://github.com/restsharp/RestSharp/issues/742).
NOTE: RestSharp for .Net Core creates a new socket for each api call, which can lead to a socket exhaustion problem. See [RestSharp#1406](https://github.com/restsharp/RestSharp/issues/1406).

<a id="installation"></a>
## Installation
Run the following command to generate the DLL
- [Mac/Linux] `/bin/sh build.sh`
- [Windows] `build.bat`

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;
```
<a id="packaging"></a>
## Packaging

A `.nuspec` is included with the project. You can follow the Nuget quickstart to [create](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#create-the-package) and [publish](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#publish-the-package) packages.

This `.nuspec` uses placeholders from the `.csproj`, so build the `.csproj` directly:

```
nuget pack -Build -OutputDirectory out Org.OpenAPITools.csproj
```

Then, publish to a [local feed](https://docs.microsoft.com/en-us/nuget/hosting-packages/local-feeds) or [other host](https://docs.microsoft.com/en-us/nuget/hosting-packages/overview) and consume the new package via Nuget as usual.

<a id="usage"></a>
## Usage

To use the API client with a HTTP proxy, setup a `System.Net.WebProxy`
```csharp
Configuration c = new Configuration();
System.Net.WebProxy webProxy = new System.Net.WebProxy("http://myProxyUrl:80/");
webProxy.Credentials = System.Net.CredentialCache.DefaultCredentials;
c.Proxy = webProxy;
```

<a id="getting-started"></a>
## Getting Started

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class Example
    {
        public static void Main()
        {

            Configuration config = new Configuration();
            config.BasePath = "http://localhost:8001/TheRpgEngine";
            var apiInstance = new AllApi(config);
            var path = Roll;  // string | 

            try
            {
                // Get the API capabilities
                string result = apiInstance.PathOptions(path);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AllApi.PathOptions: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }

        }
    }
}
```

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost:8001/TheRpgEngine*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AllApi* | [**PathOptions**](docs/AllApi.md#pathoptions) | **OPTIONS** /{path} | Get the API capabilities
*CampaignsApi* | [**CampaignsCampaignDelete**](docs/CampaignsApi.md#campaignscampaigndelete) | **DELETE** /Campaigns/{campaign} | Delete a Campaign
*CampaignsApi* | [**CampaignsCampaignMapsGet**](docs/CampaignsApi.md#campaignscampaignmapsget) | **GET** /Campaigns/{campaign}/Maps | Get Maps of a Campaign
*CampaignsApi* | [**CampaignsCampaignOpenPost**](docs/CampaignsApi.md#campaignscampaignopenpost) | **POST** /Campaigns/{campaign}/Open | Load Campaign
*CampaignsApi* | [**CampaignsCampaignPost**](docs/CampaignsApi.md#campaignscampaignpost) | **POST** /Campaigns/{campaign} | Create a Campaign
*CampaignsApi* | [**CampaignsGet**](docs/CampaignsApi.md#campaignsget) | **GET** /Campaigns | Get Campaigns
*ChatApi* | [**ChatPost**](docs/ChatApi.md#chatpost) | **POST** /Chat | Post a message to the chat, including roll commands
*ChatApi* | [**ChatPrivatePost**](docs/ChatApi.md#chatprivatepost) | **POST** /Chat/Private | Post a message to the GM, including roll commands
*CurrentCampaignCurrentMapApi* | [**CurrentCampaignCurrentMapFilePathGet**](docs/CurrentCampaignCurrentMapApi.md#currentcampaigncurrentmapfilepathget) | **GET** /CurrentCampaign/CurrentMap/FilePath | Retrieve file path of the current map
*CurrentCampaignCurrentMapApi* | [**CurrentCampaignCurrentMapGet**](docs/CurrentCampaignCurrentMapApi.md#currentcampaigncurrentmapget) | **GET** /CurrentCampaign/CurrentMap | Retrieve current map data
*CurrentCampaignCurrentMapApi* | [**CurrentCampaignCurrentMapPickupablesGet**](docs/CurrentCampaignCurrentMapApi.md#currentcampaigncurrentmappickupablesget) | **GET** /CurrentCampaign/CurrentMap/Pickupables | Retrieve pickupables on the current map
*CurrentCampaignCurrentMapApi* | [**CurrentCampaignCurrentMapPickupablesPost**](docs/CurrentCampaignCurrentMapApi.md#currentcampaigncurrentmappickupablespost) | **POST** /CurrentCampaign/CurrentMap/Pickupables | Create Pickupables
*CurrentCampaignCurrentMapApi* | [**CurrentCampaignCurrentMapSendAllPlayersPost**](docs/CurrentCampaignCurrentMapApi.md#currentcampaigncurrentmapsendallplayerspost) | **POST** /CurrentCampaign/CurrentMap/SendAllPlayers | Sends all players to a map
*CurrentCampaignCurrentMapApi* | [**CurrentCampaignCurrentMapTerrainDataGet**](docs/CurrentCampaignCurrentMapApi.md#currentcampaigncurrentmapterraindataget) | **GET** /CurrentCampaign/CurrentMap/TerrainData | Retrieve terrain data on the current map
*CurrentCampaignMapsApi* | [**CurrentCampaignMapsGet**](docs/CurrentCampaignMapsApi.md#currentcampaignmapsget) | **GET** /CurrentCampaign/Maps | Get a list of map names
*CurrentCampaignMapsApi* | [**CurrentCampaignMapsMapNameFilePathGet**](docs/CurrentCampaignMapsApi.md#currentcampaignmapsmapnamefilepathget) | **GET** /CurrentCampaign/Maps/{mapName}/FilePath | Retrieve file path of the given map
*CurrentCampaignMapsApi* | [**CurrentCampaignMapsMapNameGet**](docs/CurrentCampaignMapsApi.md#currentcampaignmapsmapnameget) | **GET** /CurrentCampaign/Maps/{mapName} | Get map details by name
*CurrentCampaignMapsApi* | [**CurrentCampaignMapsMapNameLoadIntoMemoryPost**](docs/CurrentCampaignMapsApi.md#currentcampaignmapsmapnameloadintomemorypost) | **POST** /CurrentCampaign/Maps/{mapName}/LoadIntoMemory | Load a map into memory
*CurrentCampaignMapsApi* | [**CurrentCampaignMapsMapNameOpenPost**](docs/CurrentCampaignMapsApi.md#currentcampaignmapsmapnameopenpost) | **POST** /CurrentCampaign/Maps/{mapName}/Open | Load a map
*CurrentCampaignMapsApi* | [**CurrentCampaignMapsMapNamePickupablesGet**](docs/CurrentCampaignMapsApi.md#currentcampaignmapsmapnamepickupablesget) | **GET** /CurrentCampaign/Maps/{mapName}/Pickupables | Get pickupables for a specific map.
*CurrentCampaignMapsApi* | [**CurrentCampaignMapsMapNamePickupablesPost**](docs/CurrentCampaignMapsApi.md#currentcampaignmapsmapnamepickupablespost) | **POST** /CurrentCampaign/Maps/{mapName}/Pickupables | Create Pickupables
*CurrentCampaignMapsApi* | [**CurrentCampaignMapsMapNameSendAllPlayersPost**](docs/CurrentCampaignMapsApi.md#currentcampaignmapsmapnamesendallplayerspost) | **POST** /CurrentCampaign/Maps/{mapName}/SendAllPlayers | Sends all players to a map
*CurrentCampaignMapsApi* | [**CurrentCampaignMapsMapNameTerrainDataGet**](docs/CurrentCampaignMapsApi.md#currentcampaignmapsmapnameterraindataget) | **GET** /CurrentCampaign/Maps/{mapName}/TerrainData | Get terrain data for a specific map.
*DiceApi* | [**RollGet**](docs/DiceApi.md#rollget) | **GET** /Roll | Get the documentation describing the full capabilities of running a dice command
*DiceApi* | [**RollPost**](docs/DiceApi.md#rollpost) | **POST** /Roll | Roll a dice and get the result (Doesn't show in chat)
*FXApi* | [**FXGet**](docs/FXApi.md#fxget) | **GET** /FX | Get Available Effects
*FXApi* | [**FXPost**](docs/FXApi.md#fxpost) | **POST** /FX | Create Click Effect
*PickupablesApi* | [**PickupablesGet**](docs/PickupablesApi.md#pickupablesget) | **GET** /Pickupables | Retrieve all pickupables
*PickupablesApi* | [**PickupablesGuidAnimationsGet**](docs/PickupablesApi.md#pickupablesguidanimationsget) | **GET** /Pickupables/{guid}/Animations | Get animations for a specific pickupable by GUID.
*PickupablesApi* | [**PickupablesGuidAnimationsPut**](docs/PickupablesApi.md#pickupablesguidanimationsput) | **PUT** /Pickupables/{guid}/Animations | Update Pickupable Animations
*PickupablesApi* | [**PickupablesGuidChatPost**](docs/PickupablesApi.md#pickupablesguidchatpost) | **POST** /Pickupables/{guid}/Chat | Update Pickupable Chat
*PickupablesApi* | [**PickupablesGuidDelete**](docs/PickupablesApi.md#pickupablesguiddelete) | **DELETE** /Pickupables/{guid} | Delete Pickupable
*PickupablesApi* | [**PickupablesGuidFocusAllPost**](docs/PickupablesApi.md#pickupablesguidfocusallpost) | **POST** /Pickupables/{guid}/FocusAll | Focus everyone on the pickupable
*PickupablesApi* | [**PickupablesGuidFocusPost**](docs/PickupablesApi.md#pickupablesguidfocuspost) | **POST** /Pickupables/{guid}/Focus | Focus on the pickupable
*PickupablesApi* | [**PickupablesGuidGet**](docs/PickupablesApi.md#pickupablesguidget) | **GET** /Pickupables/{guid} | Retrieve a specific pickupable by its GUID
*PickupablesApi* | [**PickupablesGuidMoveToGlobalLocationPost**](docs/PickupablesApi.md#pickupablesguidmovetogloballocationpost) | **POST** /Pickupables/{guid}/MoveToGlobalLocation | Move the pickupable to the target global location
*PickupablesApi* | [**PickupablesGuidTransformGet**](docs/PickupablesApi.md#pickupablesguidtransformget) | **GET** /Pickupables/{guid}/Transform | Get Pickupable Transform
*PickupablesApi* | [**PickupablesGuidTransformPut**](docs/PickupablesApi.md#pickupablesguidtransformput) | **PUT** /Pickupables/{guid}/Transform | Update Pickupable Transform


<a id="documentation-for-models"></a>
## Documentation for Models

 - [Model.Animation](docs/Animation.md)
 - [Model.Atmosphere](docs/Atmosphere.md)
 - [Model.Color](docs/Color.md)
 - [Model.Controllable](docs/Controllable.md)
 - [Model.ControllableIndividualValueInner](docs/ControllableIndividualValueInner.md)
 - [Model.CreateFx](docs/CreateFx.md)
 - [Model.CutoutSettingsData](docs/CutoutSettingsData.md)
 - [Model.GenericPropData](docs/GenericPropData.md)
 - [Model.MapDataResponse](docs/MapDataResponse.md)
 - [Model.PagedResponseOfAnimations](docs/PagedResponseOfAnimations.md)
 - [Model.PagedResponseOfProp](docs/PagedResponseOfProp.md)
 - [Model.PagedResponseOfString](docs/PagedResponseOfString.md)
 - [Model.PagedResponseOfTerrainDataPoint](docs/PagedResponseOfTerrainDataPoint.md)
 - [Model.PostProcessing](docs/PostProcessing.md)
 - [Model.Prop](docs/Prop.md)
 - [Model.PropCanvasData](docs/PropCanvasData.md)
 - [Model.PropCanvasSlider](docs/PropCanvasSlider.md)
 - [Model.PropCharacterData](docs/PropCharacterData.md)
 - [Model.PropImportData](docs/PropImportData.md)
 - [Model.PropMotion](docs/PropMotion.md)
 - [Model.PropNavPaths](docs/PropNavPaths.md)
 - [Model.PropTransform](docs/PropTransform.md)
 - [Model.PropUserAnimation](docs/PropUserAnimation.md)
 - [Model.Quaternion](docs/Quaternion.md)
 - [Model.RollRequest](docs/RollRequest.md)
 - [Model.RollResult](docs/RollResult.md)
 - [Model.Settings](docs/Settings.md)
 - [Model.TerrainData](docs/TerrainData.md)
 - [Model.TerrainDataPoint](docs/TerrainDataPoint.md)
 - [Model.Vector2](docs/Vector2.md)
 - [Model.Vector3](docs/Vector3.md)
 - [Model.Vector3Int](docs/Vector3Int.md)
 - [Model.Vector4](docs/Vector4.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.
