package HashMapEsercizioPerVerifica;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTargaEsercizio {
    private static final String[] PROVINCES = {"AG", "AL", "AN", "AO", "AP", "AQ", "AR", "AT", "AV", "BA", "BG", "BI", "BL", "BN", "BO", "BR", "BS", "BT", "BZ", "CA", "CB", "CE", "CH", "CI", "CL", "CN", "CO", "CR", "CS", "CT", "CZ", "EN", "FC", "FE", "FG", "FI", "FM", "FO", "FR", "GE", "GO", "GR", "IM", "IS", "KR", "LC", "LE", "LI", "LO", "LT", "LU", "MB", "MC", "ME", "MI", "MN", "MO", "MS", "MT", "NA", "NO", "NU", "OG", "OR", "OT", "PA", "PC", "PD", "PE", "PG", "PI", "PN", "PO", "PR", "PT", "PU", "PV", "PZ", "RA", "RC", "RE", "RG", "RI", "RM", "RN", "RO", "SA", "SI", "SO", "SP", "SR", "SS", "SU", "SV", "TA", "TE", "TN", "TO", "TP", "TR", "TS", "TV", "UD", "VA", "VB", "VC", "VE", "VI", "VR", "VS", "VT", "VV"};
    private ArrayList<Targa> targheGenerate = new ArrayList<>();
    private static final String TARGA_INIZIALE = "AA000AA";
    private static final String TARGA_FINALE = "ZZ999ZZ";
    private HashMap<String, Comune> comuni = new HashMap<>();
    private static int counter = 0;

    //Costruttore
    public HashMapTargaEsercizio() {
        for(int i = 0; i < PROVINCES.length; i++){
            comuni.put(PROVINCES[i], new Comune(PROVINCES[i]));
            
        }
        generaTarga(100);
        
    }

    public HashMapTargaEsercizio(int numerochevuoidicomuni) {
        for(int i = 0; i < numerochevuoidicomuni; i++){
            comuni.put(String.valueOf(i), new Comune(String.valueOf(i)));
        }
        generaTarga(1000);
    }

    //GeneraTarga
    public ArrayList<Targa> generaTarga(int numeroTarghe) {
        Targa targaCorrente =  new Targa(TARGA_INIZIALE);
        for (int i = 0; i < numeroTarghe; i++) {
            targheGenerate.add(targaCorrente);
            targaCorrente = prossimaTarga(targaCorrente);
        }
        return targheGenerate;
    }

    private static Targa prossimaTarga(Targa targaCorrente) {
        if (targaCorrente.getTarga().equals(TARGA_FINALE)) {
            throw new IllegalArgumentException("Raggiunta la targa finale");
        }

        char[] targaChars = targaCorrente.getTarga().toCharArray();
        // incrementa l'ultima lettera della targa (es. AA000AA -> AA000AB)
        targaChars[6]++;
        if (targaChars[6] > 'Z') {
            targaChars[6] = 'A';
            // incrementa la terzultima lettera della targa (es. AA000ZZ -> AA001AA)
            targaChars[5]++;
            if (targaChars[5] > 'Z') {
                targaChars[5] = 'A';
                // incrementa il terzultimo numero della targa (es. AA999ZZ -> AB000AA)
                targaChars[4]++;
                if (targaChars[4] > '9') {
                    targaChars[4] = '0';
                    // incrementa la seconda lettera della targa (es. AZ999ZZ -> BA000AA)
                    targaChars[3]++;
                    if (targaChars[3] > 'Z') {
                        targaChars[3] = 'A';
                        // incrementa la prima lettera della targa (es. ZZ999ZZ -> AAA000A)
                        targaChars[1]++;
                        if (targaChars[1] > 'Z') {
                            throw new IllegalArgumentException("Raggiunta la targa finale");
                        }
                    }
                }
            }
        }
        /*
        System.out.println(new String(targaChars));
        return new Targa(targaChars.toString());
        */
        String nuovaTarga = new String(targaChars);
        //System.out.println(nuovaTarga);
        return new Targa(nuovaTarga);
    }

    //più generico
    public void assegnaTarghe(int quante, String aChi){
        Comune eccoChi = comuni.get(aChi);
        Veicolo veikle = new Veicolo(69, "Bugatti(oro)", "Andrew Tate");
        System.out.println(eccoChi.prefix);

        for (int index = 0; index < quante; index++) {
            eccoChi.addTarga(targheGenerate.get(counter), veikle);
            System.out.println(eccoChi.prefix);
            counter++;
        }
    }

    private class Comune{
        String prefix;
        HashMap<Targa, Veicolo> motorizzazione = new HashMap<>();

        public Comune(String prefix) {
            this.prefix = prefix;
        }

        public void addTarga(Targa targ, Veicolo veicolo){
            targ.setTarga(prefix+targ.getTarga());
            motorizzazione.put(targ, veicolo);
        }

        public String getPrefix() {
            return prefix;
        }

        public HashMap<Targa, Veicolo> getMotorizzazione() {
            return motorizzazione;
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String outerKey : comuni.keySet()) {
            System.out.println("Chiave esterna: " + outerKey);

            // Ottiene l'HashMap interna per la chiave esterna corrente
            HashMap<Targa, Veicolo> innerMap = comuni.get(outerKey).getMotorizzazione();
        
            // Itera attraverso l'HashMap interna
            for (Targa innerKey : innerMap.keySet()) {
                Veicolo innerValue = innerMap.get(innerKey);
                System.out.println("  Prefisso + Targa: " + innerKey.getTarga() + " - Marca Veicolo: " + innerValue.getMarca() + " - Proprietario: "+ innerValue.getProprietario());
            }
        }
        return sb.toString();
    }
}