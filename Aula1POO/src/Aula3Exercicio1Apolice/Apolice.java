package Aula3Exercicio1Apolice;

public class Apolice {
    private int numero;
    private String nome;
    private int idade;
    private int sexo;
    private double valorAutomovel;
    
    public Apolice(int numero, String nome, int idade, int sexo, double valorAutomovel){
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }
    
    public double calcularValor(){
        if (sexo == 1) {
            if(idade <= 25){
                return valorAutomovel * 10 / 100;  
            } else { 
                return valorAutomovel * 5 / 100;
            }                 
        }
        else {
            return valorAutomovel * 2 / 100;
        }    
    }
    
    public String sexo(){
        if (sexo == 1) {
            return "Masculino";
        } else {
            return "Feminino";
        }
    }
    
    public String imprimir(){
        String imprimir = "Número: " + getNumero() +
                          "\nNome: " + getNome() +
                          "\nIdad: " + getIdade() +
                          "\nSexo: " + sexo() +
                          "\nValor do Automovel: " + getValorAutomovel() +
                          "\nValor da Apólice: " + calcularValor();
        
        return imprimir;        
    } 
    
    public String imprimir(String str) {
        return imprimir() + "\n" + str;
    }
}  

