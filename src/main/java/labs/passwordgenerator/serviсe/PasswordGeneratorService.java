package labs.passwordgenerator.serviсe;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class PasswordGeneratorService {
    public static String getRequest(int length) {
        String template = "https://api.api-ninjas.com/v1/passwordgenerator?length=%s";
        String token = "rWcguFvzEMEe127Sr+jUEQ==uBe90hLtpkoaq8Is";
        String url = String.format(template, length);

        WebClient.Builder builder = WebClient.builder();

        String response = WebClient.builder()
                .baseUrl(url)
                .defaultHeader("X-Api-Key", token)
                .build()
                .get()
                .retrieve()
                .bodyToMono(String.class)
                .block();

        return response;
    }
}