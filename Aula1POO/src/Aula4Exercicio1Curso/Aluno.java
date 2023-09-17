package Aula4Exercicio1Curso;

public class Aluno {
    private String ra;
    private String nomeAluno;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    
    public String imprimir() {
            return "Dados do Aluno: " +
               "\n============================" + 
               "\nRA: "   + ra +
               "\nNome: " + nomeAluno; 
    }
}

