package Completed;

public class Run {

    public static void main(String[] args) {

        Fighter fighter1 = new Fighter("Lew", 10, 2);
        Fighter fighter2 = new Fighter("Harry", 5, 4);
        //String firstAttacker = "Lew";

        Kata kata = new Kata();

        String win = kata.declareWinner(fighter1, fighter2, "Lew");

        System.out.println(win);






    }

}
