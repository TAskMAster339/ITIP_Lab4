import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try {
            FileReader fromFile = new FileReader("from.txt");
            File toFile = new File("to.txt");
            BufferedReader br = new BufferedReader(fromFile);
            FileWriter fw = new FileWriter(toFile);
            String line = br.readLine();
            while (line != null){
                fw.write(line + '\n');
                line = br.readLine();
            }
            fw.close();
            br.close();
        }catch (FileNotFoundException e) {
            System.out.println("Incorrect path " + e.getMessage());
        }catch (IOException e){
            System.out.println("IO problems " + e.getMessage());
        }catch (Exception e){
            System.out.println("Some exception " + e.getMessage());
        }
    }
}
