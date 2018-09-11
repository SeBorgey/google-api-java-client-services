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

package com.google.container.v1beta1.model;

/**
 * StatusCondition describes why a cluster or a node pool has a certain status (e.g., ERROR or
 * DEGRADED).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StatusCondition extends com.google.api.client.json.GenericJson {

  /**
   * Machine-friendly representation of the condition
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * Human-friendly representation of the condition
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * Machine-friendly representation of the condition
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * Machine-friendly representation of the condition
   * @param code code or {@code null} for none
   */
  public StatusCondition setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * Human-friendly representation of the condition
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Human-friendly representation of the condition
   * @param message message or {@code null} for none
   */
  public StatusCondition setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  @Override
  public StatusCondition set(String fieldName, Object value) {
    return (StatusCondition) super.set(fieldName, value);
  }

  @Override
  public StatusCondition clone() {
    return (StatusCondition) super.clone();
  }

}
