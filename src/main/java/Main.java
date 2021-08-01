import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    private static String AUTHOR = "Andrea Napoleoni";
    private static String BIRTH = "12/02/1994";
    private static String pattern = "dd/MM/yyyy";

    public static void main(String[] args) throws IOException, ParseException {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            int YEAR = LocalDate.now().getYear() - LocalDate.parse(BIRTH, formatter).getYear();


////////////////////////////////////////////////////////////////////////////////////////////////////////////
            String separazione = "******************************************************";
            String benvenuto = String.format("Ciao! Ti do il benvenuto nel mio progetto di \"CV Interattivo\"");
            String presentazione = String.format("Mi chiamo %s ed ho %d anni.\n" +
                    "Sono uno sviluppatore con forte orientamento alla programmazione ad oggetti.\n" +
                    "Oltre ad aver maturato esperienza con le diverse tecnologie, ho sviluppato attitudine a lavorare " +
                    "in team ed alta flessibilità nel seguire più flussi contemporaneamente.\n" +
                    "Sono alla ricerca di una realtà dinamica, all'interno della quale poter contribuire al massimo " +
                    "delle mie capacità. Desidero mettermi in gioco ed imparare sempre più cose possibili, affindando " +
                    "quindi skill e conoscenze.\nLaddove possibile sono disposto a mettermi in prima fila " +
                    "per raggiungere il risultato richiesto.", AUTHOR, YEAR);
            String sviluppoTestSuBrowser = "Sviluppo di Test Automatizzati su Browser (Chrome, Edge, Firefox, IE, " +
                    " etc) e su Dispositivi Mobile (Android, iOS) mediante Selenium e Appium, interagendo " +
                    "con framework proprietari dei clienti, dell'azienda e con alcuni OpenSource.";
            String creazioneDB = "Creazione e gestione di Database MySQL.";
            String dashboard = "Realizzazione Dashboard mediante Node-RED per visualizzazione " +
                    "dei dati prelevati dal Database.";
            String git = "Gestione di repository Git.";
            String dockerKubernetes = "Manutenzione di sistemi basati su Docker e realizzazione degli stessi " +
                    "in ambiente Kubernetes.";
            String mvngradle = "Familiarità con Maven e Gradle";
            String uniLavoro = "Tra anni universitari ed esperienze lavorative ho imparato a:";
            String lavoroInTeam = "Lavorare in team, sincronizzandomi con il team su ciascun task da svolgere.";
            String problemSolving = "Affinare le skill di Problem Solving, ricercando sempre la miglior soluzione " +
                    "per far fronte al problema posto.";
            String tempo = "Individuare il giusto tempo da dedicare a ciascun progetto affidatomi, " +
                    "assegnando priorità in base alle tempistiche di delivery e criticità in corso.";
            String proattivo = "Essere proattivo nei confronti di ogni sfida che mi si presenta.";
            String reply = "Reply - Concept Quality | nov 2020 - presente";
            String magistr = "Università degli Studi di Milano - Bicocca";
            String magistrDate = "Laurea magistrale | Ott 2018 - Ott 2020";
            String laureaMagistr = "Laurea magistrale in Informatica\n " +
                    "Tesi: \tDashboard per visualizzazione ed analisi di dati su piattaforma IoT.";
            String trienn = "Università degli Studi di Bari - Aldo Moro";
            String triennDate = "Laurea triennale | Ott. 2014- Ott. 2018";
            String laureaTrienn = "Laurea triennale in Informatica e Tecnologie per la Produzione del Software\n " +
                    "Tesi: Analisi e Progettazione di un sistema per la prenotazione e gestione di aule universitarie.";
////////////////////////////////////////////////////////////////////////////////////////////////////////////

            Categoria lavoro = new Categoria("Esperienze lavorative");
            Struttura esperienza1 = new Struttura();
            esperienza1.setTitolo("Test Automation Engeneer");
            esperienza1.setSottotitolo(reply);
            esperienza1.addElement(sviluppoTestSuBrowser);
            esperienza1.addElement(creazioneDB);
            esperienza1.addElement(dashboard);
            esperienza1.addElement(git);
            esperienza1.addElement(dockerKubernetes);
            esperienza1.addElement(mvngradle);
            lavoro.addStruttura(esperienza1);
////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Categoria softSkill = new Categoria("Soft Skill");
            Struttura esperienza2 = new Struttura();
            esperienza2.setTitolo(uniLavoro);
            esperienza2.addElement(lavoroInTeam);
            esperienza2.addElement(problemSolving);
            esperienza2.addElement(tempo);
            esperienza2.addElement(proattivo);
            softSkill.addStruttura(esperienza2);
////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Categoria istruzione = new Categoria("Istruzione precedente");
            Struttura magistrale = new Struttura();
            magistrale.setTitolo(magistr);
            magistrale.setSottotitolo(magistrDate);
            magistrale.addElement(laureaMagistr);
            Struttura triennale = new Struttura();
            triennale.setTitolo(trienn);
            triennale.setSottotitolo(triennDate);
            triennale.addElement(laureaTrienn);

            istruzione.addStruttura(magistrale);
            istruzione.addStruttura(triennale);
////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Categoria lingue = new Categoria("Lingue");
            Struttura italiano = new Struttura();
            italiano.setTitolo("Italiano");
            italiano.setSottotitolo("Madrelingua");
            Struttura inglese = new Struttura();
            inglese.setTitolo("Inglese");
            inglese.addElement("Ascolto: B2");
            inglese.addElement("Parlato: B2");
            inglese.addElement("Scritto: B1");
            lingue.addStruttura(italiano);
            lingue.addStruttura(inglese);
////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Categoria contatti = new Categoria("Contatti");
            Struttura email = new Struttura();
            email.setTitolo("E-mail");
            email.setSottotitolo("napoleoniandrea@pec.it");
            Struttura telefono = new Struttura();
            telefono.setTitolo("Telefono");
            telefono.setSottotitolo("+39 3791756740");
            contatti.addStruttura(email);
            contatti.addStruttura(telefono);
////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Categoria competenze = new Categoria("Competenze");
            competenze.addStruttura(new Struttura("Git","7/10"));
            competenze.addStruttura(new Struttura("Java","8/10"));
            competenze.addStruttura(new Struttura("MySQL","7/10"));
            competenze.addStruttura(new Struttura("Docker","6/10"));
            competenze.addStruttura(new Struttura("Kubernetes","5/10"));
            competenze.addStruttura(new Struttura("Selenium","8/10"));
            competenze.addStruttura(new Struttura("Appium","8/10"));
            competenze.addStruttura(new Struttura("Maven","7/10"));
            competenze.addStruttura(new Struttura("Gradle","5/10"));
            competenze.addStruttura(new Struttura("HTML & CSS","6/10"));
            competenze.addStruttura(new Struttura("Node-RED","9/10"));
            competenze.addStruttura(new Struttura("Sistemi Unix","7/10"));
            competenze.addStruttura(new Struttura("Office","7/10"));
            competenze.addStruttura(new Struttura("SSH","8/10"));
////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Categoria ide = new Categoria("IDE");
            ide.addStruttura(new Struttura("IntelliJ"));
            ide.addStruttura(new Struttura("VS Code"));
            ide.addStruttura(new Struttura("Eclipse"));
////////////////////////////////////////////////////////////////////////////////////////////////////////////

            ArrayList<Categoria> all = new ArrayList<Categoria>();
            all.add(lavoro);
            all.add(softSkill);
            all.add(istruzione);
            all.add(competenze);
            all.add(ide);
            all.add(lingue);

            System.out.println(separazione);
            for(Categoria c : all){
                    System.out.println(c);
                    System.out.println(separazione);
            }


       /* System.out.println(separazione);
        System.out.println(benvenuto);
        System.out.println(separazione);
        System.out.println(presentazione);
        System.out.println(separazione);
        System.out.println("Cosa posso raccontarti di me?");
*/
            ArrayList<String> domande = new ArrayList<>();


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            /*System.out.println(separazione);
            System.out.println(lavoro);
            System.out.println(separazione);
            System.out.println(softSkill);
            */    }
}
