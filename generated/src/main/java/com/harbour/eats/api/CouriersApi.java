/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.harbour.eats.api;

import com.harbour.eats.model.CourierAchievements;
import com.harbour.eats.model.CurrentQuestProgress;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-02-08T18:29:51.023597+01:00[Europe/Madrid]")
@Validated
@Tag(name = "Courier", description = "the Courier API")
public interface CouriersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /couriers/{courierId}/achievements : Get a courier&#39;s total achievements including deliveries, earnings, and current tier progress
     *
     * @param courierId The unique identifier of the courier (required)
     * @return Comprehensive achievements data including total deliveries and earnings (status code 200)
     */
    @Operation(
        operationId = "getCourierAchievements",
        summary = "Get a courier's total achievements including deliveries, earnings, and current tier progress",
        tags = { "Courier" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Comprehensive achievements data including total deliveries and earnings", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CourierAchievements.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/couriers/{courierId}/achievements",
        produces = { "application/json" }
    )
    
    default ResponseEntity<CourierAchievements> getCourierAchievements(
        @Parameter(name = "courierId", description = "The unique identifier of the courier", required = true, in = ParameterIn.PATH) @PathVariable("courierId") String courierId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"totalEarnings\" : 6.027456183070403, \"totalDeliveries\" : 0, \"courierId\" : \"courierId\", \"ordersLeftForNextTier\" : 1, \"currentTier\" : \"currentTier\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /couriers/{courierId}/current-quest : Get current quest progress and tier information for a courier
     *
     * @param courierId The unique identifier of the courier (required)
     * @return Detailed information on the courier&#39;s current quest, including progress, tiers, and rewards (status code 200)
     */
    @Operation(
        operationId = "getCurrentQuestProgress",
        summary = "Get current quest progress and tier information for a courier",
        tags = { "Courier" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Detailed information on the courier's current quest, including progress, tiers, and rewards", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CurrentQuestProgress.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/couriers/{courierId}/current-quest",
        produces = { "application/json" }
    )
    
    default ResponseEntity<CurrentQuestProgress> getCurrentQuestProgress(
        @Parameter(name = "courierId", description = "The unique identifier of the courier", required = true, in = ParameterIn.PATH) @PathVariable("courierId") String courierId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"rewardForCurrentTier\" : 1.4658129805029452, \"ordersCompleted\" : 0, \"nextTier\" : \"nextTier\", \"ordersNeededForNextTier\" : 6, \"courierId\" : \"courierId\", \"currentTier\" : \"currentTier\", \"timeLeftToCompleteTier\" : \"timeLeftToCompleteTier\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
