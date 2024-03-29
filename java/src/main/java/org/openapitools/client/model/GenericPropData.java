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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.Color;
import org.openapitools.client.model.Quaternion;
import org.openapitools.client.model.Vector2;
import org.openapitools.client.model.Vector3;
import org.openapitools.client.model.Vector4;

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
 * A class for storing generic property data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-29T21:06:33.968917Z[Etc/UTC]")
public class GenericPropData {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_BOOLS = "bools";
  @SerializedName(SERIALIZED_NAME_BOOLS)
  private Map<String, Boolean> bools = new HashMap<>();

  public static final String SERIALIZED_NAME_INTS = "ints";
  @SerializedName(SERIALIZED_NAME_INTS)
  private Map<String, Integer> ints = new HashMap<>();

  public static final String SERIALIZED_NAME_FLOATS = "floats";
  @SerializedName(SERIALIZED_NAME_FLOATS)
  private Map<String, BigDecimal> floats = new HashMap<>();

  public static final String SERIALIZED_NAME_STRINGS = "strings";
  @SerializedName(SERIALIZED_NAME_STRINGS)
  private Map<String, String> strings = new HashMap<>();

  public static final String SERIALIZED_NAME_COLORS = "colors";
  @SerializedName(SERIALIZED_NAME_COLORS)
  private Map<String, Color> colors = new HashMap<>();

  public static final String SERIALIZED_NAME_VECTOR2S = "vector2s";
  @SerializedName(SERIALIZED_NAME_VECTOR2S)
  private Map<String, Vector2> vector2s = new HashMap<>();

  public static final String SERIALIZED_NAME_VECTOR3S = "vector3s";
  @SerializedName(SERIALIZED_NAME_VECTOR3S)
  private Map<String, Vector3> vector3s = new HashMap<>();

  public static final String SERIALIZED_NAME_VECTOR4S = "vector4s";
  @SerializedName(SERIALIZED_NAME_VECTOR4S)
  private Map<String, Vector4> vector4s = new HashMap<>();

  public static final String SERIALIZED_NAME_QUATERNIONS = "quaternions";
  @SerializedName(SERIALIZED_NAME_QUATERNIONS)
  private Map<String, Quaternion> quaternions = new HashMap<>();

  public GenericPropData() {
  }

  public GenericPropData version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the GenericPropData
   * @return version
  **/
  @javax.annotation.Nullable
  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public GenericPropData bools(Map<String, Boolean> bools) {
    
    this.bools = bools;
    return this;
  }

  public GenericPropData putBoolsItem(String key, Boolean boolsItem) {
    if (this.bools == null) {
      this.bools = new HashMap<>();
    }
    this.bools.put(key, boolsItem);
    return this;
  }

   /**
   * A dictionary mapping string keys to boolean values
   * @return bools
  **/
  @javax.annotation.Nullable
  public Map<String, Boolean> getBools() {
    return bools;
  }


  public void setBools(Map<String, Boolean> bools) {
    this.bools = bools;
  }


  public GenericPropData ints(Map<String, Integer> ints) {
    
    this.ints = ints;
    return this;
  }

  public GenericPropData putIntsItem(String key, Integer intsItem) {
    if (this.ints == null) {
      this.ints = new HashMap<>();
    }
    this.ints.put(key, intsItem);
    return this;
  }

   /**
   * A dictionary mapping string keys to integer values
   * @return ints
  **/
  @javax.annotation.Nullable
  public Map<String, Integer> getInts() {
    return ints;
  }


  public void setInts(Map<String, Integer> ints) {
    this.ints = ints;
  }


  public GenericPropData floats(Map<String, BigDecimal> floats) {
    
    this.floats = floats;
    return this;
  }

  public GenericPropData putFloatsItem(String key, BigDecimal floatsItem) {
    if (this.floats == null) {
      this.floats = new HashMap<>();
    }
    this.floats.put(key, floatsItem);
    return this;
  }

   /**
   * A dictionary mapping string keys to float values
   * @return floats
  **/
  @javax.annotation.Nullable
  public Map<String, BigDecimal> getFloats() {
    return floats;
  }


  public void setFloats(Map<String, BigDecimal> floats) {
    this.floats = floats;
  }


  public GenericPropData strings(Map<String, String> strings) {
    
    this.strings = strings;
    return this;
  }

  public GenericPropData putStringsItem(String key, String stringsItem) {
    if (this.strings == null) {
      this.strings = new HashMap<>();
    }
    this.strings.put(key, stringsItem);
    return this;
  }

   /**
   * A dictionary mapping string keys to string values
   * @return strings
  **/
  @javax.annotation.Nullable
  public Map<String, String> getStrings() {
    return strings;
  }


  public void setStrings(Map<String, String> strings) {
    this.strings = strings;
  }


  public GenericPropData colors(Map<String, Color> colors) {
    
    this.colors = colors;
    return this;
  }

  public GenericPropData putColorsItem(String key, Color colorsItem) {
    if (this.colors == null) {
      this.colors = new HashMap<>();
    }
    this.colors.put(key, colorsItem);
    return this;
  }

   /**
   * A dictionary mapping string keys to Color objects
   * @return colors
  **/
  @javax.annotation.Nullable
  public Map<String, Color> getColors() {
    return colors;
  }


