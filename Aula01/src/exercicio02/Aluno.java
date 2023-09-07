
package exercicio02;

public class Aluno {
    private String nome;
    private String ra;
    private double ac1;
    private double ac2;
    private double ag;
    private double af;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double getAc1() {
        return ac1;
    }

    public void setAc1(double ac1) {
        this.ac1 = ac1;
    }

    public double getAc2() {
        return ac2;
    }

    public void setAc2(double ac2) {
        this.ac2 = ac2;
    }

    public double getAg() {
        return ag;
    }

    public void setAg(double ag) {
        this.ag = ag;
    }

    public double getAf() {
        return af;
    }

    public void setAf(double af) {
        this.af = af;
    }
    
    public double calculaMedia () {
        double media = ac1 * 0.15 + ac2 * 0.30 + ag * 0.10 + af * 0.45;
        return media;
    }
    
    public String verificaAprovacao() {
        if (calculaMedia () >= 5 ) {
            return "Aprovado.";
        } else
            return "Reprovado.";
    }
    
    public String imprimir() {
        String str = "Nome: "         + getNome()  +
                     "\nRA: "         + getRa() +
                     "\nAC1 "         + getAc1() +
                     "\nAC2: "        + getAc2() +
                     "\nAG: "         + getAg() +
                     "\nAF: "         + getAf() +
                     "\nMédia: "      + calculaMedia() +
                     "\nSituação: "  + verificaAprovacao();
                
        return str;
    } 
}
