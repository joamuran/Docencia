@file:JvmName("PersonesMC")

import java.time.LocalDateTime



/********************************************************
 * Definició d'una classe amb diversos constructors     *
 *******************************************************/

// Deinició de la classe amb constructor primari, que defineix
// dos propietats immutables, nom i anyNaix
class PersonaMC constructor(val nom: String, val anyNaix: Int) {
    

    // Ara definim propietats mutables
    var professio="";
    var poblacio="";

    // Ara fem ús de diversos constructors secundaris

    // Constructor secundari que rep nom, anyNaix i professio
    // Ha de fer referència al constructor primari, fent ús de
    // la paraula reservada "this"
    constructor(nom:String, anyNaix:Int, professio:String):this(nom, anyNaix){
        // Al fer referència al constructor primari, ja donem valor a nom i anyNaix
        // Només ens queda professio
        this.professio=professio;
    }

    // Veiem altre constructor on passem també la població
    constructor(nom:String, anyNaix:Int, professio:String, poblacio:String):this(nom, anyNaix){
        // Al fer referència al constructor primari, ja donem valor a nom i anyNaix
        // Només ens queda professio
        this.professio=professio;
        this.poblacio=poblacio;
    }

   fun printMe(): Boolean {
        println("$nom ${LocalDateTime.now().year - anyNaix} - $professio - $poblacio")
        return true
    }
}

fun main() {
    val p1 = PersonaMC("Josep", 1978)
    var p2 = PersonaMC("Paco", 1973, "Profe")
    var p3 = PersonaMC("Maria", 2013, "Estudiant", "Tavernes")

    p1.printMe()
    p2.printMe()
    p3.printMe()
}
