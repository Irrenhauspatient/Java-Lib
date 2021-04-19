public class Person {

    public String vorname;
    public String nachname;
    private int alter;

    public Person(String vorname, String nachname, int alter) {

        setNachname(nachname);
        setVorname(vorname);
        setAlter(alter);
    }

    public String getVorname() {
        return vorname;

    }

    public void setVorname(String vorname) {
        Lib_String.checkIfNullOrEmpty(vorname, "vorname");
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        Lib_String.checkIfNullOrEmpty(nachname, "nachname");
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {

        Lib_Digits.checkSpan(00, Integer.MAX_VALUE, alter, "alter");
        this.alter = alter;

    }

}
