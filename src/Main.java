

public class Main {
    public static void main(String[] args)  //номера заданий ниже//
{   task1();
    task2();
    task3();
    task4();
    task5();
    task6();
}
    private static void task1()  {
    int  OsUser=0;
     switch  (OsUser) {
     case 1:System.out.println("Вы можете установить приложение для своего iphone");
         break;
         case 0:
         System.out.println("Вы можете установить приложение для своего android");



        }}
     private static void task2() //другой вариант решения первого задания//
     { int Os=1;
         if (Os==0){
             System.out.println("Вам нужно установить приложение для айфона");}
         else System.out.println("Вам нужно установить приложение для андроид ");
     }
     private static void task3(){ //задание 2
    int Os=0;
    int clientDeviceYear=2014;
    if (Os==1 && clientDeviceYear>=2015) System.out.println("Вам нужно установить приложение для айфона");
    else if (Os==1)
        System.out.println("Вас нужно установить приложение для айфона облегченной версии");
    else if (Os!=1&& clientDeviceYear>=2015) System.out.println("Вам нужно установить приложение для андроид!");
    else  System.out.println("Вам нужно установить приложение для андроид облегченной версии");
    }
    private static void task4() { //задание 3
        int year = 2025;
        if (year % 400 == 0 || year % 100 == 0 || year % 4 == 0) {
            System.out.println("Год " + year + " является високосным");

    }}
     private static void task5() { //задание 5;
            int deliveryDistance = 95;
            int day = 1;
            if (deliveryDistance < 20) {
                System.out.println("Доставка будет занимать 1" + " день");
            } else if (deliveryDistance >= 20 && deliveryDistance <= 60)
                System.out.println("Доставка будет занимать 2 дня");
            else if (deliveryDistance >= 60 && deliveryDistance < 100)
                System.out.println("Доставка будет занимать 3 дня");


        }
     private static void task6() { //задание6

        int monthOfYear=6;
        switch (monthOfYear) {
            case 12:
                case 1:
                case 2:
                    System.out.println("Это зима");
                    break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осень!");
            default:

        }
     }

}
