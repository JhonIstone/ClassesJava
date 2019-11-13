    public class Gene{
    private int estadoGene;
        
    public Gene(int x){
        this.setAltera(x);
    };
        
    public void setAltera(int x){
        this.estadoGene = x;
    };
    
    public int getGene(){
        return this.estadoGene;
    };
    
    public boolean equals(Gene gene2){
        return this.getGene() == gene2.getGene();
    };
    
    public Gene clonar (){
        return new Gene(this.getGene());
    };
};