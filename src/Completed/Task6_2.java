package Completed;

public class Task6_2 {

    public static void main(String[] args) {

        String s = "Перевыборы выбранного президента";

        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if(s.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println(count);

    }

}
