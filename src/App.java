import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<String> menue = new ArrayList<String>();

        menue.add("Person anlegen");
        menue.add("Raum buchen");

        new Lib_Dialog().start(menue, "App");

    }

    public void Personanlegen() {
        System.out.println("Person wurde angelegt\n");
    }
}
