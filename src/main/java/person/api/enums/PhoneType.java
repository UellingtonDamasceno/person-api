package person.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author Uellington Damasceno
 */
@AllArgsConstructor
@Getter
public enum PhoneType {
    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");

    private final String type;

}
