import javax.swing.*;

public class DashboardFrame extends JFrame {
    public DashboardFrame() {
        setTitle("Dashboard - Lost & Found");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton btnList = new JButton("List Barang Hilang");
        JButton btnInput = new JButton("Input Barang");
        JButton btnHistory = new JButton("History");

        btnList.addActionListener(e -> new ListFrame());
        btnInput.addActionListener(e -> new FormFrame());
        btnHistory.addActionListener(e -> new HistoryFrame());

        JPanel panel = new JPanel();
        panel.add(btnList);
        panel.add(btnInput);
        panel.add(btnHistory);

        add(panel);
        setVisible(true);
    }
}