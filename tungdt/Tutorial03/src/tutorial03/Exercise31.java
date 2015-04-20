/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial03;

/**
 *
 * @author Tung
 */
public class Exercise31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int value1, value2;   // The values rolled on the two dice.
        int countRolls;   // Used to count the number of rolls.
        countRolls = 0;
        
        do {
            value1 = (int)(Math.random()*6) + 1;   // roll the dice
            value2 = (int)(Math.random()*6) + 1;
            countRolls++;                        // and count this roll
        } while ( value1 != 1 || value2 != 1 );
        
        System.out.println("It took " + countRolls + " rolls to get snake eyes.");
   
   }  // end main()

}  // end class