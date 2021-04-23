
public class cs {

    /**
     * Bedingungen werden abgefragt
     *
     * @param bedingung muss true oder false sein
     * @param message   gibt Fehlermeldung aus
     */
    public static void check(Boolean bedingung, String message) {
        if (!bedingung)
            throw new IllegalArgumentException(message);

    }

}
