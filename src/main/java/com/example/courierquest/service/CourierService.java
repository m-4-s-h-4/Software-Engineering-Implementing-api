package com.example.courierquest.service;

import com.harbour.eats.model.CurrentQuestProgress;
import com.harbour.eats.model.CourierAchievements;

public interface CourierService {
    CurrentQuestProgress getCurrentQuestProgress(String courierId);
    CourierAchievements getCourierAchievements(String courierId);
}
