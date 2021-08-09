package projetoinstrumento;

public class Percussao extends InstrumentoMusical{
    public Percussao(){
          super("Percussão", TipoInstrumento.Percussão);
      }

    @Override
    public String tocar(String musica){
        return "Tocando "+musica;
    }
    
    @Override
    public String afinar(){
        return "Ajeitando a percussão";
    }
}
