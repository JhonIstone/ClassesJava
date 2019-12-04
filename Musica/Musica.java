public class Musica
{
    private String titulo = new String();
    private String[] artistas;
    private double duracao;
    private String campoH = new String();
    private String genero = new String();
    private String gravadora = new String();
    
    public Musica (String titulo,int numeroArtistas, String[] artistas, double duracao, 
    String campoH, String genero, String gravadora){
        this.setArtistas(numeroArtistas, artistas);
        this.setCampoHarmonico(campoH);
        this.setDuracao(duracao);
        this.setGenero(genero);
        this.setGravadora(gravadora);
        this.setTitulo(titulo);
    }
    
    private void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    private void setDuracao (double duracao){
        this.duracao = duracao;
    }
    
    private void setArtistas (int numeroArtistas, String[] artistas){
        this.artistas = new String[numeroArtistas];
        for (int i = 0; i < numeroArtistas; i++)
            this.artistas[i] = artistas[i];
    }
    
    private void setCampoHarmonico (String campoH){
        this.campoH = campoH;
    }
    
    private void setGenero(String genero){
        this.genero = genero;
    }
    
    private void setGravadora(String gravadora){
        this.gravadora = gravadora;
    }
    
    public int getNumeroartistas (){
        return this.artistas.length;
    }
    
    public boolean equals (Musica outra){
        if (this.titulo == outra.titulo){
            for (int i = 0; i < this.getNumeroartistas(); i++){
                if (this.artistas[i] == outra.artistas[i])
                    continue;
                else
                    return false;
            }
            return true;
        }
        return false;
    }
    
    public double proximidade (Musica outra){
        double proximidade = 0;
        double aux = 0;
        
        if (this.campoH == outra.campoH)
            proximidade++;
        if (this.gravadora == outra.gravadora)
            proximidade++;
        if (this.genero == outra.genero)
            proximidade++;
        
        for (int i = 0; i < this.getNumeroartistas(); i++)
            for (int j = 0; j < outra.getNumeroartistas(); j++)
                if (this.artistas[i] == outra.artistas[j])
                    aux++;
        
        return proximidade += aux  / 100;
    }
}
