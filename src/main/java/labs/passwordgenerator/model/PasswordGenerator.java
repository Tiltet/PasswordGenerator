package labs.passwordgenerator.model;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class PasswordGenerator {
    private String random_password;
}
