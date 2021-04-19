import java.lang.reflect.Field;

public class Lib_Reflect {

    public static <T> String callerName(T string, T object) {

        String test = "";

        Field[] fields = object.getClass().getDeclaredFields();

        for (Field f : fields) {
            if (string.toString() == (f.getName())) {
                test += f.getName();

            }

        }
        return test;

        // return object.getClass().getDeclaredFields()[(int) index].getName();

    }

}
