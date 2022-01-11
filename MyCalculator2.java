/**
 * @ Avirup Sett
 * 
 */
public class MyCalculator2 extends javax.swing.JFrame {

    /**
     * Creates new form MyCalculator2
     */
    public MyCalculator2() {
        initComponents();
        this.setTitle("Calculator");
    }

    String minus_symbol;
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextField1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        if((System.getProperty("os.name")).equalsIgnoreCase("Linux")){
                minus_symbol="–";
            }
            else{
               minus_symbol=Character.toString((char)150);
            }

        jLabel3.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (1).jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (6).jpg"))); // NOI18N
        jLabel4.setText(" "+Character.toString((char)(247))+" ");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (26).jpg"))); // NOI18N
        jLabel5.setText("+/-");
        jLabel5.setToolTipText("");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (3).jpg"))); // NOI18N
        jLabel6.setText("%");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (10).jpg"))); // NOI18N
        jLabel7.setText(" x ");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (9).jpg"))); // NOI18N
        jLabel8.setText("9");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (8).jpg"))); // NOI18N
        jLabel9.setText("8");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (7).jpg"))); // NOI18N
        jLabel10.setText("7");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (14).jpg"))); // NOI18N
        jLabel11.setText("4");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (13).jpg"))); // NOI18N
        jLabel12.setText("5");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (12).jpg"))); // NOI18N
        jLabel13.setText("6");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (11).jpg"))); // NOI18N
        jLabel14.setText(" "+minus_symbol+" ");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (20).jpg"))); // NOI18N
        jLabel15.setText("1");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (19).jpg"))); // NOI18N
        jLabel16.setText("2");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (18).jpg"))); // NOI18N
        jLabel17.setText("3");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (17).jpg"))); // NOI18N
        jLabel18.setText(" + ");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (25).jpg"))); // NOI18N
        jLabel19.setText("0");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (24).jpg"))); // NOI18N
        jLabel20.setText(".");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (22).jpg"))); // NOI18N
        jLabel21.setText("jLabel3");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("/img/c6039f55f3ac67bf863bb7740480cb58 (21).jpg"))); // NOI18N
        jLabel22.setText("=");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        jScrollPane2.setBorder(null);
        jScrollPane2.setAlignmentX(0.0F);
        jScrollPane2.setAlignmentY(0.0F);
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setFocusable(false);
        jScrollPane2.setViewportView(null);

        jTextField1.setEditable(false);
        jTextField1.setColumns(20);
        jTextField1.setFont(new java.awt.Font("Ubuntu Thin", 1, 17)); // NOI18N
        jTextField1.setLineWrap(true);
        jTextField1.setRows(3);
        jTextField1.setTabSize(4);
        jTextField1.setWrapStyleWord(true);
        jTextField1.setAlignmentX(0.0F);
        jTextField1.setAlignmentY(0.0F);
        jTextField1.setAutoscrolls(false);
        jTextField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField1.setFocusable(false);
        jTextField1.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextField1.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(jTextField1);

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setAlignmentX(0.0F);
        jScrollPane1.setAlignmentY(0.0F);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(null);

        jTextField2.setEditable(false);
        jTextField2.setColumns(20);
        jTextField2.setFont(new java.awt.Font("Ubuntu Thin", 1, 27)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setRows(3);
        jTextField2.setTabSize(4);
        jTextField2.setFocusable(false);
        jTextField2.setRequestFocusEnabled(false);
        jTextField2.setSelectionColor(new java.awt.Color(255, 255, 255));
        jTextField2.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTextField2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private int lock=0;
    //String minus_symbol=Character.toString((char)150);
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
       jTextField2.setText("");
       jTextField1.setText("");
       lock=0;
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        String all_cal= jTextField2.getText()+jLabel10.getText();
        jTextField2.setText(all_cal);
        lock=0;
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        String all_cal= jTextField2.getText()+jLabel9.getText();
        jTextField2.setText(all_cal);
        lock=0;
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        String all_cal= jTextField2.getText()+jLabel8.getText();
        jTextField2.setText(all_cal);
        lock=0;
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        String all_cal= jTextField2.getText()+jLabel11.getText();
        jTextField2.setText(all_cal);
        lock=0;
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        String all_cal= jTextField2.getText()+jLabel12.getText();
        jTextField2.setText(all_cal);
        lock=0;
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        String all_cal= jTextField2.getText()+jLabel13.getText();
        jTextField2.setText(all_cal);
        lock=0;
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        String all_cal= jTextField2.getText()+jLabel15.getText();
        jTextField2.setText(all_cal);
        lock=0;
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        String all_cal= jTextField2.getText()+jLabel16.getText();
        jTextField2.setText(all_cal);
        lock=0;
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        String all_cal= jTextField2.getText()+jLabel17.getText();
        jTextField2.setText(all_cal);
        lock=0;
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        String all_cal= jTextField2.getText()+jLabel19.getText();
        jTextField2.setText(all_cal);
        lock=0;
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        String all_cal= jTextField2.getText()+jLabel20.getText();
        jTextField2.setText(all_cal);
        lock=0;
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        String all_cal= jTextField2.getText();
      
        if(all_cal.length()!=0){
        String del=all_cal.substring(0, all_cal.length()-1);
        jTextField2.setText(del.trim());
        }
        else{
        String del=(jTextField1.getText()).substring(0, ((jTextField1.getText()).trim()).length()-1);
        jTextField1.setText(del.trim()); 
        }
        lock=0;
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        if(swclear==1){
            jTextField1.setText("");
            swclear=0;
        }
        String all_cal=jTextField1.getText()+jTextField2.getText()+jLabel18.getText();
        
        if(lock==0){
        jTextField1.setText(all_cal);
        lock=1;
        jTextField2.setText("");
        }
        else{
            String typed = jTextField1.getText();
            jTextField1.setText((typed.substring(0, typed.length()-2)).concat("+ "));
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        if(swclear==1){
            jTextField1.setText("");
            swclear=0;
        }
        String all_cal=jTextField1.getText()+jTextField2.getText()+jLabel14.getText();
        
        if(lock==0){
        jTextField1.setText(all_cal);
        lock=1;
        jTextField2.setText("");
        }
        else{
            String typed = jTextField1.getText();
            jTextField1.setText((typed.substring(0, typed.length()-2)).concat(minus_symbol+" "));
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if(swclear==1){
            jTextField1.setText("");
            swclear=0;
        } 
        String all_cal=jTextField1.getText()+jTextField2.getText()+jLabel7.getText();
        
        if(lock==0){
        jTextField1.setText(all_cal);
        lock=1;
        jTextField2.setText("");
        }
        else{
            String typed = jTextField1.getText();
            jTextField1.setText((typed.substring(0, typed.length()-2)).concat("x "));
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if(swclear==1){
            jTextField1.setText("");
            swclear=0;
        }
        String all_cal=jTextField1.getText()+jTextField2.getText()+jLabel4.getText();
        
        if(lock==0){
        jTextField1.setText(all_cal);
        lock=1;
        jTextField2.setText("");
        }
        else{
            String typed = jTextField1.getText();
            jTextField1.setText((typed.substring(0, typed.length()-2)).concat(Character.toString((char)247)+" "));
        }
    }//GEN-LAST:event_jLabel4MouseClicked
    private double ans=0.0;private int swclear=0;
    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        String fs=jTextField1.getText()+jTextField2.getText();
        jTextField2.setText("");
        swclear=1;
        char ch=fs.charAt(fs.length()-2);
		String cs2=Character.toString(ch);
        if(cs2.equalsIgnoreCase(Character.toString((char)247))||cs2.equalsIgnoreCase("x")||cs2.equalsIgnoreCase("+")||cs2.equalsIgnoreCase(minus_symbol)){
            fs=fs.substring(0,fs.length()-2);
            jTextField1.setText("fs");
        }
        String s=fs;
        ans=0.0;
        try{
        for(int i=0;i<fs.length();i++){
        char c=fs.charAt(i);
		String cs=Character.toString(c);
        if(cs.equalsIgnoreCase("%")){

            int lindex=findex(fs.substring(0,i))+(fposition(fs.substring(0,i))).length()+(lposition(fs.substring(i+1))).length()+1;
            ans=Double.valueOf(fposition(fs.substring(0,i)))/100;
            System.out.println(String.format("%,.4f", ans));
            fs=fs.substring(0,findex(fs.substring(0,i)))+ans+fs.substring(lindex);
            System.out.println(fs);
        }
        }
        for(int i=0;i<fs.length();i++){
        char c=fs.charAt(i);
		String cs=Character.toString(c);
        if(cs.equalsIgnoreCase(Character.toString((char)(247)))){
            int lindex=findex(fs.substring(0,i))+(fposition(fs.substring(0,i))).length()+(lposition(fs.substring(i+1))).length()+1;
            ans=Double.valueOf(fposition(fs.substring(0,i)))/Double.valueOf(lposition(fs.substring(i+1)));
            System.out.println(String.format("%,.4f", ans));
            fs=fs.substring(0,findex(fs.substring(0,i)))+ans+fs.substring(lindex);
            System.out.println(fs);
        }
        }
        for(int i=0;i<fs.length();i++){
        char c=fs.charAt(i);
		String cs=Character.toString(c);
         if(cs.equalsIgnoreCase("x")){
            int lindex=findex(fs.substring(0,i))+(fposition(fs.substring(0,i))).length()+(lposition(fs.substring(i+1))).length()+1;
            ans=Double.valueOf(fposition(fs.substring(0,i)))*Double.valueOf(lposition(fs.substring(i+1)));
            System.out.println(String.format("%,.4f", ans));
            fs=fs.substring(0,findex(fs.substring(0,i)))+ans+fs.substring(lindex);
            System.out.println(fs);
        }
        }
         for(int i=0;i<fs.length();i++){
        char c=fs.charAt(i);
		String cs=Character.toString(c);
         if(cs.equalsIgnoreCase("+")){
            int lindex=findex(fs.substring(0,i))+(fposition(fs.substring(0,i))).length()+(lposition(fs.substring(i+1))).length()+1;
            ans=Double.valueOf(fposition(fs.substring(0,i)))+Double.valueOf(lposition(fs.substring(i+1)));
            System.out.println(String.format("%,.4f", ans));
            fs=fs.substring(0,findex(fs.substring(0,i)))+ans+fs.substring(lindex);
            System.out.println(fs);
        }
        }
          for(int i=0;i<fs.length();i++){
        char c=fs.charAt(i);
		String cs=Character.toString(c);
         if(cs.equalsIgnoreCase(minus_symbol)){
            int lindex=findex(fs.substring(0,i))+(fposition(fs.substring(0,i))).length()+(lposition(fs.substring(i+1))).length()+1;
            ans=Double.valueOf(fposition(fs.substring(0,i)))-Double.valueOf(lposition(fs.substring(i+1)));
            System.out.println(String.format("%,.4f", ans));
            fs=fs.substring(0,findex(fs.substring(0,i)))+ans+fs.substring(lindex);
            System.out.println(fs);
        }
       }
          if(ans==(int)ans && s.length()<=31)
          jTextField1.setText(s+"\n\n\nANS:"+ (int)ans);
          else if(ans!=(int)ans && s.length()<=31)
          jTextField1.setText(s+"\n\n\nANS:"+ans);
          else if(ans==(int)ans && s.length()>31)
          jTextField1.setText(s+"\n\nANS:"+ (int)ans);
          else if(ans!=(int)ans && s.length()>31)
          jTextField1.setText(s+"\n\nANS:"+ans);
        }
        catch(Exception e){
            jTextField1.setText(s+"\n\nERROR");
        }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        String all_cal= jTextField2.getText()+jLabel6.getText();
        jTextField2.setText(all_cal);
        lock=0;
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        String all_cal= jTextField2.getText();
        jTextField2.setText(("-").concat(all_cal));
        lock=0;
    }//GEN-LAST:event_jLabel5MouseClicked
    private String fposition(String s){
        String sub="";
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
			String cs=Character.toString(c);
            if((!cs.equalsIgnoreCase(Character.toString((char)(247))))&&(!cs.equalsIgnoreCase("x"))&&(!cs.equalsIgnoreCase("+"))&&(!cs.equalsIgnoreCase(minus_symbol))){
                sub=c+sub;
            }
            else
            {
                break;
            }
        }
        return sub;
    }
    
    private String lposition(String s){
        String sub="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
			String cs=Character.toString(c);
            if((!cs.equalsIgnoreCase(Character.toString((char)(247))))&&(!cs.equalsIgnoreCase("x"))&&(!cs.equalsIgnoreCase("+"))&&(!cs.equalsIgnoreCase(minus_symbol))){
                sub=sub+c;
            }
             else
            {
                break;
            }
        }
        return sub;
    }
    
    private int findex(String s){
        int flag=0;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
			String cs=Character.toString(c);
            if((!cs.equalsIgnoreCase(Character.toString((char)(247))))&&(!cs.equalsIgnoreCase("/"))&&(!cs.equalsIgnoreCase("x"))&&(!cs.equalsIgnoreCase("+"))&&(!cs.equalsIgnoreCase(minus_symbol))){
                flag=i;
            }
            else
            {
                break;
            }
        }
        return flag;
    }
    
  
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyCalculator2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCalculator2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCalculator2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCalculator2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCalculator2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextField1;
    private javax.swing.JTextArea jTextField2;
    // End of variables declaration//GEN-END:variables
    @Override
    public String toString() {
        return "MyCalculator2 [ans=" + ans + ", jLabel10=" + jLabel10 + ", jLabel11=" + jLabel11 + ", jLabel12="
                + jLabel12 + ", jLabel13=" + jLabel13 + ", jLabel14=" + jLabel14 + ", jLabel15=" + jLabel15
                + ", jLabel16=" + jLabel16 + ", jLabel17=" + jLabel17 + ", jLabel18=" + jLabel18 + ", jLabel19="
                + jLabel19 + ", jLabel20=" + jLabel20 + ", jLabel21=" + jLabel21 + ", jLabel22=" + jLabel22
                + ", jLabel3=" + jLabel3 + ", jLabel4=" + jLabel4 + ", jLabel5=" + jLabel5 + ", jLabel6=" + jLabel6
                + ", jLabel7=" + jLabel7 + ", jLabel8=" + jLabel8 + ", jLabel9=" + jLabel9 + ", jScrollPane1="
                + jScrollPane1 + ", jScrollPane2=" + jScrollPane2 + ", jTextField1=" + jTextField1 + ", jTextField2="
                + jTextField2 + ", lock=" + lock + ", swclear=" + swclear + "]";
    }
}

    

