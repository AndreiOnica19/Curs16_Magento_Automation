package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Colours {
    ERROR_RED_COLOUR("rgb(224, 43, 39)"),
    GREY_COLOUR("rgb(110, 113, 110)"),
    ORANGE_COLOUR("rgb(255, 1, 1)");

    private final String value;
}
