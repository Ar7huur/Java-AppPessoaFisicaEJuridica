package ex2;
    //ARTHUR SILVA MARQUES SILVA FIGUEIRINHA RA:262012855
    //JOSÉ RENATO CUNHA ROYER RA:262012782
import java.util.ArrayList;
import java.util.List;

public class GrupoDeContribuinte {

    List<Contribuinte> list = new ArrayList();

    public void AdicionarContribuinte(Contribuinte p) {
        list.add(p);
    }

    public double qtdTotal() {
        double ImpostoTotal = 0;
        for (int i = 0; i < list.size(); i++) {
            ImpostoTotal += list.get(i).getImposto();
        }
        return ImpostoTotal;
    }

    public double PorcentFem() {
        double Porcent;
        int Mulheres = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof PessoaFisica) {
                PessoaFisica C = (PessoaFisica) list.get(i);
                if (C.getSexo() == "Feminino") {
                    Mulheres++;
                }
            }
        }
        Porcent = (Mulheres / list.size()) * 10;

        return Porcent;
    }

}
