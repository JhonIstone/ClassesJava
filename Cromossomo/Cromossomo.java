public class Cromossomo{
    private Gene[] genes;
    
    public Cromossomo (int size){
        this.genes = new Gene[size];
    }    
    
    public Cromossomo (String valores){
        this.genes = new Gene[valores.length()];
        for(int iCont = 0; iCont < this.size(); iCont++){
          if(valores.charAt(iCont) == '*')
            this.setGene(iCont, null);
          else  
            this.setGene(iCont, new Gene(Integer.parseInt(valores.substring(iCont, iCont+1))));
        }  
    }     
    
    public int size(){
        return this.genes.length;
    }
    
    public Gene getGene(int pos){
        return this.genes[pos];
    }    
    
    public void setGene(int pos, Gene gene){
        this.genes[pos] = gene;
    }   
    
    public Cromossomo clonar(){
        Cromossomo clone = new Cromossomo(this.size());
        for(int iCont = 0; iCont < this.size(); iCont++)
          clone.setGene(iCont, (this.getGene(iCont) != null) ?
                                this.getGene(iCont).clonar() :
                                null);
        return clone;
    }; 
    
    public double getSimilaridade(Cromossomo cromo){
      double similaridade = 0;
      int max = this.size() > cromo.size() ? this.size() : cromo.size();
      for(int iCont = 0; iCont < max; iCont++){
        Gene meuGene = (iCont < this.size()) ? this.getGene(iCont) : null;
        Gene outroGene = (iCont < cromo.size()) ? cromo.getGene(iCont) : null;        
        if(meuGene == null || outroGene == null){
            if(meuGene != null || outroGene != null)
              similaridade -= 2;
        }else if(meuGene.equals(outroGene))
           similaridade += 1;
        else
           similaridade -= 1;
      }  
      return similaridade / this.size();  
    }  
    
    public void singlePointCrossover(int ponto, Cromossomo cromo){
        int max = this.size() > cromo.size() ? this.size() : cromo.size();
        Gene aux;
        for(int iCont = ponto; iCont < max; iCont++){
            if (this.getGene(iCont) != null && cromo.getGene(iCont) != null){
                aux = this.getGene(iCont);
                this.setGene(iCont, cromo.getGene(iCont));
                cromo.setGene(iCont, aux);
            }
        }
    }    
};
