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
 * PostProcessing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-29T21:06:33.968917Z[Etc/UTC]")
public class PostProcessing {
  public static final String SERIALIZED_NAME_TILT_SHIFT_BLUR_AMOUNT = "tiltShiftBlurAmount";
  @SerializedName(SERIALIZED_NAME_TILT_SHIFT_BLUR_AMOUNT)
  private BigDecimal tiltShiftBlurAmount;

  public static final String SERIALIZED_NAME_EDGE_DETECTION_ENABLED = "edgeDetectionEnabled";
  @SerializedName(SERIALIZED_NAME_EDGE_DETECTION_ENABLED)
  private Boolean edgeDetectionEnabled;

  public static final String SERIALIZED_NAME_EDGE_DETECTION_COLOR = "edgeDetectionColor";
  @SerializedName(SERIALIZED_NAME_EDGE_DETECTION_COLOR)
  private Color edgeDetectionColor;

  public static final String SERIALIZED_NAME_DITHERING_THRESHOLD = "ditheringThreshold";
  @SerializedName(SERIALIZED_NAME_DITHERING_THRESHOLD)
  private BigDecimal ditheringThreshold;

  public static final String SERIALIZED_NAME_TUBE_DISTORTION_STRENGTH = "tubeDistortionStrength";
  @SerializedName(SERIALIZED_NAME_TUBE_DISTORTION_STRENGTH)
  private BigDecimal tubeDistortionStrength;

  public static final String SERIALIZED_NAME_PIXELIZATION_RESOLUTION = "pixelizationResolution";
  @SerializedName(SERIALIZED_NAME_PIXELIZATION_RESOLUTION)
  private Integer pixelizationResolution;

  public static final String SERIALIZED_NAME_COLOR_SPLIT_STRENGTH = "colorSplitStrength";
  @SerializedName(SERIALIZED_NAME_COLOR_SPLIT_STRENGTH)
  private BigDecimal colorSplitStrength;

  public static final String SERIALIZED_NAME_WATER_RIPPLES_STRENGTH = "waterRipplesStrength";
  @SerializedName(SERIALIZED_NAME_WATER_RIPPLES_STRENGTH)
  private BigDecimal waterRipplesStrength;

  public static final String SERIALIZED_NAME_WATER_RIPPLES_SPEED = "waterRipplesSpeed";
  @SerializedName(SERIALIZED_NAME_WATER_RIPPLES_SPEED)
  private BigDecimal waterRipplesSpeed;

  public static final String SERIALIZED_NAME_SKETCH_ENABLED = "sketchEnabled";
  @SerializedName(SERIALIZED_NAME_SKETCH_ENABLED)
  private Boolean sketchEnabled;

  public static final String SERIALIZED_NAME_RADIAL_BLUR_AMOUNT = "radialBlurAmount";
  @SerializedName(SERIALIZED_NAME_RADIAL_BLUR_AMOUNT)
  private BigDecimal radialBlurAmount;

  public static final String SERIALIZED_NAME_BLOOM_THRESHHOLD = "bloomThreshhold";
  @SerializedName(SERIALIZED_NAME_BLOOM_THRESHHOLD)
  private BigDecimal bloomThreshhold;

  public static final String SERIALIZED_NAME_BLOOM_INTENSITY = "bloomIntensity";
  @SerializedName(SERIALIZED_NAME_BLOOM_INTENSITY)
  private BigDecimal bloomIntensity;

  public static final String SERIALIZED_NAME_VIGNETTE_INTENSITY = "vignetteIntensity";
  @SerializedName(SERIALIZED_NAME_VIGNETTE_INTENSITY)
  private BigDecimal vignetteIntensity;

  public static final String SERIALIZED_NAME_VIGNETTE_COLOR = "vignetteColor";
  @SerializedName(SERIALIZED_NAME_VIGNETTE_COLOR)
  private Color vignetteColor;

  public static final String SERIALIZED_NAME_POST_EXPOSURE = "postExposure";
  @SerializedName(SERIALIZED_NAME_POST_EXPOSURE)
  private BigDecimal postExposure;

