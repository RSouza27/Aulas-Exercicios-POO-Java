package classes;

public class FuncionarioHorista extends Funcionario {
    private int qtdeHoras;
    private double valorHora;

    public FuncionarioHorista() {
    }

    public FuncionarioHorista(int qtdeHoras, double valorHora, int numCracha, String nome, String setor, String funcao) {
        super(numCracha, nome, setor, funcao);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    @Override
    public double calcularSalario() {
        return qtdeHoras * valorHora;
    }
    
    public String toString() {
        return "Funcionário Horista: "      +
               "\nNome: "    + getNome()      +
               "\nCracha: "  + getNumCracha() +
               "\nSetor: "   + getSetor()     +
               "\nFunção: "  + getFuncao()    +
               "\nSalario: " + calcularSalario(); 
    }
}
