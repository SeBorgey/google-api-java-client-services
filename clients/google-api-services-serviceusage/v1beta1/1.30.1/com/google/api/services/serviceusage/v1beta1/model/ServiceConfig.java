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

package com.google.api.services.serviceusage.v1beta1.model;

/**
 * The configuration of the service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceConfig extends com.google.api.client.json.GenericJson {

  /**
   * A list of API interfaces exported by this service. Contains only the names, versions, and
   * method names of the interfaces.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Api> apis;

  static {
    // hack to force ProGuard to consider Api used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Api.class);
  }

  /**
   * Auth configuration. Contains only the OAuth rules.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Authentication authentication;

  /**
   * Additional API documentation. Contains only the summary and the documentation URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Documentation documentation;

  /**
   * Configuration for network endpoints. Contains only the names and aliases of the endpoints.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Endpoint> endpoints;

  static {
    // hack to force ProGuard to consider Endpoint used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Endpoint.class);
  }

  /**
   * The DNS address at which this service is available. An example DNS address would be:
   * `calendar.googleapis.com`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Quota configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Quota quota;

  /**
   * The product title for this service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Configuration controlling usage of this service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Usage usage;

  /**
   * A list of API interfaces exported by this service. Contains only the names, versions, and
   * method names of the interfaces.
   * @return value or {@code null} for none
   */
  public java.util.List<Api> getApis() {
    return apis;
  }

  /**
   * A list of API interfaces exported by this service. Contains only the names, versions, and
   * method names of the interfaces.
   * @param apis apis or {@code null} for none
   */
  public ServiceConfig setApis(java.util.List<Api> apis) {
    this.apis = apis;
    return this;
  }

  /**
   * Auth configuration. Contains only the OAuth rules.
   * @return value or {@code null} for none
   */
  public Authentication getAuthentication() {
    return authentication;
  }

  /**
   * Auth configuration. Contains only the OAuth rules.
   * @param authentication authentication or {@code null} for none
   */
  public ServiceConfig setAuthentication(Authentication authentication) {
    this.authentication = authentication;
    return this;
  }

  /**
   * Additional API documentation. Contains only the summary and the documentation URL.
   * @return value or {@code null} for none
   */
  public Documentation getDocumentation() {
    return documentation;
  }

  /**
   * Additional API documentation. Contains only the summary and the documentation URL.
   * @param documentation documentation or {@code null} for none
   */
  public ServiceConfig setDocumentation(Documentation documentation) {
    this.documentation = documentation;
    return this;
  }

  /**
   * Configuration for network endpoints. Contains only the names and aliases of the endpoints.
   * @return value or {@code null} for none
   */
  public java.util.List<Endpoint> getEndpoints() {
    return endpoints;
  }

  /**
   * Configuration for network endpoints. Contains only the names and aliases of the endpoints.
   * @param endpoints endpoints or {@code null} for none
   */
  public ServiceConfig setEndpoints(java.util.List<Endpoint> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  /**
   * The DNS address at which this service is available. An example DNS address would be:
   * `calendar.googleapis.com`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The DNS address at which this service is available. An example DNS address would be:
   * `calendar.googleapis.com`.
   * @param name name or {@code null} for none
   */
  public ServiceConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Quota configuration.
   * @return value or {@code null} for none
   */
  public Quota getQuota() {
    return quota;
  }

  /**
   * Quota configuration.
   * @param quota quota or {@code null} for none
   */
  public ServiceConfig setQuota(Quota quota) {
    this.quota = quota;
    return this;
  }

  /**
   * The product title for this service.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The product title for this service.
   * @param title title or {@code null} for none
   */
  public ServiceConfig setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Configuration controlling usage of this service.
   * @return value or {@code null} for none
   */
  public Usage getUsage() {
    return usage;
  }

  /**
   * Configuration controlling usage of this service.
   * @param usage usage or {@code null} for none
   */
  public ServiceConfig setUsage(Usage usage) {
    this.usage = usage;
    return this;
  }

  @Override
  public ServiceConfig set(String fieldName, Object value) {
    return (ServiceConfig) super.set(fieldName, value);
  }

  @Override
  public ServiceConfig clone() {
    return (ServiceConfig) super.clone();
  }

}
