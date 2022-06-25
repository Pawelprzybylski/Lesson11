public enum Currency {

    ZŁOTY("zł"),
    EURO("\u20ac"),
    DOLLARS("$"),
    BRITISH_POUNDS("\u00a3");

    final String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }

}
