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

package com.google.vision.v1.model;

/**
 * Response to an image annotation request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AnnotateImageResponse extends com.google.api.client.json.GenericJson {

  /**
   * If present, contextual information is needed to understand where this image comes from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageAnnotationContext context;

  /**
   * If present, crop hints have completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CropHintsAnnotation cropHintsAnnotation;

  /**
   * If set, represents the error message for the operation. Note that filled-in image annotations
   * are guaranteed to be correct, even when `error` is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status error;

  /**
   * If present, face detection has completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FaceAnnotation> faceAnnotations;

  /**
   * If present, text (OCR) detection or document (OCR) text detection has completed successfully.
   * This annotation provides the structural hierarchy for the OCR detected text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextAnnotation fullTextAnnotation;

  /**
   * If present, image properties were extracted successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageProperties imagePropertiesAnnotation;

  /**
   * If present, label detection has completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EntityAnnotation> labelAnnotations;

  /**
   * If present, landmark detection has completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EntityAnnotation> landmarkAnnotations;

  /**
   * If present, localized object detection has completed successfully. This will be sorted
   * descending by confidence score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LocalizedObjectAnnotation> localizedObjectAnnotations;

  /**
   * If present, logo detection has completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EntityAnnotation> logoAnnotations;

  /**
   * If present, safe-search annotation has completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SafeSearchAnnotation safeSearchAnnotation;

  /**
   * If present, text (OCR) detection has completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EntityAnnotation> textAnnotations;

  /**
   * If present, web detection has completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WebDetection webDetection;

  /**
   * If present, contextual information is needed to understand where this image comes from.
   * @return value or {@code null} for none
   */
  public ImageAnnotationContext getContext() {
    return context;
  }

  /**
   * If present, contextual information is needed to understand where this image comes from.
   * @param context context or {@code null} for none
   */
  public AnnotateImageResponse setContext(ImageAnnotationContext context) {
    this.context = context;
    return this;
  }

  /**
   * If present, crop hints have completed successfully.
   * @return value or {@code null} for none
   */
  public CropHintsAnnotation getCropHintsAnnotation() {
    return cropHintsAnnotation;
  }

  /**
   * If present, crop hints have completed successfully.
   * @param cropHintsAnnotation cropHintsAnnotation or {@code null} for none
   */
  public AnnotateImageResponse setCropHintsAnnotation(CropHintsAnnotation cropHintsAnnotation) {
    this.cropHintsAnnotation = cropHintsAnnotation;
    return this;
  }

  /**
   * If set, represents the error message for the operation. Note that filled-in image annotations
   * are guaranteed to be correct, even when `error` is set.
   * @return value or {@code null} for none
   */
  public Status getError() {
    return error;
  }

  /**
   * If set, represents the error message for the operation. Note that filled-in image annotations
   * are guaranteed to be correct, even when `error` is set.
   * @param error error or {@code null} for none
   */
  public AnnotateImageResponse setError(Status error) {
    this.error = error;
    return this;
  }

  /**
   * If present, face detection has completed successfully.
   * @return value or {@code null} for none
   */
  public java.util.List<FaceAnnotation> getFaceAnnotations() {
    return faceAnnotations;
  }

  /**
   * If present, face detection has completed successfully.
   * @param faceAnnotations faceAnnotations or {@code null} for none
   */
  public AnnotateImageResponse setFaceAnnotations(java.util.List<FaceAnnotation> faceAnnotations) {
    this.faceAnnotations = faceAnnotations;
    return this;
  }

  /**
   * If present, text (OCR) detection or document (OCR) text detection has completed successfully.
   * This annotation provides the structural hierarchy for the OCR detected text.
   * @return value or {@code null} for none
   */
  public TextAnnotation getFullTextAnnotation() {
    return fullTextAnnotation;
  }

  /**
   * If present, text (OCR) detection or document (OCR) text detection has completed successfully.
   * This annotation provides the structural hierarchy for the OCR detected text.
   * @param fullTextAnnotation fullTextAnnotation or {@code null} for none
   */
  public AnnotateImageResponse setFullTextAnnotation(TextAnnotation fullTextAnnotation) {
    this.fullTextAnnotation = fullTextAnnotation;
    return this;
  }

  /**
   * If present, image properties were extracted successfully.
   * @return value or {@code null} for none
   */
  public ImageProperties getImagePropertiesAnnotation() {
    return imagePropertiesAnnotation;
  }

  /**
   * If present, image properties were extracted successfully.
   * @param imagePropertiesAnnotation imagePropertiesAnnotation or {@code null} for none
   */
  public AnnotateImageResponse setImagePropertiesAnnotation(ImageProperties imagePropertiesAnnotation) {
    this.imagePropertiesAnnotation = imagePropertiesAnnotation;
    return this;
  }

  /**
   * If present, label detection has completed successfully.
   * @return value or {@code null} for none
   */
  public java.util.List<EntityAnnotation> getLabelAnnotations() {
    return labelAnnotations;
  }

  /**
   * If present, label detection has completed successfully.
   * @param labelAnnotations labelAnnotations or {@code null} for none
   */
  public AnnotateImageResponse setLabelAnnotations(java.util.List<EntityAnnotation> labelAnnotations) {
    this.labelAnnotations = labelAnnotations;
    return this;
  }

  /**
   * If present, landmark detection has completed successfully.
   * @return value or {@code null} for none
   */
  public java.util.List<EntityAnnotation> getLandmarkAnnotations() {
    return landmarkAnnotations;
  }

  /**
   * If present, landmark detection has completed successfully.
   * @param landmarkAnnotations landmarkAnnotations or {@code null} for none
   */
  public AnnotateImageResponse setLandmarkAnnotations(java.util.List<EntityAnnotation> landmarkAnnotations) {
    this.landmarkAnnotations = landmarkAnnotations;
    return this;
  }

  /**
   * If present, localized object detection has completed successfully. This will be sorted
   * descending by confidence score.
   * @return value or {@code null} for none
   */
  public java.util.List<LocalizedObjectAnnotation> getLocalizedObjectAnnotations() {
    return localizedObjectAnnotations;
  }

  /**
   * If present, localized object detection has completed successfully. This will be sorted
   * descending by confidence score.
   * @param localizedObjectAnnotations localizedObjectAnnotations or {@code null} for none
   */
  public AnnotateImageResponse setLocalizedObjectAnnotations(java.util.List<LocalizedObjectAnnotation> localizedObjectAnnotations) {
    this.localizedObjectAnnotations = localizedObjectAnnotations;
    return this;
  }

  /**
   * If present, logo detection has completed successfully.
   * @return value or {@code null} for none
   */
  public java.util.List<EntityAnnotation> getLogoAnnotations() {
    return logoAnnotations;
  }

  /**
   * If present, logo detection has completed successfully.
   * @param logoAnnotations logoAnnotations or {@code null} for none
   */
  public AnnotateImageResponse setLogoAnnotations(java.util.List<EntityAnnotation> logoAnnotations) {
    this.logoAnnotations = logoAnnotations;
    return this;
  }

  /**
   * If present, safe-search annotation has completed successfully.
   * @return value or {@code null} for none
   */
  public SafeSearchAnnotation getSafeSearchAnnotation() {
    return safeSearchAnnotation;
  }

  /**
   * If present, safe-search annotation has completed successfully.
   * @param safeSearchAnnotation safeSearchAnnotation or {@code null} for none
   */
  public AnnotateImageResponse setSafeSearchAnnotation(SafeSearchAnnotation safeSearchAnnotation) {
    this.safeSearchAnnotation = safeSearchAnnotation;
    return this;
  }

  /**
   * If present, text (OCR) detection has completed successfully.
   * @return value or {@code null} for none
   */
  public java.util.List<EntityAnnotation> getTextAnnotations() {
    return textAnnotations;
  }

  /**
   * If present, text (OCR) detection has completed successfully.
   * @param textAnnotations textAnnotations or {@code null} for none
   */
  public AnnotateImageResponse setTextAnnotations(java.util.List<EntityAnnotation> textAnnotations) {
    this.textAnnotations = textAnnotations;
    return this;
  }

  /**
   * If present, web detection has completed successfully.
   * @return value or {@code null} for none
   */
  public WebDetection getWebDetection() {
    return webDetection;
  }

  /**
   * If present, web detection has completed successfully.
   * @param webDetection webDetection or {@code null} for none
   */
  public AnnotateImageResponse setWebDetection(WebDetection webDetection) {
    this.webDetection = webDetection;
    return this;
  }

  @Override
  public AnnotateImageResponse set(String fieldName, Object value) {
    return (AnnotateImageResponse) super.set(fieldName, value);
  }

  @Override
  public AnnotateImageResponse clone() {
    return (AnnotateImageResponse) super.clone();
  }

}
