import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class FormFrame extends JFrame {
    public FormFrame() {
        setTitle("Input Barang Hilang");
        setSize(400,300);
        setLocationRelativeTo(null);

        JTextField tfNama = new JTextField(15);
        JTextField tfLokasi = new JTextField(15);
        JTextField tfPelapor = new JTextField(15);

        JButton btnSimpan = new JButton("Simpan");

        btnSimpan.addActionListener(e -> {
            try {
                ArrayList<BarangHilang> list = DataManager.loadData();
                list.add(new BarangHilang(tfNama.getText(), tfLokasi.getText(), LocalDate.now(), tfPelapor.getText()));
                DataManager.saveData(list);
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
                dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Input tidak valid!");
            }
        });

        JPanel p = new JPanel();
        p.add(new JLabel("Nama Barang"));
        p.add(tfNama);
        p.add(new JLabel("Lokasi"));
        p.add(tfLokasi);
        p.add(new JLabel("Pelapor"));
        p.add(tfPelapor);
        p.add(btnSimpan);

        add(p);
        setVisible(true);
    }
}