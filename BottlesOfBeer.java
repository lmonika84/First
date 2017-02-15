/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trial;

/**
 *
 * @author lmonika
 */
public class BottlesOfBeer {

    public static void main(String[] args) {
        int i = 99;
        String word = "bottles";
        while (i > 0) {
            
            if (i == 1) {
                word = "bottle";
            }
            
            System.out.println(i + " " + word + " of beer on the wall," + i + " " + word + " of beer.");
            System.out.print("Take one down and pass it around, ");

            i--;

            if (i > 0) {
                System.out.println(i + " " + word + " of beer on the wall");
                System.out.println();
            } else {
                System.out.println("No more bottles of beer on the wall");
            }

        }

    }

}
