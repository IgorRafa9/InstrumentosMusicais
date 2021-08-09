package projetoinstrumento;

public class Violao extends InstrumentoMusical{  
    
      public Violao(){
          super("Violão", TipoInstrumento.Cordas);
      }

    @Override
    public String tocar(String musica){
        return "Tocando "+musica;
    }
    @Override
    public String afinar(){
        return "Afinando o violão";
    }
}