  public static final String SERIALIZED_NAME_SATURATION = "saturation";
  @SerializedName(SERIALIZED_NAME_SATURATION)
  private BigDecimal saturation;

  public static final String SERIALIZED_NAME_HUE = "hue";
  @SerializedName(SERIALIZED_NAME_HUE)
  private BigDecimal hue;

  public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
  @SerializedName(SERIALIZED_NAME_TEMPERATURE)
  private BigDecimal temperature;

  public static final String SERIALIZED_NAME_SHARPEN_ENABLED = "sharpenEnabled";
  @SerializedName(SERIALIZED_NAME_SHARPEN_ENABLED)
  private Boolean sharpenEnabled;

  public static final String SERIALIZED_NAME_BLACK_BARS = "blackBars";
  @SerializedName(SERIALIZED_NAME_BLACK_BARS)
  private BigDecimal blackBars;

  public static final String SERIALIZED_NAME_SCAN_LINES_ENABLED = "ScanLinesEnabled";
  @SerializedName(SERIALIZED_NAME_SCAN_LINES_ENABLED)
  private Boolean scanLinesEnabled;

  public static final String SERIALIZED_NAME_SCANLINES_AMOUNT = "scanlinesAmount";
  @SerializedName(SERIALIZED_NAME_SCANLINES_AMOUNT)
  private Integer scanlinesAmount;

  public static final String SERIALIZED_NAME_SCANLINES_SPEED = "scanlinesSpeed";
  @SerializedName(SERIALIZED_NAME_SCANLINES_SPEED)
  private BigDecimal scanlinesSpeed;

  public PostProcessing() {
  }

  public PostProcessing tiltShiftBlurAmount(BigDecimal tiltShiftBlurAmount) {
    
    this.tiltShiftBlurAmount = tiltShiftBlurAmount;
    return this;
  }

   /**
   * Tilt-shift blur amount
   * @return tiltShiftBlurAmount
  **/
  @javax.annotation.Nullable
  public BigDecimal getTiltShiftBlurAmount() {
    return tiltShiftBlurAmount;
  }


  public void setTiltShiftBlurAmount(BigDecimal tiltShiftBlurAmount) {
    this.tiltShiftBlurAmount = tiltShiftBlurAmount;
  }


  public PostProcessing edgeDetectionEnabled(Boolean edgeDetectionEnabled) {
    
    this.edgeDetectionEnabled = edgeDetectionEnabled;
    return this;
  }

   /**
   * Whether edge detection is enabled
   * @return edgeDetectionEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getEdgeDetectionEnabled() {
    return edgeDetectionEnabled;
  }


  public void setEdgeDetectionEnabled(Boolean edgeDetectionEnabled) {
    this.edgeDetectionEnabled = edgeDetectionEnabled;
  }


  public PostProcessing edgeDetectionColor(Color edgeDetectionColor) {
    
    this.edgeDetectionColor = edgeDetectionColor;
    return this;
  }

   /**
   * Get edgeDetectionColor
   * @return edgeDetectionColor
  **/
  @javax.annotation.Nullable
  public Color getEdgeDetectionColor() {
    return edgeDetectionColor;
  }


  public void setEdgeDetectionColor(Color edgeDetectionColor) {
    this.edgeDetectionColor = edgeDetectionColor;
  }


  public PostProcessing ditheringThreshold(BigDecimal ditheringThreshold) {
    
    this.ditheringThreshold = ditheringThreshold;
    return this;
  }

   /**
   * Dithering threshold
   * @return ditheringThreshold
  **/
  @javax.annotation.Nullable
  public BigDecimal getDitheringThreshold() {
    return ditheringThreshold;
  }


  public void setDitheringThreshold(BigDecimal ditheringThreshold) {
    this.ditheringThreshold = ditheringThreshold;
  }


  public PostProcessing tubeDistortionStrength(BigDecimal tubeDistortionStrength) {
    
    this.tubeDistortionStrength = tubeDistortionStrength;
    return this;
  }

   /**
   * Tube distortion strength
   * @return tubeDistortionStrength
  **/
  @javax.annotation.Nullable
  public BigDecimal getTubeDistortionStrength() {
    return tubeDistortionStrength;
  }


