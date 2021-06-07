package Completed;

public class Task6_3 {

    public static void main(String[] args) {

        String s = "Посмотрите как Рите нравится ритм";

        String sLower = s.toLowerCase();
        //System.out.println(sLower);

        int index = sLower.indexOf("рит");
        while(index != -1){
            System.out.println(index);
            index = sLower.indexOf("рит", index + 1);
            }

    }

}
