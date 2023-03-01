/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        
        int number = getInputNumber();
        
        int sum = sumOfNumbers(number);

        timeTester(number);
        
        System.out.println(sum);

    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int n) {
        int sum = 0;
        for(int i = 0; i < n+1; i++){
            sum+= i;
        }

        return sum;
    }
    
    
    static int getInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    
    
    
    // for Extra Credit
    static int gaussianSumOfNumbers(int n) {
        return (n*(n+1))/2;
    }

    static void timeTester(int number){
        long start = 0;
        long end = 0;
        long loop = 0;
        long gauss = 0;
        start = System.currentTimeMillis();
        sumOfNumbers(number);
        end = System.currentTimeMillis();
        loop = end-start;
        start = System.currentTimeMillis();
        gaussianSumOfNumbers(number);
        end = System.currentTimeMillis();
        gauss = end-start;
        if(gauss<loop){
            System.out.println("gaussian is faster");
        }
        else if(loop<gauss){
            System.out.println("looping is faster");
        }
        else{
            System.out.println("They match??");
        }
    }

    //gaussian is faster, low values they are equal, i initially used a different time function.
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
