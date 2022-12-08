public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        char clientOS = 'i';
        switch (clientOS) {
            case ('a'):
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            case ('i'):
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            default:
                System.out.println("Скачивание приложения недоступно");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        char clientOS = 'a';
        int clientDeviceYear = 2011;
        if (clientOS == 'i' && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 'i') {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 'a' && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 1204;
        int leapYear1 = year % 4;
        int leapYear2 = year % 100;
        int leapYear3 = year % 400;
        if (leapYear3 == 0) {
            System.out.println(year + " год является високосным");
        } else if (leapYear1 == 0 && leapYear2 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 55;
        int deliveryTime = 1;
        System.out.println("Клиент находится на расстоянни "+deliveryDistance+" киллометров, это влияет на время доставки.");
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryTime < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        }else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц под номером "+monthNumber+" принадлежит сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц под номером "+monthNumber+" принадлежит сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц под номером "+monthNumber+" принадлежит сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц под номером "+monthNumber+" принадлежит сезону осень");
                break;
            default:
                System.out.println("Месяца под номером "+monthNumber+" не существует");
        }
    }
}