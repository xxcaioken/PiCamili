
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Desempenho extends javax.swing.JFrame {

    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;

    public Desempenho() {
        initComponents();
    }

    private JScrollPane criarTabelaPanel() {
        JTable j = new JTable();
        DesempenhoTableModel tableModel = new DesempenhoTableModel();
        j = new JTable(tableModel);
        j.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        j.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

            }
        });
        JScrollPane scrollPane = new JScrollPane(j);
        return scrollPane;
    }

    private void initComponents() {
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        JScrollPane scrollPane = criarTabelaPanel();
        jButton2.setText("jButton2");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel1.setText("Desempenho das Pesquisas");

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(scrollPane)))
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jButton1)))
                        .addGap(24, 24, 24));

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203,
                                        Short.MAX_VALUE)
                                .addGap(24, 24, 24)
                                .addComponent(scrollPane))
                        .addComponent(jButton1)
                        .addGap(40, 40, 40));

        pack();

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        Inicio inicio = new Inicio();

        inicio.setDefaultCloseOperation(Inicio.DISPOSE_ON_CLOSE);
        inicio.setVisible(true);

    }

}
