package gym.gymmanagementsystem;

import database.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class trainer extends javax.swing.JFrame {


    public trainer() {
        initComponents();
        
        try{
            int id = 1;
            String str1 = String.valueOf(id);
            trainerID.setText("00"+str1);
            
            Connection connection = ConnectionProvider.getConnection();
            
            Statement statement = connection.createStatement();
            String sql = "SELECT MAX(id) FROM trainer";
            ResultSet result = statement.executeQuery(sql);
            
            while(result.next()){
                id = result.getInt(1);
                id = id +1;
                String str = String.valueOf(id);
                trainerID.setText("00"+str);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        DefaultTableModel model  =(DefaultTableModel)jTable1.getModel();
        try{
            String sql = "SELECT * FROM trainer";
            Connection connection = ConnectionProvider.getConnection();
            Statement statement = connection.createStatement();
            ResultSet result= statement.executeQuery(sql);
            while (result.next()){
                model.addRow(new Object[]{result.getString(1), result.getString(2),result.getString(3), result.getString(4), result.getString(5), result.getString(6)});
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        trainerName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        trainerAge = new javax.swing.JTextField();
        trainerAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        trainerMobile = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        trainerID = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        idSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trainer");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trainericon.png"))); // NOI18N
        jLabel1.setText("Trainer");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Trainer Name");

        Age.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Age.setText("Age");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Address");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Mobile");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Join date");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Address", "Join Date", "Mobile"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(35);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(450);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(35);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(1500);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(320);
        }

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addicon.png"))); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deleteicon.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        resetBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reseticon.png"))); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Trainer ID");

        trainerID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        trainerID.setForeground(new java.awt.Color(255, 0, 51));
        trainerID.setText("001");

        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/updateicon.png"))); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Enter the valid ID to get the information");

        jLabel5.setText("Trainer ID:");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addComponent(idSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchBtn))
                    .addComponent(jLabel4))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idSearch)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchBtn)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );

        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exiticon.png"))); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(298, 298, 298)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(485, 485, 485)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(trainerID))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(trainerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(addBtn)
                                                .addGap(18, 18, 18)
                                                .addComponent(updateBtn)
                                                .addGap(18, 18, 18)
                                                .addComponent(deleteBtn)
                                                .addGap(18, 18, 18)
                                                .addComponent(resetBtn))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(Age))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(trainerName))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(trainerMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(trainerAge, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(exitBtn)
                        .addGap(361, 361, 361)
                        .addComponent(jLabel1)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitBtn)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(trainerID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(trainerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Age)
                            .addComponent(trainerAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trainerMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trainerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn)
                            .addComponent(deleteBtn)
                            .addComponent(resetBtn)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String id = trainerID.getText().toString();
        String name = trainerName.getText().toString();
        String age = trainerAge.getText().toString();
        String phonenums = trainerMobile.getText().toString();
        String addr = trainerAddress.getText().toString();
        java.util.Date date = jDateChooser1.getDate();
        java.sql.Date joinDate = new java.sql.Date(date.getTime());

        try{
            
            Connection connection = ConnectionProvider.getConnection();
            
            
            PreparedStatement statement = connection.prepareStatement("INSERT INTO trainer VALUES (?,?,?,?,?,?)");
            statement.setString(1, id);
            statement.setString(2, name);
            statement.setString(3, age);
            statement.setString(4, addr);
            statement.setDate(5, joinDate);
            statement.setString(6, phonenums);
            
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Save Trainer successfully!");
            setVisible(false);
            new trainer().setVisible(true);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error to save information","Error",JOptionPane.PLAIN_MESSAGE);
            e.printStackTrace();
        }
        
    }

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int delete = JOptionPane.showConfirmDialog(null,"Do you want to delete","Select",JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (delete == 0){
            String id = trainerID.getText();
            try{
                String sql = "UPDATE trainer JOIN member ON trainer.name = member.trainer SET trainer.name=?, trainer.age=?, trainer.address=?, trainer.joinDate=?, trainer.mobile=?, member.trainer=? WHERE trainer.id=?";
                String sql1 = "DELETE FROM trainer WHERE id='"+id+"'"; 
                Connection connection=ConnectionProvider.getConnection();
                
                PreparedStatement trainerSt=connection.prepareStatement(sql);
                PreparedStatement delSt=connection.prepareStatement(sql1);
                
                trainerSt.setNull(1,Types.INTEGER);
                trainerSt.setNull(2,Types.INTEGER);
                trainerSt.setNull(3,Types.INTEGER);
                trainerSt.setNull(4,Types.INTEGER);
                trainerSt.setNull(5,Types.INTEGER);
                trainerSt.setNull(6,Types.INTEGER);
                trainerSt.setString(7,id);
                
                trainerSt.executeUpdate();
                delSt.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
                setVisible(false);
                new trainer().setVisible(true);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            }
        }
    }

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        DefaultTableModel model  =(DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        
        
        try{
            String sql = "SELECT * FROM trainer";
            Connection connection = ConnectionProvider.getConnection();
            Statement statement = connection.createStatement();
            ResultSet result= statement.executeQuery(sql);
            while (result.next()){
                model.addRow(new Object[]{result.getString(1), result.getString(2),result.getString(3), result.getString(4), result.getString(5), result.getString(6)});
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        idSearch.setText("");
        trainerName.setText("");
        trainerAge.setText("");
        trainerMobile.setText("");
        trainerAddress.setText("");
    }

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {
        
        String id = trainerID.getText().toString();
        String name = trainerName.getText().toString();
        String age = trainerAge.getText().toString();
        String phonenums = trainerMobile.getText().toString();
        String addr = trainerAddress.getText().toString();
        java.util.Date date = jDateChooser1.getDate();
        java.sql.Date joinDate = new java.sql.Date(date.getTime());

        

        try{
            String sql1 = "UPDATE trainer SET name=?, age=?, address=?, joinDate=?, mobile=? WHERE id=?";
            String sqlTrainer = "UPDATE trainer JOIN member ON trainer.name = member.trainer SET trainer.name=?, trainer.age=?, trainer.address=?, trainer.joinDate=?, trainer.mobile=?, member.trainer=? WHERE trainer.id=?";
            
            Connection connection = ConnectionProvider.getConnection();
            PreparedStatement trainerSt=connection.prepareStatement(sqlTrainer);
            PreparedStatement sql1St = connection.prepareStatement(sql1);
            
            trainerSt.setString(1,name);
            trainerSt.setString(2,age);
            trainerSt.setString(3,addr);
            trainerSt.setDate(4,joinDate);
            trainerSt.setString(5,phonenums);
            trainerSt.setString(6,name);
            trainerSt.setString(7, id);
            trainerSt.executeUpdate();
            
            sql1St.setString(1,name);
            sql1St.setString(2,age);
            sql1St.setString(3,addr);
            sql1St.setDate(4,joinDate);
            sql1St.setString(5,phonenums);
            sql1St.setString(6,id);
            sql1St.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            setVisible(false);
            new trainer().setVisible(true);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }

    }

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int searchid = 0;
        String id = "00" +idSearch.getText();
        DefaultTableModel model  =(DefaultTableModel)jTable1.getModel();
        try{
            String sql = "SELECT * FROM trainer WHERE id='"+id+"'";
            Connection connection = ConnectionProvider.getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()){
                searchid = 1;
                model.setRowCount(0);
                model.addRow(new Object[]{result.getString(1), result.getString(2),result.getString(3), result.getString(4), result.getString(5), result.getString(6)});
                
                trainerID.setText(result.getString(1));
                trainerName.setText(result.getString(2));
                trainerAge.setText(result.getString(3));
                trainerAddress.setText(result.getString(4));
                trainerMobile.setText(result.getString(6));
                int index = jTable1.getSelectedRow();
                java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(index,4));
                jDateChooser1.setDate(date);
            }
            if(searchid == 0){
                JOptionPane.showMessageDialog(null, "Trainer ID does not exist!");
            }
        }catch(Exception e){
        }

    }

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        int exit = JOptionPane.showConfirmDialog(null, "Exit to Dashboard?","Select",JOptionPane.YES_NO_CANCEL_OPTION);
        if (exit == 0){
            setVisible(false);
            new home().setVisible(true);
        }
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
            java.util.logging.Logger.getLogger(trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trainer().setVisible(true);
            }
        });
    }


    private javax.swing.JLabel Age;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JTextField idSearch;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField trainerAddress;
    private javax.swing.JTextField trainerAge;
    private javax.swing.JLabel trainerID;
    private javax.swing.JTextField trainerMobile;
    private javax.swing.JTextField trainerName;
    private javax.swing.JButton updateBtn;

}
