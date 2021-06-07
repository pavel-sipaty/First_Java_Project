package Completed;

public class Task6_1 {

    public static void main(String[] args) {

        String str = "Перестановочный алгоритм быстрого действия";





        for(int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);
            if(str.charAt(i) == 'о') {
                letter = str.charAt(i);
                System.out.print(letter + " ");
            }
                //System.out.println(str.indexOf('о'));
        }

        //System.out.println(str.length());

    }
}
