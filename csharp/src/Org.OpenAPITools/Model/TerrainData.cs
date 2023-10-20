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
    /// TerrainData
    /// </summary>
    [DataContract(Name = "TerrainData")]
    public partial class TerrainData : IEquatable<TerrainData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TerrainData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TerrainData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TerrainData" /> class.
        /// </summary>
        /// <param name="extendNavOverEdge">The constant value for extending navigation over the edge.</param>
        /// <param name="isSculptable">Whether the terrain is sculptable.</param>
        /// <param name="size">size (required).</param>
        /// <param name="baseHeight">The base height of the terrain.</param>
        /// <param name="baseColor">baseColor.</param>
        public TerrainData(int extendNavOverEdge = default(int), bool isSculptable = default(bool), Vector3Int size = default(Vector3Int), decimal baseHeight = default(decimal), Color baseColor = default(Color))
        {
            // to ensure "size" is required (not null)
            if (size == null)
            {
                throw new ArgumentNullException("size is a required property for TerrainData and cannot be null");
            }
            this.Size = size;
            this.ExtendNavOverEdge = extendNavOverEdge;
            this.IsSculptable = isSculptable;
            this.BaseHeight = baseHeight;
            this.BaseColor = baseColor;
        }

        /// <summary>
        /// The constant value for extending navigation over the edge
        /// </summary>
        /// <value>The constant value for extending navigation over the edge</value>
        [DataMember(Name = "extendNavOverEdge", EmitDefaultValue = false)]
        public int ExtendNavOverEdge { get; set; }

        /// <summary>
        /// Whether the terrain is sculptable
        /// </summary>
        /// <value>Whether the terrain is sculptable</value>
        [DataMember(Name = "isSculptable", EmitDefaultValue = true)]
        public bool IsSculptable { get; set; }

        /// <summary>
        /// Gets or Sets Size
        /// </summary>
        [DataMember(Name = "size", IsRequired = true, EmitDefaultValue = true)]
        public Vector3Int Size { get; set; }

        /// <summary>
        /// The base height of the terrain
        /// </summary>
        /// <value>The base height of the terrain</value>
        /// <example>10</example>
        [DataMember(Name = "baseHeight", EmitDefaultValue = false)]
        public decimal BaseHeight { get; set; }

        /// <summary>
        /// Gets or Sets BaseColor
        /// </summary>
        [DataMember(Name = "baseColor", EmitDefaultValue = false)]
        public Color BaseColor { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TerrainData {\n");
            sb.Append("  ExtendNavOverEdge: ").Append(ExtendNavOverEdge).Append("\n");
            sb.Append("  IsSculptable: ").Append(IsSculptable).Append("\n");
            sb.Append("  Size: ").Append(Size).Append("\n");
            sb.Append("  BaseHeight: ").Append(BaseHeight).Append("\n");
            sb.Append("  BaseColor: ").Append(BaseColor).Append("\n");
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
            return this.Equals(input as TerrainData);
        }

        /// <summary>
        /// Returns true if TerrainData instances are equal
        /// </summary>
        /// <param name="input">Instance of TerrainData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TerrainData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ExtendNavOverEdge == input.ExtendNavOverEdge ||
                    this.ExtendNavOverEdge.Equals(input.ExtendNavOverEdge)
                ) && 
                (
                    this.IsSculptable == input.IsSculptable ||
                    this.IsSculptable.Equals(input.IsSculptable)
                ) && 
                (
                    this.Size == input.Size ||
                    (this.Size != null &&
                    this.Size.Equals(input.Size))
                ) && 
                (
                    this.BaseHeight == input.BaseHeight ||
                    this.BaseHeight.Equals(input.BaseHeight)
                ) && 
                (
                    this.BaseColor == input.BaseColor ||
                    (this.BaseColor != null &&
                    this.BaseColor.Equals(input.BaseColor))
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
                hashCode = (hashCode * 59) + this.ExtendNavOverEdge.GetHashCode();
                hashCode = (hashCode * 59) + this.IsSculptable.GetHashCode();
                if (this.Size != null)
                {
                    hashCode = (hashCode * 59) + this.Size.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.BaseHeight.GetHashCode();
                if (this.BaseColor != null)
                {
                    hashCode = (hashCode * 59) + this.BaseColor.GetHashCode();
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
