public class LoopsDemo {
    public static void main(String[] args) {

        // for shleife

        System.out.print("For-Schleife Beispiel");
        System.out.println("Hallo");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Durchlauf Nummer " + i);

        }
// While-Schleife
        int i = 0;
        while (i <= 10) {
            System.out.println("While-Durchlauf Nummer " + i);
            i = i + 1;

        }
        while (i <= 10) {
            System.out.println("\n---------\nWhile-Durchlauf Nummer " + i);
            i = i + 1;
        }
        // Do-While-Schleife
        System.out.println("\n---------\n Do-While-Beispiel");
        int j = 10;
        do {
            System.out.println("Durchlauf Nummer " + j);
            j--;
        } while (j >= 0);
    }
}
