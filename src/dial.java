public class dial {
    public static void main(String[] args) {
        String[] dial = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
        int time = 0;
        String input = new java.util.Scanner(System.in).next();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < dial.length; j++) {
                if (dial[j].indexOf(input.charAt(i)) != -1) {
                    time += j + 3;
                    break;
                }
            }
        }
        System.out.println(time);
    }
}
