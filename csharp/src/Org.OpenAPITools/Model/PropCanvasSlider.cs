/*
 * The RPG Engine API
 *
 * Requires The RPG Engine to be running locally.
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// PropCanvasSlider
    /// </summary>
    [DataContract(Name = "PropCanvasSlider")]
    public partial class PropCanvasSlider : IEquatable<PropCanvasSlider>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PropCanvasSlider" /> class.
        /// </summary>
        /// <param name="varVersion">The version of the canvas slider data.</param>
        /// <param name="guid">A uniquie identifier.</param>
        /// <param name="title">The title of the canvas slider.</param>
        /// <param name="color">color.</param>
        /// <param name="current">The current value of the canvas slider.</param>
        /// <param name="max">The maximum value of the canvas slider.</param>
        /// <param name="isVisible">Whether the canvas slider is visible.</param>
        public PropCanvasSlider(int varVersion = default(int), string guid = default(string), string title = default(string), Color color = default(Color), decimal current = default(decimal), decimal max = default(decimal), bool isVisible = default(bool))
        {
            this.VarVersion = varVersion;
            this.Guid = guid;
            this.Title = title;
            this.Color = color;
            this.Current = current;
            this.Max = max;
            this.IsVisible = isVisible;
        }

        /// <summary>
        /// The version of the canvas slider data
        /// </summary>
        /// <value>The version of the canvas slider data</value>
        [DataMember(Name = "version", EmitDefaultValue = false)]
        public int VarVersion { get; set; }

        /// <summary>
        /// A uniquie identifier
        /// </summary>
        /// <value>A uniquie identifier</value>
        /// <example>70bf4e8b-f720-4ed0-967a-d66b53ac34b8</example>
        [DataMember(Name = "guid", EmitDefaultValue = false)]
        public string Guid { get; set; }

        /// <summary>
        /// The title of the canvas slider
        /// </summary>
        /// <value>The title of the canvas slider</value>
        [DataMember(Name = "title", EmitDefaultValue = false)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets Color
        /// </summary>
        [DataMember(Name = "color", EmitDefaultValue = false)]
        public Color Color { get; set; }

        /// <summary>
        /// The current value of the canvas slider
        /// </summary>
        /// <value>The current value of the canvas slider</value>
        [DataMember(Name = "current", EmitDefaultValue = false)]
        public decimal Current { get; set; }

        /// <summary>
        /// The maximum value of the canvas slider
        /// </summary>
        /// <value>The maximum value of the canvas slider</value>
        [DataMember(Name = "max", EmitDefaultValue = false)]
        public decimal Max { get; set; }

        /// <summary>
        /// Whether the canvas slider is visible
        /// </summary>
        /// <value>Whether the canvas slider is visible</value>
        [DataMember(Name = "isVisible", EmitDefaultValue = true)]
        public bool IsVisible { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PropCanvasSlider {\n");
            sb.Append("  VarVersion: ").Append(VarVersion).Append("\n");
            sb.Append("  Guid: ").Append(Guid).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Color: ").Append(Color).Append("\n");
            sb.Append("  Current: ").Append(Current).Append("\n");
            sb.Append("  Max: ").Append(Max).Append("\n");
            sb.Append("  IsVisible: ").Append(IsVisible).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as PropCanvasSlider);
        }

        /// <summary>
        /// Returns true if PropCanvasSlider instances are equal
        /// </summary>
        /// <param name="input">Instance of PropCanvasSlider to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PropCanvasSlider input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.VarVersion == input.VarVersion ||
                    this.VarVersion.Equals(input.VarVersion)
                ) && 
                (
                    this.Guid == input.Guid ||
                    (this.Guid != null &&
                    this.Guid.Equals(input.Guid))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.Color == input.Color ||
                    (this.Color != null &&
                    this.Color.Equals(input.Color))
                ) && 
                (
                    this.Current == input.Current ||
                    this.Current.Equals(input.Current)
                ) && 
                (
                    this.Max == input.Max ||
                    this.Max.Equals(input.Max)
                ) && 
                (
                    this.IsVisible == input.IsVisible ||
                    this.IsVisible.Equals(input.IsVisible)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = (hashCode * 59) + this.VarVersion.GetHashCode();
                if (this.Guid != null)
                {
                    hashCode = (hashCode * 59) + this.Guid.GetHashCode();
                }
                if (this.Title != null)
                {
                    hashCode = (hashCode * 59) + this.Title.GetHashCode();
                }
                if (this.Color != null)
                {
                    hashCode = (hashCode * 59) + this.Color.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Current.GetHashCode();
                hashCode = (hashCode * 59) + this.Max.GetHashCode();
                hashCode = (hashCode * 59) + this.IsVisible.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
