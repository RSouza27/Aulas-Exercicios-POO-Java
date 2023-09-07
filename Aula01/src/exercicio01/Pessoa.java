package exercicio01;

public class Pessoa {
    private String CPF;
    private String nome;
    private String sexo;
    private int idade;


    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String imprimir() {
    String str = "Nome: "    + getNome()  +
                 "\nCPF: "   + getCPF() +
                 "\nSexo "   + getSexo() +
                 "\nIdade: " + getIdade();

    return str;
} 
}
