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

package com.google.partners.v2.model;

/**
 * Request message for LogUserEvent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Partners API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LogUserEventRequest extends com.google.api.client.json.GenericJson {

  /**
   * The action that occurred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventAction;

  /**
   * The category the action belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventCategory;

  /**
   * List of event data for the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EventData> eventDatas;

  static {
    // hack to force ProGuard to consider EventData used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EventData.class);
  }

  /**
   * The scope of the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventScope;

  /**
   * Advertiser lead information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Lead lead;

  /**
   * Current request metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RequestMetadata requestMetadata;

  /**
   * The URL where the event occurred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * The action that occurred.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventAction() {
    return eventAction;
  }

  /**
   * The action that occurred.
   * @param eventAction eventAction or {@code null} for none
   */
  public LogUserEventRequest setEventAction(java.lang.String eventAction) {
    this.eventAction = eventAction;
    return this;
  }

  /**
   * The category the action belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventCategory() {
    return eventCategory;
  }

  /**
   * The category the action belongs to.
   * @param eventCategory eventCategory or {@code null} for none
   */
  public LogUserEventRequest setEventCategory(java.lang.String eventCategory) {
    this.eventCategory = eventCategory;
    return this;
  }

  /**
   * List of event data for the event.
   * @return value or {@code null} for none
   */
  public java.util.List<EventData> getEventDatas() {
    return eventDatas;
  }

  /**
   * List of event data for the event.
   * @param eventDatas eventDatas or {@code null} for none
   */
  public LogUserEventRequest setEventDatas(java.util.List<EventData> eventDatas) {
    this.eventDatas = eventDatas;
    return this;
  }

  /**
   * The scope of the event.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventScope() {
    return eventScope;
  }

  /**
   * The scope of the event.
   * @param eventScope eventScope or {@code null} for none
   */
  public LogUserEventRequest setEventScope(java.lang.String eventScope) {
    this.eventScope = eventScope;
    return this;
  }

  /**
   * Advertiser lead information.
   * @return value or {@code null} for none
   */
  public Lead getLead() {
    return lead;
  }

  /**
   * Advertiser lead information.
   * @param lead lead or {@code null} for none
   */
  public LogUserEventRequest setLead(Lead lead) {
    this.lead = lead;
    return this;
  }

  /**
   * Current request metadata.
   * @return value or {@code null} for none
   */
  public RequestMetadata getRequestMetadata() {
    return requestMetadata;
  }

  /**
   * Current request metadata.
   * @param requestMetadata requestMetadata or {@code null} for none
   */
  public LogUserEventRequest setRequestMetadata(RequestMetadata requestMetadata) {
    this.requestMetadata = requestMetadata;
    return this;
  }

  /**
   * The URL where the event occurred.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The URL where the event occurred.
   * @param url url or {@code null} for none
   */
  public LogUserEventRequest setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public LogUserEventRequest set(String fieldName, Object value) {
    return (LogUserEventRequest) super.set(fieldName, value);
  }

  @Override
  public LogUserEventRequest clone() {
    return (LogUserEventRequest) super.clone();
  }

}
