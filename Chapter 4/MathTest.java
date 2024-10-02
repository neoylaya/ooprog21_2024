public class MathTest {
    public static void main(String[] args) {
        double numValue = 37.0;
        
        double sqrt = Math.sqrt(37);
        System.out.println("SQRT " + sqrt);
        
        double sin = Math.sin(numValue);
        System.out.println("SIN: " + sin);
      
        double cos = Math.cos(numValue);
        System.out.println("COS: " + cos);
      
        double floor = Math.floor(numValue);
        System.out.println("FLOOR: " + floor);
      
        double ceil = Math.ceil(numValue);
        System.out.println("CEIL: " + ceil);
      
        long round = Math.round(numValue);
        System.out.println("ROUND: " + round);
        
        int max = Math.max(28,30);
        System.out.println("MAX: " + max);
        
        int min = Math.min(28, 30);
        System.out.println("MIN: " + min);
        
        double random = Math.random()*10 ;
        System.out.println("RANDOM " + random);
        
        
    }
}