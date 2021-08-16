import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.spec.ECField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javax.swing.*;

public class Main {


    private static ArrayList<Categoria> all = new ArrayList<Categoria>();

    public static void main(String[] args) throws IOException, ParseException, InterruptedException {
        Categoria lavoro = new Categoria("Esperienze lavorative", Descrizioni.getEsperienze1());
        Categoria softSkill = new Categoria("Soft Skill", Descrizioni.getEsperienze2());
        Categoria istruzione = new Categoria("Istruzione", Descrizioni.getUniversità());
        Categoria lingue = new Categoria("Lingue", Descrizioni.getLingue());
        Categoria contatti = new Categoria("Contatti", Descrizioni.getContatti());
        Categoria competenze = new Categoria("Competenze", Descrizioni.getCompetenze());

        all.add(lavoro);
        all.add(softSkill);
        all.add(istruzione);
        all.add(istruzione);
        all.add(lingue);
        all.add(contatti);
        all.add(competenze);

        askQuestionInTerminal();
    }


    private static void askQuestionInTerminal() {
        System.out.println(Descrizioni.getSeparazione());
        System.out.println(Descrizioni.getBenvenuto());
        System.out.println(Descrizioni.getPresentazione());
        printMenu(all);
        ArrayList<Categoria> copia = all;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean avereInfo = true;
        int scelta = 10;
        String opt = "";
        while (avereInfo) {
            try {
                if (copia.size() != 0) {
                    opt = reader.readLine().trim();
                    scelta = Integer.parseInt(opt);
                    if (scelta >= 1 && scelta <= copia.size()) {
                        System.out.println(Descrizioni.getSeparazione());
                        System.out.println("Hai scelto " + scelta);
                        System.out.println(Descrizioni.getSeparazione());

                        Categoria inAnalisi = copia.get(scelta - 1);

                        System.out.println(inAnalisi.getNomeCategoria());

                        for (Struttura struttura : inAnalisi.getStruttura()) {

                            System.out.println(struttura.getTitolo());
                            if (struttura.getSottotitolo().length() > 0) {
                                System.out.println(struttura.getSottotitolo());
                            }
                            for (String str : struttura.getElementi()) {
                                System.out.println(" - " + str);
                            }

                        }
                        copia.remove(copia.get(scelta - 1));
                    } else {
                        System.out.println("Mi dispiace ma \"" + opt + "\" non è tra le operazioni previste");
                    }
                } else {
                    System.out.println("Ora sai tutto di me. Se il mio profilo è in linea con quel che cercavi, " +
                            "scrivimi all'indirizzo <<napoleoniandrea@pec.it>>.\n" +
                            "Ciao!");
                    reader.readLine().trim();
                    break;
                }
            } catch (Exception e) {
                System.out.println("Inserisci un numero, non cercare la falla ;)");
                avereInfo = true;
            }
            printMenu(all);
        }
    }

    private static void printMenu(ArrayList<Categoria> lista) {
        System.out.println(Descrizioni.getSeparazione());
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(String.format("[%d] - %s", (i + 1), lista.get(i).getNomeCategoria()));
        }
        System.out.println(Descrizioni.getSeparazione());
    }
}
