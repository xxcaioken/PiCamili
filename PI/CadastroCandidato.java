
public class CadastroCandidato extends javax.swing.JFrame {
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField5;
        private javax.swing.JTextField jTextField6;
        private javax.swing.JTextField jTextField7;
        private javax.swing.JToggleButton jToggleButton2;
        private javax.swing.JToggleButton jToggleButton3;
        private javax.swing.JToggleButton jToggleButton4;
        private javax.swing.JToolBar jToolBar1;
        private int id = 0;
        private Candidato candidato;

        public CadastroCandidato(String id) {
                this.id = Integer.valueOf(id);
                initComponents();

        }

        private void initComponents() {
                jToolBar1 = new javax.swing.JToolBar();
                jTextField1 = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jTextField5 = new javax.swing.JTextField();
                jTextField6 = new javax.swing.JTextField();
                jTextField7 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jToggleButton2 = new javax.swing.JToggleButton();
                jToggleButton3 = new javax.swing.JToggleButton();
                jToggleButton4 = new javax.swing.JToggleButton();

                jToolBar1.setRollover(true);
                if (this.id != 0) {
                        this.candidato = CadastroDefault(this.id);
                }
                jTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField1ActionPerformed(evt);
                        }
                });
                jToolBar1.add(jTextField1);

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel1.setText("Cadastro Candidato");

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel2.setText("ID :");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel3.setText("Nome :");

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel4.setText("Partido:");
                if (this.candidato != null) {
                        String i = String.valueOf(this.candidato.getId());
                        String n = this.candidato.getNome();
                        String p = this.candidato.getPartido();
                        jTextField6.setText(i);
                        jTextField7.setText(p);
                        jTextField5.setText(n);
                }
                jTextField5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField5ActionPerformed(evt);
                        }
                });

                jTextField6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField6ActionPerformed(evt);
                        }
                });

                jTextField7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField7ActionPerformed(evt);
                        }
                });

                jButton1.setText("Voltar");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jToggleButton2.setBackground(new java.awt.Color(0, 153, 0));
                jToggleButton2.setText("Salvar");
                jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton2ActionPerformed(evt);
                        }

                });

                jToggleButton3.setBackground(new java.awt.Color(255, 0, 0));
                jToggleButton3.setText("Excluir");
                jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton3ActionPerformed(evt);
                        }

                });
                jToggleButton4.setText("Editar");
                jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton4ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(40, 40, 40)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                57,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel1)))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(33, 33, 33)
                                                                                                                                .addComponent(jLabel3,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                57,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                layout.createSequentialGroup()
                                                                                                                                                .addContainerGap()
                                                                                                                                                .addComponent(jLabel4)))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jTextField5,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                174,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jTextField7,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                174,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jTextField6,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                174,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addContainerGap(150, Short.MAX_VALUE))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addComponent(jButton1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jToggleButton2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jToggleButton3,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jToggleButton4,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(23, 23, 23)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(28, 28, 28)
                                                                .addComponent(jLabel1)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(29, 29, 29)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(jLabel2)
                                                                                                                                .addGap(20, 20, 20))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(jTextField6)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel3)
                                                                                                                .addComponent(jTextField5,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                33,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jTextField7,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                33,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jLabel4))
                                                                                                .addGap(58, 58, 58)
                                                                                                .addComponent(jButton1)
                                                                                                .addGap(24, 24, 24))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jToggleButton2)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jToggleButton3)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jToggleButton4)
                                                                                                                .addGap(19, 19, 19)))));

                pack();
        }

        public Candidato CadastroDefault(int id) {
                return CandidatoStorage.selectCandidato(id);
        }

        public void setaAsCoisa() {

        }

        private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        }

        private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                retorna();

        }

        private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {
                Candidato c = new Candidato();
                c.setId(Integer.parseInt(jTextField6.getText()));
                c.setNome(jTextField5.getText());
                c.setpartido(jTextField7.getText());
                new CandidatoStorage().updatetList(c);
                retorna();
        }

        private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {
                Candidato c = new Candidato();
                c.setId(Integer.parseInt(jTextField6.getText()));
                c.setNome(jTextField5.getText());
                c.setpartido(jTextField7.getText());
                new CandidatoStorage().insertList(c);
                retorna();

        }

        private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {
                String index = jTextField6.getText();
                new CandidatoStorage().deleteList(index);
                retorna();

        }

        public void retorna() {
                this.dispose();
                ListaCandidato l = new ListaCandidato();
                l.setDefaultCloseOperation(Inicio.DISPOSE_ON_CLOSE);
                l.setVisible(true);
        }
}
