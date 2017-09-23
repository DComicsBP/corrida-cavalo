package corridacavalos;

import java.util.Random;

public  class Cavalo implements Runnable {
    private int max = 2000; 
    private int min = 0; 
    private int decrementa; 
    private int auxiliarControle; 
    private String nome;
    
    
    public Cavalo (String nome) { 
        this.nome = nome; 
    }
    
     Random r = new Random();
    
    public void run() {
        
        long t = 0; 
        
        
        try {
            do{
            
                
                this.auxiliarControle = (int) this.gerarTempoAleatorio(); 
                
                System.out.println("Aux- COntrole = " + this.auxiliarControle);
                this.setDecrementa(gerarDistanciaAleatoria());
               
                Thread.sleep(r.nextInt (100), this.getDecrementa());
                
                this.setMax(this.getMax()-this.decrementa);
                
                if(this.getMax() <0){
                    this.setMax(0);
                }
                
                
            
                t += (long) this.auxiliarControle; 
                
            }while(this.getMax()>this.getMin());
            
            
        } catch (InterruptedException ex) {
        
           
        }
        
        
        System.out.println (nome + " chegou em " + t + " ms");
    }
          
    public int gerarDistanciaAleatoria() {
        
        return (int) Math.ceil(Math.random() * (50  - 10 + 1)) - 1 + 10;
        
    }
    
    
    
    public long gerarTempoAleatorio() {
        
        return (long) Math.ceil(Math.random() * (100-10+1)) - 1+ 10;
        
        
    }
      
    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setDecrementa(int decrementa) {
        this.decrementa = decrementa;
    }

    public void setAuxiliarControle(int auxiliarControle) {
        this.auxiliarControle = auxiliarControle;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public int getDecrementa() {
        return decrementa;
    }

    public int getAuxiliarControle() {
        return auxiliarControle;
    }
     
}
    

