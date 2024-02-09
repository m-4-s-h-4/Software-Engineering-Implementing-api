package com.example.courierquest.controller;

import com.example.courierquest.service.CourierService;
import com.harbour.eats.api.CouriersApi;
import com.harbour.eats.model.CurrentQuestProgress;
import com.harbour.eats.model.CourierAchievements;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourierController implements CouriersApi {

    private final CourierService courierService;

    public CourierController(CourierService courierService) {
        this.courierService = courierService;
    }

    @Override
    public ResponseEntity<CurrentQuestProgress> getCurrentQuestProgress(@PathVariable("courierId") String courierId) {
        CurrentQuestProgress progress = courierService.getCurrentQuestProgress(courierId);
        if (progress == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(progress);
    }

    @Override
    public ResponseEntity<CourierAchievements> getCourierAchievements(@PathVariable("courierId") String courierId) {
        CourierAchievements achievements = courierService.getCourierAchievements(courierId);
        if (achievements == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(achievements);
    }
}
