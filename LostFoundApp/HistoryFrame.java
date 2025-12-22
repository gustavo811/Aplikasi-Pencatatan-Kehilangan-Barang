import javax.swing.*;
import java.util.ArrayList;

public class HistoryFrame extends JFrame {
    public HistoryFrame() {
        setTitle("History Laporan");
        setSize(300,200);
        setLocationRelativeTo(null);

        ArrayList<BarangHilang> list = DataManager.loadData();
        JLabel lbl = new JLabel("Total Laporan Barang Hilang: " + list.size());

        add(lbl);
        setVisible(true);
    }
}