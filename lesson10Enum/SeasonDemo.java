package lesson10Enum;

/**
 * Created by student on 6/3/2018.
 */
public class SeasonDemo {
    public static void main(String[] args) {
        Season myFavSeason = Season.SPRING;
        System.out.println(myFavSeason);
        printSeason(myFavSeason);
        printAllSeason();
        printSeason("AUTUMN");
    }

    public static void printSeason(Season season) {

        switch (season) {
            case SPRING:
                System.out.println("Я люблю весну");
                break;
        }
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
        }
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
        }
        switch (season) {
            case AUTUMN:
                System.out.println("Я люблю осень");
        }
    }

    public static  void printAllSeason(){
        Season[] seasons = Season.values();
        for (Season season:seasons){
            System.out.println(season+" средняя температура " + season.getTemp() + season.getDescription());
        }
    }

    public static void printSeason(String str){
        Season someSeason = Season.valueOf(str);
        System.out.println(someSeason);
    }
}
