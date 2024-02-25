package labs.passwordgenerator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class PasswordGenerator {
    @JsonProperty("random_password")
    private String randomPassword;
}
