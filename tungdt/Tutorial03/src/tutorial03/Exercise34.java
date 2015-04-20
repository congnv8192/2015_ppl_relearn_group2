/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial03;
import userlib.TextIO;

/**
 *
 * @author Tung
 */
public class Exercise34 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
   
       String line;    // A line of text, typed in by the user.
       int i;          // Position in line, from 0 to line.length() - 1.
       char ch;        // One of the characters in line.
       boolean didCR;  // Set to true if the previous output was a carriage return.
       
       TextIO.putln("Enter a line of text.");
       TextIO.put("? ");
       line = TextIO.getln();
       
       TextIO.putln();
       didCR = true;
       
       for ( i = 0;  i < line.length();  i++ ) {
          ch = line.charAt(i);
          if ( Character.isLetter(ch) ) {
             TextIO.put(ch);
             didCR = false;
          }
          else {
             if ( didCR == false ) {
                TextIO.putln();
                didCR = true;
             }
          }
       }
       
       TextIO.putln();  // Make sure there's at least one carriage return at the end.
         
   }  // end main()

}  // end class ListWordsInString