package Completed;

public class Task2_1 {
    public static void main(String[] args) {
        int a;
        int b;
        int sum;
        int subtract;
        int multiply;
        int divide;
        int rem;

        a = 1035;
        b = 318;

        sum = a+b;
        subtract = a-b;
        multiply = a*b;
        divide = a/b;
        rem = a%b;

        System.out.println("Сумма " + sum);
        System.out.println("Вычитание " + subtract);
        System.out.println("Умножение " + multiply);
        System.out.println("Деление " + divide);
        System.out.println("Остаток от делеиня " + rem);
        System.out.println();
        System.out.println("============");

        ///////////////////////////

        // Проверка на четность.
        int chetA = a%2;
        int chetB = b%2;

        if(chetA == 0){
             System.out.println("Число " + a + " четное.");
         }else {
             System.out.println("Число " + a + " нечетное.");
         }

        if(chetB == 0){
            System.out.println("Число " + b + " четное.");
        }else {
            System.out.println("Число " + b + " нечетное.");
        }

    }
}
