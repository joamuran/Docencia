/* Exemple interficies 

    * Definirem dues interfícies, amb mètodes 
    comuns, i veurem en una classe que implemente les dos
    com especificar al mètode de quina classe ens referim.
*/


interface Interface1 {

    // Mètode abstracte
    fun metode1()      
    
    // Mètode amb implementació 
    // predeterminada
    fun metode2(){
        println("Mètode2 de Interface1");
    }
}
 
interface Interface2 {
    fun metode2(){
        // Mètode amb implementació 
        // predeterminada.
        println("Mètode3 de Interface2");
    }
}

// Ara definim la classe classe1, que implementa
// les dues interfícies
class classe1 : Interface1, Interface2 {

    // Mètode 1 és abstracte, per tant,
    // necessita sobreescriptura.
    override fun metode1 () {
        println("Metode 1 classe1");       
    }

    // El segon mètode, realment, no necessitaria
    // sobreescriptura si no volguérem modificar-ne 
    // el funcionament. 
    // Anem a sobreescriure'l, per veure com 
    // accedir als mètodes de les interfícies.
    override fun metode2(){
        println("Mètode2 de classe1");
        // Amb super podem accedir a la implementació
        // per defecte de la interfície.
        // Si només disposàrem d'un mètode, no hi hauria
        // dubte, i podriem invocar-lo amb super.metode2();
        // Com que hi ha dos classes que l'implementen, 
        // indiquem aquesta entre <>:
        super<Interface1>.metode2();
        super<Interface2>.metode2();
    }
}

fun main() {
    var o1=classe1();
    o1.metode1();
    o1.metode2();
}