  public void setColors(Map<String, Color> colors) {
    this.colors = colors;
  }


  public GenericPropData vector2s(Map<String, Vector2> vector2s) {
    
    this.vector2s = vector2s;
    return this;
  }

  public GenericPropData putVector2sItem(String key, Vector2 vector2sItem) {
    if (this.vector2s == null) {
      this.vector2s = new HashMap<>();
    }
    this.vector2s.put(key, vector2sItem);
    return this;
  }

   /**
   * A dictionary mapping string keys to Vector2 objects
   * @return vector2s
  **/
  @javax.annotation.Nullable
  public Map<String, Vector2> getVector2s() {
    return vector2s;
  }


  public void setVector2s(Map<String, Vector2> vector2s) {
    this.vector2s = vector2s;
  }


  public GenericPropData vector3s(Map<String, Vector3> vector3s) {
    
    this.vector3s = vector3s;
    return this;
  }

  public GenericPropData putVector3sItem(String key, Vector3 vector3sItem) {
    if (this.vector3s == null) {
      this.vector3s = new HashMap<>();
    }
    this.vector3s.put(key, vector3sItem);
    return this;
  }

   /**
   * A dictionary mapping string keys to Vector3 objects
   * @return vector3s
  **/
  @javax.annotation.Nullable
  public Map<String, Vector3> getVector3s() {
    return vector3s;
  }


  public void setVector3s(Map<String, Vector3> vector3s) {
    this.vector3s = vector3s;
  }


  public GenericPropData vector4s(Map<String, Vector4> vector4s) {
    
    this.vector4s = vector4s;
    return this;
  }

  public GenericPropData putVector4sItem(String key, Vector4 vector4sItem) {
    if (this.vector4s == null) {
      this.vector4s = new HashMap<>();
    }
    this.vector4s.put(key, vector4sItem);
    return this;
  }

   /**
   * A dictionary mapping string keys to Vector4 objects
   * @return vector4s
  **/
  @javax.annotation.Nullable
  public Map<String, Vector4> getVector4s() {
    return vector4s;
  }


  public void setVector4s(Map<String, Vector4> vector4s) {
    this.vector4s = vector4s;
  }


  public GenericPropData quaternions(Map<String, Quaternion> quaternions) {
    
    this.quaternions = quaternions;
    return this;
  }

  public GenericPropData putQuaternionsItem(String key, Quaternion quaternionsItem) {
    if (this.quaternions == null) {
      this.quaternions = new HashMap<>();
    }
    this.quaternions.put(key, quaternionsItem);
    return this;
  }

   /**
   * A dictionary mapping string keys to Quaternion objects
   * @return quaternions
  **/
  @javax.annotation.Nullable
  public Map<String, Quaternion> getQuaternions() {
    return quaternions;
  }


  public void setQuaternions(Map<String, Quaternion> quaternions) {
    this.quaternions = quaternions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericPropData genericPropData = (GenericPropData) o;
    return Objects.equals(this.version, genericPropData.version) &&
        Objects.equals(this.bools, genericPropData.bools) &&
        Objects.equals(this.ints, genericPropData.ints) &&
        Objects.equals(this.floats, genericPropData.floats) &&
        Objects.equals(this.strings, genericPropData.strings) &&
        Objects.equals(this.colors, genericPropData.colors) &&
        Objects.equals(this.vector2s, genericPropData.vector2s) &&
        Objects.equals(this.vector3s, genericPropData.vector3s) &&
        Objects.equals(this.vector4s, genericPropData.vector4s) &&
        Objects.equals(this.quaternions, genericPropData.quaternions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, bools, ints, floats, strings, colors, vector2s, vector3s, vector4s, quaternions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericPropData {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    bools: ").append(toIndentedString(bools)).append("\n");
    sb.append("    ints: ").append(toIndentedString(ints)).append("\n");
    sb.append("    floats: ").append(toIndentedString(floats)).append("\n");
    sb.append("    strings: ").append(toIndentedString(strings)).append("\n");
    sb.append("    colors: ").append(toIndentedString(colors)).append("\n");
    sb.append("    vector2s: ").append(toIndentedString(vector2s)).append("\n");
    sb.append("    vector3s: ").append(toIndentedString(vector3s)).append("\n");
    sb.append("    vector4s: ").append(toIndentedString(vector4s)).append("\n");
    sb.append("    quaternions: ").append(toIndentedString(quaternions)).append("\n");
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
    openapiFields.add("bools");
    openapiFields.add("ints");
    openapiFields.add("floats");
    openapiFields.add("strings");
    openapiFields.add("colors");
    openapiFields.add("vector2s");
    openapiFields.add("vector3s");
    openapiFields.add("vector4s");
    openapiFields.add("quaternions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GenericPropData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GenericPropData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenericPropData is not found in the empty JSON string", GenericPropData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GenericPropData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenericPropData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenericPropData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenericPropData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenericPropData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenericPropData.class));

       return (TypeAdapter<T>) new TypeAdapter<GenericPropData>() {
           @Override
           public void write(JsonWriter out, GenericPropData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenericPropData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GenericPropData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenericPropData
  * @throws IOException if the JSON string is invalid with respect to GenericPropData
  */
  public static GenericPropData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenericPropData.class);
  }

 /**
  * Convert an instance of GenericPropData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