  public void setTubeDistortionStrength(BigDecimal tubeDistortionStrength) {
    this.tubeDistortionStrength = tubeDistortionStrength;
  }


  public PostProcessing pixelizationResolution(Integer pixelizationResolution) {
    
    this.pixelizationResolution = pixelizationResolution;
    return this;
  }

   /**
   * Pixelization resolution
   * @return pixelizationResolution
  **/
  @javax.annotation.Nullable
  public Integer getPixelizationResolution() {
    return pixelizationResolution;
  }


  public void setPixelizationResolution(Integer pixelizationResolution) {
    this.pixelizationResolution = pixelizationResolution;
  }


  public PostProcessing colorSplitStrength(BigDecimal colorSplitStrength) {
    
    this.colorSplitStrength = colorSplitStrength;
    return this;
  }

   /**
   * Color split strength
   * @return colorSplitStrength
  **/
  @javax.annotation.Nullable
  public BigDecimal getColorSplitStrength() {
    return colorSplitStrength;
  }


  public void setColorSplitStrength(BigDecimal colorSplitStrength) {
    this.colorSplitStrength = colorSplitStrength;
  }


  public PostProcessing waterRipplesStrength(BigDecimal waterRipplesStrength) {
    
    this.waterRipplesStrength = waterRipplesStrength;
    return this;
  }

   /**
   * Water ripples strength
   * @return waterRipplesStrength
  **/
  @javax.annotation.Nullable
  public BigDecimal getWaterRipplesStrength() {
    return waterRipplesStrength;
  }


  public void setWaterRipplesStrength(BigDecimal waterRipplesStrength) {
    this.waterRipplesStrength = waterRipplesStrength;
  }


  public PostProcessing waterRipplesSpeed(BigDecimal waterRipplesSpeed) {
    
    this.waterRipplesSpeed = waterRipplesSpeed;
    return this;
  }

   /**
   * Water ripples speed
   * @return waterRipplesSpeed
  **/
  @javax.annotation.Nullable
  public BigDecimal getWaterRipplesSpeed() {
    return waterRipplesSpeed;
  }


  public void setWaterRipplesSpeed(BigDecimal waterRipplesSpeed) {
    this.waterRipplesSpeed = waterRipplesSpeed;
  }


  public PostProcessing sketchEnabled(Boolean sketchEnabled) {
    
    this.sketchEnabled = sketchEnabled;
    return this;
  }

   /**
   * Whether sketch is enabled
   * @return sketchEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getSketchEnabled() {
    return sketchEnabled;
  }


  public void setSketchEnabled(Boolean sketchEnabled) {
    this.sketchEnabled = sketchEnabled;
  }


  public PostProcessing radialBlurAmount(BigDecimal radialBlurAmount) {
    
    this.radialBlurAmount = radialBlurAmount;
    return this;
  }

   /**
   * Radial blur amount
   * @return radialBlurAmount
  **/
  @javax.annotation.Nullable
  public BigDecimal getRadialBlurAmount() {
    return radialBlurAmount;
  }


  public void setRadialBlurAmount(BigDecimal radialBlurAmount) {
    this.radialBlurAmount = radialBlurAmount;
  }


  public PostProcessing bloomThreshhold(BigDecimal bloomThreshhold) {
    
    this.bloomThreshhold = bloomThreshhold;
    return this;
  }

   /**
   * Bloom threshold
   * @return bloomThreshhold
  **/
  @javax.annotation.Nullable
  public BigDecimal getBloomThreshhold() {
    return bloomThreshhold;
  }


  public void setBloomThreshhold(BigDecimal bloomThreshhold) {
    this.bloomThreshhold = bloomThreshhold;
  }


  public PostProcessing bloomIntensity(BigDecimal bloomIntensity) {
    
    this.bloomIntensity = bloomIntensity;
    return this;
  }

   /**
   * Bloom intensity
   * @return bloomIntensity
  **/
  @javax.annotation.Nullable
  public BigDecimal getBloomIntensity() {
    return bloomIntensity;
  }


