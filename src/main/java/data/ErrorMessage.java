package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorMessage {
    REQUIRED_FIELD_ERROR_MESSAGE("This is a required field."),
    ACCOUNT_ERROR("The account sign-in was incorrect or your account is disabled temporarily. "+
            "Please wait and try again later."),
    MISSING_PASSWORD_ERROR("A login and a password are required.");

    private final String value;
}