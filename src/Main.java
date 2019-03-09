public class Main {


    public static long fib(int n) {
        if (n <= 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }


    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println("Something additional.");

    }
}
