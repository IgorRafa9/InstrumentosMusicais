
package projetoinstrumento;


public abstract class InstrumentoMusical {
    private String nome;
    private TipoInstrumento tipo;
    
    protected InstrumentoMusical(String nome, TipoInstrumento tipo){
        this.nome=nome;
        this.tipo=tipo;
    }
   
    
    public abstract String tocar(String musica);
    public abstract String afinar();
}
