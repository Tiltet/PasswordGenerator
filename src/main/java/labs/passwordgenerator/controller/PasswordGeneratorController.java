package labs.passwordgenerator.controller;

import labs.passwordgenerator.model.PasswordGenerator;
import labs.passwordgenerator.serviсe.PasswordGeneratorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/api/v1"})
public class PasswordGeneratorController {

    @GetMapping({"/password"})
    public String hello(@RequestParam(defaultValue = "5") int length) {

        // return PasswordGenerator.builder().length(length).build();
        return PasswordGeneratorService.getRequest(length);
    }
}

/*
package com.Faceit.Faceit.controller;

import com.Faceit.Faceit.service.FaceitService;
import com.Faceit.Faceit.model.SearchResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stats")
public class FaceitController {
    @GetMapping("/sashka")
    public String hello(@RequestParam(defaultValue = "s1mple") String nickname) {
        return FaceitService.getRequest(nickname);
    }


}*/