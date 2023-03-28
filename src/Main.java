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

        System.out.println("Задача 1");

        // Пишем код для задачи 1

        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 +
                    ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        int age2 = 25;
        if (age2 >= 18) {
            System.out.println("Если возраст человека равен " + age2 +
                    ", то он совершеннолетий.");
        }
    }

    public static void task2() {

        System.out.println("Задача 2");

        // Пишем код для задачи 2

        int temperature1 = 2;
        if (temperature1 < 5) {
            System.out.println("На улице " + temperature1 +
                    " градуса, нужно надеть шапку.");
        }
        int temperature2 = 10;
        if (temperature2 > 5) {
            System.out.println("На улице " + temperature2 +
                    " градусов, можно идти без шапки.");
        }
    }

    public static void task3() {

        System.out.println("Задача 3");

        // Пишем код для задачи 3

        int speed1 = 80;
        if (speed1 > 60) {
            System.out.println("Если скорость " + speed1 +
                    " то придется заплатить штраф.");
        }
        int speed2 = 50;
        if (speed2 < 60) {
            System.out.println("Если скорость" + speed2 +
                    " то можно ездить спокойно.");
        }
    }

    public static void task4() {

        System.out.println("Задача 4");

        // Пишем код для задачи 4

        int age3 = 5;
        if (age3 >= 2 && age3 <= 6) {

            System.out.println("Если человеку " + age3 + " лет, то ему нужно ходить в детский сад.");
        } else if (age3 >= 7 && age3 <= 18) {

            System.out.println("Если человеку " + age3 + " лет, то ему нужно ходить в школу.");
        } else if (age3 > 18 && age3 < 24) {

            System.out.println("Если человеку " + age3 + " лет, то ему нужно ходить в университет.");
        }

        else
            System.out.println("Если человеку больше" + age3 + " лет, то ему пора ходить на работу.");
    }


                    public static void task5 () {

                    System.out.println("Задача 5");

                    // Пишем код для задачи 5

                        int age4 = 8;
                        if(age4 < 5 ) {
                            System.out.println("Если ребенку меньше 5 лет, то он не может кататься на аттракционе.");
                        } else if (age4 >=5 && age4 <14) {
                            System.out.println("Если ребенку " + age4 +" лет, то он может кататься только в сопровождении взрослого. " +
                                    "Если взрослого нет, то кататься нельзя.");
                        } else
                            System.out.println("Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.");


                    }
            }
