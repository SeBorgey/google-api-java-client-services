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

package com.google.api.services.compute.model;

/**
 * Model definition for GlobalSetLabelsRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GlobalSetLabelsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The
   * fingerprint is initially generated by Compute Engine and changes after every request to modify
   * or update labels. You must always provide an up-to-date fingerprint hash when updating or
   * changing labels, otherwise the request will fail with error 412 conditionNotMet. Make a get()
   * request to the resource to get the latest fingerprint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelFingerprint;

  /**
   * A list of labels to apply for this resource. Each label key & value must comply with RFC1035.
   * Specifically, the name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and
   * all following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash. For example, "webserver-frontend": "images". A label value can also be
   * empty (e.g. "my-label": "").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The
   * fingerprint is initially generated by Compute Engine and changes after every request to modify
   * or update labels. You must always provide an up-to-date fingerprint hash when updating or
   * changing labels, otherwise the request will fail with error 412 conditionNotMet. Make a get()
   * request to the resource to get the latest fingerprint.
   * @see #decodeLabelFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelFingerprint() {
    return labelFingerprint;
  }

  /**
   * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The
   * fingerprint is initially generated by Compute Engine and changes after every request to modify
   * or update labels. You must always provide an up-to-date fingerprint hash when updating or
   * changing labels, otherwise the request will fail with error 412 conditionNotMet. Make a get()
   * request to the resource to get the latest fingerprint.
   * @see #getLabelFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeLabelFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(labelFingerprint);
  }

  /**
   * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The
   * fingerprint is initially generated by Compute Engine and changes after every request to modify
   * or update labels. You must always provide an up-to-date fingerprint hash when updating or
   * changing labels, otherwise the request will fail with error 412 conditionNotMet. Make a get()
   * request to the resource to get the latest fingerprint.
   * @see #encodeLabelFingerprint()
   * @param labelFingerprint labelFingerprint or {@code null} for none
   */
  public GlobalSetLabelsRequest setLabelFingerprint(java.lang.String labelFingerprint) {
    this.labelFingerprint = labelFingerprint;
    return this;
  }

  /**
   * The fingerprint of the previous set of labels for this resource, used to detect conflicts. The
   * fingerprint is initially generated by Compute Engine and changes after every request to modify
   * or update labels. You must always provide an up-to-date fingerprint hash when updating or
   * changing labels, otherwise the request will fail with error 412 conditionNotMet. Make a get()
   * request to the resource to get the latest fingerprint.
   * @see #setLabelFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public GlobalSetLabelsRequest encodeLabelFingerprint(byte[] labelFingerprint) {
    this.labelFingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(labelFingerprint);
    return this;
  }

  /**
   * A list of labels to apply for this resource. Each label key & value must comply with RFC1035.
   * Specifically, the name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and
   * all following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash. For example, "webserver-frontend": "images". A label value can also be
   * empty (e.g. "my-label": "").
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * A list of labels to apply for this resource. Each label key & value must comply with RFC1035.
   * Specifically, the name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and
   * all following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash. For example, "webserver-frontend": "images". A label value can also be
   * empty (e.g. "my-label": "").
   * @param labels labels or {@code null} for none
   */
  public GlobalSetLabelsRequest setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  @Override
  public GlobalSetLabelsRequest set(String fieldName, Object value) {
    return (GlobalSetLabelsRequest) super.set(fieldName, value);
  }

  @Override
  public GlobalSetLabelsRequest clone() {
    return (GlobalSetLabelsRequest) super.clone();
  }

}