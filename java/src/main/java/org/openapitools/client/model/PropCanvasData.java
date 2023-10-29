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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.PropCanvasSlider;

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
 * PropCanvasData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-29T20:42:08.286157Z[Etc/UTC]")
public class PropCanvasData {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_SHOW_TITLE = "showTitle";
  @SerializedName(SERIALIZED_NAME_SHOW_TITLE)
  private Boolean showTitle;

  public static final String SERIALIZED_NAME_SLIDERS = "sliders";
  @SerializedName(SERIALIZED_NAME_SLIDERS)
  private Map<String, PropCanvasSlider> sliders = new HashMap<>();

  public static final String SERIALIZED_NAME_SHOW_STATUSES = "showStatuses";
  @SerializedName(SERIALIZED_NAME_SHOW_STATUSES)
  private Boolean showStatuses;

  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  private List<String> statuses;

  public PropCanvasData() {
  }

  public PropCanvasData version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the canvas data
   * @return version
  **/
  @javax.annotation.Nullable
  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public PropCanvasData showTitle(Boolean showTitle) {
    
    this.showTitle = showTitle;
    return this;
  }

   /**
   * Whether the title is shown on the canvas
   * @return showTitle
  **/
  @javax.annotation.Nullable
  public Boolean getShowTitle() {
    return showTitle;
  }


  public void setShowTitle(Boolean showTitle) {
    this.showTitle = showTitle;
  }


  public PropCanvasData sliders(Map<String, PropCanvasSlider> sliders) {
    
    this.sliders = sliders;
    return this;
  }

  public PropCanvasData putSlidersItem(String key, PropCanvasSlider slidersItem) {
    if (this.sliders == null) {
      this.sliders = new HashMap<>();
    }
    this.sliders.put(key, slidersItem);
    return this;
  }

   /**
   * Get sliders
   * @return sliders
  **/
  @javax.annotation.Nullable
  public Map<String, PropCanvasSlider> getSliders() {
    return sliders;
  }


  public void setSliders(Map<String, PropCanvasSlider> sliders) {
    this.sliders = sliders;
  }


  public PropCanvasData showStatuses(Boolean showStatuses) {
    
    this.showStatuses = showStatuses;
    return this;
  }

   /**
   * Whether statuses are shown on the canvas
   * @return showStatuses
  **/
  @javax.annotation.Nullable
  public Boolean getShowStatuses() {
    return showStatuses;
  }


  public void setShowStatuses(Boolean showStatuses) {
    this.showStatuses = showStatuses;
  }


  public PropCanvasData statuses(List<String> statuses) {
    
    this.statuses = statuses;
    return this;
  }

  public PropCanvasData addStatusesItem(String statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * Get statuses
   * @return statuses
  **/
  @javax.annotation.Nullable
  public List<String> getStatuses() {
    return statuses;
  }


  public void setStatuses(List<String> statuses) {
    this.statuses = statuses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropCanvasData propCanvasData = (PropCanvasData) o;
    return Objects.equals(this.version, propCanvasData.version) &&
        Objects.equals(this.showTitle, propCanvasData.showTitle) &&
        Objects.equals(this.sliders, propCanvasData.sliders) &&
        Objects.equals(this.showStatuses, propCanvasData.showStatuses) &&
        Objects.equals(this.statuses, propCanvasData.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, showTitle, sliders, showStatuses, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropCanvasData {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    showTitle: ").append(toIndentedString(showTitle)).append("\n");
    sb.append("    sliders: ").append(toIndentedString(sliders)).append("\n");
    sb.append("    showStatuses: ").append(toIndentedString(showStatuses)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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
    openapiFields.add("showTitle");
    openapiFields.add("sliders");
    openapiFields.add("showStatuses");
    openapiFields.add("statuses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PropCanvasData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PropCanvasData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PropCanvasData is not found in the empty JSON string", PropCanvasData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PropCanvasData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PropCanvasData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("statuses") != null && !jsonObj.get("statuses").isJsonNull() && !jsonObj.get("statuses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `statuses` to be an array in the JSON string but got `%s`", jsonObj.get("statuses").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PropCanvasData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PropCanvasData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PropCanvasData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PropCanvasData.class));

       return (TypeAdapter<T>) new TypeAdapter<PropCanvasData>() {
           @Override
           public void write(JsonWriter out, PropCanvasData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PropCanvasData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PropCanvasData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PropCanvasData
  * @throws IOException if the JSON string is invalid with respect to PropCanvasData
  */
  public static PropCanvasData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PropCanvasData.class);
  }

 /**
  * Convert an instance of PropCanvasData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
