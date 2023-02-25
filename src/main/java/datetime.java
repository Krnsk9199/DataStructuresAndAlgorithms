import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime {
    public static void main (String [] args){
        DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss");
        String time = LocalDateTime.now().format(FORMATTER);
        System.out.println(time);
    }
}
