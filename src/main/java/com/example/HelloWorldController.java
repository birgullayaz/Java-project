package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class HelloWorldController {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class, args);
    }

    @GetMapping("/")
    public String home(@RequestParam(name = "lang", defaultValue = "tr") String lang, Model model) {
        model.addAttribute("lang", lang);
        return "home";
    }

    @PostMapping("/submit")
    public String handleFormSubmit(
            @RequestParam(name = "isim", required = false) String isim,
            @RequestParam(name = "soyisim", required = false) String soyisim,
            @RequestParam(name = "lang", defaultValue = "tr") String lang,
            Model model) {
        model.addAttribute("lang", lang);
        if (isim == null || isim.trim().isEmpty()) {
            String errorMsg = "tr".equals(lang) ? "Lütfen bir isim giriniz." : "Please enter a name.";
            model.addAttribute("error", errorMsg);
            return "home";
        }
        
        if (soyisim == null || soyisim.trim().isEmpty()) {
            String errorMsg = "tr".equals(lang) ? "Lütfen bir soyisim giriniz." : "Please enter a surname.";
            model.addAttribute("error", errorMsg);
            return "home";
        }
        
        // Simüle edilmiş işlem
        String successMsg = "tr".equals(lang) ? "CV başarıyla işlendi!" : "CV successfully processed!";
        model.addAttribute("success", successMsg);
        
        model.addAttribute("isim", isim);
        model.addAttribute("soyisim", soyisim);
        model.addAttribute("lang", lang);
        return "result";
    }

    @GetMapping("/hello")
    public String helloWorld(@RequestParam(name = "lang", defaultValue = "tr") String lang, Model model) {
        model.addAttribute("lang", lang);
        return "home";
    }
}

