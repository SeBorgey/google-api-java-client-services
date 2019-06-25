/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.tagmanager.model;

/**
 * Represents a predicate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Condition extends com.google.api.client.json.GenericJson {

  /**
   * A list of named parameters (key/value), depending on the condition's type. Notes: For binary
   * operators, include parameters named arg0 and    arg1 for specifying the left and right
   * operands,    respectively. At this time, the left operand (arg0) must be a reference     to a
   * variable. For case-insensitive Regex matching, include a boolean parameter named
   * ignore_case that is set to true.     If not specified or set to any other value, the matching
   * will be case     sensitive. To negate an operator, include a boolean parameter named     negate
   * boolean parameter that is set to true.
   *
   * @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable
   * tagmanager.accounts.containers.workspaces.triggers.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Parameter> parameter;

  /**
   * The type of operator for this condition. @mutable
   * tagmanager.accounts.containers.workspaces.triggers.create @mutable
   * tagmanager.accounts.containers.workspaces.triggers.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * A list of named parameters (key/value), depending on the condition's type. Notes: For binary
   * operators, include parameters named arg0 and    arg1 for specifying the left and right
   * operands,    respectively. At this time, the left operand (arg0) must be a reference     to a
   * variable. For case-insensitive Regex matching, include a boolean parameter named
   * ignore_case that is set to true.     If not specified or set to any other value, the matching
   * will be case     sensitive. To negate an operator, include a boolean parameter named     negate
   * boolean parameter that is set to true.
   *
   * @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable
   * tagmanager.accounts.containers.workspaces.triggers.update
   * @return value or {@code null} for none
   */
  public java.util.List<Parameter> getParameter() {
    return parameter;
  }

  /**
   * A list of named parameters (key/value), depending on the condition's type. Notes: For binary
   * operators, include parameters named arg0 and    arg1 for specifying the left and right
   * operands,    respectively. At this time, the left operand (arg0) must be a reference     to a
   * variable. For case-insensitive Regex matching, include a boolean parameter named
   * ignore_case that is set to true.     If not specified or set to any other value, the matching
   * will be case     sensitive. To negate an operator, include a boolean parameter named     negate
   * boolean parameter that is set to true.
   *
   * @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable
   * tagmanager.accounts.containers.workspaces.triggers.update
   * @param parameter parameter or {@code null} for none
   */
  public Condition setParameter(java.util.List<Parameter> parameter) {
    this.parameter = parameter;
    return this;
  }

  /**
   * The type of operator for this condition. @mutable
   * tagmanager.accounts.containers.workspaces.triggers.create @mutable
   * tagmanager.accounts.containers.workspaces.triggers.update
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of operator for this condition. @mutable
   * tagmanager.accounts.containers.workspaces.triggers.create @mutable
   * tagmanager.accounts.containers.workspaces.triggers.update
   * @param type type or {@code null} for none
   */
  public Condition setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Condition set(String fieldName, Object value) {
    return (Condition) super.set(fieldName, value);
  }

  @Override
  public Condition clone() {
    return (Condition) super.clone();
  }

}