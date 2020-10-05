package sk.kosickaakademia.nebus.nacitavanie;

public class Main {
    public static void main(String[] args) {
        TestKeyboard retazec = new TestKeyboard();
        String slovo = retazec.nacitaj();
        boolean zistenie = retazec.vyhodnot(slovo);
        retazec.vypis(zistenie);
    }
}
