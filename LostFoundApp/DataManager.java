import java.io.*;
import java.util.*;
import java.time.LocalDate;

public class DataManager {
    private static final String FILE_NAME = "data_barang_hilang.csv";

    public static ArrayList<BarangHilang> loadData() {
        ArrayList<BarangHilang> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                list.add(new BarangHilang(d[0], d[1], LocalDate.parse(d[2]), d[3]));
            }
        } catch (IOException e) {
            System.out.println("File belum ada.");
        }
        return list;
    }

    public static void saveData(ArrayList<BarangHilang> list) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (BarangHilang b : list) {
                pw.println(b.toCSV());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}