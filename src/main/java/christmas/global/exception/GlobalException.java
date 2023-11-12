package christmas.global.exception;

import christmas.global.exception.base.ChristmasPlannerException;

public class GlobalException extends ChristmasPlannerException {

    public GlobalException(GlobalError error) {
        super(error);
    }
}
