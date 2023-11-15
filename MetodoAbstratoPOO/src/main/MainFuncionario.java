package main;

import classes.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainFuncionario {
    
    static ArrayList<FuncionarioHorista>    lstFuncionarioHorista = new ArrayList<>();    
    static ArrayList<FuncionarioMensalista> lstFuncionarioMensalista = new ArrayList<>();
    
    public static void main(String[] args) {
        String  nome = ""
               ,setor = ""
               ,funcao = "";
           int  opcao
               ,numCracha = 0
               ,qtdeHoras = 0;
        double  salario = 0
               ,desconto = 0
               ,valorHora = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(   "1 - Cadastrar Funcionario Mensalista\n"
                                                                    + "2 - Cadastrar Funcionario Horista\n"
                                                                    + "3 - Mostrar Funcionarios\n" 
                                                                    + "4 - Sair"));
            
            switch (opcao) {
                case 1:
                nome = JOptionPane.showInputDialog("Digite o Nome:");
                setor = JOptionPane.showInputDialog("Digite o Setor:");
                funcao = JOptionPane.showInputDialog("Digite a Função:");
                numCracha = Integer.parseInt(JOptionPane.showInputDialog("Digite o Número do Cracha:"));
                salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário: "));
                desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o Desconto: "));
                
                FuncionarioMensalista mensalista = new FuncionarioMensalista(salario, desconto,numCracha, nome, setor, funcao);
                lstFuncionarioMensalista.add(mensalista);
                break;
                
                case 2:
                nome = JOptionPane.showInputDialog("Digite o Nome:");
                setor = JOptionPane.showInputDialog("Digite o Setor:");
                funcao = JOptionPane.showInputDialog("Digite a Função:");
                numCracha = Integer.parseInt(JOptionPane.showInputDialog("Digite o Número do Cracha:"));
                qtdeHoras = Integer.parseInt(JOptionPane.showInputDialog("Digite Quantas Horas de Trabalho: "));
                valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor por Hora: "));
                
                FuncionarioHorista horista = new FuncionarioHorista(qtdeHoras, valorHora, numCracha, nome, setor, funcao);
                lstFuncionarioHorista.add(horista);
                break;
                
                case 3:
                    if (lstFuncionarioHorista.isEmpty() && lstFuncionarioMensalista.isEmpty()){
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar um Funcionário antes.", 
                                                 "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Funcionários Cadastrados: \n" +
                        mostrarHorista() + mostrarMensalista()); 
                    }
                    break;
                
                case 4:
                    System.exit(0);
                    break;
            }   
    }while (opcao != 4);  
        
       
    }
    public static String mostrarHorista (){
        String str = null;
        if (lstFuncionarioHorista.isEmpty()) {
            str = "Nenhum Horista Cadastrado!!!\n";
        }else {
            for (FuncionarioHorista horistas : lstFuncionarioHorista) { 
                str = horistas.toString() + "\n";
            } 
        } return str;
    } 
    public static String mostrarMensalista (){
        String str = null;
        if (lstFuncionarioMensalista.isEmpty()) {
            str = "Nenhum Mensalista Cadastrado!!!\n";
        }else {
            for (FuncionarioMensalista mensalistas : lstFuncionarioMensalista) {
                str = mensalistas.toString()  + "\n";
            }
        } return str;
    } 
}