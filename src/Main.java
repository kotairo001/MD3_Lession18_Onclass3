public class Main {
    public static void main(String[] args) {
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization(11722);
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization(11722);
        lazyPrimeFactorization.start();
        optimizedPrimeFactorization.start();
    }
}
