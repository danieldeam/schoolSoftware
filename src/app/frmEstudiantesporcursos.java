/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import java.sql.*;
import config.Conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Universidad
 */
public class frmEstudiantesporcursos extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;

    /**
     * Creates new form frmEstudiantesporcursos
     */
    public frmEstudiantesporcursos() {
        initComponents();
        cboCursos.addItem("Seleccione");
        cboCursos.addItem("Matemática 1");
        cboCursos.addItem("Matemática 2");
        cboCursos.addItem("Matemática 3");
        cboCursos.addItem("Idiomas");
        cboCursos.addItem("Deportes");
        cboCursos.addItem("Música 1");
        cboCursos.addItem("Música 2");
        cboCursos.addItem("Química 1");
        cboCursos.addItem("Química 2");
        cboCursos.addItem("Química 3");
        cboCursos.addItem("Física 1");
        cboCursos.addItem("Física 2");
        cboCursos.addItem("Física 3");
        cboCursos.addItem("Biología 1");
        cboCursos.addItem("Biología 2");
        cboCursos.addItem("Ética");
        listar();
    }

    public void listar() {

        if (cboCursos.getSelectedItem().equals("Seleccione")) {
            String SQL = "SELECT * FROM estudiantes";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    public void ordenarlista() {
        if (cboCursos.getSelectedItem().equals("Seleccione")) {
            String SQL = "SELECT * FROM estudiantes";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else if (cboCursos.getSelectedItem().equals("Matemática 1")) {
            String SQL = "SELECT * FROM estudiantes WHERE cursos='Matemática 1'";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else if (cboCursos.getSelectedItem().equals("Matemática 2")) {
            String SQL = "SELECT * FROM estudiantes WHERE cursos='Matemática 2'";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else if (cboCursos.getSelectedItem().equals("Matemática 3")) {
            String SQL = "SELECT * FROM estudiantes WHERE cursos='Matemática 3'";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else if (cboCursos.getSelectedItem().equals("Idiomas")) {
            String SQL = "SELECT * FROM estudiantes WHERE cursos='Idiomas'";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else if (cboCursos.getSelectedItem().equals("Deportes")) {
            String SQL = "SELECT * FROM estudiantes WHERE cursos='Deportes'";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else if (cboCursos.getSelectedItem().equals("Música 1")) {
            String SQL = "SELECT * FROM estudiantes WHERE cursos='Música 1'";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else if (cboCursos.getSelectedItem().equals("Música 2")) {
            String SQL = "SELECT * FROM estudiantes WHERE cursos='Música 2'";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else if (cboCursos.getSelectedItem().equals("Química 1")) {
            String SQL = "SELECT * FROM estudiantes WHERE cursos='Química 1'";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else if (cboCursos.getSelectedItem().equals("Química 2")) {
            String SQL = "SELECT * FROM estudiantes WHERE cursos='Química 2'";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else if (cboCursos.getSelectedItem().equals("Química 3")) {
            String SQL = "SELECT * FROM estudiantes WHERE cursos='Química 3'";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else if (cboCursos.getSelectedItem().equals("Física 1")) {
            String SQL = "SELECT * FROM estudiantes WHERE cursos='Física 1'";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else if (cboCursos.getSelectedItem().equals("Física 2")) {
            String SQL = "SELECT * FROM estudiantes WHERE cursos='Física 2'";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else if (cboCursos.getSelectedItem().equals("Física 3")) {
            String SQL = "SELECT * FROM estudiantes WHERE cursos='Física 3'";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else if (cboCursos.getSelectedItem().equals("Biología 1")) {
            String SQL = "SELECT * FROM estudiantes WHERE cursos='Biología 1'";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else if (cboCursos.getSelectedItem().equals("Biología 2")) {
            String SQL = "SELECT * FROM estudiantes WHERE cursos='Biología 2'";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else if (cboCursos.getSelectedItem().equals("Ética")) {
            String SQL = "SELECT * FROM estudiantes WHERE cursos='Ética'";

            try {
                cn = con.getConnection();
                st = cn.createStatement();
                rs = st.executeQuery(SQL);
                Object[] estudiantes2 = new Object[7];
                modelo = (DefaultTableModel) tblEstudiantesporcurso.getModel();

                while (rs.next()) {
                    estudiantes2[0] = rs.getInt("id_estudiante");
                    estudiantes2[1] = rs.getString("nombres");
                    estudiantes2[2] = rs.getString("apellidos");
                    estudiantes2[3] = rs.getLong("documento");
                    estudiantes2[4] = rs.getLong("codigo_estudiante");
                    estudiantes2[5] = rs.getString("Correo");
                    estudiantes2[6] = rs.getString("cursos");
                    modelo.addRow(estudiantes2);

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    public void limpiar_tabla(DefaultTableModel model) {
        for (int i = 0; i < tblEstudiantesporcurso.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstudiantesporcurso = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        cboCursos = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();

        setTitle("Listado de Estudiantes por Curso - EDUSENA");

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Listado de Estudiantes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 12))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        tblEstudiantesporcurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRES", "APELLIDOS", "DOCUMENTO", "CODIGO ESTUDIANTE", "CORREO", "CURSOS"
            }
        ));
        jScrollPane1.setViewportView(tblEstudiantesporcurso);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Cursos EDUSENA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Light", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        cboCursos.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(cboCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        btnRegresar.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnOrdenar.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        btnOrdenar.setText("Ordenar");
        btnOrdenar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOrdenar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed


    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // TODO add your handling code here:
        limpiar_tabla(modelo);
        ordenarlista();

    }//GEN-LAST:event_btnOrdenarActionPerformed

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
            java.util.logging.Logger.getLogger(frmEstudiantesporcursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEstudiantesporcursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEstudiantesporcursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEstudiantesporcursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEstudiantesporcursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cboCursos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEstudiantesporcurso;
    // End of variables declaration//GEN-END:variables
}
