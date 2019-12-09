/*
Uma playlist possui um nome e é formada por um conjunto de músicas. Considere a descrição apresentada e forneça:
5) (0.5) a estrutura estática da classe playlist.
6) (0.5) um método de acesso que retorne a lista de músicas da playlist.
7) (0.5) um método que permita adicionar uma música a playlist.
   */
public class Playlist
{
    private String nome;
    private Musica[] musicas = new Musica[0];
    
    public Playlist(String nome){
         this.nome = nome;
    }
    
    public void setPlaylist (Musica musica){
        Musica[] aux = new Musica[this.musicas.length + 1];
        int iCont;
        for(iCont = 0; iCont < this.musicas.length; iCont++){
            aux[iCont] = musicas[iCont];
        }
        aux[iCont] = musica;
        this.musicas = aux; 
    }
    
    public String[] getPlaylist (){
        
        String[] lista = new String[this.musicas.length];
        
        for (int iCont = 0; iCont < this.musicas.length;iCont++){
            lista[iCont] = this.musicas[iCont].getNomeMusica();
        }
        
        return lista;
    }
}
