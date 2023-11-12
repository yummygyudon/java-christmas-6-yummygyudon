package christmas.domain.exception;

import christmas.domain.exception.error.MenuError;
import christmas.global.exception.base.ChristmasPlannerException;

public class MenuException extends ChristmasPlannerException {
    public MenuException(MenuError error) {
        super(error);
    }
}