  public void setBloomIntensity(BigDecimal bloomIntensity) {
    this.bloomIntensity = bloomIntensity;
  }


  public PostProcessing vignetteIntensity(BigDecimal vignetteIntensity) {
    
    this.vignetteIntensity = vignetteIntensity;
    return this;
  }

   /**
   * Vignette intensity
   * @return vignetteIntensity
  **/
  @javax.annotation.Nullable
  public BigDecimal getVignetteIntensity() {
    return vignetteIntensity;
  }


  public void setVignetteIntensity(BigDecimal vignetteIntensity) {
    this.vignetteIntensity = vignetteIntensity;
  }


  public PostProcessing vignetteColor(Color vignetteColor) {
    
    this.vignetteColor = vignetteColor;
    return this;
  }

   /**
   * Get vignetteColor
   * @return vignetteColor
  **/
  @javax.annotation.Nullable
  public Color getVignetteColor() {
    return vignetteColor;
  }


  public void setVignetteColor(Color vignetteColor) {
    this.vignetteColor = vignetteColor;
  }


  public PostProcessing postExposure(BigDecimal postExposure) {
    
    this.postExposure = postExposure;
    return this;
  }

   /**
   * Post-exposure
   * @return postExposure
  **/
  @javax.annotation.Nullable
  public BigDecimal getPostExposure() {
    return postExposure;
  }


  public void setPostExposure(BigDecimal postExposure) {
    this.postExposure = postExposure;
  }


  public PostProcessing saturation(BigDecimal saturation) {
    
    this.saturation = saturation;
    return this;
  }

   /**
   * Saturation
   * @return saturation
  **/
  @javax.annotation.Nullable
  public BigDecimal getSaturation() {
    return saturation;
  }


  public void setSaturation(BigDecimal saturation) {
    this.saturation = saturation;
  }


  public PostProcessing hue(BigDecimal hue) {
    
    this.hue = hue;
    return this;
  }

   /**
   * Hue
   * @return hue
  **/
  @javax.annotation.Nullable
  public BigDecimal getHue() {
    return hue;
  }


  public void setHue(BigDecimal hue) {
    this.hue = hue;
  }


  public PostProcessing temperature(BigDecimal temperature) {
    
    this.temperature = temperature;
    return this;
  }

