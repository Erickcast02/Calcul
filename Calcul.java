public class Calcul {

    public int sumar(int n1, int n2) {
        return n1 + n2;
    }

    public int restar(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    public double division(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Error no puedes dividir por cero :o.");
            return Double.NaN;
        }
        return n1 / n2;
    }

    public static void main(String[] args) {
        Calcul calc = new Calcul();

        System.out.println("Suma: " + calc.sumar(7, 3));
        System.out.println("Resta: " + calc.restar(10, 7));
        System.out.println("Multiplicación: " + calc.multiplicar(4, 6));
        System.out.println("División: " + calc.division(8, 2));
        System.out.println("División por cero: " + calc.division(5, 0));
    }
}
