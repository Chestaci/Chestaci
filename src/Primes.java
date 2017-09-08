import java.util.Arrays;

public class Primes {

    private boolean primes[];

    public Primes(int number){
        primes = new boolean[number+1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for(int i = 2;i*i < number;i++){
            if(primes[i]){
                for(int j=i*i;j < number;j+=i){
                    primes[j] = false;
                }
            }
        }

    }
}

