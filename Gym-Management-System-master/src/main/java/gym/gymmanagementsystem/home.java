
package gym.gymmanagementsystem;

import javax.swing.JOptionPane;


public class home extends javax.swing.JFrame {

    public home() {
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        addMember = new javax.swing.JMenu();
        editMember = new javax.swing.JMenu();
        trainers = new javax.swing.JMenu();
        payments = new javax.swing.JMenu();
        payments1 = new javax.swing.JMenu();
        logOut = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("GYM MANAGEMENT SYSTEM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("WELCOME ");

        addMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addmembericon.png"))); // NOI18N
        addMember.setText("Add Member");
        addMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMemberMouseClicked(evt);
            }
        });
        jMenuBar1.add(addMember);

        editMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/managemembericon.png"))); // NOI18N
        editMember.setText("Manage Member");
        editMember.setToolTipText("");
        editMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMemberMouseClicked(evt);
            }
        });
        jMenuBar1.add(editMember);

        trainers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trainericon.png"))); // NOI18N
        trainers.setText("Trainers");
        trainers.setToolTipText("");
        trainers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trainersMouseClicked(evt);
            }
        });
        jMenuBar1.add(trainers);

        payments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/listicon.png"))); // NOI18N
        payments.setText("Members List");
        payments.setToolTipText("");
        payments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentsMouseClicked(evt);
            }
        });
        jMenuBar1.add(payments);

        payments1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paymentsicon.png"))); // NOI18N
        payments1.setText("Payments");
        payments1.setToolTipText("");
        payments1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payments1MouseClicked(evt);
            }
        });
        jMenuBar1.add(payments1);

        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logouticon.png"))); // NOI18N
        logOut.setText("Log out");
        logOut.setToolTipText("");
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
        });
        jMenuBar1.add(logOut);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(344, 344, 344))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(115, 115, 115))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {
        int logout = JOptionPane.showConfirmDialog(null, "Log out?", "Select",JOptionPane.YES_NO_CANCEL_OPTION);
        if (logout==0){
            setVisible(false);
            new login().setVisible(true);
        }
        
    }

    private void addMemberMouseClicked(java.awt.event.MouseEvent evt) {
        setVisible(false);
        new newMember().setVisible(true);
    }

    private void editMemberMouseClicked(java.awt.event.MouseEvent evt) {
        setVisible(false);
        new editMember().setVisible(true);
    }

    private void trainersMouseClicked(java.awt.event.MouseEvent evt) {
        setVisible(false);
        new trainer().setVisible(true);
    }

    private void paymentsMouseClicked(java.awt.event.MouseEvent evt) {
        setVisible(false);
        new memberList().setVisible(true);
    }

    private void payments1MouseClicked(java.awt.event.MouseEvent evt) {
        setVisible(false);
        new payment().setVisible(true);
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }


    private javax.swing.JMenu addMember;
    private javax.swing.JMenu editMember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu logOut;
    private javax.swing.JMenu payments;
    private javax.swing.JMenu payments1;
    private javax.swing.JMenu trainers;

}
