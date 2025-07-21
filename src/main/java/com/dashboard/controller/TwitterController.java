package com.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller  // ✅ Correct annotation to render HTML
public class TwitterController {

    // ✅ This API returns fake data as JSON
    @GetMapping("/twitter-stats")
    @ResponseBody  // Important to return data as JSON
    public Map<String, Object> getTwitterStats() {
        Map<String, Object> stats = new HashMap<>();
        stats.put("followers", 1234);  // Example data
        stats.put("tweets", 567);      // Example data
        return stats;
    }

    // ✅ This returns the dashboard.html file
    @GetMapping("/dashboard")
    public String showDashboard() {
        return "dashboard";  // This will render dashboard.html from templates
    }
}



