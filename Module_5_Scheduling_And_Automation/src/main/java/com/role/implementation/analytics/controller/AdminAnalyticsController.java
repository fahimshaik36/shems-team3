package com.role.implementation.analytics.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.role.implementation.analytics.service.AdminAnalyticsService;
import com.role.implementation.repository.UserRepository;
import com.role.implementation.model.User;

@Controller
public class AdminAnalyticsController {

    private final AdminAnalyticsService adminAnalyticsService;
    private final UserRepository userRepository;

    public AdminAnalyticsController(AdminAnalyticsService adminAnalyticsService,
                                    UserRepository userRepository) {
        this.adminAnalyticsService = adminAnalyticsService;
        this.userRepository = userRepository;
    }

    // ================= ADMIN — SYSTEM WIDE ANALYTICS DASHBOARD =================
    @GetMapping("/admin/analytics")
    public String showAdminAnalytics(Model model) {

        // 🔋 Total system energy today
        model.addAttribute("totalEnergyToday",
                adminAnalyticsService.getTotalEnergyToday());

        // 📅 Total system energy this week
        model.addAttribute("totalEnergyThisWeek",
                adminAnalyticsService.getTotalEnergyThisWeek());

        // 📈 System energy for last 7 days (GRAPH)
        model.addAttribute("weeklySystemEnergy",
                adminAnalyticsService.getSystemLast7DaysEnergy());

        // 🔝 Top 5 energy consuming devices today
        model.addAttribute("topDevices",
                adminAnalyticsService.getTop5DevicesToday());

        // ⚡ Active devices count
        model.addAttribute("activeDevices",
                adminAnalyticsService.getActiveDeviceCount());

        // 🚨 Users who have peak device usage today
        Map<Integer, Boolean> userPeakMap =
                adminAnalyticsService.getUsersWithPeakUsage();
        model.addAttribute("userPeakMap", userPeakMap);

        // 🆕 Convert User IDs → User Names for display
        Map<Integer, String> userNames = new HashMap<>();
        for (Integer userId : userPeakMap.keySet()) {
            User user = userRepository.findById(userId).orElse(null);
            if (user != null) {
                userNames.put(userId, user.getName());
            }
        }
        model.addAttribute("userNames", userNames);

        // 💡 Smart system recommendations
        model.addAttribute("systemRecommendations",
                adminAnalyticsService.getSystemRecommendations());

        return "admin-analytics"; // templates/admin-analytics.html
    }
}
