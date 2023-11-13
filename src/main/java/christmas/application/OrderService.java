package christmas.application;

import christmas.domain.entity.Order;
import christmas.domain.enums.MenuType;
import christmas.domain.repository.OrderRepository;
import christmas.application.info.EventResultInfo;

import java.util.List;
import java.util.stream.Collectors;

class OrderService {
    private final OrderRepository orderRepository;

    OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    /** Order 등록 */
    void registerOrders(List<Order> orders) {
        orderRepository.insert(orders);
    }



    /** Order 연산 기능 */
    // 해당 MenuType 에 해당하는 메뉴들이 존재하는지 확인
    boolean isExistAnyMenuTypeInOrders(MenuType menuType) {
        return orderRepository.findAll().stream()
                .anyMatch(order -> order.getMenu().getType().equals(menuType));
    }

    // 전체 금액 연산
    int getTotalAmount() {
        int totalAmount = 0;
        for (Order eachOrder : orderRepository.findAll()) {
            totalAmount += eachOrder.calculateTotalPrice();
        }
        return totalAmount;
    }

    // 해당 MenuType 에 해당하는 메뉴들을 몇 개나 시켰는지 연산
    int getOrdersCountByMenuType(MenuType menuType) {
        long totalOrderCount = orderRepository.findAll().stream()
                .filter(order -> order.getMenu().getType().equals(menuType))
                .count();
        return (int) totalOrderCount;
    }

    // 주문 정보 반환 (직접적인 Menu 객체를 노출시키지 않고 DTO로 반환)
    List<EventResultInfo.ReceiveMenu> getOrdersHistory() {
        return orderRepository.findAll().stream()
                .map(order -> new EventResultInfo.ReceiveMenu(
                        order.getMenu().getName(), order.getQuantity()
                ))
                .collect(Collectors.toList());
    }

}
