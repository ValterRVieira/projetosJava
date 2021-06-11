/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps2_atividade1;

/**
 * @author valter
 * RA 1869810-5
 */
import java.util.Scanner;
public class PS2_atividade1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite a idade em anos:  ");
        Scanner in = new Scanner(System.in);
        int idade = in.nextInt();
        
        if ((idade<0)||(idade>150)){
            System.out.println("Idade inválida");
        }else if (idade<16){
            System.out.println("Proibido Votar");
        }else if (((idade>=16)&&(idade <18)) ||(idade>60)){
            System.out.println("Voto opcional (facultativo)");    
        }else 
            System.out.println("Voto Obrigatório");     
        }
    }