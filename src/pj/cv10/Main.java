package pj.cv10;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Date now = new Date();
        //System.out.println(now);

        System.out.println("### UKOL1 ###");
        SimpleDateFormat df = new SimpleDateFormat("HH:mm dd/MM/yyyy");
//        System.out.println(df.format(now));

        Faktura f1 = new Faktura();
        System.out.println(f1);
        LocalDate profakturu = LocalDate.parse("2001-01-01");

        System.out.println("### UKOL 2 ###");
        Faktura f2 = new Faktura(profakturu);
        System.out.println(f2);

        System.out.println("### UKOL 3");
        ToolFile toolFile = new ToolFile();
        Path file = Paths.get("test.txt");

        try {
            toolFile.getInfo(file);
        } catch (Exception e) {
            System.out.println("Error!\n" + e.getMessage());
        }

        System.out.println("## UKOLY 4-5");
        try {
            toolFile.ls(".");
        } catch (Exception e) {
            System.out.println("Error!\n" + e.getMessage());
        }
        System.out.println("### UKOL 6 ###");
        try {
            ArrayList<String> directories = toolFile.listDirectories(".");
        } catch (Exception e) {
            System.out.println("Error!\n" + e.getMessage());
        }
        System.out.println("### UKOL 7 ###");
        try {
            ArrayList<String> files = toolFile.listFiles(".");
        } catch (Exception e) {
            System.out.println("Error!\n" + e.getMessage());
        }







    }
}
