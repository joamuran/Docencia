package com.ieseljust.dam.exemplePersones;

public class Persones {
    public static void main(String[] args) {
        Persona p=new Persona("Jose", 1978, "Profe");
        p.printMe();

    	Persona2 p2 = new Persona2("Paco", 1973, "Profe");
    	p2.printMe();
    	
	Persona3 p3 = new Persona3("Maria", 2013, "Estudiant");
	p3.printMe();
	
    	Persona4 p4 = new Persona4("Pepica", 2016, "Estudiant");
	p4.printMe();        // Fixeu-vos que el nom ens apareixerà
                     	   // directament en majúscules!!
	//p4.anyNaix = 2050;   // Llançarà una excepció!
    	p4.printMe();

    }
}
