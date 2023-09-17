package Aula4Exercicio1Curso;

import java.util.ArrayList;
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
        
        do {
            opt = JOptionPane.showInputDialog
            ("1 - Cadastrar Curso "
            + "\n2 - Mostrar Cursos "
            + "\n3 - Cadastrar Aluno "
            + "\n4 - Mostrar Alunos"
            + "\n5 - Sair");
            if(opt == null){
                System.exit(0);
            }
            
            switch(opt) {
                case "1" :
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Código do Curso"));
                    nomeCurso = JOptionPane.showInputDialog("Nome do Curso: ");
                    cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Carga Horária do Curso: "));
                    
                    curso.setCodigo(codigo);
                    curso.setNomeCurso(nomeCurso);
                    curso.setCargaHoraria(cargaHoraria);
                    
                    lstCurso.add (new Curso(codigo, nomeCurso, cargaHoraria));
                    break;
                
                case "2" :
                    if(lstCurso.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum Curso Cadastrado!");
                        break;
                    }
                    JOptionPane.showMessageDialog(null, curso.imprimir());
                    break;
                
                case "3" :
                    ra = JOptionPane.showInputDialog("RA do Aluno: ");
                    nomeAluno = JOptionPane.showInputDialog("Nome do Aluno: ");
                    nomeCurso = JOptionPane.showInputDialog("Nome do Curso: ");
                    
                    aluno.setRa(ra);
                    aluno.setNomeAluno(nomeAluno);
                    curso.setNomeCurso(nomeCurso);
                    
                    lstAluno.add (new Aluno());
                    break;
                    
                case "4" :    
                     if(lstAluno.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum Aluno Cadastrado!");
                        break;
                    }
                    JOptionPane.showMessageDialog(null, curso.imprimirCompleto());
                    break;
                    
                
                default:
                JOptionPane.showMessageDialog(null, "Opção Inválida!", "Erro", JOptionPane.WARNING_MESSAGE);
            
            }   
        }while(!opt.equals("5"));
    }
    
}
