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

package com.google.api.services.dlp.v2.model;

/**
 * Pseudonymization method that generates deterministic encryption for the given input. Outputs a
 * base64 encoded representation of the encrypted output. Uses AES-SIV based on the RFC
 * https://tools.ietf.org/html/rfc5297.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2CryptoDeterministicConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. A context may be used for higher security and maintaining referential integrity such
   * that the same identifier in two different contexts will be given a distinct surrogate. The
   * context is appended to plaintext value being encrypted. On decryption the provided context is
   * validated against the value used during encryption. If a context was provided during
   * encryption, same context must be provided during decryption as well.
   *
   * If the context is not set, plaintext would be used as is for encryption. If the context is set
   * but:
   *
   * 1. there is no record present when transforming a given value or 2. the field is not present
   * when transforming a given value,
   *
   * plaintext would be used as is for encryption.
   *
   * Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured
   * and non-structured `ContentItem`s.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2FieldId context;

  /**
   * The key used by the encryption function.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2CryptoKey cryptoKey;

  /**
   * The custom info type to annotate the surrogate with. This annotation will be applied to the
   * surrogate by prefixing it with the name of the custom info type followed by the number of
   * characters comprising the surrogate. The following scheme defines the format: ():
   *
   * For example, if the name of custom info type is 'MY_TOKEN_INFO_TYPE' and the surrogate is
   * 'abc', the full replacement value will be: 'MY_TOKEN_INFO_TYPE(3):abc'
   *
   * This annotation identifies the surrogate when inspecting content using the custom info type
   * 'Surrogate'. This facilitates reversal of the surrogate when it occurs in free text.
   *
   * In order for inspection to work properly, the name of this info type must not occur naturally
   * anywhere in your data; otherwise, inspection may either
   *
   * - reverse a surrogate that does not correspond to an actual identifier - be unable to parse the
   * surrogate and result in an error
   *
   * Therefore, choose your custom info type name carefully after considering what your data looks
   * like. One way to select a name that has a high chance of yielding reliable detection is to
   * include one or more unicode characters that are highly improbable to exist in your data. For
   * example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex
   * code point 29DD might be used like so: ⧝MY_TOKEN_TYPE
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2InfoType surrogateInfoType;

  /**
   * Optional. A context may be used for higher security and maintaining referential integrity such
   * that the same identifier in two different contexts will be given a distinct surrogate. The
   * context is appended to plaintext value being encrypted. On decryption the provided context is
   * validated against the value used during encryption. If a context was provided during
   * encryption, same context must be provided during decryption as well.
   *
   * If the context is not set, plaintext would be used as is for encryption. If the context is set
   * but:
   *
   * 1. there is no record present when transforming a given value or 2. the field is not present
   * when transforming a given value,
   *
   * plaintext would be used as is for encryption.
   *
   * Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured
   * and non-structured `ContentItem`s.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2FieldId getContext() {
    return context;
  }

  /**
   * Optional. A context may be used for higher security and maintaining referential integrity such
   * that the same identifier in two different contexts will be given a distinct surrogate. The
   * context is appended to plaintext value being encrypted. On decryption the provided context is
   * validated against the value used during encryption. If a context was provided during
   * encryption, same context must be provided during decryption as well.
   *
   * If the context is not set, plaintext would be used as is for encryption. If the context is set
   * but:
   *
   * 1. there is no record present when transforming a given value or 2. the field is not present
   * when transforming a given value,
   *
   * plaintext would be used as is for encryption.
   *
   * Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured
   * and non-structured `ContentItem`s.
   * @param context context or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoDeterministicConfig setContext(GooglePrivacyDlpV2FieldId context) {
    this.context = context;
    return this;
  }

  /**
   * The key used by the encryption function.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoKey getCryptoKey() {
    return cryptoKey;
  }

  /**
   * The key used by the encryption function.
   * @param cryptoKey cryptoKey or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoDeterministicConfig setCryptoKey(GooglePrivacyDlpV2CryptoKey cryptoKey) {
    this.cryptoKey = cryptoKey;
    return this;
  }

  /**
   * The custom info type to annotate the surrogate with. This annotation will be applied to the
   * surrogate by prefixing it with the name of the custom info type followed by the number of
   * characters comprising the surrogate. The following scheme defines the format: ():
   *
   * For example, if the name of custom info type is 'MY_TOKEN_INFO_TYPE' and the surrogate is
   * 'abc', the full replacement value will be: 'MY_TOKEN_INFO_TYPE(3):abc'
   *
   * This annotation identifies the surrogate when inspecting content using the custom info type
   * 'Surrogate'. This facilitates reversal of the surrogate when it occurs in free text.
   *
   * In order for inspection to work properly, the name of this info type must not occur naturally
   * anywhere in your data; otherwise, inspection may either
   *
   * - reverse a surrogate that does not correspond to an actual identifier - be unable to parse the
   * surrogate and result in an error
   *
   * Therefore, choose your custom info type name carefully after considering what your data looks
   * like. One way to select a name that has a high chance of yielding reliable detection is to
   * include one or more unicode characters that are highly improbable to exist in your data. For
   * example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex
   * code point 29DD might be used like so: ⧝MY_TOKEN_TYPE
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2InfoType getSurrogateInfoType() {
    return surrogateInfoType;
  }

  /**
   * The custom info type to annotate the surrogate with. This annotation will be applied to the
   * surrogate by prefixing it with the name of the custom info type followed by the number of
   * characters comprising the surrogate. The following scheme defines the format: ():
   *
   * For example, if the name of custom info type is 'MY_TOKEN_INFO_TYPE' and the surrogate is
   * 'abc', the full replacement value will be: 'MY_TOKEN_INFO_TYPE(3):abc'
   *
   * This annotation identifies the surrogate when inspecting content using the custom info type
   * 'Surrogate'. This facilitates reversal of the surrogate when it occurs in free text.
   *
   * In order for inspection to work properly, the name of this info type must not occur naturally
   * anywhere in your data; otherwise, inspection may either
   *
   * - reverse a surrogate that does not correspond to an actual identifier - be unable to parse the
   * surrogate and result in an error
   *
   * Therefore, choose your custom info type name carefully after considering what your data looks
   * like. One way to select a name that has a high chance of yielding reliable detection is to
   * include one or more unicode characters that are highly improbable to exist in your data. For
   * example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex
   * code point 29DD might be used like so: ⧝MY_TOKEN_TYPE
   * @param surrogateInfoType surrogateInfoType or {@code null} for none
   */
  public GooglePrivacyDlpV2CryptoDeterministicConfig setSurrogateInfoType(GooglePrivacyDlpV2InfoType surrogateInfoType) {
    this.surrogateInfoType = surrogateInfoType;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2CryptoDeterministicConfig set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2CryptoDeterministicConfig) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2CryptoDeterministicConfig clone() {
    return (GooglePrivacyDlpV2CryptoDeterministicConfig) super.clone();
  }

}