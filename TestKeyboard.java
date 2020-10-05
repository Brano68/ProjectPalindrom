package sk.kosickaakademia.nebus.nacitavanie;
import java.util.Scanner;

public class TestKeyboard {
    Scanner sc = new Scanner(System.in);
    public String text;

    public TestKeyboard(){

    }

    public String nacitaj(){
        text = sc.nextLine();
        return text;
    }

    public Boolean vyhodnot(String slovo){
        int dlzka = slovo.length();
        int j = dlzka - 1;
        int pocitadlo = 0;
        for(int i = 0; i < dlzka; i++){
            if(slovo.charAt(i) == slovo.charAt(j)){
                pocitadlo++;
            }
            j--;
        }
        if(pocitadlo == dlzka){
            return true;
        }
        else{
            return false;
        }
    }

    public void vypis(boolean hodnota){
        if(hodnota == true){
            System.out.println("Je polindrom");
        }else{
            System.out.println("Nie je polindrom");
        }
    }

}
