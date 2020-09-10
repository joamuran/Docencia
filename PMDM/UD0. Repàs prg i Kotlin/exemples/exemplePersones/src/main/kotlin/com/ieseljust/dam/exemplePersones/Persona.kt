package com.ieseljust.dam.exemplePersones

import java.time.LocalDateTime

/********************************************************
 * Definició d'una classe amb el constructor secundari  *
 *******************************************************/
class Persona {
    // Definim les propietats
    val nom: String
    val anyNaix: Int
    public var professio: String

    // Definim el constructor
    constructor(nom: String, anyNaix: Int, professio: String = "") {
        this.nom = nom
        this.anyNaix = anyNaix
        this.professio = professio
    }

    // AltresMètodes
    fun printMe(): Boolean {
        println("$nom ${LocalDateTime.now().year - anyNaix} - $professio")
        return true
    }
}

/********************************************************
 * Definició d'una classe amb el constructor primari    *
 *******************************************************/
class Persona2 constructor(nom: String, anyNaix: Int, professio: String) {
    // Definim les propietats
    val nom: String
    val anyNaix: Int
    var professio: String 

    // Bloc init per inicialitzar els objectes
    // El 'constructor' està a la definició
    // de la pròpia classe
    init {
        //println(nom+anyNaix+professio);
        this.nom = nom
        this.anyNaix = anyNaix
        this.professio = professio
    }
    fun printMe(): Boolean {
        println("$nom ${LocalDateTime.now().year - anyNaix} - $professio")
        return true
    }
}

/********************************************************
 * Definició d'una classe amb el constructor primari  *
 *******************************************************/
class Persona3 constructor(val nom: String, val anyNaix: Int, var professio: String = "") {
    // No cal definir les propietats ni init
    // ja que aquestes es defineixen directament en el 
    // constructor, predecides de var o val

    // Altres mètodes
    fun printMe(): Boolean {
        println("$nom ${LocalDateTime.now().year - anyNaix} - $professio")
        return true
    }
}

/********************************************************
 * Definició d'una classe amb el constructor primari i  *
 * Accessors (getter i setters) personalitzats.         *
 *******************************************************/
class Persona4 constructor(nom: String, anyNaix: Int, professio: String) {
    // Cal declarar les propietats fora del `consructor`
    // (com hem fet en Persona2)
    val nom: String
    // I immediatament després de definir cada propietat,
    // generem els mètodes get() o set() com desitgem.
    get() {
        // field fa referència al propi camp (atribut)
        // (en aquest cas el retorna en majúscules)
        return field.toUpperCase()
    }
    var professio: String = ""
    var anyNaix: Int = LocalDateTime.now().year

    // El setter rebrà un 'valor' al què actualitzar
    // la propietat. El tipus d'aquest 'value' s'infereix
    // del tipus de la propietat que anem a modificar.
    set(value) {
        // En aquest cas, comprovem que l'any no siga
        // superior a l'any actual. En eixe cas, llaçariem
        // una excepció.
        if (value> LocalDateTime.now().year) {
            throw IllegalArgumentException("L'any de naixement no pot ser posterior a ${LocalDateTime.now().year}")
        }
        // Accedim a la propietat amb l'alias 'field', i al
        // valor a actualitzar amb 'value' 
        field = value
    }
    init {
        this.nom = nom
        this.professio = professio
        this.anyNaix = anyNaix
    }
    fun
    printMe(): Boolean {
        println("$nom ${LocalDateTime.now().year - anyNaix} - $professio")
        return true
    }
}

/*
Si utilitzàrem només aquest fitxer, de forma autònima i aquesta fora la classe
principal, crearíem la funció main com s'expressa aci baix.
Com que anem a crear una altra classe Java per a que llance 
l'aplicació, aquesta funció està comentada.
*/

/*fun main(args: Array<String>) {
    val p1 = Persona("Josep", 1978, "Profe")
    p1.printMe()
    var p2 = Persona2("Paco", 1973, "Profe")
    p2.printMe()
    var p3 = Persona3("Maria", 2013, "Estudiant")
    p3.printMe()
    var p4 = Persona4("Pepica", 2016, "Estudiant")
    p4.printMe()        // Fixeu-bos que el nom ens apareixerà
                        // directament en majúscules!!
    p4.anyNaix = 2050   // Llançarà una excepció!
    p4.printMe()
}*/
