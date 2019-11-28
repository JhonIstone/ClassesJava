class ControleEntrada{
    Porta porta = new Porta();
    ContadorVolta contador = new ContadorVolta();
    
    void abrir(){
        if(!porta.estaAberta())
          contador.contar();
        porta.abrir();  
    };
    
    
    void fechar(){
        porta.fechar();
    };
    
    void reset(){
        porta.fechar();
        contador.zerar();
    };    
    
    int buscarQtdeAberturas(){
        return contador.buscarValor();
    };    
    
}
