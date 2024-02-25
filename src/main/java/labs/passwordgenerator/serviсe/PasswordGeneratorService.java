package labs.passwordgenerator.serviсe;

import labs.passwordgenerator.model.PasswordGenerator;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class PasswordGeneratorService {

    public static PasswordGenerator getRequest(String length) {
        String template = "https://api.api-ninjas.com/v1/passwordgenerator?length=%s";
        String token = "rWcguFvzEMEe127Sr+jUEQ==uBe90hLtpkoaq8Is";
        String url = String.format(template, length);


        return WebClient.builder()
                .baseUrl(url)
                .defaultHeader("X-Api-Key", token)
                .build()
                .get()
                .retrieve()
                .bodyToMono(PasswordGenerator.class)
                .block();
    }
}