/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

//import java.util.InputMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;
import util.Test;

/**
 *
 * @author 0924345
 */
public class AppCtr {

    public static void main(String[] args) {

        System.out.println("Saisir une valeur:");
        Scanner scan = new Scanner(System.in);
        int val1 = scan.nextInt();
        System.out.println("Saisir une deuxième valeur: ");
        int val2 = scan.nextInt();
        Test.calculDivision(val1, val2);

        try {
            Test.calculDivision(val1, val2);

        } catch (ArithmeticException e) {
            //message à destination de l'usager
            System.out.println("Attention!!!Le dénominateur ne peut être égal à 0.");
            System.err.println("ArithmeticException: " + e.getMessage());
            e.printStackTrace();
//            e.getMessage();
            e.getStackTrace();
        } catch (InputMismatchException e) {
//            System.out.println("Attention!!!Erreurs sur le format des nombres.");
            System.err.println("InputMismatchException: " + e.getMessage());

            e.printStackTrace();
//            e.getMessage();
            e.getStackTrace();

        } finally {
            System.out.println("Merci d’avoir utilisé notre programme");
        }

    }
}
