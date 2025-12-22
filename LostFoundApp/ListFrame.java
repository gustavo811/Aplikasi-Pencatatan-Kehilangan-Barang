import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;

public class ListFrame extends JFrame {
    public ListFrame() {
        setTitle("List Barang Hilang");
        setSize(600,300);
        setLocationRelativeTo(null);

        String[] col = {"Nama", "Lokasi", "Tanggal", "Pelapor"};
        DefaultTableModel model = new DefaultTableModel(col,0);
        JTable table = new JTable(model);

        ArrayList<BarangHilang> list = DataManager.loadData();
        list.sort(Comparator.comparing(BarangHilang::getNamaBarang));

        for (BarangHilang b : list) {
            model.addRow(new Object[]{b.getNamaBarang(), b.getLokasi(), b.getTanggal(), b.getPelapor()});
        }

        add(new JScrollPane(table));
        setVisible(true);
    }
}