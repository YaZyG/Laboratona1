public class Main {
    public static void main(String[] args) {
        int number = 538;
        int reversed = 0;
        while (number > 0) {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }
        System.out.println("Реверснуте число: " + reversed);
    }
}