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

package com.google.api.services.pubsublite.v1.model;

/**
 * Response for ListTopicSubscriptions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Pub/Sub Lite API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListTopicSubscriptionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token that can be sent as `page_token` to retrieve the next page of results. If this field is
   * omitted, there are no more results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The names of subscriptions attached to the topic. The order of the subscriptions is
   * unspecified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> subscriptions;

  /**
   * A token that can be sent as `page_token` to retrieve the next page of results. If this field is
   * omitted, there are no more results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token that can be sent as `page_token` to retrieve the next page of results. If this field is
   * omitted, there are no more results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListTopicSubscriptionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The names of subscriptions attached to the topic. The order of the subscriptions is
   * unspecified.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSubscriptions() {
    return subscriptions;
  }

  /**
   * The names of subscriptions attached to the topic. The order of the subscriptions is
   * unspecified.
   * @param subscriptions subscriptions or {@code null} for none
   */
  public ListTopicSubscriptionsResponse setSubscriptions(java.util.List<java.lang.String> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  @Override
  public ListTopicSubscriptionsResponse set(String fieldName, Object value) {
    return (ListTopicSubscriptionsResponse) super.set(fieldName, value);
  }

  @Override
  public ListTopicSubscriptionsResponse clone() {
    return (ListTopicSubscriptionsResponse) super.clone();
  }

}
