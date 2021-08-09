
package projetoinstrumento;

public class Flauta extends InstrumentoMusical{
    
    public Flauta(){
          super("Flauta", TipoInstrumento.Sopro);
      }

    @Override
    public String tocar(String musica){
        return "Tocando "+musica;
    }
    @Override
    public String afinar(){
        return "Afinando a flauta";
    }
}
