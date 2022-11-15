public class Main {
    public static void main(String[] args) {

         int age [] = new int [3];
        age[0] = 1;
        age[1] = 2;
        age[2] = 3;
        for (int i = 2; i >= 0; i--) {
            if (age[i] % 2 != 0) {
              age[i] = age[i] + 1;
            }
            if (i == 0) {
                System.out.printf("%s", age[i]);
            }
            else
                System.out.printf("%s,", age[i]);
        }

        System.out.println();
        double sum [] = { 1.57, 7.654, 9.986};
        for (int a = 2; a >= 0 ; a--){
            if (a == 0)
                System.out.printf("%s ",sum[a]);
            else
                System.out.printf("%s, ",sum[a]);
        }
        System.out.println();
        int number [] = {2, 3, 9, 30, 143, 189, 1020};
        for (int s = 6; s >= 0; s--) {
            if (s == 0)
                System.out.printf("%s ", number[s]);
            else
                System.out.printf("%s, ", number[s]);
        }






    }
}