public class PesquisaEleitoral extends javax.swing.JFrame {
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField4;
        private String id;
        private Pesquisa pesquisa;

        public PesquisaEleitoral(String id) {
                this.id = id;
                initComponents();
        }

        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jTextField2 = new javax.swing.JTextField();
                jTextField3 = new javax.swing.JTextField();
                jTextField4 = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                if (this.id != null) {
                        this.pesquisa = cadastroDefault(this.id);
                }
                jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
                jLabel1.setText("Pesquisa Eleitoral");

                jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
                jLabel2.setText("ID Cadandidato :");

                jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
                jLabel3.setText("Data da Pesquisa :");

                jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
                jLabel4.setText("Intenção de Voto :");

                jTextField1.setMinimumSize(new java.awt.Dimension(64, 28));
                jTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField1ActionPerformed(evt);
                        }
                });

                jTextField2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField2ActionPerformed(evt);
                        }
                });

                jTextField3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField3ActionPerformed(evt);
                        }
                });

                jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
                jLabel5.setText("Fonte da Pesquisa:");

                jTextField4.setMinimumSize(new java.awt.Dimension(64, 28));
                jTextField4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField4ActionPerformed(evt);
                        }
                });

                jButton3.setText("Salvar");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });
                jButton4.setText("Voltar");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });
                if (this.pesquisa != null) {
                        String n = String.valueOf(this.pesquisa.getIdCandidato());
                        String p = this.pesquisa.getData();
                        String i = String.valueOf(this.pesquisa.getIntencaoDeVoto());
                        String f = this.pesquisa.getFontePesquisa();
                        jTextField1.setText(n);
                        jTextField2.setText(p);
                        jTextField3.setText(i);
                        jTextField4.setText(f);
                }

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jButton4)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButton3)
                                                                .addGap(25, 25, 25))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(33, 33, 33)
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                162,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                .addGap(26, 26, 26)
                                                                                                                                                .addComponent(jLabel5)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(jTextField4,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE))
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addGap(27, 27, 27)
                                                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                .addComponent(jLabel3)
                                                                                                                                                                                .addComponent(jLabel4)
                                                                                                                                                                                .addComponent(jLabel2))
                                                                                                                                                                .addGap(12, 12, 12)
                                                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                .addComponent(jTextField3,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                221,
                                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                                .addComponent(jTextField2)
                                                                                                                                                                                .addComponent(jTextField1,
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                Short.MAX_VALUE))))
                                                                                                                .addGap(1, 1, 1)))
                                                                .addGap(110, 110, 110)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addComponent(jLabel1)
                                                                .addGap(34, 34, 34)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jLabel2)
                                                                                                .addGap(15, 15, 15))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jTextField1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jLabel3)
                                                                                                .addGap(15, 15, 15))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jTextField2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jTextField3))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jTextField4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 27, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jButton4)
                                                                                .addComponent(jButton3))
                                                                .addGap(30, 30, 30)));

                pack();
        }

        private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("1");
        }

        private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("2");
        }

        private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("3");
        }

        private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("4");
        }

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
                this.dispose();
                retorna();

        }

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaStorage pesConec=new PesquisaStorage();
                Pesquisa p = new Pesquisa();
                p.setIdCandidato(Integer.parseInt(jTextField1.getText()));
                p.setData(jTextField2.getText());
                p.setIntencaoDeVoto(Double.parseDouble(jTextField3.getText()));
                p.setFontePesquisa(jTextField4.getText());
                if (this.pesquisa != null) {

                        pesConec.updatetList(p);
                } else {

                        pesConec.insertList(p);
                }
                retorna();

        }

        public Pesquisa cadastroDefault(String id) {
                return PesquisaStorage.selectPesquisa(id);
        }

        public void retorna() {
                this.dispose();
                ListaPesquisa l = new ListaPesquisa();
                l.setDefaultCloseOperation(Inicio.DISPOSE_ON_CLOSE);
                l.setVisible(true);
        }
}
