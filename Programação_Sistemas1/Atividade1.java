/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

/**
 * @author valter
 * RA 1869810-5
 */
import javax.swing.JOptionPane;
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Atributos
        String nome, n1, n2, n3, nExame;
        float nota1, nota2, nota3, exame, media;
        
        //Recebendo o nome do aluno(a)
        nome = JOptionPane.showInputDialog(null,"Digite o nome do aluno(a) ");

       //Recebe a string nota
        n1 = JOptionPane.showInputDialog(null,"Digite a Nota da Atividade Avaliativa1");
        n2 = JOptionPane.showInputDialog(null,"Digite a Nota da Atividade Avaliativa2");
        n3 = JOptionPane.showInputDialog(null,"Digite a Nota da Atividade Avaliativa3");
        
        //converte a String em double
        nota1 = Float.parseFloat(n1);
        nota2 = Float.parseFloat(n2);
        nota3 = Float.parseFloat(n3);

        //Calcula a media 
        media = (nota1+nota2+nota3)/3;
        
        //Verifica se a média é superior ou igual a 7
        if (media>=7){
            JOptionPane.showMessageDialog(null,"Aluno(a): " +nome+"\n"+"A média do aluno(a) é: " +media+"\n"+"Aluno(a) Aprovado.","Situação do Aluno(a)",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Aluno(a): " +nome+"\n"+"A média do aluno(a) é: " +media+"\n"+"Deverá fazer Exame ."+"\n"+"Pressione ok para digitar a nota da sub.","Situação do Aluno(a)", JOptionPane.WARNING_MESSAGE);
            
            //Recebendo e convertendo valor
            nExame = JOptionPane.showInputDialog("Digite a nota do Exame");
            exame = Float.parseFloat(nExame);

            //Calculando a nota da sub
            media = (exame + media)/2;

            if (media >=5 ){
                JOptionPane.showMessageDialog(null,"Aluno(a): " +nome+"\n"+"A média do aluno(a) é: " +media+"\n"+"Aluno Aprovado","Situação do Aluno(a)",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Aluno(a): " +nome+"\n"+"A média do aluno(a) é: " +media+"+\n"+"Reprovado","Situação do Aluno(a)", JOptionPane.WARNING_MESSAGE);
            }
        }
       System.exit(0);
        }
    }