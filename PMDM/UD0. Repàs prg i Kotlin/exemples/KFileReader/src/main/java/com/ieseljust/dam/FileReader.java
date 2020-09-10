package com.ieseljust.dam;



class FileReader
{
    public static void main(String args[])
    {
        // Cas 1:  Podem utilitzar directament la funció mostraFitxer
        //         ja que aquesta no llança errors.
        //         Si el fitxer no existeix, donarà un 
        //         error d'execució.

        // Si provem el cas 2 del mostraFitxer .kt, no ens
        // deixarà compilar, ja que en eixe cas, sí que caldria
        // capturar les excepcions.

        //MostraFitxerKt.mostraFitxer("/tmp/noexisteix.txt");

        // Cas 2: Per al segon cas, ara sí que se'n obliga a 
        //        capturar l'excepció en temps de compilació.

        try {
            MostraFitxerKt.mostraFitxer("/tmp/noexisteix.txt");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}