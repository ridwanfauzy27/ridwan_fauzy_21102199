package com.Ridwan.PBO.Pertemuan9;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class DemoDatabase extends JFrame{
    private JTabbedPane tabbedPane1;
    private JPanel mainPanel;
    private JTextField txtNama;
    private JTextField txtNim;
    private JSpinner sprNilai;
    private JButton submitButton1;
    private JButton clearButton1;
    private JLabel Nama;
    private JLabel Nim;
    private JLabel Nilai;
    private JTable dataTable;
    private DefaultTableModel model;
    private static Connection c;
    private static Statement s;
    private static ResultSet rs;

    public DemoDatabase(){
        super ("Demo Database");

        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400,400);
        submitButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nim = txtNim.getText();
                String nama = txtNama.getText();
                int nilai = (int) sprNilai.getValue();
                try {
                    opendb();
                    s.executeUpdate("INSERT INTO tb_mahasiswa VALUE ('"+ nim +"' , '"+ nama +"', '"+ nilai +"')");
                    Object[]row = {nim, nama, nilai};
                    model.addRow(row);

                    JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");

                }catch (SQLException | ClassNotFoundException ex){
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, ex.getLocalizedMessage());
                } finally {
                    closeDb();
                }
            }
        });
        clearButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNama.setText("");
                txtNim.setText("");
                sprNilai.setValue(0);
                JOptionPane.showMessageDialog(null, "Form Clear" );
            }
        });
    }
    public static void main(String[] args) {
        JFrame mainFrame = new DemoDatabase();
        mainFrame.setVisible(true);
    }

    public static void opendb() throws ClassNotFoundException, SQLException {
        String URL = "jdbc:mysql://localhost:3306/db_demo";
        String Username = "root";
        String Password = "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        c = DriverManager.getConnection(URL,Username,Password);
        s = c.createStatement();
    }
    private void closeDb(){
        try {
            rs.close();
            s.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        model = new DefaultTableModel();
        dataTable = new JTable(model);
        model.addColumn("NIM");
        model.addColumn("Nama");
        model.addColumn("Nilai");

        try{
            opendb();
            rs = s.executeQuery("SELECT * FROM tb_mahasiswa");
            while (rs.next()){
                Object[] row = {
                        rs.getString("nim"),
                        rs.getString("nama"),
                        rs.getString("nilai")
                };
                model.addRow(row);
            }
        } catch (SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
        } finally{
            closeDb();
        }
    }
}
