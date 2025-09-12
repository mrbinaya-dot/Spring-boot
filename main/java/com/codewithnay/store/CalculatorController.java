package com.codewithnay.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculator")

public class CalculatorController {
    @GetMapping("/add")
    public String add(@RequestParam int a , @RequestParam int b){
        int result = a + b;
        return "Addition:" + result;

    }

    @GetMapping("/subtract")
    public String subtract (@RequestParam int a , @RequestParam int b){
        int result = a - b;
        return "subtract"+result;
    }
    @GetMapping("/multiply")
    public String multioly (@RequestParam int a , @RequestParam int b){
        int result = a*b;
        return "multiply"+result;
    }

    @GetMapping("/divide")
    public String divide (@RequestParam int a , @RequestParam int b){
        if(a==0) return "connot divide";
        int result = a/b;
        return "divide"+result;
    }


}
