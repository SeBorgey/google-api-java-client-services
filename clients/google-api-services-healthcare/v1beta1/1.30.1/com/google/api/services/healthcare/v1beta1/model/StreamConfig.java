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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * This structure contains configuration for streaming FHIR export.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StreamConfig extends com.google.api.client.json.GenericJson {

  /**
   * The destination BigQuery structure that contains both the dataset location and corresponding
   * schema config.
   *
   * The output is organized in one table per resource type. The server reuses the existing tables
   * (if any) that are named after the resource types, e.g. "Patient", "Observation". When there is
   * no existing table for a given resource type, the server attempts to create one.
   *
   * When a table schema doesn't align with the schema config, either because of existing
   * incompatible schema or out of band incompatible modification, the server does not stream in new
   * data.
   *
   * One resolution in this case is to delete the incompatible table and let the server recreate
   * one, though the newly created table only contains data after the table recreation.
   *
   * BigQuery imposes a 1 MB limit on streaming insert row size, therefore any resource mutation
   * that generates more than 1 MB of BigQuery data will not be streamed.
   *
   * Results are appended to the corresponding BigQuery tables. Different versions of the same
   * resource are distinguishable by the meta.versionId and meta.lastUpdated columns. The operation
   * (CREATE/UPDATE/DELETE) that results in the new version is recorded in the meta.tag.
   *
   * The tables contain all historical resource versions since streaming was enabled. For query
   * convenience, the server also creates one view per table of the same name containing only the
   * current resource version.
   *
   * The streamed data in the BigQuery dataset is not guaranteed to be completely unique. The
   * combination of the id and meta.versionId columns should ideally identify a single unique row.
   * But in rare cases, duplicates may exist. At query time, users may use the SQL select statement
   * to keep only one of the duplicate rows given an id and meta.versionId pair. Alternatively, the
   * server created view mentioned above also filters out duplicates.
   *
   * If a resource mutation cannot be streamed to BigQuery, errors will be logged to Cloud Logging
   * (see [Viewing logs](/healthcare/docs/how- tos/logging)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudHealthcareV1beta1FhirBigQueryDestination bigqueryDestination;

  /**
   * Supply a FHIR resource type (such as "Patient" or "Observation"). See https://www.hl7.org/fhir
   * /valueset-resource-types.html for a list of all FHIR resource types. The server treats an empty
   * list as an intent to stream all the supported resource types in this FHIR store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resourceTypes;

  /**
   * The destination BigQuery structure that contains both the dataset location and corresponding
   * schema config.
   *
   * The output is organized in one table per resource type. The server reuses the existing tables
   * (if any) that are named after the resource types, e.g. "Patient", "Observation". When there is
   * no existing table for a given resource type, the server attempts to create one.
   *
   * When a table schema doesn't align with the schema config, either because of existing
   * incompatible schema or out of band incompatible modification, the server does not stream in new
   * data.
   *
   * One resolution in this case is to delete the incompatible table and let the server recreate
   * one, though the newly created table only contains data after the table recreation.
   *
   * BigQuery imposes a 1 MB limit on streaming insert row size, therefore any resource mutation
   * that generates more than 1 MB of BigQuery data will not be streamed.
   *
   * Results are appended to the corresponding BigQuery tables. Different versions of the same
   * resource are distinguishable by the meta.versionId and meta.lastUpdated columns. The operation
   * (CREATE/UPDATE/DELETE) that results in the new version is recorded in the meta.tag.
   *
   * The tables contain all historical resource versions since streaming was enabled. For query
   * convenience, the server also creates one view per table of the same name containing only the
   * current resource version.
   *
   * The streamed data in the BigQuery dataset is not guaranteed to be completely unique. The
   * combination of the id and meta.versionId columns should ideally identify a single unique row.
   * But in rare cases, duplicates may exist. At query time, users may use the SQL select statement
   * to keep only one of the duplicate rows given an id and meta.versionId pair. Alternatively, the
   * server created view mentioned above also filters out duplicates.
   *
   * If a resource mutation cannot be streamed to BigQuery, errors will be logged to Cloud Logging
   * (see [Viewing logs](/healthcare/docs/how- tos/logging)).
   * @return value or {@code null} for none
   */
  public GoogleCloudHealthcareV1beta1FhirBigQueryDestination getBigqueryDestination() {
    return bigqueryDestination;
  }

  /**
   * The destination BigQuery structure that contains both the dataset location and corresponding
   * schema config.
   *
   * The output is organized in one table per resource type. The server reuses the existing tables
   * (if any) that are named after the resource types, e.g. "Patient", "Observation". When there is
   * no existing table for a given resource type, the server attempts to create one.
   *
   * When a table schema doesn't align with the schema config, either because of existing
   * incompatible schema or out of band incompatible modification, the server does not stream in new
   * data.
   *
   * One resolution in this case is to delete the incompatible table and let the server recreate
   * one, though the newly created table only contains data after the table recreation.
   *
   * BigQuery imposes a 1 MB limit on streaming insert row size, therefore any resource mutation
   * that generates more than 1 MB of BigQuery data will not be streamed.
   *
   * Results are appended to the corresponding BigQuery tables. Different versions of the same
   * resource are distinguishable by the meta.versionId and meta.lastUpdated columns. The operation
   * (CREATE/UPDATE/DELETE) that results in the new version is recorded in the meta.tag.
   *
   * The tables contain all historical resource versions since streaming was enabled. For query
   * convenience, the server also creates one view per table of the same name containing only the
   * current resource version.
   *
   * The streamed data in the BigQuery dataset is not guaranteed to be completely unique. The
   * combination of the id and meta.versionId columns should ideally identify a single unique row.
   * But in rare cases, duplicates may exist. At query time, users may use the SQL select statement
   * to keep only one of the duplicate rows given an id and meta.versionId pair. Alternatively, the
   * server created view mentioned above also filters out duplicates.
   *
   * If a resource mutation cannot be streamed to BigQuery, errors will be logged to Cloud Logging
   * (see [Viewing logs](/healthcare/docs/how- tos/logging)).
   * @param bigqueryDestination bigqueryDestination or {@code null} for none
   */
  public StreamConfig setBigqueryDestination(GoogleCloudHealthcareV1beta1FhirBigQueryDestination bigqueryDestination) {
    this.bigqueryDestination = bigqueryDestination;
    return this;
  }

  /**
   * Supply a FHIR resource type (such as "Patient" or "Observation"). See https://www.hl7.org/fhir
   * /valueset-resource-types.html for a list of all FHIR resource types. The server treats an empty
   * list as an intent to stream all the supported resource types in this FHIR store.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResourceTypes() {
    return resourceTypes;
  }

  /**
   * Supply a FHIR resource type (such as "Patient" or "Observation"). See https://www.hl7.org/fhir
   * /valueset-resource-types.html for a list of all FHIR resource types. The server treats an empty
   * list as an intent to stream all the supported resource types in this FHIR store.
   * @param resourceTypes resourceTypes or {@code null} for none
   */
  public StreamConfig setResourceTypes(java.util.List<java.lang.String> resourceTypes) {
    this.resourceTypes = resourceTypes;
    return this;
  }

  @Override
  public StreamConfig set(String fieldName, Object value) {
    return (StreamConfig) super.set(fieldName, value);
  }

  @Override
  public StreamConfig clone() {
    return (StreamConfig) super.clone();
  }

}
