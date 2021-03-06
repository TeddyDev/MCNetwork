package me.lukebingham.core.i18n;

/**
 * Created by LukeBingham on 19/03/2017.
 */
public enum I18nMessage {
    ID("id"),

    // CURRENCY & ECONOMY
    COINS_SYMBOL("coins-symbol"),

    // COSMETICS
    COSMETICS("cosmetics"),
    GADGETS("gadgets"),
    HATS("hats"),
    TRAILS("trails"),
    PETS("pets"),

    // GADGETS
    GADGETS_NOT_UNLOCKED("gadget.not-unlocked"),
    GADGETS_RANK_REQUIRED("gadget.rank-required"),

    // GENERAL WORDS
    RARITY("rarity"),
    COST("cost"),
    PROFILE("profile"),
    BACK("back"),
    SELECTED("selected"),

    TEST("test"),
    ;

    private final String key;

    I18nMessage(String key) {
        this.key = key;
    }

    public final String getKey() {
        return key;
    }
}
