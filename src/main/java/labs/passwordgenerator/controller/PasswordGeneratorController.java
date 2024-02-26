package labs.passwordgenerator.controller;

import labs.passwordgenerator.model.PasswordGenerator;
import labs.passwordgenerator.service.PasswordGeneratorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/api/v1"})
public class PasswordGeneratorController {

    @GetMapping({"/password"})
    public PasswordGenerator hello(@RequestParam(defaultValue = "5") String length) {
        return PasswordGeneratorService.getRequest(length);
    }
}