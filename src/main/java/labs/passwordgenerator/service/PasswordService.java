package labs.passwordgenerator.service;

import labs.passwordgenerator.model.PasswordGenerator;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class PasswordService {

    private PasswordService() {
        throw new IllegalStateException("Utility class");
    }

    public static PasswordGenerator getRequest(String length) {
        String url = String.format("https://api.api-ninjas.com/v1/passwordgenerator?length=%s", length);

        return WebClient.builder()
                .baseUrl(url)
                .defaultHeader("X-Api-Key", "rWcguFvzEMEe127Sr+jUEQ==uBe90hLtpkoaq8Is")
                .build()
                .get()
                .retrieve()
                .bodyToMono(PasswordGenerator.class)
                .block();
    }
}