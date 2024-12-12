import java.util.Scanner;
public class CalculadoraJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta el primer numero");
        int num1 = sc.nextInt();

        System.out.println("Inserta el segundo numero");
        int num2 = sc.nextInt();

        System.out.println("Elige una operación (+, -, *, /):");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("El resultado es: " + (num1 + num2));
                break;
            case '-':
                System.out.println("El resultado es: " + (num1 - num2));
                break;
            case '*':
                System.out.println("El resultado es: " + (num1 * num2));
                break;
            case '/':
                if (num2!= 0) {
                    System.out.println("El resultado es: " + (num1 / num2));
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            default:
                System.out.println("Error: Operación no válida.");
        }
    }

}