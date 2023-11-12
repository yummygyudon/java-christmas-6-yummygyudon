package christmas.domain.exception.error;

import christmas.global.exception.base.ChristmasPlannerError;

public enum OrderError implements ChristmasPlannerError {
    TOO_MANY_SINGLE_MENU_QUANTITY("유효하지 않은 주문입니다. 다시 입력해 주세요."),
    TOO_LITTLE_SINGLE_MENU_QUANTITY("유효하지 않은 주문입니다. 다시 입력해 주세요."),
    TOO_MANY_MENU_QUANTITY("유효하지 않은 주문입니다. 다시 입력해 주세요."),

    ONLY_BEVERAGE("유효하지 않은 주문입니다. 다시 입력해 주세요."),
    DUPLICATED_ORDER_EXIST("유효하지 않은 주문입니다. 다시 입력해 주세요."),
    ;

    private final String errorMessage;

    OrderError(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override

    public String getErrorMessage() {
        return errorMessage;
    }
}
