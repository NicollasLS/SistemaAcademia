/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademia;

import java.util.ArrayList;
import java.util.Scanner;
import model.AlunoAcademia;

/**
 *
 * @author Instrutor
 */
public class SistemaAcademia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        ArrayList<AlunoAcademia> alunos = new ArrayList<> ();
        int opcao;
            
        do {
            System.out.println("\n====Menu Academia====");
            System.out.println("1. Cadastrar Aluno ");
            System.out.println("2. Listar Alunos e IMC ");
            System.out.println("3. Sair ");
            System.out.println("4. Escolha um opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            
            switch (opcao) {
            case 1:
                  
            
            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            //System.out.println("Idade: ");
            //int idade = scanner.nextInt();
            System.out.println("Peso (Kg): ");
            double peso = scanner.nextDouble();
            System.out.println("Altura (m): ");
            double altura = scanner.nextDouble();
            alunos.add(new AlunoAcademia(nome, peso, altura));
            break;
            
            case 2:
            
            if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado");
        } else {
        System.out.println("\n --- Lista de alunos --- ");
        for (AlunoAcademia aluno : alunos) {
        System.out.println(aluno);
              }
           }
        break;
        
        case 3:
        System.out.println("Encerrando o sistema... ");
        break;
        
        default:
        System.out.println("Opcao invalida. ");
              }
            }while (opcao !=3);
        scanner.close();
        
    }
}
        
        
        //AlunoAcademia aluno1 = new AlunoAcademia ("Pedro", 85.5, 1.75);   
         //AlunoAcademia aluno2 = new AlunoAcademia ("Ana", 60, 1.56);
         //AlunoAcademia aluno3 = new AlunoAcademia ("Jussara", 88, 1.70);
         
         //aluno1.exibirStatus ();
         //aluno2.exibirStatus();
         //aluno3.exibirStatus();
        
    
    
    
}
