package com.example.courierquest.service;

import com.harbour.eats.model.CurrentQuestProgress;
import com.harbour.eats.model.CourierAchievements;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MainCourierService implements CourierService {
    private final Map<String, CurrentQuestProgress> questProgressMap = new HashMap<>();
    private final Map<String, CourierAchievements> achievementsMap = new HashMap<>();

    public MainCourierService() {
        //mock data
        initializeMockData();
    }

    private void initializeMockData() {
        questProgressMap.put("courier123", new CurrentQuestProgress()
                .courierId("courier123")
                .currentTier("Bronze")
                .nextTier("Silver")
                .ordersCompleted(5)
                .ordersNeededForNextTier(10)
                .rewardForCurrentTier(10.0)
                .timeLeftToCompleteTier("P7D"));

        achievementsMap.put("courier123", new CourierAchievements()
                .courierId("courier123")
                .totalDeliveries(15)
                .totalEarnings(300.0)
                .currentTier("Bronze")
                .ordersLeftForNextTier(5));
    }

    @Override
    public CurrentQuestProgress getCurrentQuestProgress(String courierId) {
        return questProgressMap.get(courierId);
    }

    @Override
    public CourierAchievements getCourierAchievements(String courierId) {
        return achievementsMap.get(courierId);
    }
}
