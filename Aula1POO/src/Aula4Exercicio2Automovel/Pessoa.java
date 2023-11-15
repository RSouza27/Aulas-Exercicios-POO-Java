package Aula4Exercicio2Automovel;

import java.util.ArrayList;

class Pessoa {
    private int codigo;
    private String nome;
    private ArrayList<Automovel> automoveis;

    public Pessoa() {
        automoveis = new ArrayList<>();
    }

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        automoveis = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inserirAutomovel(Automovel automovel) {
        automoveis.add(automovel);
    }

    public void removerAutomovel(int index) {
        if (index >= 0 && index < automoveis.size()) {
            automoveis.remove(index);
        }
    }
    
    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }
    
    public String imprimirAutomoveis() {
        StringBuilder sb = new StringBuilder();
        sb.append("Código: ").append(codigo).append(", Nome: ").append(nome).append("\n");
        sb.append("Automóveis:\n");
        for (int i = 0; i < automoveis.size(); i++) {
            sb.append(i + 1).append(" - ").append(automoveis.get(i).imprimir()).append("\n");
        }
        return sb.toString();
    }

    public String imprimir() {
        return "Código: " + codigo + ", Nome: " + nome;
    }

    public String imprimirCompleto() {
        StringBuilder sb = new StringBuilder();
        sb.append("Código: ").append(codigo).append(", Nome: ").append(nome).append("\n");
        sb.append("Automóveis:\n");
        for (Automovel automovel : automoveis) {
            sb.append(automovel.imprimir()).append("\n");
        }
        return sb.toString();
    }
}

