public class FibonacciSeries {
    static int fib(int n){
        if(n == 1  || n==2)
        return 1;
        else {
            System.out.print(n+" ");
            int i = fib(n - 1) + fib(n - 2);
            return i;

        }
    }


    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
