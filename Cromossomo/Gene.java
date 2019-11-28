public class Gene{
    private int valor;
    
    public Gene(int valor){
        this.setValor(valor);
    }
    
    public Gene(Gene gene){
        this(gene.getValor());
    }
    
    
    public void setValor(int valor){
        this.valor = valor;
    }    
    
    public int getValor(){
        return this.valor;
    } 
    
    public boolean equals(Gene outro){
        return outro.getValor() == this.getValor();
    }  
    
    public Gene clonar(){
        return new Gene(this);
    }    
    
}    