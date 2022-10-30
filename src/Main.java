public class Main {
    //Exercise 1
    public static void isLeapYear(int year){
        int givenYear = year;
        if(givenYear % 4 == 0){
            System.out.println(givenYear + " — високосный год");
        }
        else {
            System.out.println(givenYear + " — не високосный год");
        }
    }

    //Exercise 2
    public static void printResult(int osType, int clientDeviceYear){
        if(clientDeviceYear < 2015 && osType == 0){
            System.out.println("установите lite-версию приложения для iOS");
            if(clientDeviceYear < 2015 && osType == 1){
                System.out.println("установите lite-версию приложения для Android");

            }
        }
        else if(clientDeviceYear >= 2015){
            System.out.println("установите приложение");
        }
    }

    public static int deliveryDays(int distance){
        int days = 0;
        if(distance <= 20){
            days = 1;
        }
        else if(distance > 20 && distance < 60){
            days = 2;
        }
        else if(distance > 60 && distance < 100){
            days = 3;
        }
        return days;
    }




    public static void main(String[] args) {
        //HW 1 Exercise 1
        System.out.println("HW 1 Exercise 1");
        isLeapYear(2025);

        //HW 1 Exercise 2
        System.out.println();
        System.out.println("HW 1 Exercise 2");
        printResult(0,2022);

        //HW 1 Exercise 3
        System.out.println();
        System.out.println("HW 1 Exercise 3");
        int deliveryDistance = 95;
        System.out.println("Потребуется дней: " + deliveryDays(deliveryDistance));
    }
}