public enum Seasons {

    Winter(12, 1, 2),
    Spring(3, 4, 5),
    Summer(6, 7, 8),
    Autumn(9, 10, 11),
    ;
    private int month1;
    private int month2;
    private int month3;

    Seasons(int month1, int month2, int month3) {
        this.month1 = month1;
        this.month2 = month2;
        this.month3 = month3;
    }

    public int getMonth1() {
        return month1;
    }

    public int getMonth2() {
        return month2;
    }

    public int getMonth3() {
        return month3;
    }
}

