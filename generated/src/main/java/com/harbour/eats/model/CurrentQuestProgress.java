package com.harbour.eats.model;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * CurrentQuestProgress
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-08T18:29:51.023597+01:00[Europe/Madrid]")
public class CurrentQuestProgress {

  @lombok.Getter
  private String courierId;

  @lombok.Getter
  private String currentTier;

  @lombok.Getter
  private String nextTier;

  @lombok.Getter
  private Integer ordersCompleted;

  @lombok.Getter
  private Integer ordersNeededForNextTier;

  @lombok.Getter
  private Double rewardForCurrentTier;

  @lombok.Getter
  private String timeLeftToCompleteTier;

  public CurrentQuestProgress courierId(String courierId) {
    this.courierId = courierId;
    return this;
  }

  public void setCourierId(String courierId) {
    this.courierId = courierId;
  }

  public CurrentQuestProgress currentTier(String currentTier) {
    this.currentTier = currentTier;
    return this;
  }

  public void setCurrentTier(String currentTier) {
    this.currentTier = currentTier;
  }

  public CurrentQuestProgress nextTier(String nextTier) {
    this.nextTier = nextTier;
    return this;
  }

  public void setNextTier(String nextTier) {
    this.nextTier = nextTier;
  }

  public CurrentQuestProgress ordersCompleted(Integer ordersCompleted) {
    this.ordersCompleted = ordersCompleted;
    return this;
  }

  public void setOrdersCompleted(Integer ordersCompleted) {
    this.ordersCompleted = ordersCompleted;
  }

  public CurrentQuestProgress ordersNeededForNextTier(Integer ordersNeededForNextTier) {
    this.ordersNeededForNextTier = ordersNeededForNextTier;
    return this;
  }

  public void setOrdersNeededForNextTier(Integer ordersNeededForNextTier) {
    this.ordersNeededForNextTier = ordersNeededForNextTier;
  }

  public CurrentQuestProgress rewardForCurrentTier(Double rewardForCurrentTier) {
    this.rewardForCurrentTier = rewardForCurrentTier;
    return this;
  }

  public void setRewardForCurrentTier(Double rewardForCurrentTier) {
    this.rewardForCurrentTier = rewardForCurrentTier;
  }

  public CurrentQuestProgress timeLeftToCompleteTier(String timeLeftToCompleteTier) {
    this.timeLeftToCompleteTier = timeLeftToCompleteTier;
    return this;
  }

  public void setTimeLeftToCompleteTier(String timeLeftToCompleteTier) {
    this.timeLeftToCompleteTier = timeLeftToCompleteTier;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentQuestProgress currentQuestProgress = (CurrentQuestProgress) o;
    return Objects.equals(this.courierId, currentQuestProgress.courierId) &&
        Objects.equals(this.currentTier, currentQuestProgress.currentTier) &&
        Objects.equals(this.nextTier, currentQuestProgress.nextTier) &&
        Objects.equals(this.ordersCompleted, currentQuestProgress.ordersCompleted) &&
        Objects.equals(this.ordersNeededForNextTier, currentQuestProgress.ordersNeededForNextTier) &&
        Objects.equals(this.rewardForCurrentTier, currentQuestProgress.rewardForCurrentTier) &&
        Objects.equals(this.timeLeftToCompleteTier, currentQuestProgress.timeLeftToCompleteTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courierId, currentTier, nextTier, ordersCompleted, ordersNeededForNextTier, rewardForCurrentTier, timeLeftToCompleteTier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentQuestProgress {\n");
    sb.append("    courierId: ").append(toIndentedString(courierId)).append("\n");
    sb.append("    currentTier: ").append(toIndentedString(currentTier)).append("\n");
    sb.append("    nextTier: ").append(toIndentedString(nextTier)).append("\n");
    sb.append("    ordersCompleted: ").append(toIndentedString(ordersCompleted)).append("\n");
    sb.append("    ordersNeededForNextTier: ").append(toIndentedString(ordersNeededForNextTier)).append("\n");
    sb.append("    rewardForCurrentTier: ").append(toIndentedString(rewardForCurrentTier)).append("\n");
    sb.append("    timeLeftToCompleteTier: ").append(toIndentedString(timeLeftToCompleteTier)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

