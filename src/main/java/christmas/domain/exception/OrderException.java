package christmas.domain.exception;

import christmas.domain.exception.error.OrderError;
import christmas.global.exception.base.ChristmasPlannerException;

public class OrderException extends ChristmasPlannerException {
    public OrderException(OrderError error) {
        super(error);
    }
}
