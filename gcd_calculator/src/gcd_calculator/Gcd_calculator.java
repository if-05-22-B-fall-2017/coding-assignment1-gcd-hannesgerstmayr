package gcd_calculator;

/**
 * @author Hannes Gerstmayr
 */
public class Gcd_calculator {
    public static void main(String[] args) {
        int number1=15;
        int number2= 5;
        System.out.printf("(Primefactors)   Der ggT von %d und %d ist %d\n", number1, number2, gcdPrimeFactors(number1, number2));
        System.out.printf("(Euclid)         Der ggT von %d und %d ist %d\n\n", number1, number2, gcdEucledian(number1, number2));
        
        number1=19;
        number2=9;
        System.out.printf("(Primefactors)   Der ggT von %d und %d ist %d\n", number1, number2, gcdPrimeFactors(number1, number2));
        System.out.printf("(Euclid)         Der ggT von %d und %d ist %d\n\n", number1, number2, gcdEucledian(number1, number2));
        
        number1=16;
        number2=8;
       System.out.printf("(Primefactors)   Der ggT von %d und %d ist %d\n", number1, number2, gcdPrimeFactors(number1, number2));
        System.out.printf("(Euclid)         Der ggT von %d und %d ist %d\n\n", number1, number2, gcdEucledian(number1, number2));
        
        number1=44;
        number2=14;
        System.out.printf("(Primefactors)   Der ggT von %d und %d ist %d\n", number1, number2, gcdPrimeFactors(number1, number2));
        System.out.printf("(Euclid)         Der ggT von %d und %d ist %d\n\n", number1, number2, gcdEucledian(number1, number2));
        
        number1=456456;
        number2=3456;
        System.out.printf("(Primefactors)   Der ggT von %d und %d ist %d\n", number1, number2, gcdPrimeFactors(number1, number2));
        System.out.printf("(Euclid)         Der ggT von %d und %d ist %d\n\n", number1, number2, gcdEucledian(number1, number2));
    }
    
    public static int gcdPrimeFactors(int number1, int number2){
        int[] primeFactorsNumber1=new int[number1];
        int[] primeFactorsNumber2=new int[number2];
        int countFactorsNumber1=0;
        int countFactorsNumber2=0;

        for ( int i = 1 ; i <= number1 ; i++ ){
            if ( number1 % i == 0 ){
                primeFactorsNumber1[countFactorsNumber1] = i;
                countFactorsNumber1++;
            }
	}
        for ( int i = 1 ; i <= number2 ; i++ ){
            if ( number2 % i == 0 ){
                primeFactorsNumber2[countFactorsNumber2] = i;
                countFactorsNumber2++;
            }
	}
        
        int gcd = 0;
	for ( int i = 0 ; i < countFactorsNumber1 ; i++ ){
            for ( int j = 0 ; j < countFactorsNumber2 ; j++){
                if ( primeFactorsNumber1[i] == primeFactorsNumber2[j] ){
                    if ( primeFactorsNumber1[i] > gcd ){
                            gcd = primeFactorsNumber1[i];
                    }
                }
            }
	}
        return gcd;
    }

    public static int gcdEucledian(int number1, int number2){
        if (number2 == 0) {
            return number1;
        } else {
            return gcdEucledian(number2, number1 % number2);
        }
    }
}