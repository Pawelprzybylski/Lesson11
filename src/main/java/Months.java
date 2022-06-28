import java.time.Month;
public class Months {

    public static void printSeason(Month month) {
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println(Seasons.WINTER);
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println(Seasons.SPRING);
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println(Seasons.SUMMER);
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println(Seasons.AUTUMN);
        }
    }

}













