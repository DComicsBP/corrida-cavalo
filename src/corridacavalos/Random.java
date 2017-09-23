package corridacavalos;
public class Random {
    public static int nextInt(int max)
    {
        int random=(int)System.currentTimeMillis();
        return ((random%max)*-1);
    }
    
    
}
    

