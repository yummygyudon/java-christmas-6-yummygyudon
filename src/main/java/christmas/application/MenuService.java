package christmas.application;

import christmas.domain.entity.Menu;
import christmas.domain.repository.MenuRepository;
import christmas.global.constant.Standard;


class MenuService {
    MenuService() {
    }

    public Menu getMenu(String name) {
        return MenuRepository.findMenuByName(name);
    }

    public Menu getGiveawayMenu() {
        return MenuRepository.findMenuByName(Standard.GIVEAWAY_MENU_NAME);
    }


}
