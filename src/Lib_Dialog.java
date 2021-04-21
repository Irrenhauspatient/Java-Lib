import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lib_Dialog {

    private static final int ENDE = 0;
    private int option = -1;

    private Scanner input;

    public Lib_Dialog() {
        input = new Scanner(System.in);

    }

    /**
     * Eigentliche Startmethode
     */

    public void start(ArrayList<String> menue) {

        while (option != ENDE) {
            try {
                option = einlesenFunktion(menue);
                ausfuehrenFunktion(option);
            } catch (IllegalArgumentException msg) {
                System.out.println("\n" + msg);
            } catch (InputMismatchException msg) {
                System.out.println("\n" + msg + ": Kein korrekter Wert");
                input.nextLine();
            } catch (Exception msg) {
                System.out.println("\n" + msg);
            }
        }
    }

    public int einlesenFunktion(ArrayList<String> menue) {

        StringBuilder sb = new StringBuilder();
        int optioncounter = 0;

        for (String string : menue) {

            optioncounter++;
            sb.append(String.format("%d: %s\n", optioncounter, string));

        }
        sb.append("\nBitte wählen sie eine Option\n");
        System.out.println(sb);

        return input.nextInt();

    }

    public void ausfuehrenFunktion(int option) {

        switch (option) {
        case 0:

        case 1:

        case 2:

        case 3:

        case 4:

        case 5:

        case 6:

        }

    }

}
