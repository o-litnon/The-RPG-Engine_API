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
    /// ControllableIndividualValueInner
    /// </summary>
    [DataContract(Name = "Controllable_individual_value_inner")]
    public partial class ControllableIndividualValueInner : IEquatable<ControllableIndividualValueInner>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ControllableIndividualValueInner" /> class.
        /// </summary>
        /// <param name="uintValue">The unsigned integer value.</param>
        /// <param name="stringValue">The string value.</param>
        public ControllableIndividualValueInner(int uintValue = default(int), string stringValue = default(string))
        {
            this.UintValue = uintValue;
            this.StringValue = stringValue;
        }

        /// <summary>
        /// The unsigned integer value
        /// </summary>
        /// <value>The unsigned integer value</value>
        [DataMember(Name = "uintValue", EmitDefaultValue = false)]
        public int UintValue { get; set; }

        /// <summary>
        /// The string value
        /// </summary>
        /// <value>The string value</value>
        [DataMember(Name = "stringValue", EmitDefaultValue = false)]
        public string StringValue { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ControllableIndividualValueInner {\n");
            sb.Append("  UintValue: ").Append(UintValue).Append("\n");
            sb.Append("  StringValue: ").Append(StringValue).Append("\n");
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
            return this.Equals(input as ControllableIndividualValueInner);
        }

        /// <summary>
        /// Returns true if ControllableIndividualValueInner instances are equal
        /// </summary>
        /// <param name="input">Instance of ControllableIndividualValueInner to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ControllableIndividualValueInner input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.UintValue == input.UintValue ||
                    this.UintValue.Equals(input.UintValue)
                ) && 
                (
                    this.StringValue == input.StringValue ||
                    (this.StringValue != null &&
                    this.StringValue.Equals(input.StringValue))
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
                hashCode = (hashCode * 59) + this.UintValue.GetHashCode();
                if (this.StringValue != null)
                {
                    hashCode = (hashCode * 59) + this.StringValue.GetHashCode();
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
