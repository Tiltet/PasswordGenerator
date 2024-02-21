package labs.passwordgenerator.serviсe;

import java.util.logging.Logger;
import labs.passwordgenerator.model.PasswordGenerator;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class PasswordGeneratorService {
    static Logger logger = Logger.getLogger(PasswordGeneratorService.class.getName());
    public static PasswordGenerator getRequest(String length) {
        String template = "https://api.api-ninjas.com/v1/passwordgenerator?length=%s";
        String token = "rWcguFvzEMEe127Sr+jUEQ==uBe90hLtpkoaq8Is";
        String url = String.format(template, length);

        WebClient.Builder builder = WebClient.builder();

        PasswordGenerator response = WebClient.builder()
                .baseUrl(url)
                .defaultHeader("X-Api-Key", token)
                .build()
                .get()
                .retrieve()
                .bodyToMono(PasswordGenerator.class)
                .block();
        logger.info("------------------------------------------------------");
        logger.info(response.toString());
        logger.info("------------------------------------------------------");

        return response;
    }
}