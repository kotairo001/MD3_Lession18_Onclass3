public class OptimizedPrimeFactorization implements Runnable {
    private Thread t;
    private int targetNumber;

    public OptimizedPrimeFactorization(int targetNumber) {
        this.targetNumber = targetNumber;
    }


    @Override
    public void run() {
        try {
            System.out.println("OptimizedPrimeFactorization");
            boolean flag = true;
            if(targetNumber==2){
                System.out.println("This number is a primer");;
            } else if(targetNumber<2) {
                System.out.println("This number is not a primer");;
            } else {
                for (int i = 2; i < Math.sqrt(targetNumber); i++) {
                    if(i%i==0){
                        flag = false;
                    }
                }
            }
            if(!flag){
                System.out.println("This number is not a primer");;
            }
        } catch (Exception e) {
            System.out.println("Thread was interrupted");
        }
    }

    public void start () {
        if(t==null){
            t = new Thread(this);
            t.start();
        }
    }
}
