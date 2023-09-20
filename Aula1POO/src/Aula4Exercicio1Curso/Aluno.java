package Aula4Exercicio1Curso;

import java.util.ArrayList;

public class Aluno {
    private String ra;
    private String nomeAluno;
    private ArrayList<Aluno> lstAluno;
    private ArrayList<Curso> lstCurso = new ArrayList<>();
    
    public Aluno() {
        this.ra = ra;
        this.nomeAluno = nomeAluno;
        lstAluno = new ArrayList<>();
    }
    
    public Aluno (String ra, String nomeAluno){
        this.ra = ra;
        this.nomeAluno = nomeAluno;   
    }

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
        String imp =    "\n============================" + 
                        "\nRA: "   + ra +
                        "\nNome: " + nomeAluno; 
        for (Aluno aluno : lstAluno) {
            imp += aluno.imprimir();
        }
        return imp;
    }     
}

