import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) throws Exception {

        double sueldo = 0;
        int categoria;

        System.out.println("Insert the number of the type category that you try to calculate the salary");
        System.out.println("Stockers: 1");
        System.out.println("Cashiers: 2");
        System.out.println("Supervisors: 3");
        Scanner teclado = new Scanner(System.in);

        categoria = teclado.nextInt();

        if (categoria == 1) {
            sueldo = 15890 + (15890 * 0.10);
        } else if (categoria == 2) {
            sueldo = 25630.89;
        } else if (categoria == 3) {
            sueldo = 35560.20 - (35560.20 * 0.11);
        } else {
            System.out.println("You need to insert a number of a valid category.");
        }

        double sueldoRedondeado = Math.round(sueldo * 100) / 100.0;

        if (categoria == 1 || categoria == 2 || categoria == 3) {
            System.out.println("Total wage of the selected category " + categoria + " it is " + sueldoRedondeado);
        }
    }
}

/*
 * 
 * 
 * An exercise in Java
 * A program is needed, depending on the type of employee,
 * calculate and show in the screen the appropiate salary.
 * 
 * - The stockers will charge $15,890 + a bonus of 10%
 * - The cashiers will charge $ 25,630.89 fixed wage
 * - the supervisors will charge $35,560.20 raw, and they will get a discount
 * of 11% because of their pension.
 * 
 * 
 * 
 */