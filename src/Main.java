public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 ");

        int ageMasha = 17;
        if (ageMasha >= 18) {
            System.out.println("Если возраст человека равен " + ageMasha + "он совершеннолетний");
        } else {
            System.out.println(" Если возраст человека равен " + ageMasha + " он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задача 2 ");
        int temperature = 1;
        if (temperature < 5) {
            System.out.println(" На улице " + temperature + " градусов нужно надеть шапку ");
        } else {
            System.out.println("на улице " + temperature + " градусов можно идти без шапки ");
        }
        System.out.println("Задача 3 ");
        int speed = 80;
        if (speed > 60) {
            System.out.println(" Если скорость " + speed + " придеться заплатить штраф");
        } else {
            System.out.println("Если скорсть " + speed + " можно ездить спокойно ");
        }
        System.out.println("Задача 4 ");
        int age2 = 33;
        if (age2 > 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в детский сад");
        } else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + " то ему нужно ходить в школу");
        } else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + " то его место в университет");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + " то ему пора ходить на работу");
        }
        System.out.println("Задача 5 ");
        int ageBaby = 4;
        if (ageBaby <= 5) {
            System.out.println(" Если возраст ребенка равен " + ageBaby + " то нельзя кататься ");
        } else if (ageBaby >= 6 && ageBaby <= 14) {
            System.out.println(" Если возраст ребенка равен " + ageBaby + " то он моет кататься в сопровождении взрослого ");
        } else if (ageBaby > 14) {
            System.out.println(" Если возраст ребенка равен " + ageBaby + " то он может каться без сопровождения взрослого ");
        }
        System.out.println("Задача 6 ");
        int maxPassenger = 120;
        int seatedPassenger = 60;
        int passenger = 99;
        if (passenger <= seatedPassenger) {
            System.out.println("есть сидячие места");
        } else {
            System.out.println(" Сидячих мест нет ");
        }
        if (passenger < maxPassenger) {
            System.out.println(" Есть свободные места в вагоне ");
        } else {
            System.out.println(" нет свободных мест ");
        }

        System.out.println("Задача 7 ");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println(" one большее число ");
        } else {
            if (two > three) {
                System.out.println(" two большее число ");
            } else {
                System.out.println(" three большее число");
            }
        }
    }
}



