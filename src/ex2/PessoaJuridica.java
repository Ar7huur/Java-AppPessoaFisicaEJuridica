package ex2;
//ARTHUR SILVA MARQUES SILVA FIGUEIRINHA RA:262012855
    //JOSÉ RENATO CUNHA ROYER RA:262012782
public class PessoaJuridica extends Contribuinte {

    private String ano_f;

    public PessoaJuridica(String nome, String doc, double renda_b, String ano_f) {
        super(nome, doc, renda_b);
        this.ano_f = ano_f;
    }

    public String getAno_f() {
        return ano_f;
    }

    public void setAno_f(String ano_f) {
        this.ano_f = ano_f;
    }

    /**
     *
     * @return
     */
    @Override
    public double calcImposto() {
        return (super.getRenda_b() * 0.1);
    }
}
