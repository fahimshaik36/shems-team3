package com.role.implementation.analytics.service;

import java.util.Map;

public interface AdminAnalyticsService {

    // 🔋 Total system energy today
    double getTotalEnergyToday();

    // 📅 Total system energy this week
    double getTotalEnergyThisWeek();

    // 🔝 Top 5 energy consuming devices today
    Map<String, Double> getTop5DevicesToday();

    // ⚡ Total active devices in system
    long getActiveDeviceCount();

    // 🚨 Users having at least one device with peak usage today
    Map<Integer, Boolean> getUsersWithPeakUsage();

    // 🧠 AI-Style System Recommendations
    Map<String, String> getSystemRecommendations();

    // 📈 System energy usage for last 7 days (for admin graph)
    Map<String, Double> getSystemLast7DaysEnergy();
}
