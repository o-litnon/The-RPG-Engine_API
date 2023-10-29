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
import org.openapitools.client.model.Vector3;

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
 * TerrainDataPoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-29T20:42:08.286157Z[Etc/UTC]")
public class TerrainDataPoint {
  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Vector3 position;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private BigDecimal value;

  public static final String SERIALIZED_NAME_COLOUR = "colour";
  @SerializedName(SERIALIZED_NAME_COLOUR)
  private Vector3 colour;

  public TerrainDataPoint() {
  }

  public TerrainDataPoint position(Vector3 position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  public Vector3 getPosition() {
    return position;
  }


  public void setPosition(Vector3 position) {
    this.position = position;
  }


  public TerrainDataPoint value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * Terrain data value
   * @return value
  **/
  @javax.annotation.Nullable
  public BigDecimal getValue() {
    return value;
  }


  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public TerrainDataPoint colour(Vector3 colour) {
    
    this.colour = colour;
    return this;
  }

   /**
   * Get colour
   * @return colour
  **/
  @javax.annotation.Nullable
  public Vector3 getColour() {
    return colour;
  }


  public void setColour(Vector3 colour) {
    this.colour = colour;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerrainDataPoint terrainDataPoint = (TerrainDataPoint) o;
    return Objects.equals(this.position, terrainDataPoint.position) &&
        Objects.equals(this.value, terrainDataPoint.value) &&
        Objects.equals(this.colour, terrainDataPoint.colour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, value, colour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerrainDataPoint {\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    colour: ").append(toIndentedString(colour)).append("\n");
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
    openapiFields.add("position");
    openapiFields.add("value");
    openapiFields.add("colour");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TerrainDataPoint
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TerrainDataPoint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TerrainDataPoint is not found in the empty JSON string", TerrainDataPoint.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TerrainDataPoint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TerrainDataPoint` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `position`
      if (jsonObj.get("position") != null && !jsonObj.get("position").isJsonNull()) {
        Vector3.validateJsonElement(jsonObj.get("position"));
      }
      // validate the optional field `colour`
      if (jsonObj.get("colour") != null && !jsonObj.get("colour").isJsonNull()) {
        Vector3.validateJsonElement(jsonObj.get("colour"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TerrainDataPoint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TerrainDataPoint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TerrainDataPoint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TerrainDataPoint.class));

       return (TypeAdapter<T>) new TypeAdapter<TerrainDataPoint>() {
           @Override
           public void write(JsonWriter out, TerrainDataPoint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TerrainDataPoint read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TerrainDataPoint given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TerrainDataPoint
  * @throws IOException if the JSON string is invalid with respect to TerrainDataPoint
  */
  public static TerrainDataPoint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TerrainDataPoint.class);
  }

 /**
  * Convert an instance of TerrainDataPoint to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

