package corridacavalos;

import java.util.ArrayList;
import java.util.Scanner;

public class CorridaCavalos {
    public static void main(String[] args) throws InterruptedException {
      ArrayList<Thread> at; 
       
        
        int i = 0; 
        
        Scanner scan = new Scanner(System.in); 
        System.out.println("Quantos cavalos participarão da corrida? ");
        int quantiCavalo = scan.nextInt(); 
        Thread[] cavalos = new Thread [quantiCavalo];
        
        System.out.println ("Corrida iniciada!");
        
        do{
            
              cavalos[i] = new Thread (new Cavalo("[" + i+ "]"));
              
        
              i++; 
             
        }while(i < quantiCavalo); 
      
        
        for (int j = 0; j < cavalos.length; ++j) {
            cavalos [j].start();
            
            
        }
	
        for (int j = 0; j < cavalos.length; ++j) {
            
            
            cavalos [j].join();
           
        }
        System.out.println ("Corrida terminada.");
    
        
        
    }
        

    
    
}
