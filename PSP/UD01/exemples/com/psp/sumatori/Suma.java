package com.psp.sumatori;

public class Suma {
    public Long suma(long n1, long n2){
            /* Realitza la suma entre tots els números
               compresos entre n1 i n2
            */
            long result=0;
            for (long i=n1;i<=n2;i++){
                    result=result+i;
            }
            return result;
    }

    public static void main(String[] args){
        Suma s=new Suma();
        // La llista d'arguments és un vector d'strings,
        // pel que cal convertir-los a enters llargs (LONG).
        Long r=s.suma(Long.parseLong(args[0]),Long.parseLong(args[1]));

        // El resultat el bolcarem per l'eixida estàndard
        System.out.println(r);
}

}