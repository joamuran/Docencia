
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StreamsIODemo {

   public static void main(String[] args) {

      System.out.println
         ("-------------------- Calendari de l'any 2020 ------------------------");
      try {

        // En primer lloc, creem l'objecte ProcessBuilder, 
        // i l'inicialitzem amb l'ordre que anem a utilitzar.
         ProcessBuilder pb = new
            ProcessBuilder("cal", "2020");
            // ProcessBuilder("bash", "-c", "ls | grep com");
            // ProcessBuilder ("find", "-name", "*.java");
            // ProcessBuilder ("ls", "-l");

        // Llancem el procés, i recollim l'objecte 
        // Process que ens retorna.
         Process p=pb.start();

         // Llegim l'eixida del procés amb getInputStream,
         // I la bolquem per pantalla
         BufferedReader br=new BufferedReader(
            new InputStreamReader(
               p.getInputStream()));
            String line;
            while((line=br.readLine())!=null){
               System.out.println(line);
            }
      } catch (Exception e) {
         e.printStackTrace();
      }
      System.out.println
         ("-------------------------------------------------------------------");
   }
}
