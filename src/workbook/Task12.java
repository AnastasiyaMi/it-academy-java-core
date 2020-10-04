package workbook;

public class Task12 {
    public static void main(String[] args){
        int factorial = 1;
        int i = 0;
        while (i <= 10) {
            if (i == 0) {
                factorial = 1;
            } else {
                factorial *= i;
            }
            i++;
            System.out.println (factorial);
        }

    }
}
