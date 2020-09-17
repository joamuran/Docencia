package com.psp.sumatori;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Runner {
    public Long run (Long n1, Long n2){
        /* Aquesta classe s'encarrega d'invocar 
           la classe com.psp.sumatori.Suma en un
           procés, i retorna un enter amb la suma.
           Per tal de comunicar-se amb Suma, 
           com que aquesta escriu per la seua eixida
           estàndard el resultat, l'haurem de llegir amb
           el mètode getInputStream de la classe Process
           i processar-lo com un Stream d'entrada, com 
           hem vist anteriorment.
        */
        ProcessBuilder pb;
        try {
            // Creem un objecte de la classe processBuilder
            pb = new ProcessBuilder("java","com.psp.sumatori.Suma",
                                n1.toString(),
                                n2.toString());

            // Llancem el procés
            System.out.println("Anem a llançar el procés.");
            Process p=pb.start();
            System.out.println("Hem llançat el procés amb start");

            // Llegim l'eixida estàndard
            BufferedReader br=new BufferedReader(
                                  new InputStreamReader(
                                       p.getInputStream()));
            System.out.println("Hem creat el búffer de lectura. Esperant que s'ompliga");
            String line;
            while((line=br.readLine())!=null){
                System.out.println("Buffer preparat");
                // Quan tenim una línia (que serà la única eixida)
                // la retornem al programa principal convertida en Long.
                return Long.parseLong(line);
                }
                        
        } catch (Exception e) {
            e.printStackTrace();
        }
                return 0L;
    }

    public static void main(String[] args){
        Runner r=new Runner();

        // Comprovem el nombre d'arguments
        if (args.length!=2) {
            System.out.println("Nombre d'arguments incorrecte.");
            System.exit(0); 
        };

        // Convertim els paràmetres a números
        Long index1=Long.parseLong(args[0]);
        Long index2=Long.parseLong(args[1]);
        

        // Ordenem els índex, per si el primer és major que el segon
        if (index1>index2){
            Long tmp=index1;
            index1=index2;
            index2=tmp;
        }

        // Particionem el rang de valors en dos rangs iguals
        Long meitat=((index2-index1)/2)+index1;

        // Invoquem els processos per realitzar els càlculs
        System.out.println("Anem a llançar el primer run");
        Long sumand1=r.run(index1, meitat);
        System.out.println("Anem a llançar el segon run");
        Long sumand2=r.run(meitat+1, index2);
        System.out.println("S'han finalitzat els dos processos. Calculant.");
                
        // Obtenim finalment el resultat
        System.out.println(sumand1+"+"+sumand2+"="+(sumand1+sumand2));
    }
}
