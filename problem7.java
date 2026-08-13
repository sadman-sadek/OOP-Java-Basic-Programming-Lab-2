public class Problem7 {
    public static void main(String[] args) {
        int first = 10;
        int second = 20;

        System.out.println("Before swapping:");
        System.out.println("First = " + first);
        System.out.println("Second = " + second);

        int temp = first;
        first = second;
        second = temp;

        System.out.println("After swapping:");
        System.out.println("First = " + first);
        System.out.println("Second = " + second);
    }
}