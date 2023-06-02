public class FibonacciSeries {
    static int fib(int num){
        //
        if(num == 1  || num==2)
        return 1;
        else {
            System.out.print(num+" ");
            int i = fib(num - 1) + fib(num - 2);
            return i;

        }
    }


    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
