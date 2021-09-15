package jokenpo2;

import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
	
	public static void main(String[] args) {
	
     Scanner ler = new Scanner(System.in);
     Random random = new Random();
     
     System.out.println("----------------------------");
     System.out.println("        J O K E N P O       ");	
     System.out.println("----------------------------");
     System.out.println();
     
     String jogarNovamente = "s";
     
     while(jogarNovamente.equalsIgnoreCase("s")) {
    	 
    	 int qtdPartidas = 0;
         int contador = 0;
         int jogadaUsuario = 0;
         int jogadaMaquina = 0;
         int contadorVitoriaUsuario = 0;
         int contadorVitoriaMaquina = 0;
         int contadorEmpate = 0;
    	
    	 System.out.println();
    	 System.out.print("Quantas partidas: ");
    	 qtdPartidas = ler.nextInt();
    	 System.out.println("----------------------------");
    	 
    	 while(qtdPartidas < 3 || qtdPartidas % 2 == 0) {
    		 System.out.println("Digite um número ímpar igual ou maior que 3");
    		 System.out.print("Quantas partidas: ");
    		 qtdPartidas = ler.nextInt();
    		 System.out.println("----------------------------");
    	 }
    	 
    	 System.out.println("1 - Pedra");
		 System.out.println("2 - Papel");
		 System.out.println("3 - Tesoura");
		 System.out.println("----------------------------");
		 
    	 
    	 while(contador < qtdPartidas) {
    		 
    		 int contadorPtds = contador + 1;
    		 System.out.println();
    		 System.out.println("Partida " + contadorPtds);
    		 System.out.print("Qual sua opção: ");
    		 jogadaUsuario = ler.nextInt();
    		 System.out.println();

    		 
    		 while(jogadaUsuario != 1 && jogadaUsuario != 2 && jogadaUsuario != 3 ) {
    	     System.out.println("Por favor digite de 1 até 3");
    	     jogadaUsuario = ler.nextInt();
    		 }
    		 
    		 if(jogadaUsuario == 1) {
        		 System.out.println("Você escolheu pedra");
    		 }else if(jogadaUsuario == 2){
    			 System.out.println("Você escolheu papel"); 
    		 }else {
    			 System.out.println("Você escolheu tesoura");
    		 }
    		 
    		 
    		 jogadaMaquina = random.nextInt(3) + 1;
    		 
    		 if(jogadaMaquina == 1) {
        		 System.out.println("O computador escolheu pedra");
    		 }else if(jogadaMaquina == 2){
    			 System.out.println("O computador escolheu papel"); 
    		 }else {
    			 System.out.println("O computador escolheu tesoura");
    		 }
    		 
    		 if((jogadaUsuario == 1 && jogadaMaquina == 3) || (jogadaUsuario == 2 && jogadaMaquina == 1) || (jogadaUsuario == 3 && jogadaMaquina == 2)) {
    			 System.out.println("Você ganhou essa rodada");
    			  contadorVitoriaUsuario++;
    		 }else if((jogadaMaquina == 1 && jogadaUsuario == 3) ||  (jogadaMaquina == 2 && jogadaUsuario == 1) || (jogadaMaquina == 3 && jogadaUsuario == 2)) {
    		     System.out.println("Você perdeu essa rodada");
    	 	     contadorVitoriaMaquina++;	 
    	     }else{
    	    	 System.out.println("Empatou");
    	    	 contadorEmpate++;
    	     }
    		 
    		 if(contadorVitoriaUsuario > (qtdPartidas - contadorEmpate) / 2 ) {
    			 contador = 500000;
    		 }else if(contadorVitoriaMaquina > (qtdPartidas - contadorEmpate) / 2 ) {
    			 contador = 500000;
    		 }
    	      contador++;  
         }
     
          while(contadorVitoriaUsuario == contadorVitoriaMaquina || contadorEmpate == qtdPartidas) {
        	 System.out.println(); 
        	 System.out.println("Vamos desempatar");
        	 System.out.print("Qual sua opção: ");
     		 jogadaUsuario = ler.nextInt();
     		 System.out.println();

     		 
     		 while(jogadaUsuario != 1 && jogadaUsuario != 2 && jogadaUsuario != 3 ) {
     	     System.out.println("Por favor digite de 1 até 3");
     	     jogadaUsuario = ler.nextInt();
     		 }
     		 
     		 if(jogadaUsuario == 1) {
         		 System.out.println("Você escolheu pedra");
     		 }else if(jogadaUsuario == 2){
     			 System.out.println("Você escolheu papel"); 
     		 }else {
     			 System.out.println("Você escolheu tesoura");
     		 }
     		 
     		 
     		 jogadaMaquina = random.nextInt(3) + 1;
     		 
     		 if(jogadaMaquina == 1) {
         		 System.out.println("O computador escolheu pedra");
     		 }else if(jogadaMaquina == 2){
     			 System.out.println("O computador escolheu papel"); 
     		 }else {
     			 System.out.println("O computador escolheu tesoura");
     		 }
     		 
     		 if((jogadaUsuario == 1 && jogadaMaquina == 3) || (jogadaUsuario == 2 && jogadaMaquina == 1) || (jogadaUsuario == 3 && jogadaMaquina == 2)) {
     			  System.out.println();
     			  System.out.println("Você ganhou essa rodada");
     			  contadorVitoriaUsuario++;
     		 }else if((jogadaMaquina == 1 && jogadaUsuario == 3) ||  (jogadaMaquina == 2 && jogadaUsuario == 1) || (jogadaMaquina == 3 && jogadaUsuario == 2)) {
     			 System.out.println();
     		     System.out.println("Você perdeu essa rodada");
     	 	     contadorVitoriaMaquina++;	 
     	     }else{
     	    	 System.out.println("Empatou");
     	     }             	  
          }
          
          if(contadorVitoriaUsuario > contadorVitoriaMaquina) {
        	  System.out.println();
        	  System.out.println("Você ganhou de " + contadorVitoriaUsuario + " x " + contadorVitoriaMaquina);  
 		  }else if(contadorVitoriaMaquina > contadorVitoriaUsuario) {
 			 System.out.println();
 			 System.out.println("Você perdeu de " + contadorVitoriaMaquina + " x " + contadorVitoriaUsuario);
 			 contador = 500000;
 		  }
          
         
          System.out.print("Você deseja jogar novamente? ");
          jogarNovamente = ler.next();
          
          while(!jogarNovamente.equalsIgnoreCase("s") && !jogarNovamente.equalsIgnoreCase("n")) {
        	  System.out.println("Por favor digite um S ou N");
        	  System.out.print("Você deseja jogar novamente? ");
        	  jogarNovamente = ler.next();
        }      
          
          ler.close();
     }
	}
 }
