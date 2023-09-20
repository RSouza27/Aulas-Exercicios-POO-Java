package Aula4Exercicio1Curso;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MainCurso {

    public static void main(String[] args) {
        int escolhaCurso, codigo, cargaHoraria;
        String nomeCurso = null;
        String nomeAluno = null; 
        String ra = null;
        String opt = "";
        
        ArrayList<Curso> lstCurso = new ArrayList<>(); 
        ArrayList<Aluno> lstAluno = new ArrayList<>();
        
        Curso curso = new Curso();
        
        Aluno aluno = new Aluno();
        
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println ("\nEscolha uma opcao: " );
            System.out.println ("\n1 - Cadastrar Curso ");
            System.out.println ("\n2 - Mostrar Cursos ");
            System.out.println ("\n3 - Cadastrar Aluno ");
            System.out.println ("\n4 - Mostrar Alunos ");
            System.out.println ("\n5 - Sair");

            opt = scanner.nextLine();
            
            switch(opt) {
                case "1" :
                    System.out.println("\nCodigo do curso: ");
                    codigo = Integer.parseInt(scanner.nextLine());
                    System.out.println("\nNome do curso: ");
                    nomeCurso = scanner.nextLine();
                    System.out.println("\nCarga horária do curso: ");
                    cargaHoraria = Integer.parseInt(scanner.nextLine());
                    
                    lstCurso.add (new Curso(codigo, nomeCurso, cargaHoraria));
                    break;
                    
                case "2" :
                    if(lstCurso.isEmpty()) {
                        System.out.println ("\nNenhum Curso Cadastrado!");
                        break;
                    }
                    for( Curso c : lstCurso) {
                        System.out.println (c.imprimir());
                    }    
                    break;
                    
                case "3" :
                    System.out.println("\nRA do aluno: ");
                    ra = scanner.nextLine();
                    System.out.println("\nNome do aluno: ");
                    nomeAluno = scanner.nextLine();
                    System.out.println("\nEscolha do curso: ");
                    codigo = Integer.parseInt(scanner.nextLine());
                    
                    lstAluno.add (new Aluno(ra, nomeAluno));
                    break;
                    
                case "4" :    
                    if(lstAluno.isEmpty()) {
                        System.out.println("\nNenhum Aluno Cadastrado!");
                        break;
                    }
                    System.out.println(curso.imprimirCompleto());
                    break;
                
                case "5" :
                    if(lstAluno.isEmpty()) {
                        System.out.println("\nNenhum Aluno Cadastrado!");
                        break;
                    }
                    System.out.println("Insira o ra para excluir: ");
                    ra = scanner.nextLine();
                    lstAluno.remove (new Aluno());
                    
                case "6" :
                    break;
                    
                default:
                System.out.println("\nOpcao Invalida!");
            }   
        }while(!opt.equals("6"));
    }
    
}
