
package ex2;
    //ARTHUR SILVA MARQUES SILVA FIGUEIRINHA RA:262012855
    //JOSÉ RENATO CUNHA ROYER RA:262012782
public class PessoaFisica extends Contribuinte {

    private String sexo;

    public PessoaFisica(String nome, String doc, double renda_b, String sexo) {
        super(nome, doc, renda_b);
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     *
     * @return
     */
    @Override
    public double calcImposto() {
        double renda = getRenda_b();
        double resul = 0;
        if (renda >= 0 && renda <= 1400) {
            resul += renda;
        }
        if (renda >= 1400.01 && renda <= 2100) {
            resul += (renda * 0.1) - 100;
        }
        if (renda >= 2100.01 && renda <= 2800) {
            resul += (renda * 0.15) - 270;
        }
        if (renda >= 2800.01 && renda <= 3600) {
            resul += (renda * 0.25) - 500;
        }
        if (renda >= 3600.01) {
            resul += (renda * 0.30) - 700;
        }
        return resul;
    }

}
