import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListaCandidato extends javax.swing.JFrame {

    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JLabel jLabel1;
    CandidatoTableModel tableModel = new CandidatoTableModel();
    JTable j = new JTable(tableModel);

    public ListaCandidato() {
        initComponents();
    }

    private JScrollPane criarTabelaPanel() {
        j.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        j.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                btnsopt();
                if (!e.getValueIsAdjusting()) {
                    if (j.getSelectedRow() >= 0) {
                        habilitarBtns();
                    } else {
                        desabilitarBtns();
                    }
                }
            }
        });
        JScrollPane scrollPane = new JScrollPane(j);
        return scrollPane;
    }

    private void initComponents() {
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        JScrollPane scrollPane = criarTabelaPanel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel1.setText("Desempenho das Pesquisas");

        jButton1.setText("Voltar");
        jButton3.setText("adicionar");
        jButton2.setText("editar");
        jButton4.setText("excluir");

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                // .addGap(24, 24, 24)
                                                .addComponent(scrollPane)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton3)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton4)
                                                .addContainerGap()))));

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203,
                                        Short.MAX_VALUE)
                                .addComponent(scrollPane))
                        .addGap(24, 24, 24)
                        .addComponent(jButton1)
                        .addGap(24, 24, 24)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4));

        pack();
        desabilitarBtns();

    }

    private void habilitarBtns() {
        jButton2.setEnabled(true);
        jButton4.setEnabled(true);
    }

    private void desabilitarBtns() {
        jButton2.setEnabled(false);
        jButton4.setEnabled(false);
    }

    public void btnsopt() {
        j.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    if (j.getSelectedRow() >= 0) {
                        habilitarBtns();
                    } else {
                        desabilitarBtns();
                    }
                }
            }
        });
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        Inicio inicio = new Inicio();
        inicio.setDefaultCloseOperation(Inicio.DISPOSE_ON_CLOSE);
        inicio.setVisible(true);

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int selection = j.getSelectedRow();
        String i = j.getModel().getValueAt(selection, 0).toString();
        this.dispose();
        CadastroCandidato candidato = new CadastroCandidato(i);
        candidato.setDefaultCloseOperation(Inicio.DISPOSE_ON_CLOSE);
        candidato.setVisible(true);

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        CadastroCandidato inicio = new CadastroCandidato("0");

        inicio.setDefaultCloseOperation(Inicio.DISPOSE_ON_CLOSE);
        inicio.setVisible(true);

    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        int selection = j.getSelectedRow();
        Object i = j.getModel().getValueAt(selection, 0);
        new CandidatoStorage().deleteList((String) i);

    }

}
