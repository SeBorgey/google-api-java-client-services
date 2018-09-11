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

package com.google.composer.v1beta1.model;

/**
 * The configuration information for the Kubernetes Engine nodes running the Apache Airflow
 * software.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NodeConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The disk size in GB used for node VMs. Minimum size is 20GB. If unspecified, defaults
   * to 100GB. Cannot be updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer diskSizeGb;

  /**
   * Optional. The Compute Engine [zone](/compute/docs/regions-zones) in which to deploy the VMs
   * used to run the Apache Airflow software, specified as a [relative resource
   * name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/zones/{zoneId}".
   *
   * This `location` must belong to the enclosing environment's project and location. If both this
   * field and `nodeConfig.machineType` are specified, `nodeConfig.machineType` must belong to this
   * `location`; if both are unspecified, the service will pick a zone in the Compute Engine region
   * corresponding to the Cloud Composer location, and propagate that choice to both fields. If only
   * one field (`location` or `nodeConfig.machineType`) is specified, the location information from
   * the specified field will be propagated to the unspecified field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Optional. The Compute Engine [machine type](/compute/docs/machine-types) used for cluster
   * instances, specified as a [relative resource
   * name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/zones/{zoneId}/machineTypes/{machineTypeId}".
   *
   * The `machineType` must belong to the enclosing environment's project and location. If both this
   * field and `nodeConfig.location` are specified, this `machineType` must belong to the
   * `nodeConfig.location`; if both are unspecified, the service will pick a zone in the Compute
   * Engine region corresponding to the Cloud Composer location, and propagate that choice to both
   * fields. If exactly one of this field and `nodeConfig.location` is specified, the location
   * information from the specified field will be propagated to the unspecified field.
   *
   * If this field is unspecified, the `machineTypeId` defaults to "n1-standard-1".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * Optional. The Compute Engine network to be used for machine communications, specified as a
   * [relative resource name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/global/networks/{networkId}".
   *
   * If unspecified, the default network in the environment's project is used. If a [Custom Subnet
   * Network](/vpc/docs/vpc#vpc_networks_and_subnets) is provided, `nodeConfig.subnetwork` must also
   * be provided. For [Shared VPC](/vpc/docs/shared-vpc) subnetwork requirements, see
   * `nodeConfig.subnetwork`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * Optional. The set of Google API scopes to be made available on all node VMs. Defaults to
   * ["https://www.googleapis.com/auth/cloud-platform"] and must be included in the list of
   * specified scopes. Cannot be updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> oauthScopes;

  /**
   * Optional. The Google Cloud Platform Service Account to be used by the node VMs. If a service
   * account is not specified, the "default" Compute Engine service account is used. Cannot be
   * updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Optional. The Compute Engine subnetwork to be used for machine communications, specified as a
   * [relative resource name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/regions/{regionId}/subnetworks/{subnetworkId}"
   *
   * If a subnetwork is provided, `nodeConfig.network` must also be provided, and the subnetwork
   * must belong to the same project as the network.
   *
   * For Shared VPC, you must configure the subnetwork with secondary ranges named composer-pods and
   * composer-services to support Alias IPs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetwork;

  /**
   * Optional. The list of instance tags applied to all node VMs. Tags are used to identify valid
   * sources or targets for network firewalls. Each tag within the list must comply with
   * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Cannot be updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * Optional. The disk size in GB used for node VMs. Minimum size is 20GB. If unspecified, defaults
   * to 100GB. Cannot be updated.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDiskSizeGb() {
    return diskSizeGb;
  }

  /**
   * Optional. The disk size in GB used for node VMs. Minimum size is 20GB. If unspecified, defaults
   * to 100GB. Cannot be updated.
   * @param diskSizeGb diskSizeGb or {@code null} for none
   */
  public NodeConfig setDiskSizeGb(java.lang.Integer diskSizeGb) {
    this.diskSizeGb = diskSizeGb;
    return this;
  }

  /**
   * Optional. The Compute Engine [zone](/compute/docs/regions-zones) in which to deploy the VMs
   * used to run the Apache Airflow software, specified as a [relative resource
   * name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/zones/{zoneId}".
   *
   * This `location` must belong to the enclosing environment's project and location. If both this
   * field and `nodeConfig.machineType` are specified, `nodeConfig.machineType` must belong to this
   * `location`; if both are unspecified, the service will pick a zone in the Compute Engine region
   * corresponding to the Cloud Composer location, and propagate that choice to both fields. If only
   * one field (`location` or `nodeConfig.machineType`) is specified, the location information from
   * the specified field will be propagated to the unspecified field.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Optional. The Compute Engine [zone](/compute/docs/regions-zones) in which to deploy the VMs
   * used to run the Apache Airflow software, specified as a [relative resource
   * name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/zones/{zoneId}".
   *
   * This `location` must belong to the enclosing environment's project and location. If both this
   * field and `nodeConfig.machineType` are specified, `nodeConfig.machineType` must belong to this
   * `location`; if both are unspecified, the service will pick a zone in the Compute Engine region
   * corresponding to the Cloud Composer location, and propagate that choice to both fields. If only
   * one field (`location` or `nodeConfig.machineType`) is specified, the location information from
   * the specified field will be propagated to the unspecified field.
   * @param location location or {@code null} for none
   */
  public NodeConfig setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Optional. The Compute Engine [machine type](/compute/docs/machine-types) used for cluster
   * instances, specified as a [relative resource
   * name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/zones/{zoneId}/machineTypes/{machineTypeId}".
   *
   * The `machineType` must belong to the enclosing environment's project and location. If both this
   * field and `nodeConfig.location` are specified, this `machineType` must belong to the
   * `nodeConfig.location`; if both are unspecified, the service will pick a zone in the Compute
   * Engine region corresponding to the Cloud Composer location, and propagate that choice to both
   * fields. If exactly one of this field and `nodeConfig.location` is specified, the location
   * information from the specified field will be propagated to the unspecified field.
   *
   * If this field is unspecified, the `machineTypeId` defaults to "n1-standard-1".
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * Optional. The Compute Engine [machine type](/compute/docs/machine-types) used for cluster
   * instances, specified as a [relative resource
   * name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/zones/{zoneId}/machineTypes/{machineTypeId}".
   *
   * The `machineType` must belong to the enclosing environment's project and location. If both this
   * field and `nodeConfig.location` are specified, this `machineType` must belong to the
   * `nodeConfig.location`; if both are unspecified, the service will pick a zone in the Compute
   * Engine region corresponding to the Cloud Composer location, and propagate that choice to both
   * fields. If exactly one of this field and `nodeConfig.location` is specified, the location
   * information from the specified field will be propagated to the unspecified field.
   *
   * If this field is unspecified, the `machineTypeId` defaults to "n1-standard-1".
   * @param machineType machineType or {@code null} for none
   */
  public NodeConfig setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  /**
   * Optional. The Compute Engine network to be used for machine communications, specified as a
   * [relative resource name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/global/networks/{networkId}".
   *
   * If unspecified, the default network in the environment's project is used. If a [Custom Subnet
   * Network](/vpc/docs/vpc#vpc_networks_and_subnets) is provided, `nodeConfig.subnetwork` must also
   * be provided. For [Shared VPC](/vpc/docs/shared-vpc) subnetwork requirements, see
   * `nodeConfig.subnetwork`.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * Optional. The Compute Engine network to be used for machine communications, specified as a
   * [relative resource name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/global/networks/{networkId}".
   *
   * If unspecified, the default network in the environment's project is used. If a [Custom Subnet
   * Network](/vpc/docs/vpc#vpc_networks_and_subnets) is provided, `nodeConfig.subnetwork` must also
   * be provided. For [Shared VPC](/vpc/docs/shared-vpc) subnetwork requirements, see
   * `nodeConfig.subnetwork`.
   * @param network network or {@code null} for none
   */
  public NodeConfig setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * Optional. The set of Google API scopes to be made available on all node VMs. Defaults to
   * ["https://www.googleapis.com/auth/cloud-platform"] and must be included in the list of
   * specified scopes. Cannot be updated.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOauthScopes() {
    return oauthScopes;
  }

  /**
   * Optional. The set of Google API scopes to be made available on all node VMs. Defaults to
   * ["https://www.googleapis.com/auth/cloud-platform"] and must be included in the list of
   * specified scopes. Cannot be updated.
   * @param oauthScopes oauthScopes or {@code null} for none
   */
  public NodeConfig setOauthScopes(java.util.List<java.lang.String> oauthScopes) {
    this.oauthScopes = oauthScopes;
    return this;
  }

  /**
   * Optional. The Google Cloud Platform Service Account to be used by the node VMs. If a service
   * account is not specified, the "default" Compute Engine service account is used. Cannot be
   * updated.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Optional. The Google Cloud Platform Service Account to be used by the node VMs. If a service
   * account is not specified, the "default" Compute Engine service account is used. Cannot be
   * updated.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public NodeConfig setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Optional. The Compute Engine subnetwork to be used for machine communications, specified as a
   * [relative resource name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/regions/{regionId}/subnetworks/{subnetworkId}"
   *
   * If a subnetwork is provided, `nodeConfig.network` must also be provided, and the subnetwork
   * must belong to the same project as the network.
   *
   * For Shared VPC, you must configure the subnetwork with secondary ranges named composer-pods and
   * composer-services to support Alias IPs.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetwork() {
    return subnetwork;
  }

  /**
   * Optional. The Compute Engine subnetwork to be used for machine communications, specified as a
   * [relative resource name](/apis/design/resource_names#relative_resource_name). For example:
   * "projects/{projectId}/regions/{regionId}/subnetworks/{subnetworkId}"
   *
   * If a subnetwork is provided, `nodeConfig.network` must also be provided, and the subnetwork
   * must belong to the same project as the network.
   *
   * For Shared VPC, you must configure the subnetwork with secondary ranges named composer-pods and
   * composer-services to support Alias IPs.
   * @param subnetwork subnetwork or {@code null} for none
   */
  public NodeConfig setSubnetwork(java.lang.String subnetwork) {
    this.subnetwork = subnetwork;
    return this;
  }

  /**
   * Optional. The list of instance tags applied to all node VMs. Tags are used to identify valid
   * sources or targets for network firewalls. Each tag within the list must comply with
   * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Cannot be updated.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * Optional. The list of instance tags applied to all node VMs. Tags are used to identify valid
   * sources or targets for network firewalls. Each tag within the list must comply with
   * [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Cannot be updated.
   * @param tags tags or {@code null} for none
   */
  public NodeConfig setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  @Override
  public NodeConfig set(String fieldName, Object value) {
    return (NodeConfig) super.set(fieldName, value);
  }

  @Override
  public NodeConfig clone() {
    return (NodeConfig) super.clone();
  }

}
