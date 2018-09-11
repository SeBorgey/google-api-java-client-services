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

package com.google.container.model;

/**
 * ListClustersResponse is the result of ListClustersRequest.
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
public final class ListClustersResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of clusters in the project in the specified zone, or across all ones.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Cluster> clusters;

  /**
   * If any zones are listed here, the list of clusters returned may be missing those zones.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> missingZones;

  /**
   * A list of clusters in the project in the specified zone, or across all ones.
   * @return value or {@code null} for none
   */
  public java.util.List<Cluster> getClusters() {
    return clusters;
  }

  /**
   * A list of clusters in the project in the specified zone, or across all ones.
   * @param clusters clusters or {@code null} for none
   */
  public ListClustersResponse setClusters(java.util.List<Cluster> clusters) {
    this.clusters = clusters;
    return this;
  }

  /**
   * If any zones are listed here, the list of clusters returned may be missing those zones.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMissingZones() {
    return missingZones;
  }

  /**
   * If any zones are listed here, the list of clusters returned may be missing those zones.
   * @param missingZones missingZones or {@code null} for none
   */
  public ListClustersResponse setMissingZones(java.util.List<java.lang.String> missingZones) {
    this.missingZones = missingZones;
    return this;
  }

  @Override
  public ListClustersResponse set(String fieldName, Object value) {
    return (ListClustersResponse) super.set(fieldName, value);
  }

  @Override
  public ListClustersResponse clone() {
    return (ListClustersResponse) super.clone();
  }

}
