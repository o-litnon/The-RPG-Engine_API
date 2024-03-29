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
    /// Vector4
    /// </summary>
    [DataContract(Name = "Vector4")]
    public partial class Vector4 : IEquatable<Vector4>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Vector4" /> class.
        /// </summary>
        /// <param name="x">X-coordinate.</param>
        /// <param name="y">Y-coordinate.</param>
        /// <param name="z">Z-coordinate.</param>
        /// <param name="w">W-coordinate.</param>
        public Vector4(decimal x = default(decimal), decimal y = default(decimal), decimal z = default(decimal), decimal w = default(decimal))
        {
            this.X = x;
            this.Y = y;
            this.Z = z;
            this.W = w;
        }

        /// <summary>
        /// X-coordinate
        /// </summary>
        /// <value>X-coordinate</value>
        [DataMember(Name = "x", EmitDefaultValue = false)]
        public decimal X { get; set; }

        /// <summary>
        /// Y-coordinate
        /// </summary>
        /// <value>Y-coordinate</value>
        [DataMember(Name = "y", EmitDefaultValue = false)]
        public decimal Y { get; set; }

        /// <summary>
        /// Z-coordinate
        /// </summary>
        /// <value>Z-coordinate</value>
        [DataMember(Name = "z", EmitDefaultValue = false)]
        public decimal Z { get; set; }

        /// <summary>
        /// W-coordinate
        /// </summary>
        /// <value>W-coordinate</value>
        [DataMember(Name = "w", EmitDefaultValue = false)]
        public decimal W { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Vector4 {\n");
            sb.Append("  X: ").Append(X).Append("\n");
            sb.Append("  Y: ").Append(Y).Append("\n");
            sb.Append("  Z: ").Append(Z).Append("\n");
            sb.Append("  W: ").Append(W).Append("\n");
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
            return this.Equals(input as Vector4);
        }

        /// <summary>
        /// Returns true if Vector4 instances are equal
        /// </summary>
        /// <param name="input">Instance of Vector4 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Vector4 input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.X == input.X ||
                    this.X.Equals(input.X)
                ) && 
                (
                    this.Y == input.Y ||
                    this.Y.Equals(input.Y)
                ) && 
                (
                    this.Z == input.Z ||
                    this.Z.Equals(input.Z)
                ) && 
                (
                    this.W == input.W ||
                    this.W.Equals(input.W)
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
                hashCode = (hashCode * 59) + this.X.GetHashCode();
                hashCode = (hashCode * 59) + this.Y.GetHashCode();
                hashCode = (hashCode * 59) + this.Z.GetHashCode();
                hashCode = (hashCode * 59) + this.W.GetHashCode();
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
