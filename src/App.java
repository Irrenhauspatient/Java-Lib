
public class App {
    public static void main(String[] args) throws Exception {

        Person person = new Person("asdasd", "asdasdas", 99);

        int[] a = new int[] { person.alter };

        System.out.println(a.getClass().getTypeParameters()[0]);

    }
}
