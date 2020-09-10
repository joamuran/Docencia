package com.ieseljust.dam

import java.io.File
import java.io.IOException;

/* 

// Cas 1: Funció mostraFitxer sense 
// tractament d'excepcipns

fun mostraFitxer (fitxer:String){
    File(fitxer).forEachLine() { println(it) }
}

*/




// Cas2 2:F unció mostraFitxer amb tractament 
// d'excepcions. Ens obligarà a capturar 
// l'excepció des de Java

@Throws(IOException::class)
fun mostraFitxer (fitxer:String){
    File(fitxer).forEachLine() { println(it) }
}

