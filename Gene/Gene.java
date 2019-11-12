public class Gene{
     private int estadoGene;
    
    public void insereValorEstado(int x){
        estadoGene = x;
    };
    
    public int retorna(){
        return estadoGene;
    };
    
    public boolean Equals(Gene gene2){
        return estadoGene == gene2.estadoGene;
    };
};
