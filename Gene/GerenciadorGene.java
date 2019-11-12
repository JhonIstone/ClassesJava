public class GerenciadorGene{
   
   Gene gene = new Gene();
   Gene gene2 = new Gene();
     
   public void DarValor(int x, int y){
       gene2.insereValorEstado(y);
       gene.insereValorEstado(x);
   };
   
   public void RetornaValor(){     
       System.out.println(gene.retorna());
       System.out.println(gene2.retorna());
    };
    
   public boolean Compara(){
       return gene.Equals(gene2);
   };
};
