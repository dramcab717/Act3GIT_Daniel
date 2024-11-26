package programajava2;

import java.util.Scanner;

public class programa2 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número (distinto del segundo):");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número (distinto del primero):");
        int num2 = scanner.nextInt();

        while (num1 == num2) {
            System.out.println("Los números deben ser distintos. Introduce el segundo número de nuevo:");
            num2 = scanner.nextInt();
        }

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        System.out.println("Números entre " + start + " y " + end + " incrementando de 7 en 7:");
        for (int i = start; i <= end; i += 7) {
            System.out.println(i);
        }

        scanner.close();
    }
}

