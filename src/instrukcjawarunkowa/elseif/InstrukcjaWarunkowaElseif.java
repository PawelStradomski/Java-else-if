
package instrukcjawarunkowa.elseif;
/**
 * 
 * @author pawelstradomski
 */

public class InstrukcjaWarunkowaElseif {

    
    public static void main(String[] args) {
        
        
        /*
        INSTRUKCJE WARUNKOWE: if, else, else if, 
        
        if - jesli zachodzi warunek wykonuje funkcje i sie zatrzymuje.
        
        else - W innym wypadku wykonaj instrukcje. Jezeli nie zaszedl warunek prawdziwosci "po if"  
         lub "else if" wykonuje funkcje zdefiniowana po "else".
        
        else if - W innym wypadku, jezeli nie wykonano warunku po "if" (warunek_ bo byl "false", 
        mozna zdefiniowac kolejny warunek: "else if" (warunek) i nastepnie wykonana 
        zostanie funkcja po else if. Po "else if" jezeli warunek rowniez byl falszywy mozna
        skorzystac z "else" zeby wykonalo kolejna funkcje
        
        {} - klamerki sa wazne, spinaja np 2 funkcje do wykonania
        np:
        
        */
        // Przyklad 1
        
        int items = 120;
        if (items == 100)
            System.out.println("PRAWDA1");
        else
            System.out.println("PRAWDA2");
        
        // Przyklad 2
        
        int nextItems = 120;
        if (nextItems == 100)
            System.out.println("PRAWDA3");
        else if (nextItems == 130)
            System.out.println("PRAWDA4");
        else if (nextItems == 120)
        {
            System.out.println("Wynik to 120");
            System.out.println("TAK TERAZ DZIALA 120");
        }
        else
            System.out.println("Prawda 3 lub Prawda4");
    }
    
}
