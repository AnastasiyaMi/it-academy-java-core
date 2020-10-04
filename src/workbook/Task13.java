package workbook;

public class Task13 {
    public static void main (String[] args) {
        int multi = 1;
        int i = 1;
        do {
            multi *= i;
            i++;
        } while (i <= 25);
        System.out.println (multi);
    }
}
