package Completed;

public class Task3_3 {

    public static void main(String[] args) {

        int a = 50;

        if(a > 10){
            System.out.println("больше 10");
        }else {
            System.out.print("");
        }

        if(a < 100) {
            System.out.println("a меньше 100");
        }else {
            System.out.print("");
        }

        if (a / 2 > 20) {
            System.out.println("результат деления на 2 больше 20");
        }else {
            System.out.print("");
        }

        if(a >= 5 & a <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");
        }else {
            System.out.print("");
        }

        if(a < 5 || a > 40) {
            System.out.println("значение переменной меньше 5 или больше 40");
        }else {
            System.out.println("");
        }

    }
}