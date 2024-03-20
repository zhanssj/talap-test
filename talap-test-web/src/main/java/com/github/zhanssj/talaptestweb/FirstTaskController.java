package com.github.zhanssj.talaptestweb;

import com.github.zhanssj.talaptestcore.AverageCalculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/first-task")
public class FirstTaskController {

    @GetMapping
    public String taskPage(Model model) {
//        model.addAttribute("res", null);
//        model.addAttribute("error", null);
        return "first-task";
    }

    @PostMapping
    public String processForm(@RequestParam String nums, Model model) {
        try {
            List<Integer> integers = Arrays.stream(nums.split(" "))
                    .map(Integer::parseInt)
                    .toList();
            model.addAttribute("original", nums);
            model.addAttribute("res", AverageCalculator.calculateAverage(integers));
        } catch (Exception e) {
            model.addAttribute("error", "Please enter valid integers");
        }
        return "first-task";
    }
}
