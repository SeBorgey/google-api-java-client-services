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

package com.google.api.services.datastore.v1.model;

/**
 * A property of an index.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDatastoreAdminV1IndexedProperty extends com.google.api.client.json.GenericJson {

  /**
   * Required. The indexed property's direction.  Must not be DIRECTION_UNSPECIFIED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String direction;

  /**
   * Required. The property name to index.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The indexed property's direction.  Must not be DIRECTION_UNSPECIFIED.
   * @return value or {@code null} for none
   */
  public java.lang.String getDirection() {
    return direction;
  }

  /**
   * Required. The indexed property's direction.  Must not be DIRECTION_UNSPECIFIED.
   * @param direction direction or {@code null} for none
   */
  public GoogleDatastoreAdminV1IndexedProperty setDirection(java.lang.String direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Required. The property name to index.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The property name to index.
   * @param name name or {@code null} for none
   */
  public GoogleDatastoreAdminV1IndexedProperty setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleDatastoreAdminV1IndexedProperty set(String fieldName, Object value) {
    return (GoogleDatastoreAdminV1IndexedProperty) super.set(fieldName, value);
  }

  @Override
  public GoogleDatastoreAdminV1IndexedProperty clone() {
    return (GoogleDatastoreAdminV1IndexedProperty) super.clone();
  }

}
