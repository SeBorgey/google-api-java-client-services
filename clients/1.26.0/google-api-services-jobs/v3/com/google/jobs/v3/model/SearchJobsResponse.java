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

package com.google.jobs.v3.model;

/**
 * Output only.
 *
 * Response for SearchJob method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchJobsResponse extends com.google.api.client.json.GenericJson {

  /**
   * If query broadening is enabled, we may append additional results from the broadened query. This
   * number indicates how many of the jobs returned in the jobs field are from the broadened query.
   * These results are always at the end of the jobs list. In particular, a value of 0, or if the
   * field isn't set, all the jobs in the jobs list are from the original (without broadening)
   * query. If this field is non-zero, subsequent requests with offset after this result set should
   * contain all broadened results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer broadenedQueryJobsCount;

  /**
   * An estimation of the number of jobs that match the specified query.
   *
   * This number is not guaranteed to be accurate. For accurate results, see
   * enable_precise_result_size.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer estimatedTotalSize;

  /**
   * The histogram results that match specified SearchJobsRequest.histogram_facets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HistogramResults histogramResults;

  /**
   * The location filters that the service applied to the specified query. If any filters are lat-
   * lng based, the JobLocation.location_type is JobLocation.LocationType#LOCATION_TYPE_UNSPECIFIED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Location> locationFilters;

  /**
   * The Job entities that match the specified SearchJobsRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MatchingJob> matchingJobs;

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResponseMetadata metadata;

  /**
   * The token that specifies the starting position of the next page of results. This field is empty
   * if there are no more results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The spell checking result, and correction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SpellingCorrection spellCorrection;

  /**
   * The precise result count, which is available only if the client set enable_precise_result_size
   * to `true` or if the response is the last page of results. Otherwise, the value will be `-1`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalSize;

  /**
   * If query broadening is enabled, we may append additional results from the broadened query. This
   * number indicates how many of the jobs returned in the jobs field are from the broadened query.
   * These results are always at the end of the jobs list. In particular, a value of 0, or if the
   * field isn't set, all the jobs in the jobs list are from the original (without broadening)
   * query. If this field is non-zero, subsequent requests with offset after this result set should
   * contain all broadened results.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBroadenedQueryJobsCount() {
    return broadenedQueryJobsCount;
  }

  /**
   * If query broadening is enabled, we may append additional results from the broadened query. This
   * number indicates how many of the jobs returned in the jobs field are from the broadened query.
   * These results are always at the end of the jobs list. In particular, a value of 0, or if the
   * field isn't set, all the jobs in the jobs list are from the original (without broadening)
   * query. If this field is non-zero, subsequent requests with offset after this result set should
   * contain all broadened results.
   * @param broadenedQueryJobsCount broadenedQueryJobsCount or {@code null} for none
   */
  public SearchJobsResponse setBroadenedQueryJobsCount(java.lang.Integer broadenedQueryJobsCount) {
    this.broadenedQueryJobsCount = broadenedQueryJobsCount;
    return this;
  }

  /**
   * An estimation of the number of jobs that match the specified query.
   *
   * This number is not guaranteed to be accurate. For accurate results, see
   * enable_precise_result_size.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEstimatedTotalSize() {
    return estimatedTotalSize;
  }

  /**
   * An estimation of the number of jobs that match the specified query.
   *
   * This number is not guaranteed to be accurate. For accurate results, see
   * enable_precise_result_size.
   * @param estimatedTotalSize estimatedTotalSize or {@code null} for none
   */
  public SearchJobsResponse setEstimatedTotalSize(java.lang.Integer estimatedTotalSize) {
    this.estimatedTotalSize = estimatedTotalSize;
    return this;
  }

  /**
   * The histogram results that match specified SearchJobsRequest.histogram_facets.
   * @return value or {@code null} for none
   */
  public HistogramResults getHistogramResults() {
    return histogramResults;
  }

  /**
   * The histogram results that match specified SearchJobsRequest.histogram_facets.
   * @param histogramResults histogramResults or {@code null} for none
   */
  public SearchJobsResponse setHistogramResults(HistogramResults histogramResults) {
    this.histogramResults = histogramResults;
    return this;
  }

  /**
   * The location filters that the service applied to the specified query. If any filters are lat-
   * lng based, the JobLocation.location_type is JobLocation.LocationType#LOCATION_TYPE_UNSPECIFIED.
   * @return value or {@code null} for none
   */
  public java.util.List<Location> getLocationFilters() {
    return locationFilters;
  }

  /**
   * The location filters that the service applied to the specified query. If any filters are lat-
   * lng based, the JobLocation.location_type is JobLocation.LocationType#LOCATION_TYPE_UNSPECIFIED.
   * @param locationFilters locationFilters or {@code null} for none
   */
  public SearchJobsResponse setLocationFilters(java.util.List<Location> locationFilters) {
    this.locationFilters = locationFilters;
    return this;
  }

  /**
   * The Job entities that match the specified SearchJobsRequest.
   * @return value or {@code null} for none
   */
  public java.util.List<MatchingJob> getMatchingJobs() {
    return matchingJobs;
  }

  /**
   * The Job entities that match the specified SearchJobsRequest.
   * @param matchingJobs matchingJobs or {@code null} for none
   */
  public SearchJobsResponse setMatchingJobs(java.util.List<MatchingJob> matchingJobs) {
    this.matchingJobs = matchingJobs;
    return this;
  }

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * @return value or {@code null} for none
   */
  public ResponseMetadata getMetadata() {
    return metadata;
  }

  /**
   * Additional information for the API invocation, such as the request tracking id.
   * @param metadata metadata or {@code null} for none
   */
  public SearchJobsResponse setMetadata(ResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The token that specifies the starting position of the next page of results. This field is empty
   * if there are no more results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The token that specifies the starting position of the next page of results. This field is empty
   * if there are no more results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public SearchJobsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The spell checking result, and correction.
   * @return value or {@code null} for none
   */
  public SpellingCorrection getSpellCorrection() {
    return spellCorrection;
  }

  /**
   * The spell checking result, and correction.
   * @param spellCorrection spellCorrection or {@code null} for none
   */
  public SearchJobsResponse setSpellCorrection(SpellingCorrection spellCorrection) {
    this.spellCorrection = spellCorrection;
    return this;
  }

  /**
   * The precise result count, which is available only if the client set enable_precise_result_size
   * to `true` or if the response is the last page of results. Otherwise, the value will be `-1`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalSize() {
    return totalSize;
  }

  /**
   * The precise result count, which is available only if the client set enable_precise_result_size
   * to `true` or if the response is the last page of results. Otherwise, the value will be `-1`.
   * @param totalSize totalSize or {@code null} for none
   */
  public SearchJobsResponse setTotalSize(java.lang.Integer totalSize) {
    this.totalSize = totalSize;
    return this;
  }

  @Override
  public SearchJobsResponse set(String fieldName, Object value) {
    return (SearchJobsResponse) super.set(fieldName, value);
  }

  @Override
  public SearchJobsResponse clone() {
    return (SearchJobsResponse) super.clone();
  }

}
