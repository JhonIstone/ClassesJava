public class TesteGene{
    public void run(){
        
        Cromossomo c1 = new Cromossomo("*1234567890");
        Cromossomo c2 = new Cromossomo("*123456789");  
        
        
        System.out.println(c1.getSimilaridade(c2));
        System.out.println(c2.getSimilaridade(c1));        
        
        
    }    
}
