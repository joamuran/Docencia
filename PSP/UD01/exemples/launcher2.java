public class launcher2 {
    public static void main(String[] args) {
        try{
            String app="firefox";
            Process p1, p2;
            ProcessBuilder pb;
            
            pb=new ProcessBuilder(app);

            p1=pb.start();
            p2=pb.start();


            System.out.println(p1.getClass());
            System.out.println("Primera instànicia de "+app+" amb PID "+p1.pid());
            System.out.println("Segona instància de "+app+" amb PID "+p2.pid());
            
            
        } catch (Exception e){
            e.printStackTrace();
        }

    }
 }