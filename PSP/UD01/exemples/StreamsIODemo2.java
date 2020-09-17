import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class StreamsIODemo2 {

   public static void main(String[] args) {

      try {

        // En primer lloc, creem l'objecte ProcessBuilder, 
        // i l'inicialitzem amb l'ordre que anem a utilitzar.
         ProcessBuilder pb = new
            ProcessBuilder("cal", "2020");

        // Llancem el procés, i recollim l'objecte 
        // Process que ens retorna.
         Process p=pb.start();

         // Llegim l'eixida del procés amb getInputStream,
         // a través d'InputStreamReader i BufferedReader
         BufferedReader br=new BufferedReader(
            new InputStreamReader(
               p.getInputStream()));

               // I bolquem l'eixida a un nou fitxer, amb un 
               // BufferedWriter, i de forma molt similar
               // a l'exemple anterior
               BufferedWriter bw=new BufferedWriter(
                  new FileWriter(new File("calendari2020.txt")));
                  String line;
                  while((line=br.readLine())!=null){
                     bw.write(line+"\n");
                  }
                  bw.close();

      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
