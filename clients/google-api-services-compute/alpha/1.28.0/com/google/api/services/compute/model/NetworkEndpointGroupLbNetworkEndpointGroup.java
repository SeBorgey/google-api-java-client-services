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
 * Load balancing specific fields for network endpoint group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkEndpointGroupLbNetworkEndpointGroup extends com.google.api.client.json.GenericJson {

  /**
   * The default port used if the port number is not specified in the network endpoint. [Deprecated]
   * This field is deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer defaultPort;

  /**
   * The URL of the network to which all network endpoints in the NEG belong. Uses "default" project
   * network if unspecified. [Deprecated] This field is deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated]
   * This field is deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetwork;

  /**
   * [Output Only] The URL of the zone where the network endpoint group is located. [Deprecated]
   * This field is deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * The default port used if the port number is not specified in the network endpoint. [Deprecated]
   * This field is deprecated.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDefaultPort() {
    return defaultPort;
  }

  /**
   * The default port used if the port number is not specified in the network endpoint. [Deprecated]
   * This field is deprecated.
   * @param defaultPort defaultPort or {@code null} for none
   */
  public NetworkEndpointGroupLbNetworkEndpointGroup setDefaultPort(java.lang.Integer defaultPort) {
    this.defaultPort = defaultPort;
    return this;
  }

  /**
   * The URL of the network to which all network endpoints in the NEG belong. Uses "default" project
   * network if unspecified. [Deprecated] This field is deprecated.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * The URL of the network to which all network endpoints in the NEG belong. Uses "default" project
   * network if unspecified. [Deprecated] This field is deprecated.
   * @param network network or {@code null} for none
   */
  public NetworkEndpointGroupLbNetworkEndpointGroup setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated]
   * This field is deprecated.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetwork() {
    return subnetwork;
  }

  /**
   * Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated]
   * This field is deprecated.
   * @param subnetwork subnetwork or {@code null} for none
   */
  public NetworkEndpointGroupLbNetworkEndpointGroup setSubnetwork(java.lang.String subnetwork) {
    this.subnetwork = subnetwork;
    return this;
  }

  /**
   * [Output Only] The URL of the zone where the network endpoint group is located. [Deprecated]
   * This field is deprecated.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * [Output Only] The URL of the zone where the network endpoint group is located. [Deprecated]
   * This field is deprecated.
   * @param zone zone or {@code null} for none
   */
  public NetworkEndpointGroupLbNetworkEndpointGroup setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public NetworkEndpointGroupLbNetworkEndpointGroup set(String fieldName, Object value) {
    return (NetworkEndpointGroupLbNetworkEndpointGroup) super.set(fieldName, value);
  }

  @Override
  public NetworkEndpointGroupLbNetworkEndpointGroup clone() {
    return (NetworkEndpointGroupLbNetworkEndpointGroup) super.clone();
  }

}