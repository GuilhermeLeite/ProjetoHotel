/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Hotel.Contrato;
import Hotel.Hóspede;
import buffers.BufferContrato;
import fileModel.Arquivos;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guilherme A. F. Leite, Matrícula: 161080022
 */
public class EditarContratos extends javax.swing.JDialog {
    Arquivos arq;
    Arquivos arqh;
    List<String> lista;
    List<String> listah;
    private File arquivo;
    private File arquivoh;
    Contrato c=null;
    Hóspede h = null;
    /**
     * Creates new form EditarContratos
     */
    public EditarContratos(java.awt.Frame parent, boolean modal, Contrato contrato) {
        super(parent, modal);
        initComponents();
        
        arq = new Arquivos("contratos");
        arquivo = arq.getFile();
        lista = arq.lerArquivo(arquivo);
        c=contrato;
        ///////////
        arqh = new Arquivos("hospedes");
        arquivoh = arqh.getFile();
        listah = arqh.lerArquivo(arquivoh);
        //h = new Hóspede(0);
        preencher();
        hospedePreencher();
        limpar();
        desabilitarCampos();        
        
    }
    
    public EditarContratos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        arq = new Arquivos("contratos");
        arquivo = arq.getFile();
        lista = arq.lerArquivo(arquivo);
        
