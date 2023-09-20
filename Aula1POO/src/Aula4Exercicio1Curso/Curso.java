package Aula4Exercicio1Curso;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nomeCurso;
    private int cargaHoraria;
    private ArrayList<Aluno> lstAluno;
    private ArrayList<Curso> lstCurso;
    
    public Curso() {
        lstAluno = new ArrayList<>();
        lstCurso = new ArrayList<>();
    }
            
    public Curso(int codigo, String nomeCurso, int cargaHoraria) {
        this();
        this.codigo       = codigo;
        this.nomeCurso    = nomeCurso;
        this.cargaHoraria = cargaHoraria;
    }
    
    public void adicionarAluno(Aluno aluno) {
        lstAluno.add(aluno);
    }
    
    public void removerAluno(int index) {
        lstAluno.remove(index);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getLstAluno() {
        return lstAluno;
    }

    public void setLstAluno(ArrayList<Aluno> lstAluno) {
        this.lstAluno = lstAluno;
    }
    public void addAluno(Aluno aluno) {
        lstAluno.add(aluno);
    }
    
    public void removeAluno(Aluno aluno) {
        lstAluno.remove(aluno);
    }
    
    public void removeAluno(int index) {
        lstAluno.remove(index);
    }
    
    public void removePet(String nome) {
        for (Aluno aluno : lstAluno) {
            if (aluno.getNomeAluno().endsWith(nome)) {
                lstAluno.remove(aluno);
            }
        }
    }
    
    public String imprimir() {
        String imp = "";
        imp +=  "\n================" +
                "\nCodigo: "         + codigo +
                "\nNome do Curso: "  + nomeCurso +
                "\nCarga Horaria: "  + cargaHoraria;
        for (Curso curso : lstCurso) {
            imp += curso.imprimir();
        }
        return imp;
    }
    
    public String imprimirCompleto() {
        String str = "";
        
        str += imprimir(); 
        for (Aluno aluno : lstAluno) {
            str += aluno.imprimir();
        }
        return str;           
    }
}