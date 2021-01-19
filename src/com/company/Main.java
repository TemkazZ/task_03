package com.company;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//        // 1)  Написать программу, вводящую с клавиатуры число и выводящую сообщение «less», если его значение меньше 100, «not less» - иначе.
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//
//        if (number<100){
//            System.out.println( "less" );
//        }
//        else {
//            System.out.println( "not less" );
//        }
//    }


//    public static void main(String[] args) {
//        Scanner console  = new Scanner(System.in);
//        // String name = scanner.nextLine();
//        int n = console.nextInt();
//        switch (n){
//            case 2 :
//                System.out.println( "2 - неудовлетворительно" );
//                break ;
//            case 3 :
//                System.out.println( "3 - удовлетворительно" );
//                break ;
//            case 4 :
//                System.out.println( "4 - хорошо" );
//                break ;
//            case 5 :
//                System.out.println( "5 - отлично" );
//                break ;
//            default :
//                System.out.println( "число не в диапозоне от 2 до 5" );
//        }
//    }




//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        // String name = scanner.nextLine();
//        String day = console.nextLine();
//        switch (day) {
//            case "Monday":
//                System.out.println("1");
//                break;
//            case "Tuesday":
//                System.out.println("2");
//                break;
//            case "Wednesday":
//                System.out.println("3");
//                break;
//            case "Thursday":
//                System.out.println("4");
//                break;
//            case "Friday":
//                System.out.println("5");
//                break;
//            case "Saturday":
//                System.out.println("6");
//                break;
//            case "Sunday":
//                System.out.println("7");
//                break;
//            default:
//                System.out.println("Используй данные слова");
//                DayOfWeek[] dayOfWeeks = DayOfWeek.values();
//                for (int i = 0; i < dayOfWeeks.length; i++) {
//                    DayOfWeek dayOfWeek = dayOfWeeks[i];
//                    System.out.println(dayOfWeek + " ");
//                }
//        }
//    }

//    public static void main(String[] args) {
//        // Get DayOfWeek enums value
//        System.out.println("Введите баллы");
//        Scanner console  = new Scanner(System.in);
//        int Mark = console.nextInt();
//
//        if((Mark >=91) && (Mark<=100)){
//            System.out.println("балл " + Mark + " соответствует разряду А");
//        }
//        if((Mark >=81) && (Mark<=90)){
//            System.out.println("балл " + Mark + " соответствует разряду B");
//        }
//        if((Mark >=71) && (Mark<=80)){
//            System.out.println("балл " + Mark + " соответствует разряду C");
//        }
//        if((Mark >=61) && (Mark<=70)){
//            System.out.println("балл " + Mark + " соответствует разряду D");
//        }
//        if((Mark >=51) && (Mark<=60)){
//            System.out.println("балл " + Mark + " соответствует разряду E");
//        }
//        if(Mark <=50){
//            System.out.println("балл " + Mark + " соответствует разряду F");
//        }
//        if(Mark >100){
//            System.out.println("балл " + Mark + " не существует");
//        }
//
//    }

    //5.1
//    public static void main(String[] args) {
//        double a = 8.53;
//        double b = 17.1;
//        //double x = 2.5;
//        double x = -3.1;
//        double y;
//
//
//        if (x > 0) {
//            y = (a + (1 / 2 * Math.pow(Math.E, -x)));
//        } else {
//            y = Math.cos(b * x + 1);
//        }
//        System.out.println("y = " + y);
//    }

    public static void main(String[] args) {
        double a = 7.1;
        double b = 3.2;
        double x = -3.04;
        //double x = -2.16;
        //double x= 5.37
        double y;


        if (x <= 0) {
            y = (a + (1 / 2 * Math.pow(Math.E, -x)));
        } else if ((0 < x) && (x < 4)) {
            y = Math.sin(Math.pow(b, 2) * x);
        } else {
            y = Math.sqrt(Math.pow(x, 2) + 2 * a);
        }

        System.out.println("y = " + y);
    }
}