        ///////////
        arqh = new Arquivos("hospedes");
        arquivoh = arqh.getFile();
        listah = arqh.lerArquivo(arquivoh);
        h = new Hóspede(0);
        h.setContrato4edit(h.getCode());
        c = h.getContrato();
        preencher();
        hospedePreencher();
        limpar();
        desabilitarCampos();        
        
    }
    
    private void hospedePreencher(){
        File f = arqh.getFile();
        listah = arqh.lerArquivo(f);
        DefaultTableModel model = (DefaultTableModel) tabelaUsuarios.getModel();
        model.setRowCount(0);
        int t = 0;
        while (t < listah.size()) {
            model.addRow(listah.get(t).split(";"));
            t++;
        }
    }
    
    private void limpar() {
        idCampo.setText("");
        idContratoCampo.setText("");
        idServicoCampo.setText("");
        nomeCampo.setText("");
        cartaoCampo.setText("");
        dataFinalCampo.setText("");
        cpfCampo.setText("");
        dataInicialCampo.setText("");
        nascimentoCampo.setText("");
        bandeiraCartaoCampo.setText("");
        statusCampo.setText("");
        validadeCartaoCampo.setText("");
        qtdServicoCampo.setText("");
        tipoTarifaCampo.setText("");
        femininoJButton.setSelected(false);
        masculinoJButton.setSelected(false);
    }
    
    private void desabilitarCampos(){
        
        
        
        
        nomeCampo.setEditable(false);
        cartaoCampo.setEditable(false);
        dataFinalCampo.setEditable(false);
        cpfCampo.setEditable(false);
        dataInicialCampo.setEditable(false);
        nascimentoCampo.setEditable(false);
        bandeiraCartaoCampo.setEditable(false);
        statusCampo.setEditable(false);
        validadeCartaoCampo.setEditable(false);
        qtdServicoCampo.setEditable(false);
        tipoTarifaCampo.setEditable(false);
        femininoJButton.setEnabled(false);
        masculinoJButton.setEnabled(false);
    }
    
    private void habilitarCampos(){
        
        
        nomeCampo.setEditable(true);
        cartaoCampo.setEditable(true);
        dataFinalCampo.setEditable(true);
        cpfCampo.setEditable(true);
        dataInicialCampo.setEditable(true);
        nascimentoCampo.setEditable(true);
        bandeiraCartaoCampo.setEditable(true);
        //statusCampo.setEditable(true);
        validadeCartaoCampo.setEditable(true);
        //qtdServicoCampo.setEditable(true);
        tipoTarifaCampo.setEditable(true);
        femininoJButton.setEnabled(true);
        masculinoJButton.setEnabled(true);
    }
    
    private void preencher() {
        File f = arq.getFile();
        lista = arq.lerArquivo(f);
        DefaultTableModel model = (DefaultTableModel) tabelaContratos.getModel();
        model.setRowCount(0);
        int t = 0;
        while (t < lista.size()) {
            model.addRow(lista.get(t).split(";"));
            t++;
        }
        
    }
    
    private boolean camposVazios() {
        boolean b = true;
        if (nomeCampo.getText().equals("") || bandeiraCartaoCampo.getText().equals("null") || cartaoCampo.getText().equals("null")|| bandeiraCartaoCampo.getText().equals("") || cartaoCampo.getText().equals("")) {
            b = false;
        }
        return b;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexoGrupal = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idCampo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idContratoCampo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idServicoCampo = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nomeCampo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cpfCampo = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        nascimentoCampo = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        femininoJButton = new javax.swing.JRadioButton();
        masculinoJButton = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        statusCampo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cartaoCampo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dataInicialCampo = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        dataFinalCampo = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        tipoTarifaCampo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        qtdServicoCampo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        bandeiraCartaoCampo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        validadeCartaoCampo = new javax.swing.JFormattedTextField();
        jPanel9 = new javax.swing.JPanel();
        checkoutButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        serviceButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaContratos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 55, 58));

        jPanel4.setBackground(new java.awt.Color(76, 82, 86));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)), "Edição de Contrato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(51, 55, 58));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)), "Contrato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID: ");
        jLabel1.setToolTipText("ID de Cadastro do Hóspede");

        idCampo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        idCampo.setForeground(new java.awt.Color(255, 255, 255));
        idCampo.setText("000");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contract1.gif"))); // NOI18N

        idContratoCampo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        idContratoCampo.setForeground(new java.awt.Color(255, 255, 255));
        idContratoCampo.setText("000");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CA:");
        jLabel2.setToolTipText("ID do Contrato Atual: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SA:");
        jLabel5.setToolTipText("ID do Contrato Atual: ");

        idServicoCampo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        idServicoCampo.setForeground(new java.awt.Color(255, 255, 255));
        idServicoCampo.setText("000");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idCampo))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idContratoCampo))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idServicoCampo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idCampo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idContratoCampo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(idServicoCampo))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(51, 55, 58));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)), "Hóspede", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome: ");

        nomeCampo.setEditable(false);
        nomeCampo.setBackground(new java.awt.Color(51, 51, 51));
        nomeCampo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        nomeCampo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CPF: ");

        cpfCampo.setEditable(false);
        cpfCampo.setBackground(new java.awt.Color(51, 51, 51));
        cpfCampo.setForeground(new java.awt.Color(255, 255, 255));
        try {
            cpfCampo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfCampo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data de Nascimento: ");

        nascimentoCampo.setEditable(false);
        nascimentoCampo.setBackground(new java.awt.Color(51, 51, 51));
        nascimentoCampo.setForeground(new java.awt.Color(255, 255, 255));
        try {
            nascimentoCampo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        nascimentoCampo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sexo: ");

        femininoJButton.setBackground(new java.awt.Color(51, 55, 58));
        femininoJButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        femininoJButton.setForeground(new java.awt.Color(255, 255, 255));
        femininoJButton.setText("Feminino");
        femininoJButton.setEnabled(false);

        masculinoJButton.setBackground(new java.awt.Color(51, 55, 58));
        masculinoJButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        masculinoJButton.setForeground(new java.awt.Color(255, 255, 255));
        masculinoJButton.setText("Masculino");
        masculinoJButton.setEnabled(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeCampo)
                    .addComponent(cpfCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(femininoJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(masculinoJButton))
                    .addComponent(nascimentoCampo))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nomeCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nascimentoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(femininoJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masculinoJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(51, 55, 58));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)), "Dados do Contrato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Estado do Contrato: ");

        statusCampo.setEditable(false);
        statusCampo.setBackground(new java.awt.Color(51, 51, 51));
        statusCampo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        statusCampo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nº do Cartão:");

        cartaoCampo.setBackground(new java.awt.Color(51, 51, 51));
        cartaoCampo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        cartaoCampo.setForeground(new java.awt.Color(255, 255, 255));
        cartaoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartaoCampoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Data Inicial: ");

        dataInicialCampo.setBackground(new java.awt.Color(51, 51, 51));
        dataInicialCampo.setForeground(new java.awt.Color(255, 255, 255));
        try {
            dataInicialCampo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataInicialCampo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Data Final: ");

        dataFinalCampo.setBackground(new java.awt.Color(51, 51, 51));
        dataFinalCampo.setForeground(new java.awt.Color(255, 255, 255));
        try {
            dataFinalCampo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataFinalCampo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tipo de Tarifa: ");

        tipoTarifaCampo.setEditable(false);
        tipoTarifaCampo.setBackground(new java.awt.Color(51, 51, 51));
        tipoTarifaCampo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        tipoTarifaCampo.setForeground(new java.awt.Color(255, 255, 255));
        tipoTarifaCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoTarifaCampoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Quantidade de Serviços: ");

        qtdServicoCampo.setEditable(false);
        qtdServicoCampo.setBackground(new java.awt.Color(51, 51, 51));
        qtdServicoCampo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        qtdServicoCampo.setForeground(new java.awt.Color(255, 255, 255));
        qtdServicoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdServicoCampoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Bandeira do Cartão: ");

        bandeiraCartaoCampo.setBackground(new java.awt.Color(51, 51, 51));
        bandeiraCartaoCampo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        bandeiraCartaoCampo.setForeground(new java.awt.Color(255, 255, 255));
        bandeiraCartaoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bandeiraCartaoCampoActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Validade do Cartão: ");

        validadeCartaoCampo.setBackground(new java.awt.Color(51, 51, 51));
        validadeCartaoCampo.setForeground(new java.awt.Color(255, 255, 255));
        try {
            validadeCartaoCampo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        validadeCartaoCampo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bandeiraCartaoCampo)
                    .addComponent(cartaoCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(statusCampo)
                    .addComponent(tipoTarifaCampo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataFinalCampo)
                            .addComponent(dataInicialCampo)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtdServicoCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validadeCartaoCampo)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(statusCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataInicialCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cartaoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataFinalCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(validadeCartaoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(bandeiraCartaoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(qtdServicoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(tipoTarifaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(51, 55, 58));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));

        checkoutButton.setBackground(new java.awt.Color(51, 51, 51));
        checkoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checkout1.png"))); // NOI18N
        checkoutButton.setToolTipText("Fechar Contrato");
        checkoutButton.setEnabled(false);
        checkoutButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checkout2.png"))); // NOI18N
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(51, 51, 51));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/leave.png"))); // NOI18N
        exitButton.setToolTipText("Sair");
        exitButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/leave1.gif"))); // NOI18N
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(51, 51, 51));
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save1.png"))); // NOI18N
        saveButton.setToolTipText("Salvar");
        saveButton.setEnabled(false);
        saveButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save2.png"))); // NOI18N
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(51, 51, 51));
        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N
        editButton.setToolTipText("Editar Dados");
        editButton.setEnabled(false);
        editButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password1.gif"))); // NOI18N
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(51, 51, 51));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel1.png"))); // NOI18N
        cancelButton.setToolTipText("Cancelar");
        cancelButton.setEnabled(false);
        cancelButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel2.png"))); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        serviceButton.setBackground(new java.awt.Color(51, 51, 51));
        serviceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/service1.png"))); // NOI18N
        serviceButton.setToolTipText("Serviços");
        serviceButton.setEnabled(false);
        serviceButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/service2.png"))); // NOI18N
        serviceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(checkoutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(editButton)
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addGap(18, 18, 18)
                .addComponent(cancelButton)
                .addGap(18, 18, 18)
                .addComponent(serviceButton)
                .addGap(26, 26, 26)
                .addComponent(exitButton)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(serviceButton)
                    .addComponent(cancelButton)
                    .addComponent(saveButton)
                    .addComponent(exitButton)
                    .addComponent(checkoutButton)
                    .addComponent(editButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(76, 82, 86));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tabelaContratos.setAutoCreateRowSorter(true);
        tabelaContratos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tabelaContratos.setForeground(new java.awt.Color(0, 0, 0));
        tabelaContratos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "Aberto", "5", "João", "01/01/2000", "31/12/2018", "000011112222", "25", "aaaaaaaaaa", "001"}
            },
            new String [] {
                "ID", "Status", "ID do Hóspede", "Nome do Hóspede", "Data Inicial", "Data Final", "Cartão", "Tarifa", "Qtd. de Serviços", "ID de Serviço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaContratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaContratosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaContratos);

        jScrollPane2.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tabelaUsuarios.setAutoCreateRowSorter(true);
        tabelaUsuarios.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tabelaUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "João", "M", "99 99999-9999", "aaa@gmail.com", "0000000", "00000000099", "aaaa", "vvvvv", "01/01/2000", "31/12/2018", "999"}
            },
            new String [] {
                "ID", "Nome", "Sexo", "Telefone", "Email", "RG", "CPF", "Endereço", "Endereço 2", "Data de Nascimento", "Data de Cadastro", "Contrato nº"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUsuarios.setFocusable(false);
        tabelaUsuarios.setOpaque(false);
        tabelaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaUsuarios);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cartaoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartaoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartaoCampoActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        // TODO add your handling code here:
        /*File f = arq.getFile();
        lista1 = arq.lerArquivo(f);

        if (arq.regravarDados(f, BufferHóspede.apagarCliente(lista1, idCampo.getText()))) {
            preencher();
            checkoutButton.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Hóspede removido.", "Remoção", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(this, "Falha na remoção.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        editButton.setEnabled(false);
        cancelButton.setEnabled(false);
        preencher();
        limpar();*/
        //JDIALOG FOR CHECKOUT
    }//GEN-LAST:event_checkoutButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        
        File arquivo = arq.getFile();
        lista = arq.lerArquivo(arquivo);
        String idH = idCampo.getText();
        String idC = idContratoCampo.getText();
        String idS = idServicoCampo.getText();
        String nome = nomeCampo.getText();
        //String cpf = cpfCampo.getText();
        String status = statusCampo.getText();
        String dataInicial = dataInicialCampo.getText();
        String dataFinal = dataFinalCampo.getText();
        String validadeCartao = validadeCartaoCampo.getText();
        String cartaoNum = cartaoCampo.getText();
        String bandeiraCartao = bandeiraCartaoCampo.getText();
        String tarifaTipo = tipoTarifaCampo.getText();
        String qtdServicos = qtdServicoCampo.getText();


        if (!camposVazios()) {
            JOptionPane.showMessageDialog(this, "Impossível salvar!\nHá campos vazios", "Falha", JOptionPane.ERROR_MESSAGE);
            limpar();
        } else {
            //String idCliente = idCampo.getText();
            String contratoEditado =""+ idC + ";" + status+ ";" + idH +";"
            +  nome+ ";" + dataInicial+ ";" + dataFinal + ";"
            + cartaoNum + "|"+ bandeiraCartao + "|"+ validadeCartao + ";"
            + tarifaTipo + ";"  + qtdServicos + ";"
            + idS;

            lista = BufferContrato.editarContrato(lista, idC, contratoEditado);
            if (arq.regravarDados(arquivo, lista)) {
                JOptionPane.showMessageDialog(this, "Editado", "Edição Salva", JOptionPane.INFORMATION_MESSAGE);
                preencher();
                hospedePreencher();
                limpar();
                desabilitarCampos();
                cancelButton.setEnabled(false);
                saveButton.setEnabled(false);
                serviceButton.setEnabled(false);
                checkoutButton.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "Falha", "Edição Não salva", JOptionPane.ERROR_MESSAGE);
                preencher();
                hospedePreencher();
                limpar();
                desabilitarCampos();
                cancelButton.setEnabled(false);
                saveButton.setEnabled(false);
                serviceButton.setEnabled(false);
                checkoutButton.setEnabled(false);
            }
        }
        preencher();
        hospedePreencher();
        limpar();

    }//GEN-LAST:event_saveButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        habilitarCampos();
        saveButton.setEnabled(true);
        cancelButton.setEnabled(true);
        serviceButton.setEnabled(false);
        editButton.setEnabled(false);
        checkoutButton.setEnabled(false);
    }//GEN-LAST:event_editButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        //id--;
        cancelButton.setEnabled(false);

        
        saveButton.setEnabled(false);
        editButton.setEnabled(false);
        checkoutButton.setEnabled(false);
        limpar();
        desabilitarCampos();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void serviceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceButtonActionPerformed
        // TODO add your handling code here:
        //Contratos.addContrato(BufferContrato.idNovoContrato(listac), );
        /*File arquivo = arq.getFile();
        lista1 = arq.lerArquivo(arquivo);
        String id = idCampo.getText();
        String nome = nomeCampo.getText();
        String cpf = cpfCampo.getText();
        String email = statusCampo.getText();
        String rg = rgCampo.getText();
        String dataCadastro = dataCadastroCampo.getText();
        String dataNascimento = nascimentoCampo.getText();
        String contratoID = idContratoCampo.getText();
        String endereço = cartaoCampo.getText();
        String endereço2 = endereco2Campo.getText();

        char sexo = 'F';
        if (femininoJButton.isSelected()) {
            sexo = 'F';
        } else {
            if (masculinoJButton.isSelected()) {
                sexo = 'M';
            }
        }

        String telefone = telefoneCampo.getText();
        if (camposVazios()){

            c.setNome(nome);
            c.setCode(Integer.parseInt(id));
            c.setCpf(cpf);
            c.setRg(rg);
            c.setSexo(sexo);
            c.setEmail(email);
            c.setTelefone(telefone);
            c.setDataNascimento(dataNascimento);
            c.setEndereço(endereço);
            c.setEndereço2(endereço2);
            c.setContrato(Integer.parseInt(contratoID));
            System.out.println("----------"+c.getCode());

            //ABRIR JDIALOG DE EDIÇÃO DE CONTRATO, A PARTIR DO ID
            
        }*/
        //ABRIR JDIALOG DE SERVIÇOS
    }//GEN-LAST:event_serviceButtonActionPerformed

    private void tipoTarifaCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoTarifaCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoTarifaCampoActionPerformed

    private void qtdServicoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdServicoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdServicoCampoActionPerformed

    private void tabelaContratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaContratosMouseClicked
        // TODO add your handling code here:
        String[] ca;
        hospedePreencher();
        checkoutButton.setEnabled(true);
        editButton.setEnabled(true);
        serviceButton.setEnabled(true);
        int linha=tabelaContratos.getSelectedRow();
        
        
        
        hospedePreencher();
        idCampo.setText(tabelaContratos.getValueAt(linha, 2).toString());
        nomeCampo.setText(tabelaContratos.getValueAt(linha, 3).toString());
        idContratoCampo.setText(tabelaContratos.getValueAt(linha, 0).toString());
        idServicoCampo.setText(tabelaContratos.getValueAt(linha, 9).toString());
        
        String idh = idCampo.getText();
        int parsed = Integer.parseInt(idh);
        tabelaUsuarios.setRowSelectionInterval(parsed, parsed);
        int linha1 = tabelaUsuarios.getSelectedRow();
        //System.out.println(""+idh);
        
        if(tabelaUsuarios.getValueAt(linha1, 6) == null){
            cpfCampo.setText("null");
            
        }else{
            cpfCampo.setText(tabelaUsuarios.getValueAt(linha1, 6).toString());
        }
        if(tabelaUsuarios.getValueAt(linha1, 9)== null){
            nascimentoCampo.setText("null");
        }else{
            nascimentoCampo.setText(tabelaUsuarios.getValueAt(linha1, 9).toString());
        }
        
        
        if(tabelaUsuarios.getValueAt(linha1, 2) != null){
            if ((tabelaUsuarios.getValueAt(linha1, 2).toString()).charAt(0) == 'F') {
                    femininoJButton.setSelected(true);
                } else {
                    masculinoJButton.setSelected(true);
                }
        }else{
            femininoJButton.setSelected(true);
            masculinoJButton.setSelected(true);
        }
        statusCampo.setText(tabelaContratos.getValueAt(linha, 1).toString());
        if(tabelaContratos.getValueAt(linha, 6).toString().equalsIgnoreCase("||")){
            cartaoCampo.setText("null");
            bandeiraCartaoCampo.setText("null");
            validadeCartaoCampo.setText("null");
        }else {
            String cartao =tabelaContratos.getValueAt(linha, 6).toString();
            
            
            ca = cartao.split("\\|");
            System.out.println(""+Arrays.toString(ca));
            cartaoCampo.setText(ca[0]);
            bandeiraCartaoCampo.setText(ca[1]);
            validadeCartaoCampo.setText(ca[2]);
        }
        
        
        
        dataInicialCampo.setText(tabelaContratos.getValueAt(linha, 4).toString());
        dataFinalCampo.setText(tabelaContratos.getValueAt(linha, 5).toString());
        tipoTarifaCampo.setText(tabelaContratos.getValueAt(linha, 7).toString());
        qtdServicoCampo.setText(tabelaContratos.getValueAt(linha, 8).toString());
        hospedePreencher();
        preencher();
        
        //int linha1 = tabelaUsuarios.getSelectedRow();
    }//GEN-LAST:event_tabelaContratosMouseClicked

    private void bandeiraCartaoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bandeiraCartaoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bandeiraCartaoCampoActionPerformed

    private void tabelaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuariosMouseClicked
        /*// TODO add your handling code here:

        // TODO add your handling code here:
        try {
            int linha = tabelaUsuarios.getSelectedRow();
            idCampo.setText(tabelaUsuarios.getValueAt(linha, 0).toString());
            idContratoCampo.setText(tabelaUsuarios.getValueAt(linha, 11).toString());
            nomeCampo.setText(tabelaUsuarios.getValueAt(linha, 1).toString());
            rgCampo.setText(tabelaUsuarios.getValueAt(linha, 5).toString());
            cpfCampo.setText(tabelaUsuarios.getValueAt(linha, 6).toString());
            dataCadastroCampo.setText(tabelaUsuarios.getValueAt(linha, 10).toString());
            nascimentoCampo.setText(tabelaUsuarios.getValueAt(linha, 9).toString());
            emailCampo.setText(tabelaUsuarios.getValueAt(linha, 4).toString());
            telefoneCampo.setText(tabelaUsuarios.getValueAt(linha, 3).toString());
            enderecoCampo.setText(tabelaUsuarios.getValueAt(linha, 7).toString());
            endereco2Campo.setText(tabelaUsuarios.getValueAt(linha, 8).toString());

            if ((tabelaUsuarios.getValueAt(linha, 2).toString()).charAt(0) == 'F') {
                femininoJButton.setSelected(true);
            } else {
                masculinoJButton.setSelected(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Há Campos Vazios neste Cliente", "Alerta", JOptionPane.WARNING_MESSAGE);
        }

        editButton.setEnabled(true);
        cancelButton.setEnabled(true);
        deleteButton.setEnabled(true);*/
    }//GEN-LAST:event_tabelaUsuariosMouseClicked

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
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditarContratos dialog = new EditarContratos(new javax.swing.JFrame(), true,null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bandeiraCartaoCampo;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField cartaoCampo;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JFormattedTextField cpfCampo;
    private javax.swing.JFormattedTextField dataFinalCampo;
    private javax.swing.JFormattedTextField dataInicialCampo;
    private javax.swing.JButton editButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JRadioButton femininoJButton;
    private javax.swing.JLabel idCampo;
    private javax.swing.JLabel idContratoCampo;
    private javax.swing.JLabel idServicoCampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton masculinoJButton;
    private javax.swing.JFormattedTextField nascimentoCampo;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JTextField qtdServicoCampo;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton serviceButton;
    private javax.swing.ButtonGroup sexoGrupal;
    private javax.swing.JTextField statusCampo;
    private javax.swing.JTable tabelaContratos;
    private javax.swing.JTable tabelaUsuarios;
    private javax.swing.JTextField tipoTarifaCampo;
    private javax.swing.JFormattedTextField validadeCartaoCampo;
    // End of variables declaration//GEN-END:variables
}
