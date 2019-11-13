public class ContadorVolta{
    private int valor;
    
    public void getcontar(){
        this.valor++;
    }
    
    public void getAdd(int x){
        this.valor = this.valor + x;
    };
    
    public void setzerar(){
        this.valor = 0;
    }    
    
    public int getbuscarValor(){
        return this.valor;
    }    
    
    
}
