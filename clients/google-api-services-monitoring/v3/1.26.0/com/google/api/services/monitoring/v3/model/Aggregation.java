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

package com.google.api.services.monitoring.v3.model;

/**
 * Describes how to combine multiple time series to provide different views of the data. Aggregation
 * consists of an alignment step on individual time series (alignment_period and per_series_aligner)
 * followed by an optional reduction step of the data across the aligned time series
 * (cross_series_reducer and group_by_fields). For more details, see Aggregation.
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
public final class Aggregation extends com.google.api.client.json.GenericJson {

  /**
   * The alignment period for per-time series alignment. If present, alignmentPeriod must be at
   * least 60 seconds. After per-time series alignment, each time series will contain data points
   * only on the period boundaries. If perSeriesAligner is not specified or equals ALIGN_NONE, then
   * this field is ignored. If perSeriesAligner is specified and does not equal ALIGN_NONE, then
   * this field must be defined; otherwise an error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String alignmentPeriod;

  /**
   * The approach to be used to combine time series. Not all reducer functions may be applied to all
   * time series, depending on the metric type and the value type of the original time series.
   * Reduction may change the metric type of value type of the time series.Time series data must be
   * aligned in order to perform cross-time series reduction. If crossSeriesReducer is specified,
   * then perSeriesAligner must be specified and not equal ALIGN_NONE and alignmentPeriod must be
   * specified; otherwise, an error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String crossSeriesReducer;

  /**
   * The set of fields to preserve when crossSeriesReducer is specified. The groupByFields determine
   * how the time series are partitioned into subsets prior to applying the aggregation function.
   * Each subset contains time series that have the same value for each of the grouping fields. Each
   * individual time series is a member of exactly one subset. The crossSeriesReducer is applied to
   * each subset of time series. It is not possible to reduce across different resource types, so
   * this field implicitly contains resource.type. Fields not specified in groupByFields are
   * aggregated away. If groupByFields is not specified and all the time series have the same
   * resource type, then the time series are aggregated into a single output time series. If
   * crossSeriesReducer is not defined, this field is ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> groupByFields;

  /**
   * The approach to be used to align individual time series. Not all alignment functions may be
   * applied to all time series, depending on the metric type and value type of the original time
   * series. Alignment may change the metric type or the value type of the time series.Time series
   * data must be aligned in order to perform cross-time series reduction. If crossSeriesReducer is
   * specified, then perSeriesAligner must be specified and not equal ALIGN_NONE and alignmentPeriod
   * must be specified; otherwise, an error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String perSeriesAligner;

  /**
   * The alignment period for per-time series alignment. If present, alignmentPeriod must be at
   * least 60 seconds. After per-time series alignment, each time series will contain data points
   * only on the period boundaries. If perSeriesAligner is not specified or equals ALIGN_NONE, then
   * this field is ignored. If perSeriesAligner is specified and does not equal ALIGN_NONE, then
   * this field must be defined; otherwise an error is returned.
   * @return value or {@code null} for none
   */
  public String getAlignmentPeriod() {
    return alignmentPeriod;
  }

  /**
   * The alignment period for per-time series alignment. If present, alignmentPeriod must be at
   * least 60 seconds. After per-time series alignment, each time series will contain data points
   * only on the period boundaries. If perSeriesAligner is not specified or equals ALIGN_NONE, then
   * this field is ignored. If perSeriesAligner is specified and does not equal ALIGN_NONE, then
   * this field must be defined; otherwise an error is returned.
   * @param alignmentPeriod alignmentPeriod or {@code null} for none
   */
  public Aggregation setAlignmentPeriod(String alignmentPeriod) {
    this.alignmentPeriod = alignmentPeriod;
    return this;
  }

  /**
   * The approach to be used to combine time series. Not all reducer functions may be applied to all
   * time series, depending on the metric type and the value type of the original time series.
   * Reduction may change the metric type of value type of the time series.Time series data must be
   * aligned in order to perform cross-time series reduction. If crossSeriesReducer is specified,
   * then perSeriesAligner must be specified and not equal ALIGN_NONE and alignmentPeriod must be
   * specified; otherwise, an error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getCrossSeriesReducer() {
    return crossSeriesReducer;
  }

  /**
   * The approach to be used to combine time series. Not all reducer functions may be applied to all
   * time series, depending on the metric type and the value type of the original time series.
   * Reduction may change the metric type of value type of the time series.Time series data must be
   * aligned in order to perform cross-time series reduction. If crossSeriesReducer is specified,
   * then perSeriesAligner must be specified and not equal ALIGN_NONE and alignmentPeriod must be
   * specified; otherwise, an error is returned.
   * @param crossSeriesReducer crossSeriesReducer or {@code null} for none
   */
  public Aggregation setCrossSeriesReducer(java.lang.String crossSeriesReducer) {
    this.crossSeriesReducer = crossSeriesReducer;
    return this;
  }

  /**
   * The set of fields to preserve when crossSeriesReducer is specified. The groupByFields determine
   * how the time series are partitioned into subsets prior to applying the aggregation function.
   * Each subset contains time series that have the same value for each of the grouping fields. Each
   * individual time series is a member of exactly one subset. The crossSeriesReducer is applied to
   * each subset of time series. It is not possible to reduce across different resource types, so
   * this field implicitly contains resource.type. Fields not specified in groupByFields are
   * aggregated away. If groupByFields is not specified and all the time series have the same
   * resource type, then the time series are aggregated into a single output time series. If
   * crossSeriesReducer is not defined, this field is ignored.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getGroupByFields() {
    return groupByFields;
  }

  /**
   * The set of fields to preserve when crossSeriesReducer is specified. The groupByFields determine
   * how the time series are partitioned into subsets prior to applying the aggregation function.
   * Each subset contains time series that have the same value for each of the grouping fields. Each
   * individual time series is a member of exactly one subset. The crossSeriesReducer is applied to
   * each subset of time series. It is not possible to reduce across different resource types, so
   * this field implicitly contains resource.type. Fields not specified in groupByFields are
   * aggregated away. If groupByFields is not specified and all the time series have the same
   * resource type, then the time series are aggregated into a single output time series. If
   * crossSeriesReducer is not defined, this field is ignored.
   * @param groupByFields groupByFields or {@code null} for none
   */
  public Aggregation setGroupByFields(java.util.List<java.lang.String> groupByFields) {
    this.groupByFields = groupByFields;
    return this;
  }

  /**
   * The approach to be used to align individual time series. Not all alignment functions may be
   * applied to all time series, depending on the metric type and value type of the original time
   * series. Alignment may change the metric type or the value type of the time series.Time series
   * data must be aligned in order to perform cross-time series reduction. If crossSeriesReducer is
   * specified, then perSeriesAligner must be specified and not equal ALIGN_NONE and alignmentPeriod
   * must be specified; otherwise, an error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getPerSeriesAligner() {
    return perSeriesAligner;
  }

  /**
   * The approach to be used to align individual time series. Not all alignment functions may be
   * applied to all time series, depending on the metric type and value type of the original time
   * series. Alignment may change the metric type or the value type of the time series.Time series
   * data must be aligned in order to perform cross-time series reduction. If crossSeriesReducer is
   * specified, then perSeriesAligner must be specified and not equal ALIGN_NONE and alignmentPeriod
   * must be specified; otherwise, an error is returned.
   * @param perSeriesAligner perSeriesAligner or {@code null} for none
   */
  public Aggregation setPerSeriesAligner(java.lang.String perSeriesAligner) {
    this.perSeriesAligner = perSeriesAligner;
    return this;
  }

  @Override
  public Aggregation set(String fieldName, Object value) {
    return (Aggregation) super.set(fieldName, value);
  }

  @Override
  public Aggregation clone() {
    return (Aggregation) super.clone();
  }

}
