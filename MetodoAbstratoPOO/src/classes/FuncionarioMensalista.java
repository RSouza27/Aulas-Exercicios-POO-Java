package classes;

public class FuncionarioMensalista extends Funcionario{
    private double salario;
    private double desconto;

    public FuncionarioMensalista() {
    }

    public FuncionarioMensalista(double salario, double desconto, int numCracha, String nome, String setor, String funcao) {
        super(numCracha, nome, setor, funcao);
        this.salario = salario;
        this.desconto = desconto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    @Override
    public double calcularSalario() {
        return salario - desconto;
    }
    
    public String toString() {
        return "Funcionário Mensalista: "   +
               "\nNome: "    + getNome()      +
               "\nCracha: "  + getNumCracha() +
               "\nSetor: "   + getSetor()     +
               "\nFunção: "  + getFuncao()    +
               "\nSalario:"  + getSalario()   +
               "\nDesconto:" + getDesconto()  + 
               "\nSalario Mensal: " + calcularSalario(); 
    }
}
