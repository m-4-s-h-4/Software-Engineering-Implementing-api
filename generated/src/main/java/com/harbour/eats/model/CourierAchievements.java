package com.harbour.eats.model;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * CourierAchievements
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-08T18:29:51.023597+01:00[Europe/Madrid]")
public class CourierAchievements {

  @lombok.Getter
  private String courierId;

  @lombok.Getter
  private Integer totalDeliveries;

  @lombok.Getter
  private Double totalEarnings;

  @lombok.Getter
  private String currentTier;

  @lombok.Getter
  private Integer ordersLeftForNextTier;

  public CourierAchievements courierId(String courierId) {
    this.courierId = courierId;
    return this;
  }

  public void setCourierId(String courierId) {
    this.courierId = courierId;
  }

  public CourierAchievements totalDeliveries(Integer totalDeliveries) {
    this.totalDeliveries = totalDeliveries;
    return this;
  }

  public void setTotalDeliveries(Integer totalDeliveries) {
    this.totalDeliveries = totalDeliveries;
  }

  public CourierAchievements totalEarnings(Double totalEarnings) {
    this.totalEarnings = totalEarnings;
    return this;
  }

  public void setTotalEarnings(Double totalEarnings) {
    this.totalEarnings = totalEarnings;
  }

  public CourierAchievements currentTier(String currentTier) {
    this.currentTier = currentTier;
    return this;
  }

  public void setCurrentTier(String currentTier) {
    this.currentTier = currentTier;
  }

  public CourierAchievements ordersLeftForNextTier(Integer ordersLeftForNextTier) {
    this.ordersLeftForNextTier = ordersLeftForNextTier;
    return this;
  }

  public void setOrdersLeftForNextTier(Integer ordersLeftForNextTier) {
    this.ordersLeftForNextTier = ordersLeftForNextTier;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourierAchievements courierAchievements = (CourierAchievements) o;
    return Objects.equals(this.courierId, courierAchievements.courierId) &&
        Objects.equals(this.totalDeliveries, courierAchievements.totalDeliveries) &&
        Objects.equals(this.totalEarnings, courierAchievements.totalEarnings) &&
        Objects.equals(this.currentTier, courierAchievements.currentTier) &&
        Objects.equals(this.ordersLeftForNextTier, courierAchievements.ordersLeftForNextTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courierId, totalDeliveries, totalEarnings, currentTier, ordersLeftForNextTier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourierAchievements {\n");
    sb.append("    courierId: ").append(toIndentedString(courierId)).append("\n");
    sb.append("    totalDeliveries: ").append(toIndentedString(totalDeliveries)).append("\n");
    sb.append("    totalEarnings: ").append(toIndentedString(totalEarnings)).append("\n");
    sb.append("    currentTier: ").append(toIndentedString(currentTier)).append("\n");
    sb.append("    ordersLeftForNextTier: ").append(toIndentedString(ordersLeftForNextTier)).append("\n");
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

