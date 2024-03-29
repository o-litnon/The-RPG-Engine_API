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
import java.util.Arrays;

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
 * Vector3Int
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-29T21:06:33.968917Z[Etc/UTC]")
public class Vector3Int {
  public static final String SERIALIZED_NAME_X = "x";
  @SerializedName(SERIALIZED_NAME_X)
  private Integer x;

  public static final String SERIALIZED_NAME_Y = "y";
  @SerializedName(SERIALIZED_NAME_Y)
  private Integer y;

  public static final String SERIALIZED_NAME_Z = "z";
  @SerializedName(SERIALIZED_NAME_Z)
  private Integer z;

  public Vector3Int() {
  }

  public Vector3Int x(Integer x) {
    
    this.x = x;
    return this;
  }

   /**
   * The x-coordinate
   * @return x
  **/
  @javax.annotation.Nullable
  public Integer getX() {
    return x;
  }


  public void setX(Integer x) {
    this.x = x;
  }


  public Vector3Int y(Integer y) {
    
    this.y = y;
    return this;
  }

   /**
   * The y-coordinate
   * @return y
  **/
  @javax.annotation.Nullable
  public Integer getY() {
    return y;
  }


  public void setY(Integer y) {
    this.y = y;
  }


  public Vector3Int z(Integer z) {
    
    this.z = z;
    return this;
  }

   /**
   * The z-coordinate
   * @return z
  **/
  @javax.annotation.Nullable
  public Integer getZ() {
    return z;
  }


  public void setZ(Integer z) {
    this.z = z;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vector3Int vector3Int = (Vector3Int) o;
    return Objects.equals(this.x, vector3Int.x) &&
        Objects.equals(this.y, vector3Int.y) &&
        Objects.equals(this.z, vector3Int.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vector3Int {\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
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
    openapiFields.add("x");
    openapiFields.add("y");
    openapiFields.add("z");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Vector3Int
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Vector3Int.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Vector3Int is not found in the empty JSON string", Vector3Int.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Vector3Int.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Vector3Int` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Vector3Int.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Vector3Int' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Vector3Int> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Vector3Int.class));

       return (TypeAdapter<T>) new TypeAdapter<Vector3Int>() {
           @Override
           public void write(JsonWriter out, Vector3Int value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Vector3Int read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Vector3Int given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Vector3Int
  * @throws IOException if the JSON string is invalid with respect to Vector3Int
  */
  public static Vector3Int fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Vector3Int.class);
  }

 /**
  * Convert an instance of Vector3Int to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

