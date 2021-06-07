package Completed;

public class Loop2 {

    public static void main(String[] args) {

        for (int i = 9; i >= 0; i--) {

            for(int j = 9; j > i; j--) {
                System.out.print("  ");
            }

            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out .println();
        }


//        for(int i = 0; i < 10; i++) {
//
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        System.out.print("  ");
//
//        for(int i = 0; i < 9; i++) {
//
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//        System.out.print("    ");
//
//        for(int i = 0; i < 8; i++) {
//
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//        System.out.print("      ");
//
//        for(int i = 0; i < 7; i++) {
//
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//        System.out.print("        ");
//
//        for(int i = 0; i < 6; i++) {
//
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//        System.out.print("          ");
//
//        for(int i = 0; i < 5; i++) {
//
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//        System.out.print("            ");
//
//        for(int i = 0; i < 4; i++) {
//
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//        System.out.print("              ");
//
//        for(int i = 0; i < 3; i++) {
//
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//        System.out.print("                ");
//
//        for(int i = 0; i < 2; i++) {
//
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//        System.out.print("                  " + 0);


    }
}
