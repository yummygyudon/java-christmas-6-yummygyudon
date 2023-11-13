package christmas.application;

import christmas.domain.enums.Badge;
import christmas.global.constant.Standard;


class GiftService {

    GiftService() {
    }

    /** 증정 Menu(Giveaway) 관련 기능 */
    boolean isGiveaway(int totalAmount) {
        return totalAmount >= Standard.MINIMUM_AMOUNT_FOR_GIVEAWAY_EVENT;
    }

    /** 증정 Badge 관련 기능 */
    boolean isBadge(int discountAmount) {
        return discountAmount >= Standard.MINIMUM_AMOUNT_FOR_BADGE_EVENT;
    }

    Badge checkForBadge(int discountAmount) {
        if (discountAmount >= Badge.SANTA.getPriceCriteria()) {
            return Badge.SANTA;
        }
        if (discountAmount >= Badge.TREE.getPriceCriteria()) {
            return Badge.TREE;
        }
        return Badge.STAR;
    }
}
