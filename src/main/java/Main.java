import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    private static String AUTHOR = "Andrea Napoleoni";
    private static String BIRTH = "12/02/1994";
    private static String pattern = "dd/MM/yyyy";

    public static void main(String[] args) throws IOException, ParseException {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        int YEAR = LocalDate.now().getYear() - LocalDate.parse(BIRTH, formatter).getYear();


        String benvenuto = String.format("Ciao! Ti do il benvenuto nel mio progetto di \"CV Interattivo\"");
        String presentazione = String.format("Mi chiamo %s ed ho %d anni.",AUTHOR,YEAR);

        System.out.println(benvenuto);
        System.out.println(presentazione);


        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        int a = Integer.valueOf(reader.readLine());

        System.out.println(a);
        reader.readLine();
    }

}
