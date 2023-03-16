package com.yurich.ChuckNorrisService.controllers;

import com.yurich.ChuckNorrisService.services.ChuckNorrisQuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisQuotesController {

    private final ChuckNorrisQuotesService service;

    public ChuckNorrisQuotesController(ChuckNorrisQuotesService service) {
        this.service = service;
    }

    @RequestMapping({"/", ""})
    public String getRandomQuote(Model model) {
        String joke = service.getRandomQuote();
        model.addAttribute("joke", joke);
        return "index";
    }
}
