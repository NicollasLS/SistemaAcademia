/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademia;

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
        
        
        AlunoAcademia aluno1 = new AlunoAcademia ("Pedro", 85.5, 1.75);   
         AlunoAcademia aluno2 = new AlunoAcademia ("Ana", 60, 1.56);
         AlunoAcademia aluno3 = new AlunoAcademia ("Jussara", 88, 1.70);
         
         aluno1.exibirStatus ();
         aluno2.exibirStatus();
         aluno3.exibirStatus();
        
    }
    
    
}
