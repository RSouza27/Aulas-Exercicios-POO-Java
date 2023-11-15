
package classes;

public abstract class Funcionario {
    private int numCracha;
    private String nome;
    private String setor;
    private String funcao;

    public Funcionario() {
    }

    public Funcionario(int numCracha, String nome, String setor, String funcao) {
        this.numCracha = numCracha;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
    }
    
    public abstract double calcularSalario();

    public int getNumCracha() {
        return numCracha;
    }

    public void setNumCracha(int numCracha) {
        this.numCracha = numCracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
}
