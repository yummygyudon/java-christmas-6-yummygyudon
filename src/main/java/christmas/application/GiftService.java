package christmas.application;

import christmas.domain.enums.Badge;
import christmas.global.constant.Standard;


class GiftService {

    public boolean isGiveaway(int totalAmount) {
        return totalAmount >= Standard.MINIMUM_AMOUNT_FOR_GIVEAWAY_EVENT;
    }


    public boolean isBadge(int discountAmount) {
        return discountAmount >= Standard.MINIMUM_AMOUNT_FOR_BADGE_EVENT;
    }
    public Badge checkForBadge(int discountAmount) {
        if (discountAmount >= Badge.SANTA.getPriceCriteria()) {
            return Badge.SANTA;
        }
        if (discountAmount >= Badge.TREE.getPriceCriteria()) {
            return Badge.TREE;
        }
        return Badge.STAR;
    }
}
