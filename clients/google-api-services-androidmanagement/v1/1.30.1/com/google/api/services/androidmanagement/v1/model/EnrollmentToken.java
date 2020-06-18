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

package com.google.api.services.androidmanagement.v1.model;

/**
 * An enrollment token.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnrollmentToken extends com.google.api.client.json.GenericJson {

  /**
   * Optional, arbitrary data associated with the enrollment token. This could contain, for example,
   * the ID of an org unit the device is assigned to after enrollment. After a device enrolls with
   * the token, this data will be exposed in the enrollment_token_data field of the Device resource.
   * The data must be 1024 characters or less; otherwise, the creation request will fail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String additionalData;

  /**
   * Controls personal usage on devices provisioned using this enrollment token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String allowPersonalUsage;

  /**
   * The length of time the enrollment token is valid, ranging from 1 minute to 30 days. If not
   * specified, the default duration is 1 hour.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * The expiration time of the token. This is a read-only field generated by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expirationTimestamp;

  /**
   * The name of the enrollment token, which is generated by the server during creation, in the form
   * enterprises/{enterpriseId}/enrollmentTokens/{enrollmentTokenId}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Whether the enrollment token is for one time use only. If the flag is set to true, only one
   * device can use it for registration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean oneTimeOnly;

  /**
   * The name of the policy initially applied to the enrolled device, in the form
   * enterprises/{enterpriseId}/policies/{policyId}. If not specified, the policy_name for the
   * device’s user is applied. If user_name is also not specified,
   * enterprises/{enterpriseId}/policies/default is applied by default. When updating this field,
   * you can specify only the policyId as long as the policyId doesn’t contain any slashes. The rest
   * of the policy name will be inferred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String policyName;

  /**
   * A JSON string whose UTF-8 representation can be used to generate a QR code to enroll a device
   * with this enrollment token. To enroll a device using NFC, the NFC record must contain a
   * serialized java.util.Properties representation of the properties in the JSON.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String qrCode;

  /**
   * The user associated with this enrollment token. If it's specified when the enrollment token is
   * created and the user does not exist, the user will be created. This field must not contain
   * personally identifiable information. Only the account_identifier field needs to be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private User user;

  /**
   * The token value that's passed to the device and authorizes the device to enroll. This is a
   * read-only field generated by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Optional, arbitrary data associated with the enrollment token. This could contain, for example,
   * the ID of an org unit the device is assigned to after enrollment. After a device enrolls with
   * the token, this data will be exposed in the enrollment_token_data field of the Device resource.
   * The data must be 1024 characters or less; otherwise, the creation request will fail.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdditionalData() {
    return additionalData;
  }

  /**
   * Optional, arbitrary data associated with the enrollment token. This could contain, for example,
   * the ID of an org unit the device is assigned to after enrollment. After a device enrolls with
   * the token, this data will be exposed in the enrollment_token_data field of the Device resource.
   * The data must be 1024 characters or less; otherwise, the creation request will fail.
   * @param additionalData additionalData or {@code null} for none
   */
  public EnrollmentToken setAdditionalData(java.lang.String additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  /**
   * Controls personal usage on devices provisioned using this enrollment token.
   * @return value or {@code null} for none
   */
  public java.lang.String getAllowPersonalUsage() {
    return allowPersonalUsage;
  }

  /**
   * Controls personal usage on devices provisioned using this enrollment token.
   * @param allowPersonalUsage allowPersonalUsage or {@code null} for none
   */
  public EnrollmentToken setAllowPersonalUsage(java.lang.String allowPersonalUsage) {
    this.allowPersonalUsage = allowPersonalUsage;
    return this;
  }

  /**
   * The length of time the enrollment token is valid, ranging from 1 minute to 30 days. If not
   * specified, the default duration is 1 hour.
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * The length of time the enrollment token is valid, ranging from 1 minute to 30 days. If not
   * specified, the default duration is 1 hour.
   * @param duration duration or {@code null} for none
   */
  public EnrollmentToken setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * The expiration time of the token. This is a read-only field generated by the server.
   * @return value or {@code null} for none
   */
  public String getExpirationTimestamp() {
    return expirationTimestamp;
  }

  /**
   * The expiration time of the token. This is a read-only field generated by the server.
   * @param expirationTimestamp expirationTimestamp or {@code null} for none
   */
  public EnrollmentToken setExpirationTimestamp(String expirationTimestamp) {
    this.expirationTimestamp = expirationTimestamp;
    return this;
  }

  /**
   * The name of the enrollment token, which is generated by the server during creation, in the form
   * enterprises/{enterpriseId}/enrollmentTokens/{enrollmentTokenId}.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the enrollment token, which is generated by the server during creation, in the form
   * enterprises/{enterpriseId}/enrollmentTokens/{enrollmentTokenId}.
   * @param name name or {@code null} for none
   */
  public EnrollmentToken setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Whether the enrollment token is for one time use only. If the flag is set to true, only one
   * device can use it for registration.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOneTimeOnly() {
    return oneTimeOnly;
  }

  /**
   * Whether the enrollment token is for one time use only. If the flag is set to true, only one
   * device can use it for registration.
   * @param oneTimeOnly oneTimeOnly or {@code null} for none
   */
  public EnrollmentToken setOneTimeOnly(java.lang.Boolean oneTimeOnly) {
    this.oneTimeOnly = oneTimeOnly;
    return this;
  }

  /**
   * The name of the policy initially applied to the enrolled device, in the form
   * enterprises/{enterpriseId}/policies/{policyId}. If not specified, the policy_name for the
   * device’s user is applied. If user_name is also not specified,
   * enterprises/{enterpriseId}/policies/default is applied by default. When updating this field,
   * you can specify only the policyId as long as the policyId doesn’t contain any slashes. The rest
   * of the policy name will be inferred.
   * @return value or {@code null} for none
   */
  public java.lang.String getPolicyName() {
    return policyName;
  }

  /**
   * The name of the policy initially applied to the enrolled device, in the form
   * enterprises/{enterpriseId}/policies/{policyId}. If not specified, the policy_name for the
   * device’s user is applied. If user_name is also not specified,
   * enterprises/{enterpriseId}/policies/default is applied by default. When updating this field,
   * you can specify only the policyId as long as the policyId doesn’t contain any slashes. The rest
   * of the policy name will be inferred.
   * @param policyName policyName or {@code null} for none
   */
  public EnrollmentToken setPolicyName(java.lang.String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * A JSON string whose UTF-8 representation can be used to generate a QR code to enroll a device
   * with this enrollment token. To enroll a device using NFC, the NFC record must contain a
   * serialized java.util.Properties representation of the properties in the JSON.
   * @return value or {@code null} for none
   */
  public java.lang.String getQrCode() {
    return qrCode;
  }

  /**
   * A JSON string whose UTF-8 representation can be used to generate a QR code to enroll a device
   * with this enrollment token. To enroll a device using NFC, the NFC record must contain a
   * serialized java.util.Properties representation of the properties in the JSON.
   * @param qrCode qrCode or {@code null} for none
   */
  public EnrollmentToken setQrCode(java.lang.String qrCode) {
    this.qrCode = qrCode;
    return this;
  }

  /**
   * The user associated with this enrollment token. If it's specified when the enrollment token is
   * created and the user does not exist, the user will be created. This field must not contain
   * personally identifiable information. Only the account_identifier field needs to be set.
   * @return value or {@code null} for none
   */
  public User getUser() {
    return user;
  }

  /**
   * The user associated with this enrollment token. If it's specified when the enrollment token is
   * created and the user does not exist, the user will be created. This field must not contain
   * personally identifiable information. Only the account_identifier field needs to be set.
   * @param user user or {@code null} for none
   */
  public EnrollmentToken setUser(User user) {
    this.user = user;
    return this;
  }

  /**
   * The token value that's passed to the device and authorizes the device to enroll. This is a
   * read-only field generated by the server.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The token value that's passed to the device and authorizes the device to enroll. This is a
   * read-only field generated by the server.
   * @param value value or {@code null} for none
   */
  public EnrollmentToken setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public EnrollmentToken set(String fieldName, Object value) {
    return (EnrollmentToken) super.set(fieldName, value);
  }

  @Override
  public EnrollmentToken clone() {
    return (EnrollmentToken) super.clone();
  }

}
