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
import org.openapitools.client.model.Vector3Int;

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
 * TerrainData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-29T21:06:33.968917Z[Etc/UTC]")
public class TerrainData {
  public static final String SERIALIZED_NAME_EXTEND_NAV_OVER_EDGE = "extendNavOverEdge";
  @SerializedName(SERIALIZED_NAME_EXTEND_NAV_OVER_EDGE)
  private Integer extendNavOverEdge;

  public static final String SERIALIZED_NAME_IS_SCULPTABLE = "isSculptable";
  @SerializedName(SERIALIZED_NAME_IS_SCULPTABLE)
  private Boolean isSculptable;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Vector3Int size;

  public static final String SERIALIZED_NAME_BASE_HEIGHT = "baseHeight";
  @SerializedName(SERIALIZED_NAME_BASE_HEIGHT)
  private BigDecimal baseHeight;

  public static final String SERIALIZED_NAME_BASE_COLOR = "baseColor";
  @SerializedName(SERIALIZED_NAME_BASE_COLOR)
  private Color baseColor;

  public TerrainData() {
  }

  public TerrainData extendNavOverEdge(Integer extendNavOverEdge) {
    
    this.extendNavOverEdge = extendNavOverEdge;
    return this;
  }

   /**
   * The constant value for extending navigation over the edge
   * @return extendNavOverEdge
  **/
  @javax.annotation.Nullable
  public Integer getExtendNavOverEdge() {
    return extendNavOverEdge;
  }


  public void setExtendNavOverEdge(Integer extendNavOverEdge) {
    this.extendNavOverEdge = extendNavOverEdge;
  }


  public TerrainData isSculptable(Boolean isSculptable) {
    
    this.isSculptable = isSculptable;
    return this;
  }

   /**
   * Whether the terrain is sculptable
   * @return isSculptable
  **/
  @javax.annotation.Nullable
  public Boolean getIsSculptable() {
    return isSculptable;
  }


  public void setIsSculptable(Boolean isSculptable) {
    this.isSculptable = isSculptable;
  }


  public TerrainData size(Vector3Int size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nonnull
  public Vector3Int getSize() {
    return size;
  }


  public void setSize(Vector3Int size) {
    this.size = size;
  }


  public TerrainData baseHeight(BigDecimal baseHeight) {
    
    this.baseHeight = baseHeight;
    return this;
  }

   /**
   * The base height of the terrain
   * @return baseHeight
  **/
  @javax.annotation.Nullable
  public BigDecimal getBaseHeight() {
    return baseHeight;
  }


  public void setBaseHeight(BigDecimal baseHeight) {
    this.baseHeight = baseHeight;
  }


  public TerrainData baseColor(Color baseColor) {
    
    this.baseColor = baseColor;
    return this;
  }

   /**
   * Get baseColor
   * @return baseColor
  **/
  @javax.annotation.Nullable
  public Color getBaseColor() {
    return baseColor;
  }


  public void setBaseColor(Color baseColor) {
    this.baseColor = baseColor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerrainData terrainData = (TerrainData) o;
    return Objects.equals(this.extendNavOverEdge, terrainData.extendNavOverEdge) &&
        Objects.equals(this.isSculptable, terrainData.isSculptable) &&
        Objects.equals(this.size, terrainData.size) &&
        Objects.equals(this.baseHeight, terrainData.baseHeight) &&
        Objects.equals(this.baseColor, terrainData.baseColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendNavOverEdge, isSculptable, size, baseHeight, baseColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerrainData {\n");
    sb.append("    extendNavOverEdge: ").append(toIndentedString(extendNavOverEdge)).append("\n");
    sb.append("    isSculptable: ").append(toIndentedString(isSculptable)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    baseHeight: ").append(toIndentedString(baseHeight)).append("\n");
    sb.append("    baseColor: ").append(toIndentedString(baseColor)).append("\n");
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
    openapiFields.add("extendNavOverEdge");
    openapiFields.add("isSculptable");
    openapiFields.add("size");
    openapiFields.add("baseHeight");
    openapiFields.add("baseColor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("size");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TerrainData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TerrainData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TerrainData is not found in the empty JSON string", TerrainData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TerrainData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TerrainData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TerrainData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `size`
      Vector3Int.validateJsonElement(jsonObj.get("size"));
      // validate the optional field `baseColor`
      if (jsonObj.get("baseColor") != null && !jsonObj.get("baseColor").isJsonNull()) {
        Color.validateJsonElement(jsonObj.get("baseColor"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerrainData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerrainData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerrainData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerrainData.class));

       return (TypeAdapter<T>) new TypeAdapter<TerrainData>() {
           @Override
           public void write(JsonWriter out, TerrainData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerrainData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TerrainData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TerrainData
  * @throws IOException if the JSON string is invalid with respect to TerrainData
  */
  public static TerrainData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerrainData.class);
  }

 /**
  * Convert an instance of TerrainData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

