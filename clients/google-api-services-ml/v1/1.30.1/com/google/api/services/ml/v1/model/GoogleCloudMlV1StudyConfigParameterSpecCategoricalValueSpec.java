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

package com.google.api.services.ml.v1.model;

/**
 * Model definition for GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AI Platform Training & Prediction API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec extends com.google.api.client.json.GenericJson {

  /**
   * Must be specified if type is `CATEGORICAL`. The list of possible categories.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> values;

  /**
   * Must be specified if type is `CATEGORICAL`. The list of possible categories.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getValues() {
    return values;
  }

  /**
   * Must be specified if type is `CATEGORICAL`. The list of possible categories.
   * @param values values or {@code null} for none
   */
  public GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec setValues(java.util.List<java.lang.String> values) {
    this.values = values;
    return this;
  }

  @Override
  public GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec set(String fieldName, Object value) {
    return (GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec clone() {
    return (GoogleCloudMlV1StudyConfigParameterSpecCategoricalValueSpec) super.clone();
  }

}
