package ex2;
//ARTHUR SILVA MARQUES SILVA FIGUEIRINHA RA:262012855
    //JOSÉ RENATO CUNHA ROYER RA:262012782

public class Contribuinte implements Tributacao {

    private String nome;
    private String doc;
    private double renda_b;
    private double imposto;

    public Contribuinte() {
        this.nome = "";
        this.doc = "";
        this.renda_b = 0;

    }

    public Contribuinte(String nome, String doc, double renda_b) {
        this.nome = nome;
        this.doc = doc;
        setRenda_b(renda_b);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public double getRenda_b() {
        return renda_b;
    }

    public void setRenda_b(double renda_b) {
        if (renda_b > 0) {
            this.renda_b = renda_b;
        }
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    @Override
    public double calcImposto() {
        return getImposto();
    }
}