   /**
   * Temperature
   * @return temperature
  **/
  @javax.annotation.Nullable
  public BigDecimal getTemperature() {
    return temperature;
  }


  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }


  public PostProcessing sharpenEnabled(Boolean sharpenEnabled) {
    
    this.sharpenEnabled = sharpenEnabled;
    return this;
  }

   /**
   * Whether sharpen is enabled
   * @return sharpenEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getSharpenEnabled() {
    return sharpenEnabled;
  }


  public void setSharpenEnabled(Boolean sharpenEnabled) {
    this.sharpenEnabled = sharpenEnabled;
  }


  public PostProcessing blackBars(BigDecimal blackBars) {
    
    this.blackBars = blackBars;
    return this;
  }

   /**
   * Black bars
   * @return blackBars
  **/
  @javax.annotation.Nullable
  public BigDecimal getBlackBars() {
    return blackBars;
  }


  public void setBlackBars(BigDecimal blackBars) {
    this.blackBars = blackBars;
  }


  public PostProcessing scanLinesEnabled(Boolean scanLinesEnabled) {
    
    this.scanLinesEnabled = scanLinesEnabled;
    return this;
  }

   /**
   * Whether scan lines are enabled
   * @return scanLinesEnabled
  **/
  @javax.annotation.Nullable
  public Boolean getScanLinesEnabled() {
    return scanLinesEnabled;
  }


  public void setScanLinesEnabled(Boolean scanLinesEnabled) {
    this.scanLinesEnabled = scanLinesEnabled;
  }


  public PostProcessing scanlinesAmount(Integer scanlinesAmount) {
    
    this.scanlinesAmount = scanlinesAmount;
    return this;
  }

   /**
   * Scan lines amount
   * @return scanlinesAmount
  **/
  @javax.annotation.Nullable
  public Integer getScanlinesAmount() {
    return scanlinesAmount;
  }


  public void setScanlinesAmount(Integer scanlinesAmount) {
    this.scanlinesAmount = scanlinesAmount;
  }


  public PostProcessing scanlinesSpeed(BigDecimal scanlinesSpeed) {
    
    this.scanlinesSpeed = scanlinesSpeed;
    return this;
  }

   /**
   * Scan lines speed
   * @return scanlinesSpeed
  **/
  @javax.annotation.Nullable
  public BigDecimal getScanlinesSpeed() {
    return scanlinesSpeed;
  }


  public void setScanlinesSpeed(BigDecimal scanlinesSpeed) {
    this.scanlinesSpeed = scanlinesSpeed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostProcessing postProcessing = (PostProcessing) o;
    return Objects.equals(this.tiltShiftBlurAmount, postProcessing.tiltShiftBlurAmount) &&
        Objects.equals(this.edgeDetectionEnabled, postProcessing.edgeDetectionEnabled) &&
        Objects.equals(this.edgeDetectionColor, postProcessing.edgeDetectionColor) &&
        Objects.equals(this.ditheringThreshold, postProcessing.ditheringThreshold) &&
        Objects.equals(this.tubeDistortionStrength, postProcessing.tubeDistortionStrength) &&
        Objects.equals(this.pixelizationResolution, postProcessing.pixelizationResolution) &&
        Objects.equals(this.colorSplitStrength, postProcessing.colorSplitStrength) &&
        Objects.equals(this.waterRipplesStrength, postProcessing.waterRipplesStrength) &&
        Objects.equals(this.waterRipplesSpeed, postProcessing.waterRipplesSpeed) &&
        Objects.equals(this.sketchEnabled, postProcessing.sketchEnabled) &&
        Objects.equals(this.radialBlurAmount, postProcessing.radialBlurAmount) &&
        Objects.equals(this.bloomThreshhold, postProcessing.bloomThreshhold) &&
        Objects.equals(this.bloomIntensity, postProcessing.bloomIntensity) &&
        Objects.equals(this.vignetteIntensity, postProcessing.vignetteIntensity) &&
        Objects.equals(this.vignetteColor, postProcessing.vignetteColor) &&
        Objects.equals(this.postExposure, postProcessing.postExposure) &&
        Objects.equals(this.saturation, postProcessing.saturation) &&
        Objects.equals(this.hue, postProcessing.hue) &&
        Objects.equals(this.temperature, postProcessing.temperature) &&
        Objects.equals(this.sharpenEnabled, postProcessing.sharpenEnabled) &&
        Objects.equals(this.blackBars, postProcessing.blackBars) &&
        Objects.equals(this.scanLinesEnabled, postProcessing.scanLinesEnabled) &&
        Objects.equals(this.scanlinesAmount, postProcessing.scanlinesAmount) &&
        Objects.equals(this.scanlinesSpeed, postProcessing.scanlinesSpeed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tiltShiftBlurAmount, edgeDetectionEnabled, edgeDetectionColor, ditheringThreshold, tubeDistortionStrength, pixelizationResolution, colorSplitStrength, waterRipplesStrength, waterRipplesSpeed, sketchEnabled, radialBlurAmount, bloomThreshhold, bloomIntensity, vignetteIntensity, vignetteColor, postExposure, saturation, hue, temperature, sharpenEnabled, blackBars, scanLinesEnabled, scanlinesAmount, scanlinesSpeed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostProcessing {\n");
    sb.append("    tiltShiftBlurAmount: ").append(toIndentedString(tiltShiftBlurAmount)).append("\n");
    sb.append("    edgeDetectionEnabled: ").append(toIndentedString(edgeDetectionEnabled)).append("\n");
    sb.append("    edgeDetectionColor: ").append(toIndentedString(edgeDetectionColor)).append("\n");
    sb.append("    ditheringThreshold: ").append(toIndentedString(ditheringThreshold)).append("\n");
    sb.append("    tubeDistortionStrength: ").append(toIndentedString(tubeDistortionStrength)).append("\n");
    sb.append("    pixelizationResolution: ").append(toIndentedString(pixelizationResolution)).append("\n");
    sb.append("    colorSplitStrength: ").append(toIndentedString(colorSplitStrength)).append("\n");
    sb.append("    waterRipplesStrength: ").append(toIndentedString(waterRipplesStrength)).append("\n");
    sb.append("    waterRipplesSpeed: ").append(toIndentedString(waterRipplesSpeed)).append("\n");
    sb.append("    sketchEnabled: ").append(toIndentedString(sketchEnabled)).append("\n");
    sb.append("    radialBlurAmount: ").append(toIndentedString(radialBlurAmount)).append("\n");
    sb.append("    bloomThreshhold: ").append(toIndentedString(bloomThreshhold)).append("\n");
    sb.append("    bloomIntensity: ").append(toIndentedString(bloomIntensity)).append("\n");
    sb.append("    vignetteIntensity: ").append(toIndentedString(vignetteIntensity)).append("\n");
    sb.append("    vignetteColor: ").append(toIndentedString(vignetteColor)).append("\n");
    sb.append("    postExposure: ").append(toIndentedString(postExposure)).append("\n");
    sb.append("    saturation: ").append(toIndentedString(saturation)).append("\n");
    sb.append("    hue: ").append(toIndentedString(hue)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    sharpenEnabled: ").append(toIndentedString(sharpenEnabled)).append("\n");
    sb.append("    blackBars: ").append(toIndentedString(blackBars)).append("\n");
    sb.append("    scanLinesEnabled: ").append(toIndentedString(scanLinesEnabled)).append("\n");
    sb.append("    scanlinesAmount: ").append(toIndentedString(scanlinesAmount)).append("\n");
    sb.append("    scanlinesSpeed: ").append(toIndentedString(scanlinesSpeed)).append("\n");
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
    openapiFields.add("tiltShiftBlurAmount");
    openapiFields.add("edgeDetectionEnabled");
    openapiFields.add("edgeDetectionColor");
    openapiFields.add("ditheringThreshold");
    openapiFields.add("tubeDistortionStrength");
    openapiFields.add("pixelizationResolution");
    openapiFields.add("colorSplitStrength");
    openapiFields.add("waterRipplesStrength");
    openapiFields.add("waterRipplesSpeed");
    openapiFields.add("sketchEnabled");
    openapiFields.add("radialBlurAmount");
    openapiFields.add("bloomThreshhold");
    openapiFields.add("bloomIntensity");
    openapiFields.add("vignetteIntensity");
    openapiFields.add("vignetteColor");
    openapiFields.add("postExposure");
    openapiFields.add("saturation");
    openapiFields.add("hue");
    openapiFields.add("temperature");
    openapiFields.add("sharpenEnabled");
    openapiFields.add("blackBars");
    openapiFields.add("ScanLinesEnabled");
    openapiFields.add("scanlinesAmount");
    openapiFields.add("scanlinesSpeed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PostProcessing
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PostProcessing.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostProcessing is not found in the empty JSON string", PostProcessing.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PostProcessing.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostProcessing` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `edgeDetectionColor`
      if (jsonObj.get("edgeDetectionColor") != null && !jsonObj.get("edgeDetectionColor").isJsonNull()) {
        Color.validateJsonElement(jsonObj.get("edgeDetectionColor"));
      }
      // validate the optional field `vignetteColor`
      if (jsonObj.get("vignetteColor") != null && !jsonObj.get("vignetteColor").isJsonNull()) {
        Color.validateJsonElement(jsonObj.get("vignetteColor"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostProcessing.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostProcessing' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostProcessing> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostProcessing.class));

       return (TypeAdapter<T>) new TypeAdapter<PostProcessing>() {
           @Override
           public void write(JsonWriter out, PostProcessing value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostProcessing read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostProcessing given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostProcessing
  * @throws IOException if the JSON string is invalid with respect to PostProcessing
  */
  public static PostProcessing fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostProcessing.class);
  }

 /**
  * Convert an instance of PostProcessing to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

