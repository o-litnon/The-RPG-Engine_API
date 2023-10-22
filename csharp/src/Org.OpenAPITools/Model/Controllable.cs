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
    /// Controllable
    /// </summary>
    [DataContract(Name = "Controllable")]
    public partial class Controllable : IEquatable<Controllable>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Controllable" /> class.
        /// </summary>
        /// <param name="individual">A dictionary mapping string keys to lists of (uint, string) pairs.</param>
        /// <param name="all">A set of string values.</param>
        public Controllable(Dictionary<string, List<ControllableIndividualValueInner>> individual = default(Dictionary<string, List<ControllableIndividualValueInner>>), List<string> all = default(List<string>))
        {
            this.Individual = individual;
            this.All = all;
        }

        /// <summary>
        /// A dictionary mapping string keys to lists of (uint, string) pairs
        /// </summary>
        /// <value>A dictionary mapping string keys to lists of (uint, string) pairs</value>
        [DataMember(Name = "individual", EmitDefaultValue = false)]
        public Dictionary<string, List<ControllableIndividualValueInner>> Individual { get; set; }

        /// <summary>
        /// A set of string values
        /// </summary>
        /// <value>A set of string values</value>
        [DataMember(Name = "all", EmitDefaultValue = false)]
        public List<string> All { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Controllable {\n");
            sb.Append("  Individual: ").Append(Individual).Append("\n");
            sb.Append("  All: ").Append(All).Append("\n");
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
            return this.Equals(input as Controllable);
        }

        /// <summary>
        /// Returns true if Controllable instances are equal
        /// </summary>
        /// <param name="input">Instance of Controllable to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Controllable input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Individual == input.Individual ||
                    this.Individual != null &&
                    input.Individual != null &&
                    this.Individual.SequenceEqual(input.Individual)
                ) && 
                (
                    this.All == input.All ||
                    this.All != null &&
                    input.All != null &&
                    this.All.SequenceEqual(input.All)
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
                if (this.Individual != null)
                {
                    hashCode = (hashCode * 59) + this.Individual.GetHashCode();
                }
                if (this.All != null)
                {
                    hashCode = (hashCode * 59) + this.All.GetHashCode();
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