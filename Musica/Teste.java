public class Teste
{
    public void run (){
        String[] artistas1 = {"ARTISTA1", "ARTISTA2", "ARTISTA3"};
        String[] artistas2 = {"ARTISTA4", "ARTISTA3", "ARTISTA1"};
        
        // String titulo, String[] artistas, long duracao, char campoH, String genero, String gravadora
        
        Musica musica1 = new Musica("TITULO", artistas1, 120,'D',"GENEROA","GRAVADORA");
        Musica musica2 = new Musica("TITULO", artistas2, 120,'D',"GENEROA","GRAVADORA");
        
        System.out.println(musica1.getProximidade(musica2));
    }
}
