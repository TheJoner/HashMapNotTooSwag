package HashMapEsercizioPerVerifica;

public class Veicolo {
    int tipologia;
    String marca;
    String proprietario;

    public Veicolo(int tipologia, String marca, String proprietario) {
        this.tipologia = tipologia;
        this.marca = marca;
        this.proprietario = proprietario;
    }

    public int getTipologia() {
        return tipologia;
    }

    public String getMarca() {
        return marca;
    }

    public String getProprietario() {
        return proprietario;
    }
}
