public class Factorial {


    private long number;

    public Factorial(long number) {

        this.number = number;
    }

    public long getFactorial() {
        long factorial=1;
        for(int start=1;start<=number;start++){
            factorial*=start;
        }
        return factorial;
    }
}
