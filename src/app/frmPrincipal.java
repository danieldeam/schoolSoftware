/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

/**
 *
 * @author Universidad
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        if (App.tipo_usuario == "Profesor") {
            menuProfesores.setEnabled(false);
            MenuitemEstudiantes.setEnabled(false);
            MenuitemCursos.setEnabled(false);
            menuregistro.setEnabled(false);
        } else if (App.tipo_usuario == "Estudiante"){
            menuProfesores.setEnabled(false);
            menuEstudiantes.setEnabled(false);
            MenuitemCursos.setEnabled(false);
            menuregistro.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JPanel();
        lblIcon = new javax.swing.JLabel();
        lblBienvenidos = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProfesores = new javax.swing.JMenu();
        MenuitemProfesores = new javax.swing.JMenuItem();
        menuEstudiantes = new javax.swing.JMenu();
        MenuitemEstudiantes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuitemEstudiantesporcurso = new javax.swing.JMenuItem();
        MenuitemEstudiantesporprofesor = new javax.swing.JMenuItem();
        menuCursos = new javax.swing.JMenu();
        MenuitemCursos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MenuitemCursosporprofesor = new javax.swing.JMenuItem();
        menuregistro = new javax.swing.JMenu();
        menuCerrarsesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EDUSENA - v1.0");

        Escritorio.setBackground(new java.awt.Color(255, 102, 0));
        Escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoSena.png"))); // NOI18N
        Escritorio.add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        lblBienvenidos.setFont(new java.awt.Font("Roboto Black", 1, 48)); // NOI18N
        lblBienvenidos.setText("BIENVENIDO A EDUSENA");
        Escritorio.add(lblBienvenidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgroundppal2.jpg"))); // NOI18N
        Escritorio.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        jMenuBar1.setForeground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N

        menuProfesores.setText("PROFESORES");
        menuProfesores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuProfesores.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N

        MenuitemProfesores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuitemProfesores.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        MenuitemProfesores.setText("Listado de Profesores");
        MenuitemProfesores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuitemProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuitemProfesoresActionPerformed(evt);
            }
        });
        menuProfesores.add(MenuitemProfesores);

        jMenuBar1.add(menuProfesores);

        menuEstudiantes.setText("ESTUDIANTES");
        menuEstudiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuEstudiantes.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N

        MenuitemEstudiantes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuitemEstudiantes.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        MenuitemEstudiantes.setText("Listado de Estudiantes");
        MenuitemEstudiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuitemEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuitemEstudiantesActionPerformed(evt);
            }
        });
        menuEstudiantes.add(MenuitemEstudiantes);
        menuEstudiantes.add(jSeparator1);

        MenuitemEstudiantesporcurso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuitemEstudiantesporcurso.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        MenuitemEstudiantesporcurso.setText("Estudiantes por Curso");
        MenuitemEstudiantesporcurso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuitemEstudiantesporcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuitemEstudiantesporcursoActionPerformed(evt);
            }
        });
        menuEstudiantes.add(MenuitemEstudiantesporcurso);

        MenuitemEstudiantesporprofesor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuitemEstudiantesporprofesor.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        MenuitemEstudiantesporprofesor.setText("Estudiantes por Profesor");
        MenuitemEstudiantesporprofesor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuitemEstudiantesporprofesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuitemEstudiantesporprofesorActionPerformed(evt);
            }
        });
        menuEstudiantes.add(MenuitemEstudiantesporprofesor);

        jMenuBar1.add(menuEstudiantes);

        menuCursos.setText("CURSOS");
        menuCursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCursos.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N

        MenuitemCursos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuitemCursos.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        MenuitemCursos.setText("Listado de Cursos");
        MenuitemCursos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuitemCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuitemCursosActionPerformed(evt);
            }
        });
        menuCursos.add(MenuitemCursos);
        menuCursos.add(jSeparator2);

        MenuitemCursosporprofesor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuitemCursosporprofesor.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        MenuitemCursosporprofesor.setText("Cursos por Profesor");
        MenuitemCursosporprofesor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuitemCursosporprofesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuitemCursosporprofesorActionPerformed(evt);
            }
        });
        menuCursos.add(MenuitemCursosporprofesor);

        jMenuBar1.add(menuCursos);

        menuregistro.setText("REGISTRAR USUARIO");
        menuregistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuregistro.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        menuregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuregistroMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuregistro);

        menuCerrarsesion.setText("CERRAR SESION");
        menuCerrarsesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCerrarsesion.setFocusTraversalPolicyProvider(true);
        menuCerrarsesion.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        menuCerrarsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCerrarsesionMouseClicked(evt);
            }
        });
        menuCerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarsesionActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuCerrarsesion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 962, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarsesionActionPerformed

    }//GEN-LAST:event_menuCerrarsesionActionPerformed

    private void menuCerrarsesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCerrarsesionMouseClicked
        // TODO add your handling code here:
        frmLogin login = new frmLogin();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuCerrarsesionMouseClicked

    private void MenuitemProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuitemProfesoresActionPerformed
        // TODO add your handling code here:
        frmProfesores profesores = new frmProfesores();
        profesores.setLocationRelativeTo(null);
        profesores.setVisible(true);
        
    }//GEN-LAST:event_MenuitemProfesoresActionPerformed

    private void MenuitemEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuitemEstudiantesActionPerformed
        // TODO add your handling code here:
        frmTodoslosestudiantes estudiantes1 = new frmTodoslosestudiantes();
        estudiantes1.setLocationRelativeTo(null);
        estudiantes1.setVisible(true);
    }//GEN-LAST:event_MenuitemEstudiantesActionPerformed

    private void MenuitemEstudiantesporcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuitemEstudiantesporcursoActionPerformed
        // TODO add your handling code here:
        frmEstudiantesporcursos e1 = new frmEstudiantesporcursos();
        e1.setLocationRelativeTo(null);
        e1.setVisible(true);
       
    }//GEN-LAST:event_MenuitemEstudiantesporcursoActionPerformed

    
    private void MenuitemCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuitemCursosActionPerformed
        // TODO add your handling code here:
        frmCursos c1 = new frmCursos();
        c1.setLocationRelativeTo(null);
        c1.setVisible(true);
    }//GEN-LAST:event_MenuitemCursosActionPerformed

    private void MenuitemEstudiantesporprofesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuitemEstudiantesporprofesorActionPerformed
        // TODO add your handling code here:
        frmEstudiantesporprofesor ep = new frmEstudiantesporprofesor();
        ep.setLocationRelativeTo(null);
        ep.setVisible(true);
    }//GEN-LAST:event_MenuitemEstudiantesporprofesorActionPerformed

    private void MenuitemCursosporprofesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuitemCursosporprofesorActionPerformed
        // TODO add your handling code here:
        frmCursosprofesores cp = new frmCursosprofesores();
        cp.setLocationRelativeTo(null);
        cp.setVisible(true);
    }//GEN-LAST:event_MenuitemCursosporprofesorActionPerformed

    private void menuregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuregistroMouseClicked
        // TODO add your handling code here:
        frmRegistro registrar = new frmRegistro();
        registrar.setVisible(true);
    }//GEN-LAST:event_menuregistroMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Escritorio;
    private javax.swing.JMenuItem MenuitemCursos;
    private javax.swing.JMenuItem MenuitemCursosporprofesor;
    private javax.swing.JMenuItem MenuitemEstudiantes;
    private javax.swing.JMenuItem MenuitemEstudiantesporcurso;
    private javax.swing.JMenuItem MenuitemEstudiantesporprofesor;
    private javax.swing.JMenuItem MenuitemProfesores;
    private javax.swing.JLabel background;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel lblBienvenidos;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JMenu menuCerrarsesion;
    private javax.swing.JMenu menuCursos;
    private javax.swing.JMenu menuEstudiantes;
    private javax.swing.JMenu menuProfesores;
    private javax.swing.JMenu menuregistro;
    // End of variables declaration//GEN-END:variables
}