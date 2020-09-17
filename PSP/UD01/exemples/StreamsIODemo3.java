import java.io.File;

public class StreamsIODemo3 {

   public static void main(String[] args) {

      try {

        // En primer lloc, creem l'objecte ProcessBuilder, 
        // i l'inicialitzem amb l'ordre que anem a utilitzar.
        ProcessBuilder pb = new ProcessBuilder("cal", "2020");

        // Redirigim l'eixida del procés a un fitxer
        pb.redirectOutput(new File("calendari2020_v2.txt"));

        // Llancem el procés
         pb.start();

      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
