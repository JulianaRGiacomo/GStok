
package GUI;

import DAO.VendaDAO;
import PO.Funcionario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class RelatorioDeVendas extends javax.swing.JFrame {

    public RelatorioDeVendas() throws SQLException {
        initComponents();
        this.func = null;
        preencheMaisVendidos();
        preencheMaioresClientes();
        preencheMaioresCompras();
    }

    private void preencheMaisVendidos() throws SQLException{
        ArrayList<Object[]> rs = new VendaDAO().maisVendidos();
        
        if(rs != null){
            for(int i = 0; i < rs.size(); i++){
                DefaultTableModel modelo = (DefaultTableModel) maisVendidosTable.getModel();
                modelo.setRowCount(maisVendidosTable.getRowCount());
                modelo.addRow(rs.get(i));
            }
        }
    }
    
    private void preencheMaioresClientes() throws SQLException{
        ArrayList<Object[]> rs = new VendaDAO().maioresClientes();
        
        if(rs != null){
            for(int i = 0; i < rs.size(); i++){
                DefaultTableModel modelo = (DefaultTableModel) maioresClientesTable.getModel();
                modelo.setRowCount(maioresClientesTable.getRowCount());
                modelo.addRow(rs.get(i));
            }
        }
    }
    
    private void preencheMaioresCompras() throws SQLException{
        ArrayList<Object[]> rs = new VendaDAO().maioresCompras();
        
        if(rs != null){
            for(int i = 0; i < rs.size(); i++){
                DefaultTableModel modelo = (DefaultTableModel) maioresComprasTable.getModel();
                modelo.setRowCount(maioresComprasTable.getRowCount());
                modelo.addRow(rs.get(i));
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        relatoriosPanel = new javax.swing.JTabbedPane();
        maisVendidosPanel = new javax.swing.JPanel();
        maisVendidosScrollPane = new javax.swing.JScrollPane();
        maisVendidosTable = new javax.swing.JTable();
        maioresComprasPanel = new javax.swing.JPanel();
        maioresComprasScrollPane = new javax.swing.JScrollPane();
        maioresComprasTable = new javax.swing.JTable();
        maioresClientesPanel = new javax.swing.JPanel();
        maioresClientesScrollPane = new javax.swing.JScrollPane();
        maioresClientesTable = new javax.swing.JTable();
        voltarButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Relatório de Vendas");

        maisVendidosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Nome", "Descrição", "Unidades Vendidas", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        maisVendidosTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        maisVendidosTable.setAutoscrolls(false);
        maisVendidosTable.setFocusable(false);
        maisVendidosTable.setPreferredSize(new java.awt.Dimension(705, 80));
        maisVendidosTable.setRequestFocusEnabled(false);
        maisVendidosTable.setRowHeight(20);
        maisVendidosTable.setShowVerticalLines(false);
        maisVendidosTable.getTableHeader().setReorderingAllowed(false);
        maisVendidosScrollPane.setViewportView(maisVendidosTable);
        if (maisVendidosTable.getColumnModel().getColumnCount() > 0) {
            maisVendidosTable.getColumnModel().getColumn(0).setResizable(false);
            maisVendidosTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            maisVendidosTable.getColumnModel().getColumn(1).setMinWidth(200);
            maisVendidosTable.getColumnModel().getColumn(2).setMinWidth(200);
            maisVendidosTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            maisVendidosTable.getColumnModel().getColumn(4).setResizable(false);
            maisVendidosTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        javax.swing.GroupLayout maisVendidosPanelLayout = new javax.swing.GroupLayout(maisVendidosPanel);
        maisVendidosPanel.setLayout(maisVendidosPanelLayout);
        maisVendidosPanelLayout.setHorizontalGroup(
            maisVendidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(maisVendidosScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );
        maisVendidosPanelLayout.setVerticalGroup(
            maisVendidosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maisVendidosPanelLayout.createSequentialGroup()
                .addComponent(maisVendidosScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        relatoriosPanel.addTab("Produtos Mais Vendidos", maisVendidosPanel);

        maioresComprasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data da Compra", "Nome do Vendedor", "Total de Produtos", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        maioresComprasTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        maioresComprasTable.setAutoscrolls(false);
        maioresComprasTable.setFocusable(false);
        maioresComprasTable.setPreferredSize(new java.awt.Dimension(705, 80));
        maioresComprasTable.setRequestFocusEnabled(false);
        maioresComprasTable.setRowHeight(20);
        maioresComprasTable.setShowVerticalLines(false);
        maioresComprasTable.getTableHeader().setReorderingAllowed(false);
        maioresComprasScrollPane.setViewportView(maioresComprasTable);
        if (maioresComprasTable.getColumnModel().getColumnCount() > 0) {
            maioresComprasTable.getColumnModel().getColumn(0).setResizable(false);
            maioresComprasTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            maioresComprasTable.getColumnModel().getColumn(0).setHeaderValue("Data da Compra");
            maioresComprasTable.getColumnModel().getColumn(1).setResizable(false);
            maioresComprasTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            maioresComprasTable.getColumnModel().getColumn(2).setResizable(false);
            maioresComprasTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            maioresComprasTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout maioresComprasPanelLayout = new javax.swing.GroupLayout(maioresComprasPanel);
        maioresComprasPanel.setLayout(maioresComprasPanelLayout);
        maioresComprasPanelLayout.setHorizontalGroup(
            maioresComprasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(maioresComprasScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );
        maioresComprasPanelLayout.setVerticalGroup(
            maioresComprasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maioresComprasPanelLayout.createSequentialGroup()
                .addComponent(maioresComprasScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        relatoriosPanel.addTab("Maiores Compras", maioresComprasPanel);

        maioresClientesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Total de Compras", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        maioresClientesTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        maioresClientesTable.setAutoscrolls(false);
        maioresClientesTable.setFocusable(false);
        maioresClientesTable.setPreferredSize(new java.awt.Dimension(705, 80));
        maioresClientesTable.setRequestFocusEnabled(false);
        maioresClientesTable.setRowHeight(20);
        maioresClientesTable.setShowVerticalLines(false);
        maioresClientesTable.getTableHeader().setReorderingAllowed(false);
        maioresClientesScrollPane.setViewportView(maioresClientesTable);
        if (maioresClientesTable.getColumnModel().getColumnCount() > 0) {
            maioresClientesTable.getColumnModel().getColumn(0).setResizable(false);
            maioresClientesTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            maioresClientesTable.getColumnModel().getColumn(1).setResizable(false);
            maioresClientesTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            maioresClientesTable.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout maioresClientesPanelLayout = new javax.swing.GroupLayout(maioresClientesPanel);
        maioresClientesPanel.setLayout(maioresClientesPanelLayout);
        maioresClientesPanelLayout.setHorizontalGroup(
            maioresClientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(maioresClientesScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
        );
        maioresClientesPanelLayout.setVerticalGroup(
            maioresClientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maioresClientesPanelLayout.createSequentialGroup()
                .addComponent(maioresClientesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        relatoriosPanel.addTab("Maiores Clientes", maioresClientesPanel);

        voltarButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        voltarButton1.setText("<--");
        voltarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(relatoriosPanel, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(voltarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(relatoriosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voltarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButton1ActionPerformed
        HomeGerente home = new HomeGerente();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_voltarButton1ActionPerformed

    public void setFuncionario(Funcionario f){
        this.func = new Funcionario(f);
    }
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(RelatorioDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RelatorioDeVendas().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(RelatorioDeVendas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private Funcionario func;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel maioresClientesPanel;
    private javax.swing.JScrollPane maioresClientesScrollPane;
    private javax.swing.JTable maioresClientesTable;
    private javax.swing.JPanel maioresComprasPanel;
    private javax.swing.JScrollPane maioresComprasScrollPane;
    private javax.swing.JTable maioresComprasTable;
    private javax.swing.JPanel maisVendidosPanel;
    private javax.swing.JScrollPane maisVendidosScrollPane;
    private javax.swing.JTable maisVendidosTable;
    private javax.swing.JTabbedPane relatoriosPanel;
    private javax.swing.JButton voltarButton1;
    // End of variables declaration//GEN-END:variables
}
