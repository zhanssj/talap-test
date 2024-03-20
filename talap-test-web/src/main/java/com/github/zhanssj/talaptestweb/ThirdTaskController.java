package com.github.zhanssj.talaptestweb;

import com.github.zhanssj.talaptestcore.NumberReverser;
import com.github.zhanssj.talaptestcore.PalindromeChecker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/third-task")
public class ThirdTaskController {

    @GetMapping
    public String taskPage(Model model) {
        return "third-task";
    }

    @PostMapping
    public String processForm(@RequestParam String numStr, Model model) {
        try {
            int num = Integer.parseInt(numStr);
            int reversedNumber = NumberReverser.reverseNumber(num);
            model.addAttribute("original", numStr);
            model.addAttribute("res", reversedNumber);
        } catch (Exception e) {
            model.addAttribute("error", "Please enter valid integer");
        }
        return "third-task";
    }
}
