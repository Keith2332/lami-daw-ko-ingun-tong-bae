
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class MenuTab extends javax.swing.JFrame {
    private String loggedInUsername;
    private DefaultTableModel tableModel;
    public MenuTab(String loggedInUsername) {
        this.loggedInUsername = loggedInUsername;
        initComponents();
        displayUsername(); // Display the username when the MenuTab is created
        initializeTableModel();
        loadUserData();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnUserInformation = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        cmbLocation = new javax.swing.JComboBox<>();
        txtEnterIdProductname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnUserInformation.setBackground(new java.awt.Color(51, 51, 255));
        btnUserInformation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUserInformation.setForeground(new java.awt.Color(255, 255, 255));
        btnUserInformation.setText("USER INFORMATION");
        btnUserInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserInformationActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Price", "Quantity", "Category", "Location", "Date & Time"
            }
        ));
        tblDisplay.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDisplay);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Product Information");

        jLabel3.setText("Product Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        jLabel4.setText("Price");

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantity");

        jLabel8.setText("Category");

        jLabel9.setText("Location");

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Men's Wear", "Women's Apparel", "Mobile & Gadgets", "Beauty & Personal Care", "Food & Beverages", "Toys, Kids & Babies", "Home Appliances", "Home & Living", "Women's Bags", "Computers & Peripherals" }));
        cmbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoryActionPerformed(evt);
            }
        });

        cmbLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Location", "Site 1A", "Site 1B", "Site 2A", "Site 2B", "Site 3A", "Site 3B", "Site 4A", "Site 4B" }));
        cmbLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLocationActionPerformed(evt);
            }
        });

        txtEnterIdProductname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterIdProductnameActionPerformed(evt);
            }
        });

        jLabel6.setText("Enter ID /Product Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtPrice)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2))
                    .addComponent(txtName)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(cmbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEnterIdProductname)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnterIdProductname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        btnAdd.setBackground(new java.awt.Color(102, 255, 102));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(51, 51, 51));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(102, 255, 102));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(51, 51, 51));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(102, 255, 102));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(51, 51, 51));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("INVENTORY SYSTEM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(467, 467, 467))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(22, 22, 22))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnLogout.setBackground(new java.awt.Color(255, 51, 51));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUserInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUserInformation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void initializeTableModel() {
        // Initialize the table model with column names
        String[] columnNames = {"Product ID", "Product Name", "Price", "Quantity", "Category", "Location", "Date & Time"};
        tableModel = new DefaultTableModel(columnNames, 0);
        tblDisplay.setModel(tableModel);
    }
    private void displayUsername() {
        jLabel1.setText("Welcome, " + loggedInUsername + "!");
    }
    private void loadUserData() {
        // Clear existing data in the table
    clearTable();

    // Get the user's email
    String email = loggedInUsername + ".txt";

    // Path to the user's file
    String filePath = "D:\\Documents\\NetBeansProjects\\Product_Inventory_System\\USERS\\" + email;

    // Read existing data from the user's file and populate the table
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;

        // Skip the lines containing personal information
        for (int i = 0; i < 5; i++) {
            reader.readLine();
        }

        // Read and add the data to the table model
        while ((line = reader.readLine()) != null) {
            // Split the line into individual fields
            String[] data = line.split("\\|");

            // Add data to the table model
            tableModel.addRow(data);
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading user data.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }

    private void clearTable() {
        // Clear the table model
        tableModel.setRowCount(0);
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String productName = txtName.getText();
    String price = txtPrice.getText();
    String quantity = txtQuantity.getText();
    String category = cmbCategory.getSelectedItem().toString();
    String location = cmbLocation.getSelectedItem().toString();

    // Validate input
    if (productName.isEmpty() || price.isEmpty() || quantity.isEmpty()
            || category.equals("Select Category") || location.equals("Select Location")) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Generate a unique product ID (you may need a more robust solution)
    String productId = String.valueOf(tableModel.getRowCount() + 1);

    // Get current date and time
    LocalDateTime currentDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String dateTime = currentDateTime.format(formatter);

    // Add data to the table model
    String[] rowData = {productId, productName, price, quantity, category, location, dateTime};
    tableModel.addRow(rowData);

    // Save data to the user's file
    saveDataToFile(productId, productName, price, quantity, category, location, dateTime);

    // Reset input fields
    resetInputFields();
    }//GEN-LAST:event_btnAddActionPerformed
    private void resetInputFields() {
    // Reset text fields
    txtName.setText("");
    txtPrice.setText("");
    txtQuantity.setText("");

    // Reset combo boxes
    cmbCategory.setSelectedIndex(0);
    cmbLocation.setSelectedIndex(0);
}
    private void saveDataToFile(String productId, String productName, String price,
                                String quantity, String category, String location, String dateTime) {
        // Get the user's email
        String email = loggedInUsername + ".txt";

        // Path to the user's file
        String filePath = "D:\\Documents\\NetBeansProjects\\Product_Inventory_System\\USERS\\" + email;

        // Append data to the user's file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            // Append the new product information
            writer.write(productId + "|" + productName + "|" + price + "|" +
                    quantity + "|" + category + "|" + location + "|" + dateTime);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving product information.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        clearTable();

        StartingTab x = new StartingTab();
        x.show();
        this.hide();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnUserInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserInformationActionPerformed
        // Get the user's email
    String email = loggedInUsername + ".txt";

    // Path to the user's file
    String filePath = "D:\\Documents\\NetBeansProjects\\Product_Inventory_System\\USERS\\" + email;

    // Read user information from the file and display relevant information using JOptionPane
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        StringBuilder userInfo = new StringBuilder();
        String line;

        // Read the first five lines containing personal information
        for (int i = 0; i < 5; i++) {
            userInfo.append(reader.readLine()).append("\n");
        }

        // Display user information using JOptionPane
        JOptionPane.showMessageDialog(this, userInfo.toString(), "User Information", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error reading user information.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnUserInformationActionPerformed

    private void cmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoryActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // Get the entered ID or Product Name
    String searchInput = txtEnterIdProductname.getText().trim();

    // Check if the entered input is empty
    if (searchInput.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter an ID or Product Name to update.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check if any of the update fields are empty
    if (txtName.getText().isEmpty() || txtPrice.getText().isEmpty() || txtQuantity.getText().isEmpty()
            || cmbCategory.getSelectedItem().equals("Select Category") || cmbLocation.getSelectedItem().equals("Select Location")) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Search for the row in the table based on the entered ID or Product Name
    int rowIndex = searchRowByProductIdOrName(searchInput);

    // Check if the row was found
    if (rowIndex != -1) {
        // Update the row in the table and save the updated data to the file
        updateAndSaveData(rowIndex);
    } else {
        JOptionPane.showMessageDialog(this, "Product not found.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Reset input fields after update
    resetInputFields();
    txtEnterIdProductname.setText(""); // Reset the search field
    }//GEN-LAST:event_btnUpdateActionPerformed
    private int searchRowByProductIdOrName(String searchInput) {
    for (int i = 0; i < tableModel.getRowCount(); i++) {
        String productId = tableModel.getValueAt(i, 0).toString();
        String productName = tableModel.getValueAt(i, 1).toString();

        // Check if the entered input matches the Product ID or Product Name
        if (productId.equals(searchInput) || productName.equalsIgnoreCase(searchInput)) {
            return i; // Return the index of the matching row
        }
    }
    return -1; // Return -1 if no matching row is found
}
    private void updateAndSaveData(int rowIndex) {
    // Get the current date and time
    LocalDateTime currentDateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String updatedDateTime = currentDateTime.format(formatter);

    // Update the data in the table model
    tableModel.setValueAt(txtName.getText(), rowIndex, 1);
    tableModel.setValueAt(txtPrice.getText(), rowIndex, 2);
    tableModel.setValueAt(txtQuantity.getText(), rowIndex, 3);
    tableModel.setValueAt(cmbCategory.getSelectedItem().toString(), rowIndex, 4);
    tableModel.setValueAt(cmbLocation.getSelectedItem().toString(), rowIndex, 5);
    tableModel.setValueAt(updatedDateTime, rowIndex, 6);

    // Save updated data to the user's file
    saveUpdatedDataToFileAfterUpdate(rowIndex, updatedDateTime);

    // Reset input fields after update
    resetInputFields();
}
    private void saveUpdatedDataToFileAfterUpdate(int updatedRowIndex, String updatedDateTime) {
    try {
        // Get the user's email
        String email = loggedInUsername + ".txt";

        // Path to the user's file
        String filePath = "D:\\Documents\\NetBeansProjects\\Product_Inventory_System\\USERS\\" + email;

        // Create a temporary list to store updated data
        List<String> updatedData = new ArrayList<>();

        // Read existing data from the user's file and update the row
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int count = 0;

            // Read and append the user information
            while (count < 5) {
                updatedData.add(reader.readLine());
                count++;
            }

            // Read and update the specific row
            while ((line = reader.readLine()) != null) {
                // Split the line into individual fields
                String[] data = line.split("\\|");

                // Check if the current line represents the product to be updated
                if (count - 5 == updatedRowIndex) {
                    // Update the specific row
                    String updatedProductInfo = txtEnterIdProductname.getText() + "|" +
                            txtName.getText() + "|" + txtPrice.getText() + "|" +
                            txtQuantity.getText() + "|" + cmbCategory.getSelectedItem() + "|" +
                            cmbLocation.getSelectedItem() + "|" + updatedDateTime;
                    updatedData.add(updatedProductInfo);
                } else {
                    // Add the line to the updated data without modifications
                    updatedData.add(line);
                }

                count++;
            }
        }

        // Write the updated data back to the user's file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String updatedLine : updatedData) {
                writer.write(updatedLine);
                writer.newLine();
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating product information.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
private void saveUpdatedDataToFile(int rowIndex, String updatedName, String updatedPrice,
                                    String updatedQuantity, String updatedCategory, String updatedLocation) {
    try {
        // Get the user's email
        String email = loggedInUsername + ".txt";

        // Path to the user's file
        String filePath = "D:\\Documents\\NetBeansProjects\\Product_Inventory_System\\USERS\\" + email;

        // Create a temporary list to store updated data
        List<String> updatedData = new ArrayList<>();

        // Read existing data from the user's file and update the specific row
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int count = 0;

            while ((line = reader.readLine()) != null) {
                // Skip the lines containing personal information
                if (count < 5) {
                    updatedData.add(line);
                } else if (count - 5 == rowIndex) {
                    // Update the specific row
                    updatedData.add(tableModel.getValueAt(rowIndex, 0) + "|" +
                            updatedName + "|" + updatedPrice + "|" +
                            updatedQuantity + "|" + updatedCategory + "|" + updatedLocation +
                            "|" + tableModel.getValueAt(rowIndex, 6));
                } else {
                    updatedData.add(line);
                }

                count++;
            }
        }

        // Write the updated data back to the user's file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String updatedLine : updatedData) {
                writer.write(updatedLine);
                writer.newLine();
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating product information.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Reset input fields after updating
    resetInputFields();
}
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // Get the entered ID or Product Name
    String searchInput = txtEnterIdProductname.getText().trim();

    // Check if the entered input is empty
    if (searchInput.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter an ID or Product Name to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Search for the row in the table based on the entered ID or Product Name
    int rowIndex = searchRowByProductIdOrName(searchInput);

    // Check if the row was found
    if (rowIndex != -1) {
        // Delete the row from the table and save the updated data to the file
        deleteAndSaveData(rowIndex);
    } else {
        JOptionPane.showMessageDialog(this, "Product not found.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    // Reset input fields after update
    resetInputFields();
    txtEnterIdProductname.setText(""); // Reset the search field
    }//GEN-LAST:event_btnDeleteActionPerformed
private void deleteAndSaveData(int rowIndex) {
    // Get the product ID or name to be deleted
    String productIdOrNameToDelete = txtEnterIdProductname.getText();

    // Remove the row from the table model
    tableModel.removeRow(rowIndex);

    // Save updated data to the user's file after deletion
    saveUpdatedDataToFileAfterDelete(productIdOrNameToDelete);
    
    // Reset input fields after deletion
    resetInputFields();
}
private void saveUpdatedDataToFileAfterDelete(String productIdOrNameToDelete) {
    try {
        // Get the user's email
        String email = loggedInUsername + ".txt";

        // Path to the user's file
        String filePath = "D:\\Documents\\NetBeansProjects\\Product_Inventory_System\\USERS\\" + email;

        // Create a temporary list to store updated data
        List<String> updatedData = new ArrayList<>();

        // Read existing data from the user's file and remove the row to be deleted
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into individual fields
                String[] data = line.split("\\|");

                // Check if the current line represents the product to be deleted
                if (data.length > 0 && data[0].equals(productIdOrNameToDelete)) {
                    // Skip the line to delete it from the file
                    continue;
                }

                // Add the line to the updated data
                updatedData.add(line);
            }
        }

        // Write the updated data back to the user's file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : updatedData) {
                writer.write(line);
                writer.newLine();
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error deleting product.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void cmbLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbLocationActionPerformed

    private void txtEnterIdProductnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterIdProductnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterIdProductnameActionPerformed
    
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
            java.util.logging.Logger.getLogger(MenuTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuTab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Assuming you have a variable "loggedInUsername" in the LoginTab class
                String loggedInUsername = "SampleUser"; // Replace this with your actual logic to get the username
                new MenuTab(loggedInUsername).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUserInformation;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField txtEnterIdProductname;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
