package bt6;

public class LazyPrimeFactorization implements Runnable {
    private String name;
    public LazyPrimeFactorization(String name) {
        this.name = name;
    }
    public boolean check(int number){
        if(number<2){
            return false;
        }else {
            for(int i=2;i<number-1;i++){
                if(number%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    @Override
    public void run() {
            long starttime = System.currentTimeMillis();
          for(int i=0;i<50;i++){
              if(check(i)){
                  System.out.println( this.name +  " :" + "Các số nguyên tố là " + i + " \t");
              }
          }
          long endtime = System.currentTimeMillis();
        System.out.println("Thời gian thực thi thuật toán của   " + this.name + " là : " + (endtime-starttime) + " s");

    }
}
