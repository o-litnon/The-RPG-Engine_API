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
    /// CutoutSettingsData
    /// </summary>
    [DataContract(Name = "CutoutSettingsData")]
    public partial class CutoutSettingsData : IEquatable<CutoutSettingsData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CutoutSettingsData" /> class.
        /// </summary>
        /// <param name="enabled">Whether cutout is enabled.</param>
        /// <param name="hideFloor">Whether to hide the floor.</param>
        /// <param name="position">position.</param>
        /// <param name="rotation">rotation.</param>
        /// <param name="scale">scale.</param>
        public CutoutSettingsData(bool enabled = default(bool), bool hideFloor = default(bool), Vector3 position = default(Vector3), Quaternion rotation = default(Quaternion), Vector3 scale = default(Vector3))
        {
            this.Enabled = enabled;
            this.HideFloor = hideFloor;
            this.Position = position;
            this.Rotation = rotation;
            this.Scale = scale;
        }

        /// <summary>
        /// Whether cutout is enabled
        /// </summary>
        /// <value>Whether cutout is enabled</value>
        [DataMember(Name = "enabled", EmitDefaultValue = true)]
        public bool Enabled { get; set; }

        /// <summary>
        /// Whether to hide the floor
        /// </summary>
        /// <value>Whether to hide the floor</value>
        [DataMember(Name = "hideFloor", EmitDefaultValue = true)]
        public bool HideFloor { get; set; }

        /// <summary>
        /// Gets or Sets Position
        /// </summary>
        [DataMember(Name = "position", EmitDefaultValue = false)]
        public Vector3 Position { get; set; }

        /// <summary>
        /// Gets or Sets Rotation
        /// </summary>
        [DataMember(Name = "rotation", EmitDefaultValue = false)]
        public Quaternion Rotation { get; set; }

        /// <summary>
        /// Gets or Sets Scale
        /// </summary>
        [DataMember(Name = "scale", EmitDefaultValue = false)]
        public Vector3 Scale { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CutoutSettingsData {\n");
            sb.Append("  Enabled: ").Append(Enabled).Append("\n");
            sb.Append("  HideFloor: ").Append(HideFloor).Append("\n");
            sb.Append("  Position: ").Append(Position).Append("\n");
            sb.Append("  Rotation: ").Append(Rotation).Append("\n");
            sb.Append("  Scale: ").Append(Scale).Append("\n");
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
            return this.Equals(input as CutoutSettingsData);
        }

        /// <summary>
        /// Returns true if CutoutSettingsData instances are equal
        /// </summary>
        /// <param name="input">Instance of CutoutSettingsData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CutoutSettingsData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Enabled == input.Enabled ||
                    this.Enabled.Equals(input.Enabled)
                ) && 
                (
                    this.HideFloor == input.HideFloor ||
                    this.HideFloor.Equals(input.HideFloor)
                ) && 
                (
                    this.Position == input.Position ||
                    (this.Position != null &&
                    this.Position.Equals(input.Position))
                ) && 
                (
                    this.Rotation == input.Rotation ||
                    (this.Rotation != null &&
                    this.Rotation.Equals(input.Rotation))
                ) && 
                (
                    this.Scale == input.Scale ||
                    (this.Scale != null &&
                    this.Scale.Equals(input.Scale))
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
                hashCode = (hashCode * 59) + this.Enabled.GetHashCode();
                hashCode = (hashCode * 59) + this.HideFloor.GetHashCode();
                if (this.Position != null)
                {
                    hashCode = (hashCode * 59) + this.Position.GetHashCode();
                }
                if (this.Rotation != null)
                {
                    hashCode = (hashCode * 59) + this.Rotation.GetHashCode();
                }
                if (this.Scale != null)
                {
                    hashCode = (hashCode * 59) + this.Scale.GetHashCode();
                }
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
