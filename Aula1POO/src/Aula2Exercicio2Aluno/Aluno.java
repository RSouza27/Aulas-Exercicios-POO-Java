package Aula2Exercicio2Aluno;

public class Aluno {

    private String nome;
    private String ra;
    private double ac1;
    private double ac2;
    private double ag;
    private double af;
    
    public Aluno(String nome, String ra, double ac1, double ac2, double ag, double af ) {
        this.nome = nome;
        this.ra = ra;
        this.ac1 = ac1;
        this.ac2 = ac2;
        this.ag = ag;
        this.af = af;
    }
    
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
    
    //==================================================
    
    public double calcularMedia() {    
     
        double media = ac1 * 0.15 + ac2 * 0.30 + ag * 0.10 + af * 0.45;
        
        return media;
    } 
    
    public String verificarAprovacao() {
        if(calcularMedia() >= 5){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    } 
    
    public String imprimirAluno() {
        return  "Nome: "  + getNome() +
                "\nRA: "  + getRa() +
                "\nAC1: " + getAc1() +
                "\nAC2: " + getAc2() +
                "\nAG: "  + getAg() +
                "\nAF: "  + getAf() +
                "\nMÉDIA: "  + calcularMedia() +
                "\nSITUAÇÃO: " + verificarAprovacao();
    } 
}

