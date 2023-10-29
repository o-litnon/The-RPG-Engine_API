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
 * Vector3
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-29T20:42:08.286157Z[Etc/UTC]")
public class Vector3 {
  public static final String SERIALIZED_NAME_X = "x";
  @SerializedName(SERIALIZED_NAME_X)
  private BigDecimal x;

  public static final String SERIALIZED_NAME_Y = "y";
  @SerializedName(SERIALIZED_NAME_Y)
  private BigDecimal y;

  public static final String SERIALIZED_NAME_Z = "z";
  @SerializedName(SERIALIZED_NAME_Z)
  private BigDecimal z;

  public Vector3() {
  }

  public Vector3 x(BigDecimal x) {
    
    this.x = x;
    return this;
  }

   /**
   * X-coordinate
   * @return x
  **/
  @javax.annotation.Nullable
  public BigDecimal getX() {
    return x;
  }


  public void setX(BigDecimal x) {
    this.x = x;
  }


  public Vector3 y(BigDecimal y) {
    
    this.y = y;
    return this;
  }

   /**
   * Y-coordinate
   * @return y
  **/
  @javax.annotation.Nullable
  public BigDecimal getY() {
    return y;
  }


  public void setY(BigDecimal y) {
    this.y = y;
  }


  public Vector3 z(BigDecimal z) {
    
    this.z = z;
    return this;
  }

   /**
   * Z-coordinate
   * @return z
  **/
  @javax.annotation.Nullable
  public BigDecimal getZ() {
    return z;
  }


  public void setZ(BigDecimal z) {
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
    Vector3 vector3 = (Vector3) o;
    return Objects.equals(this.x, vector3.x) &&
        Objects.equals(this.y, vector3.y) &&
        Objects.equals(this.z, vector3.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vector3 {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to Vector3
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Vector3.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Vector3 is not found in the empty JSON string", Vector3.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Vector3.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Vector3` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Vector3.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Vector3' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Vector3> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Vector3.class));

       return (TypeAdapter<T>) new TypeAdapter<Vector3>() {
           @Override
           public void write(JsonWriter out, Vector3 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Vector3 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Vector3 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Vector3
  * @throws IOException if the JSON string is invalid with respect to Vector3
  */
  public static Vector3 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Vector3.class);
  }

 /**
  * Convert an instance of Vector3 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
