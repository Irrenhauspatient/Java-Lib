import java.text.DecimalFormat;

public class Lib_Digits {

    /**
     * Prüft ob sich der Wert sich zwischen zwei Werten befindet
     * 
     * @param <T>
     * @param <K>
     * 
     * @param min   Mindest Wert
     * @param max   Maximal Wert
     * @param value Prüfwert
     */
    public static <T extends Number, K> void checkSpan(T min, T max, T value, K fieldname) {
        if (value.doubleValue() >= min.doubleValue() && value.doubleValue() <= max.doubleValue()) {
            return;
        }
        throw new IllegalArgumentException(Message.errorWrongValueSpan(min, max, value, fieldname));
    }

    /**
     * Prüft ob sich der Wert über dem min befindet
     * 
     * @param min    Mindest Wert
     * @param value  Prüfwert
     * @param object zu prüfendes Objekt
     */
    public static <T extends Number, K> void checkMin(T min, T value, K fieldname) {
        if (value.doubleValue() >= min.doubleValue()) {
            return;
        }
        throw new IllegalArgumentException(Message.errorWrongValueMin(min, value, fieldname));
    }

    /**
     * Prüft ob sich der Wert unter dem max befindet
     * 
     * @param min    Maximal Wert
     * @param value  Prüfwert
     * @param object zu prüfendes Objekt
     */
    public static <T extends Number, K> void checkMax(T max, T value, K fieldname) {
        if (value.doubleValue() <= max.doubleValue()) {
            return;
        }
        throw new IllegalArgumentException(Message.errorWrongValueMax(max, value, fieldname));
    }

    /**
     * Formatiert und wandelt den Integer nach einem bestimmten Format in einen
     * String
     * 
     * @param format Die Stringformatierung
     * @param value  Integer-Wert
     * @return String Formatierter String
     */

    public static String numberFormatter(String format, int value) {

        DecimalFormat df = new DecimalFormat(format);
        String s = df.format(value);

        return s;
    }

    /**
     * Formatiert und wandelt den Float nach einem bestimmten Format in einen String
     * 
     * @param format Die Stringformatierung
     * @param value  Float-Wert
     * @return String Formatierter String
     */
    public static String numberFormatter(String format, float value) {

        DecimalFormat df = new DecimalFormat(format);
        String s = df.format(value);

        return s;
    }

    /**
     * Formatiert und wandelt den Double nach einem bestimmten Format in einen
     * String
     * 
     * @param format Die Stringformatierung
     * @param value  Double-Wert
     * @return String Formatierter String
     */
    public static String numberFormatter(String format, double value) {

        DecimalFormat df = new DecimalFormat(format);
        String s = df.format(value);

        return s;
    }
}