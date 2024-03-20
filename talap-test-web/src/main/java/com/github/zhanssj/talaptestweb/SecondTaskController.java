package com.github.zhanssj.talaptestweb;

import com.github.zhanssj.talaptestcore.PalindromeChecker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/second-task")
public class SecondTaskController {

    @GetMapping
    public String taskPage(Model model) {
        return "second-task";
    }

    @PostMapping
    public String processForm(@RequestParam String text, Model model) {
        boolean isPalindrome = PalindromeChecker.isPalindrome(text);
        model.addAttribute("original", text);
        model.addAttribute("res", "%s is %s palindrome".formatted(text, isPalindrome ? "" : "not"));
        return "second-task";
    }
}
