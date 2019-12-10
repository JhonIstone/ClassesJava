/*
Para o site de stream de músicas, cada música é representada pelo seu título, pela lista de nome de artistas (que participam
da música), pela duração da música em segundos, pelo gênero, pelo campo harmônico da faixa (um dos seguintes valores: C
= Dó, D = Ré maior, E = Mi maior, F = Fá maior, G = Sol maior, A = Lá maior e B = Si maior) e pelo nome da gravadora.
Forneça:
1) (0.5) a estrutura estática da classe Música.
2) (0.5) um membro que inicialize a Música. Este membro deve garantir que todos os valores da música sejam
inicializados. Nenhum dos valores pode ser posteriormente alterado.
3) (1.5) um membro que verifique se duas músicas são iguais. Músicas são iguais se seus nomes são iguais e a lista de
nome de seus artistas é coincidente.
4) (2.0) um membro que calcule a proximidade de duas músicas. A proximidade duas músicas é um valor de 0 a 4,
calculado da forma que se segue: +1, quando o campo harmônico da faixa da música é coincidente; +1, quando a
gravadora é a mesma; +1 quando as músicas são do mesmo gênero e percentualmente um valor entre [0-1] que
mostra a quantidade de artistas que coincidem nas duas faixas. 
*/

public class Musica
{
    private String titulo = new String();
    private String[] artistas;
    private long duracao;
    private char campoH;
    private String genero = new String();
    private String gravadora = new String();
    
    public Musica (String titulo, String[] artistas, long duracao, char campoH, String genero, String gravadora){
        this.setArtistas(artistas);
        this.setCampoHarmonico(campoH);
        this.setDuracao(duracao);
        this.setGenero(genero);
        this.setGravadora(gravadora);
        this.setTitulo(titulo);
    }
    
    private void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    private void setDuracao (long duracao){
        this.duracao = duracao;
    }
    
    private void setArtistas (String[] artistas){
        this.artistas = artistas;
    }
    
    private void setCampoHarmonico (char campoH){
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
    
    public String getNomeMusica(){
        return this.titulo;
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
    
    public double getProximidade (Musica outra){
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
        double maior;
        if  (this.artistas.length > outra.artistas.length)
            maior = this.artistas.length;
        else
            maior = outra.artistas.length;
            
        return proximidade += aux / maior;
    }
}
