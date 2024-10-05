import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CustomExp {
    public static void main(String[] args) {
        try{
            FileReader fromFile = readFile("tes432t.txt");
        }catch (CustomFileNotFoundException e){
            System.out.println("Some error has occurred, for more information check log.txt");
        }
    }
    public static FileReader readFile(String path) throws CustomFileNotFoundException{
        try {
            return new FileReader(path);
        }catch (FileNotFoundException e){
            throw new CustomFileNotFoundException(e.getMessage());
        }
    }
}
class CustomFileNotFoundException extends FileNotFoundException{
    public CustomFileNotFoundException(){
        super();
    }
    public CustomFileNotFoundException(String e){
        super(e);
        writeInfo(e);
    }
    private void writeInfo(String log){
        try {
            FileWriter writer = new FileWriter("log.txt", true);
            String message = LocalDate.now() +" " + LocalTime.now() + " - " + log + '\n';
            writer.write(message);
            writer.close();
        }catch (IOException e){
            System.out.println("Logging error " + e.getMessage());
        }
    }
}