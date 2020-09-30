package workbook;

public class Task05 {
    public static void main(String[] args) {
        int fifaTimeGameInSecond = 86500;
        fifaTimeGameInSecond = (args.length == 1) ? Integer.parseInt(args[0]) : fifaTimeGameInSecond;
        int W = fifaTimeGameInSecond/604800;
        int D = fifaTimeGameInSecond % 604800 / 86400;
        int H = fifaTimeGameInSecond % 604800 % 86400/3600;
        int m = fifaTimeGameInSecond % 604800 %86400 % 3600/60;
        int s = fifaTimeGameInSecond %604800 % 86400 % 3600 % 60;
        System.out.println(W+ " week(s) "+D+ " day(s) " +H+ " hour(s) : "+m+" min : "+s+ " sec ");
        }
}

