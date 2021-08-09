
package projetoinstrumento;


public class InstrumentoMain {
   
    public static void main(String[] args) {
        Violao v1= new Violao();
      
        System.out.println(v1.afinar());
        System.out.println(v1.tocar("Like a Stone by Audioslave"));
        
        System.out.println("-------------------------------");
        Flauta f1= new Flauta();
      
        System.out.println(f1.afinar());
        System.out.println(f1.tocar("Strong and Strike"));
        
        System.out.println("-------------------------------");
        Percussao p1= new Percussao();
      
        System.out.println(p1.afinar());
        System.out.println(p1.tocar("Unsainted by Slipknot"));
    }
    
}
