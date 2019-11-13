public class ControleEntrada{
    Porta porta = new Porta(false);
    ContadorVolta contador = new ContadorVolta();
    
    public ControleEntrada(){
        this.porta = new Porta(false);
        this.contador = new ContadorVolta();
    };
    
    public void getabrir(){
        if(!porta.isAberta())
          this.contador.getcontar();
        this.porta.setabrir(true);
    };
   
    public void setfechar(){
        this.porta.setfechar();
    };
    
    public void reset(){
        this.porta.setfechar();
        this.contador.setzerar();
    };    
    
    public int getbuscarQtdeAberturas(){
        return this.contador.getbuscarValor();
    };    
    
}
