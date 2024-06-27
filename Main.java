public class Main {
    public static void main(String[] args) {
        Math.max(5, 7); // gives the bigger value out of the two
        Math.min(5, 7); // gives you the lower value out of the two
        Math.sqrt(36); // gives the square root of a number
        Math.abs(-76); // returns the positive value of that number (gets rid of -)

        Math.random(); // will randomly generate a number between 0(inclusive) and 1(exclusive)

        // To get more control of the range you can:
        int randomNum = (int) (Math.random() * 101); // 0 to 100
        System.out.println(randomNum);
    }
}