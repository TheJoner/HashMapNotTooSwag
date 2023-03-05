package HashMapEsercizioPerVerifica;

public class ItalianLicensePlateGenerator {
    public static void main(String[] args) {
        HashMapTargaEsercizio hmte = new HashMapTargaEsercizio();
        hmte.assegnaTarghe(10, "BG");
        hmte.assegnaTarghe(10, "LI");
        hmte.assegnaTarghe(10, "BS");
        System.out.println(hmte);
    }
}