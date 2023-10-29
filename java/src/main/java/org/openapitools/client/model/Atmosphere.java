/*
 * The RPG Engine API
 * Requires The RPG Engine to be running locally.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.client.model.Color;
import org.openapitools.client.model.Vector2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Atmosphere
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-29T20:42:08.286157Z[Etc/UTC]")
public class Atmosphere {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_LIGHT_ROTATION = "lightRotation";
  @SerializedName(SERIALIZED_NAME_LIGHT_ROTATION)
  private Vector2 lightRotation;

  public static final String SERIALIZED_NAME_LIGHT_COLOUR = "lightColour";
  @SerializedName(SERIALIZED_NAME_LIGHT_COLOUR)
  private Color lightColour;

  public static final String SERIALIZED_NAME_AMBIENT_COLOR = "ambientColor";
  @SerializedName(SERIALIZED_NAME_AMBIENT_COLOR)
  private Color ambientColor;

  public static final String SERIALIZED_NAME_ENABLE_FOG = "enableFog";
  @SerializedName(SERIALIZED_NAME_ENABLE_FOG)
  private Boolean enableFog;

  public static final String SERIALIZED_NAME_FOG_COLOUR = "fogColour";
  @SerializedName(SERIALIZED_NAME_FOG_COLOUR)
  private Color fogColour;

  public static final String SERIALIZED_NAME_FOG_DENSITY = "fogDensity";
  @SerializedName(SERIALIZED_NAME_FOG_DENSITY)
  private BigDecimal fogDensity;

  public static final String SERIALIZED_NAME_FOG_HEIGHT = "fogHeight";
  @SerializedName(SERIALIZED_NAME_FOG_HEIGHT)
  private BigDecimal fogHeight;

  public static final String SERIALIZED_NAME_CLOUDS = "clouds";
  @SerializedName(SERIALIZED_NAME_CLOUDS)
  private Boolean clouds;

  public static final String SERIALIZED_NAME_ABYSS = "abyss";
  @SerializedName(SERIALIZED_NAME_ABYSS)
  private Boolean abyss;

  public static final String SERIALIZED_NAME_TABLE = "table";
  @SerializedName(SERIALIZED_NAME_TABLE)
  private Boolean table;

  public static final String SERIALIZED_NAME_TABLE_COLOR = "tableColor";
  @SerializedName(SERIALIZED_NAME_TABLE_COLOR)
  private Color tableColor;

  public static final String SERIALIZED_NAME_SKYBOX = "skybox";
  @SerializedName(SERIALIZED_NAME_SKYBOX)
  private String skybox;

  public static final String SERIALIZED_NAME_RAIN_AMOUNT = "rainAmount";
  @SerializedName(SERIALIZED_NAME_RAIN_AMOUNT)
  private BigDecimal rainAmount;

  public static final String SERIALIZED_NAME_SNOW_AMOUNT = "snowAmount";
  @SerializedName(SERIALIZED_NAME_SNOW_AMOUNT)
  private BigDecimal snowAmount;

  public Atmosphere() {
  }

  public Atmosphere version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the atmosphere data
   * @return version
  **/
  @javax.annotation.Nullable
  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public Atmosphere lightRotation(Vector2 lightRotation) {
    
    this.lightRotation = lightRotation;
    return this;
  }

   /**
   * Get lightRotation
   * @return lightRotation
  **/
  @javax.annotation.Nullable
  public Vector2 getLightRotation() {
    return lightRotation;
  }


  public void setLightRotation(Vector2 lightRotation) {
    this.lightRotation = lightRotation;
  }


  public Atmosphere lightColour(Color lightColour) {
    
    this.lightColour = lightColour;
    return this;
  }

   /**
   * Get lightColour
   * @return lightColour
  **/
  @javax.annotation.Nullable
  public Color getLightColour() {
    return lightColour;
  }


  public void setLightColour(Color lightColour) {
    this.lightColour = lightColour;
  }


  public Atmosphere ambientColor(Color ambientColor) {
    
    this.ambientColor = ambientColor;
    return this;
  }

   /**
   * Get ambientColor
   * @return ambientColor
  **/
  @javax.annotation.Nullable
  public Color getAmbientColor() {
    return ambientColor;
  }


  public void setAmbientColor(Color ambientColor) {
    this.ambientColor = ambientColor;
  }


  public Atmosphere enableFog(Boolean enableFog) {
    
    this.enableFog = enableFog;
    return this;
  }

   /**
   * Whether fog is enabled
   * @return enableFog
  **/
  @javax.annotation.Nullable
  public Boolean getEnableFog() {
    return enableFog;
  }


  public void setEnableFog(Boolean enableFog) {
    this.enableFog = enableFog;
  }


  public Atmosphere fogColour(Color fogColour) {
    
    this.fogColour = fogColour;
    return this;
  }

   /**
   * Get fogColour
   * @return fogColour
  **/
  @javax.annotation.Nullable
  public Color getFogColour() {
    return fogColour;
  }


  public void setFogColour(Color fogColour) {
    this.fogColour = fogColour;
  }


  public Atmosphere fogDensity(BigDecimal fogDensity) {
    
    this.fogDensity = fogDensity;
    return this;
  }

   /**
   * Fog density
   * @return fogDensity
  **/
  @javax.annotation.Nullable
  public BigDecimal getFogDensity() {
    return fogDensity;
  }


  public void setFogDensity(BigDecimal fogDensity) {
    this.fogDensity = fogDensity;
  }


  public Atmosphere fogHeight(BigDecimal fogHeight) {
    
    this.fogHeight = fogHeight;
    return this;
  }

   /**
   * Fog height
   * @return fogHeight
  **/
  @javax.annotation.Nullable
  public BigDecimal getFogHeight() {
    return fogHeight;
  }


  public void setFogHeight(BigDecimal fogHeight) {
    this.fogHeight = fogHeight;
  }


  public Atmosphere clouds(Boolean clouds) {
    
    this.clouds = clouds;
    return this;
  }

   /**
   * Whether clouds are enabled
   * @return clouds
  **/
  @javax.annotation.Nullable
  public Boolean getClouds() {
    return clouds;
  }


  public void setClouds(Boolean clouds) {
    this.clouds = clouds;
  }


  public Atmosphere abyss(Boolean abyss) {
    
    this.abyss = abyss;
    return this;
  }

   /**
   * Whether abyss is enabled
   * @return abyss
  **/
  @javax.annotation.Nullable
  public Boolean getAbyss() {
    return abyss;
  }


  public void setAbyss(Boolean abyss) {
    this.abyss = abyss;
  }


  public Atmosphere table(Boolean table) {
    
    this.table = table;
    return this;
  }

   /**
   * Whether table is enabled
   * @return table
  **/
  @javax.annotation.Nullable
  public Boolean getTable() {
    return table;
  }


  public void setTable(Boolean table) {
    this.table = table;
  }


  public Atmosphere tableColor(Color tableColor) {
    
    this.tableColor = tableColor;
    return this;
  }

   /**
   * Get tableColor
   * @return tableColor
  **/
  @javax.annotation.Nullable
  public Color getTableColor() {
    return tableColor;
  }


  public void setTableColor(Color tableColor) {
    this.tableColor = tableColor;
  }


  public Atmosphere skybox(String skybox) {
    
    this.skybox = skybox;
    return this;
  }

   /**
   * Skybox image name
   * @return skybox
  **/
  @javax.annotation.Nullable
  public String getSkybox() {
    return skybox;
  }


  public void setSkybox(String skybox) {
    this.skybox = skybox;
  }


  public Atmosphere rainAmount(BigDecimal rainAmount) {
    
    this.rainAmount = rainAmount;
    return this;
  }

   /**
   * Rain amount
   * @return rainAmount
  **/
  @javax.annotation.Nullable
  public BigDecimal getRainAmount() {
    return rainAmount;
  }


  public void setRainAmount(BigDecimal rainAmount) {
    this.rainAmount = rainAmount;
  }


  public Atmosphere snowAmount(BigDecimal snowAmount) {
    
    this.snowAmount = snowAmount;
    return this;
  }

   /**
   * Snow amount
   * @return snowAmount
  **/
  @javax.annotation.Nullable
  public BigDecimal getSnowAmount() {
    return snowAmount;
  }


  public void setSnowAmount(BigDecimal snowAmount) {
    this.snowAmount = snowAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Atmosphere atmosphere = (Atmosphere) o;
    return Objects.equals(this.version, atmosphere.version) &&
        Objects.equals(this.lightRotation, atmosphere.lightRotation) &&
        Objects.equals(this.lightColour, atmosphere.lightColour) &&
        Objects.equals(this.ambientColor, atmosphere.ambientColor) &&
        Objects.equals(this.enableFog, atmosphere.enableFog) &&
        Objects.equals(this.fogColour, atmosphere.fogColour) &&
        Objects.equals(this.fogDensity, atmosphere.fogDensity) &&
        Objects.equals(this.fogHeight, atmosphere.fogHeight) &&
        Objects.equals(this.clouds, atmosphere.clouds) &&
        Objects.equals(this.abyss, atmosphere.abyss) &&
        Objects.equals(this.table, atmosphere.table) &&
        Objects.equals(this.tableColor, atmosphere.tableColor) &&
        Objects.equals(this.skybox, atmosphere.skybox) &&
        Objects.equals(this.rainAmount, atmosphere.rainAmount) &&
        Objects.equals(this.snowAmount, atmosphere.snowAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, lightRotation, lightColour, ambientColor, enableFog, fogColour, fogDensity, fogHeight, clouds, abyss, table, tableColor, skybox, rainAmount, snowAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Atmosphere {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    lightRotation: ").append(toIndentedString(lightRotation)).append("\n");
    sb.append("    lightColour: ").append(toIndentedString(lightColour)).append("\n");
    sb.append("    ambientColor: ").append(toIndentedString(ambientColor)).append("\n");
    sb.append("    enableFog: ").append(toIndentedString(enableFog)).append("\n");
    sb.append("    fogColour: ").append(toIndentedString(fogColour)).append("\n");
    sb.append("    fogDensity: ").append(toIndentedString(fogDensity)).append("\n");
    sb.append("    fogHeight: ").append(toIndentedString(fogHeight)).append("\n");
    sb.append("    clouds: ").append(toIndentedString(clouds)).append("\n");
    sb.append("    abyss: ").append(toIndentedString(abyss)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    tableColor: ").append(toIndentedString(tableColor)).append("\n");
    sb.append("    skybox: ").append(toIndentedString(skybox)).append("\n");
    sb.append("    rainAmount: ").append(toIndentedString(rainAmount)).append("\n");
    sb.append("    snowAmount: ").append(toIndentedString(snowAmount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("version");
    openapiFields.add("lightRotation");
    openapiFields.add("lightColour");
    openapiFields.add("ambientColor");
    openapiFields.add("enableFog");
    openapiFields.add("fogColour");
    openapiFields.add("fogDensity");
    openapiFields.add("fogHeight");
    openapiFields.add("clouds");
    openapiFields.add("abyss");
    openapiFields.add("table");
    openapiFields.add("tableColor");
    openapiFields.add("skybox");
    openapiFields.add("rainAmount");
    openapiFields.add("snowAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Atmosphere
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Atmosphere.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Atmosphere is not found in the empty JSON string", Atmosphere.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Atmosphere.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Atmosphere` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `lightRotation`
      if (jsonObj.get("lightRotation") != null && !jsonObj.get("lightRotation").isJsonNull()) {
        Vector2.validateJsonElement(jsonObj.get("lightRotation"));
      }
      // validate the optional field `lightColour`
      if (jsonObj.get("lightColour") != null && !jsonObj.get("lightColour").isJsonNull()) {
        Color.validateJsonElement(jsonObj.get("lightColour"));
      }
      // validate the optional field `ambientColor`
      if (jsonObj.get("ambientColor") != null && !jsonObj.get("ambientColor").isJsonNull()) {
        Color.validateJsonElement(jsonObj.get("ambientColor"));
      }
      // validate the optional field `fogColour`
      if (jsonObj.get("fogColour") != null && !jsonObj.get("fogColour").isJsonNull()) {
        Color.validateJsonElement(jsonObj.get("fogColour"));
      }
      // validate the optional field `tableColor`
      if (jsonObj.get("tableColor") != null && !jsonObj.get("tableColor").isJsonNull()) {
        Color.validateJsonElement(jsonObj.get("tableColor"));
      }
      if ((jsonObj.get("skybox") != null && !jsonObj.get("skybox").isJsonNull()) && !jsonObj.get("skybox").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skybox` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skybox").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Atmosphere.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Atmosphere' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Atmosphere> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Atmosphere.class));

       return (TypeAdapter<T>) new TypeAdapter<Atmosphere>() {
           @Override
           public void write(JsonWriter out, Atmosphere value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Atmosphere read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Atmosphere given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Atmosphere
  * @throws IOException if the JSON string is invalid with respect to Atmosphere
  */
  public static Atmosphere fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Atmosphere.class);
  }

 /**
  * Convert an instance of Atmosphere to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
