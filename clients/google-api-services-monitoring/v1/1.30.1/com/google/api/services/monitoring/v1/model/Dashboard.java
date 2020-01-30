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

package com.google.api.services.monitoring.v1.model;

/**
 * A Google Stackdriver dashboard. Dashboards define the content and layout of pages in the
 * Stackdriver web application.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Dashboard extends com.google.api.client.json.GenericJson {

  /**
   * The content is divided into equally spaced columns and the widgets are arranged vertically.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ColumnLayout columnLayout;

  /**
   * The mutable, human-readable name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * etag is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a policy from overwriting each other. An etag is returned in the response to GetDashboard,
   * and users are expected to put that etag in the request to UpdateDashboard to ensure that their
   * change will be applied to the same version of the Dashboard configuration. The field should not
   * be passed during dashboard creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Content is arranged with a basic layout that re-flows a simple list of informational elements
   * like widgets or tiles.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GridLayout gridLayout;

  /**
   * The resource name of the dashboard.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The content is divided into equally spaced rows and the widgets are arranged horizontally.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RowLayout rowLayout;

  /**
   * The content is divided into equally spaced columns and the widgets are arranged vertically.
   * @return value or {@code null} for none
   */
  public ColumnLayout getColumnLayout() {
    return columnLayout;
  }

  /**
   * The content is divided into equally spaced columns and the widgets are arranged vertically.
   * @param columnLayout columnLayout or {@code null} for none
   */
  public Dashboard setColumnLayout(ColumnLayout columnLayout) {
    this.columnLayout = columnLayout;
    return this;
  }

  /**
   * The mutable, human-readable name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The mutable, human-readable name.
   * @param displayName displayName or {@code null} for none
   */
  public Dashboard setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * etag is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a policy from overwriting each other. An etag is returned in the response to GetDashboard,
   * and users are expected to put that etag in the request to UpdateDashboard to ensure that their
   * change will be applied to the same version of the Dashboard configuration. The field should not
   * be passed during dashboard creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * etag is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a policy from overwriting each other. An etag is returned in the response to GetDashboard,
   * and users are expected to put that etag in the request to UpdateDashboard to ensure that their
   * change will be applied to the same version of the Dashboard configuration. The field should not
   * be passed during dashboard creation.
   * @param etag etag or {@code null} for none
   */
  public Dashboard setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Content is arranged with a basic layout that re-flows a simple list of informational elements
   * like widgets or tiles.
   * @return value or {@code null} for none
   */
  public GridLayout getGridLayout() {
    return gridLayout;
  }

  /**
   * Content is arranged with a basic layout that re-flows a simple list of informational elements
   * like widgets or tiles.
   * @param gridLayout gridLayout or {@code null} for none
   */
  public Dashboard setGridLayout(GridLayout gridLayout) {
    this.gridLayout = gridLayout;
    return this;
  }

  /**
   * The resource name of the dashboard.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the dashboard.
   * @param name name or {@code null} for none
   */
  public Dashboard setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The content is divided into equally spaced rows and the widgets are arranged horizontally.
   * @return value or {@code null} for none
   */
  public RowLayout getRowLayout() {
    return rowLayout;
  }

  /**
   * The content is divided into equally spaced rows and the widgets are arranged horizontally.
   * @param rowLayout rowLayout or {@code null} for none
   */
  public Dashboard setRowLayout(RowLayout rowLayout) {
    this.rowLayout = rowLayout;
    return this;
  }

  @Override
  public Dashboard set(String fieldName, Object value) {
    return (Dashboard) super.set(fieldName, value);
  }

  @Override
  public Dashboard clone() {
    return (Dashboard) super.clone();
  }

}
