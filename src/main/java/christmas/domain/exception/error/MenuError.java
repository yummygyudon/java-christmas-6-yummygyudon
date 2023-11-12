package christmas.domain.exception.error;

import christmas.global.exception.base.ChristmasPlannerError;

public enum MenuError implements ChristmasPlannerError {

    MENU_NOT_FOUND("유효하지 않은 주문입니다. 다시 입력해 주세요."),
    ;

    private final String errorMessage;

    MenuError(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }
}
