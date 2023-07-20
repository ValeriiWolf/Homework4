
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int age = 55;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        int outsideTemperature = 3;
        if (outsideTemperature < 5) {
            System.out.println("На улице " + outsideTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + outsideTemperature + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        int speed = 56;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        int age = 61;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать.");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        } else if (age > 24 && age <= 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть.");
        }
    }

    public static void task5() {
        int childsAge = 15;
        if (childsAge < 5) {
            System.out.println("Если возраст ребенка равен " + childsAge + ", то ему нельзя кататься на аттракционе");
        } else if (childsAge >= 5 && childsAge < 14) {
            System.out.println("Если возраст ребенка равен " + childsAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childsAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        int sumPlaces = 102;
        int sumPlacesSedentary = 60;
        int sumPlacesStanding = sumPlaces - sumPlacesSedentary;
        int sumPeople = 103;
        if(sumPeople > 102){
            System.out.println("Вагон полностью забит");
        }else if(sumPeople <= 60){
            int razPlacesSedentary = sumPlacesSedentary - sumPeople;
            System.out.println("В вагоне есть еще "+razPlacesSedentary+" сидячих мест и "+sumPlacesStanding+" стоячих места");
        }else {
            int razPlacesStanding = sumPlaces - sumPeople;
            System.out.println("В вагоне есть еще "+razPlacesStanding+" стоячих мест");
        }
    }

    public static void task7() {
        int one = 5;
        int two = 4;
        int three = 4;
        if(one >= two && two >= three){
            System.out.println("самое большое число "+one);
        }else if(one <= two && two >= three){
            System.out.println("самое большое число "+two);
        }else {
            System.out.println("самое большое число "+three);
        }
    }
}