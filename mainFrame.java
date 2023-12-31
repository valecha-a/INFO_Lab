/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;

/**
 *
 * @author anmolvalecha
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainJFrame
     */
    public mainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        titlelLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        ageComboBox = new javax.swing.JComboBox<>();
        emailTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        messageSrcollPane = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        genderLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        preferNotToSayRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setSize(new java.awt.Dimension(700, 500));

        mainPanel.setBackground(new java.awt.Color(255, 204, 204));
        mainPanel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N

        titlelLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        titlelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlelLabel.setText("Customer Form ");

        firstNameLabel.setText("First Name");

        lastNameLabel.setText("Last Name");

        ageLabel.setText("Age");

        emailLabel.setText("Email Address");

        firstNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstNameTextFieldKeyTyped(evt);
            }
        });

        ageComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", " " }));
        ageComboBox.setSelectedIndex(-1);
        ageComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageComboBoxActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        messageLabel.setText("Message");

        messageTextArea.setColumns(20);
        messageTextArea.setRows(5);
        messageSrcollPane.setViewportView(messageTextArea);

        genderLabel.setText("Gender");

        genderButtonGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");
        maleRadioButton.setActionCommand("Male User");

        genderButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");
        femaleRadioButton.setActionCommand("Female User");

        genderButtonGroup.add(preferNotToSayRadioButton);
        preferNotToSayRadioButton.setText("Prefer not to say");
        preferNotToSayRadioButton.setActionCommand("User prefers not to say ");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 97, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(firstNameLabel)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(ageLabel)
                                .addGap(59, 59, 59)))
                        .addGap(10, 10, 10)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(ageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(307, 307, 307))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(firstNameTextField)
                                .addGap(87, 87, 87)))
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(genderLabel)
                                .addGap(52, 52, 52)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(femaleRadioButton)
                                    .addComponent(maleRadioButton)
                                    .addComponent(preferNotToSayRadioButton)))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(lastNameLabel)
                                .addGap(32, 32, 32)
                                .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(282, 282, 282))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel)
                            .addComponent(messageLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(messageSrcollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(titlelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addComponent(submitButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titlelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameLabel)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameLabel))
                        .addGap(68, 68, 68))
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ageLabel)
                        .addComponent(genderLabel)
                        .addComponent(maleRadioButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(femaleRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preferNotToSayRadioButton)
                .addGap(13, 13, 13)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addGap(59, 59, 59)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageSrcollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageLabel))
                .addGap(54, 54, 54)
                .addComponent(submitButton)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ageComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageComboBoxActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
       String fName = firstNameTextField.getText();
       if (!fName.matches("^[a-zA-Z]+$")) {
           JOptionPane.showMessageDialog(null, "Please enter a valid first name", "Error", JOptionPane.ERROR_MESSAGE);
           return;
        }

        String lName = lastNameTextField.getText();
        if (!lName.matches("^[a-zA-Z]+$")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid last name", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
      
        Object selectedAge = ageComboBox.getSelectedItem();
        if (selectedAge == null) {
            JOptionPane.showMessageDialog(null, "Please select an age", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String age = selectedAge.toString();
       
       // String gender = selectedGender.toString();
         
       Object selectedGender = genderButtonGroup.getSelection();
       if (selectedGender == null)    {
           JOptionPane.showMessageDialog(null, "Please select a gender", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } 
       String gender;
        if (maleRadioButton.isSelected()) {
            gender = "Male User";
        }
        else if (femaleRadioButton.isSelected()) {
            gender = "Female User";
        }
        else if (preferNotToSayRadioButton.isSelected()) {
            gender = "User prefers not to say";
        }
        else    {
            gender = "Unknown";
        }
           
        
        String email = emailTextField.getText();
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter an email address", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        if (!email.matches(emailRegex))   {
            JOptionPane.showMessageDialog(null, "Please enter a valid email address", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String message = messageTextArea.getText();
        if (message.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a message", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Stop further processing
        }
        
        if (message.length() > 500) {
            JOptionPane.showMessageDialog(null, "Message is too long", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        //System.out.println(fName+" "+ lName+ " "+ age +" "+ email +" " + message + " ");
        //JOptionPane.showMessageDialog(this, fName+"  "+ lName+ " "+ age +" "+ email +" " + message + " ", "Customer Information", HEIGHT);
        JOptionPane.showMessageDialog(
        this,
        "CUSTOMER INFORMATION" + "\n" + "\n" +
        "First Name: " + fName + "\n" +
        "Last Name: " + lName + "\n" +
        "Age: " + age + "\n" +
        "Gender: " + gender + "\n" +       
        "Email: " + email + "\n" +
        "Message: " + message,
        "Form Submitted",
        JOptionPane.INFORMATION_MESSAGE
    );

    }//GEN-LAST:event_submitButtonActionPerformed

    private void firstNameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldKeyTyped

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ageComboBox;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JScrollPane messageSrcollPane;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JRadioButton preferNotToSayRadioButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titlelLabel;
    // End of variables declaration//GEN-END:variables
}
