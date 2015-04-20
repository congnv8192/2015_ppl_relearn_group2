/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial03;

/**
 *
 * @author Tung
 */
public class Exercise32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int H;            // One of the integers whose divisors we have to count.
        int MDivisor;  // Maximum number of divisors seen so far.
        int numWithMax;   // A value of H that had the given number of divisors.
       
        MDivisor = 1;  // Start with the fact that 1 has 1 divisor.
        numWithMax = 1;
        
        /* Process all the remaining values of H from 2 to 10000, and
         * update the values of MDivisor and numWithMax whenever we
         * find a value of H that has more divisors than the current value
         * of MDivisor.
           */
          
          for ( H = 2;  H <= 10000;  H++ ) {
              
              int D;  // A number to be tested to see if it's a divisor of H.
              int divisorCount;  // Humber of divisors of H.
              
              divisorCount = 0;
              
              for ( D = 1;  D <= H;  D++ ) {  // Count the divisors of H.
                  if ( H % D == 0 )
                  divisorCount++;
                }
                
                if (divisorCount > MDivisor) {
                    MDivisor = divisorCount;
                    numWithMax = H;
                }
            
            }
       
       System.out.println("Among integers between 1 and 10000,");
       System.out.println("The maximum number of divisors is " + MDivisor);
       System.out.println("A number with " + MDivisor + " divisors is " + numWithMax);
   
   } // end main()

}