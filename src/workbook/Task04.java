package workbook;

public class Task04 {
    public static void main (String[] args) {
        int x = 5;
        int y = 10;
        int sum = sum(x, y);
        int multi = multi(x, y);
        int result = sum(multi, sum);
        System.out.println(result);
    }
    static int sum(int x, int y) {
        return x + y;
    }
    static int multi(int x, int y) {
        return x * y;
    }
}
