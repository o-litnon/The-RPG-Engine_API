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
 * Settings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-29T20:42:08.286157Z[Etc/UTC]")
public class Settings {
  public static final String SERIALIZED_NAME_SHOW_GRID = "showGrid";
  @SerializedName(SERIALIZED_NAME_SHOW_GRID)
  private Boolean showGrid;

  public static final String SERIALIZED_NAME_GRID_SIZE = "gridSize";
  @SerializedName(SERIALIZED_NAME_GRID_SIZE)
  private BigDecimal gridSize;

  public static final String SERIALIZED_NAME_LINE_WIDTH = "lineWidth";
  @SerializedName(SERIALIZED_NAME_LINE_WIDTH)
  private BigDecimal lineWidth;

  public static final String SERIALIZED_NAME_GRID_COLOR = "gridColor";
  @SerializedName(SERIALIZED_NAME_GRID_COLOR)
  private Color gridColor;

  public static final String SERIALIZED_NAME_GRID_TYPE = "gridType";
  @SerializedName(SERIALIZED_NAME_GRID_TYPE)
  private Integer gridType;

  public static final String SERIALIZED_NAME_UNIT_MULTIPLIER = "unitMultiplier";
  @SerializedName(SERIALIZED_NAME_UNIT_MULTIPLIER)
  private BigDecimal unitMultiplier;

  public static final String SERIALIZED_NAME_ROUND_RULERS = "roundRulers";
  @SerializedName(SERIALIZED_NAME_ROUND_RULERS)
  private Boolean roundRulers;

  public Settings() {
  }

  public Settings showGrid(Boolean showGrid) {
    
    this.showGrid = showGrid;
    return this;
  }

   /**
   * Whether to show the grid
   * @return showGrid
  **/
  @javax.annotation.Nullable
  public Boolean getShowGrid() {
    return showGrid;
  }


  public void setShowGrid(Boolean showGrid) {
    this.showGrid = showGrid;
  }


  public Settings gridSize(BigDecimal gridSize) {
    
    this.gridSize = gridSize;
    return this;
  }

   /**
   * Grid size
   * @return gridSize
  **/
  @javax.annotation.Nullable
  public BigDecimal getGridSize() {
    return gridSize;
  }


  public void setGridSize(BigDecimal gridSize) {
    this.gridSize = gridSize;
  }


  public Settings lineWidth(BigDecimal lineWidth) {
    
    this.lineWidth = lineWidth;
    return this;
  }

   /**
   * Line width
   * @return lineWidth
  **/
  @javax.annotation.Nullable
  public BigDecimal getLineWidth() {
    return lineWidth;
  }


  public void setLineWidth(BigDecimal lineWidth) {
    this.lineWidth = lineWidth;
  }


  public Settings gridColor(Color gridColor) {
    
    this.gridColor = gridColor;
    return this;
  }

   /**
   * Get gridColor
   * @return gridColor
  **/
  @javax.annotation.Nullable
  public Color getGridColor() {
    return gridColor;
  }


  public void setGridColor(Color gridColor) {
    this.gridColor = gridColor;
  }


  public Settings gridType(Integer gridType) {
    
    this.gridType = gridType;
    return this;
  }

   /**
   * Grid type
   * @return gridType
  **/
  @javax.annotation.Nullable
  public Integer getGridType() {
    return gridType;
  }


  public void setGridType(Integer gridType) {
    this.gridType = gridType;
  }


  public Settings unitMultiplier(BigDecimal unitMultiplier) {
    
    this.unitMultiplier = unitMultiplier;
    return this;
  }

   /**
   * Unit multiplier
   * @return unitMultiplier
  **/
  @javax.annotation.Nullable
  public BigDecimal getUnitMultiplier() {
    return unitMultiplier;
  }


  public void setUnitMultiplier(BigDecimal unitMultiplier) {
    this.unitMultiplier = unitMultiplier;
  }


  public Settings roundRulers(Boolean roundRulers) {
    
    this.roundRulers = roundRulers;
    return this;
  }

   /**
   * Whether to round rulers
   * @return roundRulers
  **/
  @javax.annotation.Nullable
  public Boolean getRoundRulers() {
    return roundRulers;
  }


  public void setRoundRulers(Boolean roundRulers) {
    this.roundRulers = roundRulers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Settings settings = (Settings) o;
    return Objects.equals(this.showGrid, settings.showGrid) &&
        Objects.equals(this.gridSize, settings.gridSize) &&
        Objects.equals(this.lineWidth, settings.lineWidth) &&
        Objects.equals(this.gridColor, settings.gridColor) &&
        Objects.equals(this.gridType, settings.gridType) &&
        Objects.equals(this.unitMultiplier, settings.unitMultiplier) &&
        Objects.equals(this.roundRulers, settings.roundRulers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showGrid, gridSize, lineWidth, gridColor, gridType, unitMultiplier, roundRulers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settings {\n");
    sb.append("    showGrid: ").append(toIndentedString(showGrid)).append("\n");
    sb.append("    gridSize: ").append(toIndentedString(gridSize)).append("\n");
    sb.append("    lineWidth: ").append(toIndentedString(lineWidth)).append("\n");
    sb.append("    gridColor: ").append(toIndentedString(gridColor)).append("\n");
    sb.append("    gridType: ").append(toIndentedString(gridType)).append("\n");
    sb.append("    unitMultiplier: ").append(toIndentedString(unitMultiplier)).append("\n");
    sb.append("    roundRulers: ").append(toIndentedString(roundRulers)).append("\n");
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
    openapiFields.add("showGrid");
    openapiFields.add("gridSize");
    openapiFields.add("lineWidth");
    openapiFields.add("gridColor");
    openapiFields.add("gridType");
    openapiFields.add("unitMultiplier");
    openapiFields.add("roundRulers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Settings
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Settings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Settings is not found in the empty JSON string", Settings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Settings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Settings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `gridColor`
      if (jsonObj.get("gridColor") != null && !jsonObj.get("gridColor").isJsonNull()) {
        Color.validateJsonElement(jsonObj.get("gridColor"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Settings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Settings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Settings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Settings.class));

       return (TypeAdapter<T>) new TypeAdapter<Settings>() {
           @Override
           public void write(JsonWriter out, Settings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Settings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Settings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Settings
  * @throws IOException if the JSON string is invalid with respect to Settings
  */
  public static Settings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Settings.class);
  }

 /**
  * Convert an instance of Settings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
