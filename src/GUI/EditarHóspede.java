/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import Hotel.Contrato;
import Hotel.Contratos;

import fileModel.Arquivos;
import buffers.BufferHóspede;
import Hotel.Hóspede;
import Hotel.Hóspedes;
import buffers.BufferContrato;
import java.io.File;
import java.util.Calendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Guilherme A. F. Leite, Matrícula: 161080022
 */
public class EditarHóspede extends javax.swing.JDialog {

    Arquivos arq;
    Arquivos arqc;
    List<String> lista1;
    List<String> lista;
    List<String> listac;
    private static EditarHóspede cj;
    private Hóspede c;
    private File arquivo1;
    private File arquivoc;
    
    /**
     * Creates new form EditarHóspede
     */
    public EditarHóspede(java.awt.Frame parent, boolean modal, int index) {
        super(parent, modal);
        initComponents();
        arq = new Arquivos("hospedes");
        arquivo1 = arq.getFile();
        lista = arq.lerArquivo(arquivo1);
        idCampo1.setText(String.valueOf(BufferHóspede.idNovoUsuario(lista)));
        femininoJButton1.setSelected(true);
        c = new Hóspede(BufferHóspede.idNovoUsuario(lista));
        Hóspedes.addHóspede(BufferHóspede.idNovoUsuario(lista),c);
        arqc = new Arquivos("contratos");
        arquivoc = arqc.getFile();
        listac = arqc.lerArquivo(arquivoc);
        preencher();
        limpar();
        desabilitarCampos();
        preencher1();
        limpar1();
        habilitarCampos1();
        jTabbedPane1.setSelectedIndex(index);
    }
    
    public EditarHóspede(java.awt.Frame parent, boolean modal, int index, int linha1) {
        super(parent, modal);
        initComponents();
        arq = new Arquivos("hospedes");
        arquivo1 = arq.getFile();
        lista = arq.lerArquivo(arquivo1);
        idCampo1.setText(String.valueOf(BufferHóspede.idNovoUsuario(lista)));
        femininoJButton1.setSelected(true);
        c = new Hóspede(BufferHóspede.idNovoUsuario(lista));
        Hóspedes.addHóspede(BufferHóspede.idNovoUsuario(lista),c);
        arqc = new Arquivos("contratos");
        arquivoc = arqc.getFile();
        listac = arqc.lerArquivo(arquivoc);
        preencher();
        limpar();
        desabilitarCampos();
        preencher1();
        limpar1();
        habilitarCampos1();
        jTabbedPane1.setSelectedIndex(index);
        tabelaUsuarios.setRowSelectionInterval(linha1, linha1);
        
    }
    
    static {
        cj = new EditarHóspede(null, true,0);
    }

    public static EditarHóspede getInstance() {
        return cj;
    }

    
    private void limpar() {
        idCampo.setText("");
        idContratoCampo.setText("");
        nomeCampo.setText("");
        rgCampo.setText("");
        cpfCampo.setText("");
        dataCadastroCampo.setText("");
        nascimentoCampo.setText("");
        emailCampo.setText("");
        telefoneCampo.setText("");
        enderecoCampo.setText("");
        endereco2Campo.setText("");
        femininoJButton.setSelected(false);
        masculinoJButton.setSelected(false);
    }
    
    private void desabilitarCampos(){
        
        nomeCampo.setEditable(false);
        rgCampo.setEditable(false);
        cpfCampo.setEditable(false);
        dataCadastroCampo.setEditable(false);
        nascimentoCampo.setEditable(false);
        emailCampo.setEditable(false);
        telefoneCampo.setEditable(false);
        enderecoCampo.setEditable(false);
        endereco2Campo.setEditable(false);
        femininoJButton.setEnabled(false);
        masculinoJButton.setEnabled(false);
    }
    
    private void habilitarCampos(){
        
        nomeCampo.setEditable(true);
        rgCampo.setEditable(true);
        cpfCampo.setEditable(true);
        dataCadastroCampo.setEditable(true);
        nascimentoCampo.setEditable(true);
        emailCampo.setEditable(true);
        telefoneCampo.setEditable(true);
        enderecoCampo.setEditable(true);
        endereco2Campo.setEditable(true);
        femininoJButton.setEnabled(true);
        masculinoJButton.setEnabled(true);
    }
    
    private void preencher() {
        File f = arq.getFile();
        lista1 = arq.lerArquivo(f);
        DefaultTableModel model = (DefaultTableModel) tabelaUsuarios.getModel();
        model.setRowCount(0);
        int t = 0;
        while (t < lista1.size()) {
            model.addRow(lista1.get(t).split(";"));
            t++;
        }
        
    }
    
    private boolean camposVazios() {
        boolean b = true;
        if (nomeCampo.getText().equals("") || cpfCampo.getText().equals("   .   .   -  ") || rgCampo.getText().equals("")) {
            b = false;
        }
        return b;
    }
    
///////////////////
    private void limpar1() {
        idCampo1.setText("");
        idContratoCampo1.setText("");
        nomeCampo1.setText("");
        rgCampo1.setText("");
        cpfCampo1.setText("");
        dataCadastroCampo1.setText("");
        nascimentoCampo1.setText("");
        emailCampo1.setText("");
        telefoneCampo1.setText("");
        enderecoCampo1.setText("");
        endereco2Campo1.setText("");
        femininoJButton1.setSelected(false);
        masculinoJButton1.setSelected(false);
    }
    
    private void desabilitarCampos1(){
        
        nomeCampo1.setEditable(false);
        rgCampo1.setEditable(false);
        cpfCampo1.setEditable(false);
        dataCadastroCampo1.setEditable(false);
        nascimentoCampo1.setEditable(false);
        emailCampo1.setEditable(false);
        telefoneCampo1.setEditable(false);
        enderecoCampo1.setEditable(false);
        endereco2Campo1.setEditable(false);
        femininoJButton1.setEnabled(false);
        masculinoJButton1.setEnabled(false);
    }
    
    private void habilitarCampos1(){
        
        nomeCampo1.setEditable(true);
        rgCampo1.setEditable(true);
        cpfCampo1.setEditable(true);
        dataCadastroCampo1.setEditable(false);
        nascimentoCampo1.setEditable(true);
        emailCampo1.setEditable(true);
        telefoneCampo1.setEditable(true);
        enderecoCampo1.setEditable(true);
        endereco2Campo1.setEditable(true);
        femininoJButton1.setEnabled(true);
        masculinoJButton1.setEnabled(true);
    }
    
    private void preencher1() {
        File f = arq.getFile();
        lista1 = arq.lerArquivo(f);
        DefaultTableModel model = (DefaultTableModel) tabelaUsuarios1.getModel();
        model.setRowCount(0);
        int t = 0;
        while (t < lista1.size()) {
            model.addRow(lista1.get(t).split(";"));
            t++;
        }
        
    }
    
    private boolean camposVazios1() {
        boolean b = true;
        if (nomeCampo1.getText().equals("") || cpfCampo1.getText().equals("   .   .   -  ") || rgCampo1.getText().equals("")) {
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
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idCampo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idContratoCampo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nomeCampo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rgCampo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cpfCampo = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        nascimentoCampo = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        dataCadastroCampo = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        femininoJButton = new javax.swing.JRadioButton();
        masculinoJButton = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        emailCampo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        enderecoCampo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        telefoneCampo = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        endereco2Campo = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        contractButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        idCampo1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        idContratoCampo1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        nomeCampo1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        rgCampo1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cpfCampo1 = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        nascimentoCampo1 = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        dataCadastroCampo1 = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        femininoJButton1 = new javax.swing.JRadioButton();
        masculinoJButton1 = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        emailCampo1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        enderecoCampo1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        telefoneCampo1 = new javax.swing.JFormattedTextField();
        jLabel26 = new javax.swing.JLabel();
        endereco2Campo1 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        exitButton1 = new javax.swing.JButton();
        saveButton1 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaUsuarios1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(76, 82, 86));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(76, 82, 86));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 55, 58));

        jPanel4.setBackground(new java.awt.Color(76, 82, 86));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)), "Edição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(51, 55, 58));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)), "Hóspede", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID: ");
        jLabel1.setToolTipText("ID de Cadastro do Hóspede");

        idCampo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        idCampo.setForeground(new java.awt.Color(255, 255, 255));
        idCampo.setText("000");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.gif"))); // NOI18N

        idContratoCampo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        idContratoCampo.setForeground(new java.awt.Color(255, 255, 255));
        idContratoCampo.setText("000");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CA:");
        jLabel2.setToolTipText("ID do Contrato Atual: ");

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
                        .addComponent(idContratoCampo)))
                .addContainerGap())
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
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(51, 55, 58));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)), "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome: ");

        nomeCampo.setBackground(new java.awt.Color(51, 51, 51));
        nomeCampo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        nomeCampo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RG: ");

        rgCampo.setBackground(new java.awt.Color(51, 51, 51));
        rgCampo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        rgCampo.setForeground(new java.awt.Color(255, 255, 255));
        rgCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgCampoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CPF: ");

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

        nascimentoCampo.setBackground(new java.awt.Color(51, 51, 51));
        nascimentoCampo.setForeground(new java.awt.Color(255, 255, 255));
        try {
            nascimentoCampo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        nascimentoCampo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Data de Cadastro: ");
        jLabel8.setToolTipText("");

        dataCadastroCampo.setBackground(new java.awt.Color(51, 51, 51));
        dataCadastroCampo.setForeground(new java.awt.Color(255, 255, 255));
        try {
            dataCadastroCampo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataCadastroCampo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sexo: ");

        femininoJButton.setBackground(new java.awt.Color(51, 55, 58));
        sexoGrupal.add(femininoJButton);
        femininoJButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        femininoJButton.setForeground(new java.awt.Color(255, 255, 255));
        femininoJButton.setText("Feminino");

        masculinoJButton.setBackground(new java.awt.Color(51, 55, 58));
        sexoGrupal.add(masculinoJButton);
        masculinoJButton.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        masculinoJButton.setForeground(new java.awt.Color(255, 255, 255));
        masculinoJButton.setText("Masculino");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rgCampo)
                    .addComponent(nomeCampo)
                    .addComponent(cpfCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(femininoJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(masculinoJButton))
                    .addComponent(dataCadastroCampo)
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
                    .addComponent(jLabel5)
                    .addComponent(rgCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataCadastroCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
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
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)), "Dados de Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email: ");

        emailCampo.setBackground(new java.awt.Color(51, 51, 51));
        emailCampo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        emailCampo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Endereço 1: ");

        enderecoCampo.setBackground(new java.awt.Color(51, 51, 51));
        enderecoCampo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        enderecoCampo.setForeground(new java.awt.Color(255, 255, 255));
        enderecoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoCampoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Telefone: ");

        telefoneCampo.setBackground(new java.awt.Color(51, 51, 51));
        telefoneCampo.setForeground(new java.awt.Color(255, 255, 255));
        try {
            telefoneCampo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneCampo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Endereço 2: ");
        jLabel14.setToolTipText("");

        endereco2Campo.setBackground(new java.awt.Color(51, 51, 51));
        endereco2Campo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        endereco2Campo.setForeground(new java.awt.Color(255, 255, 255));
        endereco2Campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endereco2CampoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enderecoCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(emailCampo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefoneCampo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(endereco2Campo))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(emailCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(enderecoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(endereco2Campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(51, 55, 58));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));

        deleteButton.setBackground(new java.awt.Color(51, 51, 51));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X1.png"))); // NOI18N
        deleteButton.setToolTipText("Remover Hóspede");
        deleteButton.setEnabled(false);
        deleteButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X2.png"))); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
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

        contractButton.setBackground(new java.awt.Color(51, 51, 51));
        contractButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contract.png"))); // NOI18N
        contractButton.setToolTipText("Cancelar");
        contractButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contract1.gif"))); // NOI18N
        contractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contractButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(editButton)
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addGap(18, 18, 18)
                .addComponent(cancelButton)
                .addGap(18, 18, 18)
                .addComponent(contractButton)
                .addGap(26, 26, 26)
                .addComponent(exitButton)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contractButton)
                    .addComponent(cancelButton)
                    .addComponent(saveButton)
                    .addComponent(exitButton)
                    .addComponent(deleteButton)
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
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(76, 82, 86));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

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
        tabelaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsuarios);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
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
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Editar Hóspede", jPanel2);

        jPanel3.setBackground(new java.awt.Color(51, 55, 58));

        jPanel10.setBackground(new java.awt.Color(76, 82, 86));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)), "Adição", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel11.setBackground(new java.awt.Color(51, 55, 58));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)), "Hóspede", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ID: ");
        jLabel12.setToolTipText("ID de Cadastro do Hóspede");

        idCampo1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        idCampo1.setForeground(new java.awt.Color(255, 255, 255));
        idCampo1.setText("000");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.gif"))); // NOI18N

        idContratoCampo1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        idContratoCampo1.setForeground(new java.awt.Color(255, 255, 255));
        idContratoCampo1.setText("000");

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CA:");
        jLabel16.setToolTipText("ID do Contrato Atual: ");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idCampo1))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idContratoCampo1)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(idCampo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(idContratoCampo1))
                .addGap(40, 40, 40)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(51, 55, 58));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)), "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Nome: ");

        nomeCampo1.setBackground(new java.awt.Color(51, 51, 51));
        nomeCampo1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        nomeCampo1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("RG: ");

        rgCampo1.setBackground(new java.awt.Color(51, 51, 51));
        rgCampo1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        rgCampo1.setForeground(new java.awt.Color(255, 255, 255));
        rgCampo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgCampo1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("CPF: ");

        cpfCampo1.setBackground(new java.awt.Color(51, 51, 51));
        cpfCampo1.setForeground(new java.awt.Color(255, 255, 255));
        try {
            cpfCampo1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfCampo1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Data de Nascimento: ");

        nascimentoCampo1.setBackground(new java.awt.Color(51, 51, 51));
        nascimentoCampo1.setForeground(new java.awt.Color(255, 255, 255));
        try {
            nascimentoCampo1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        nascimentoCampo1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Data de Cadastro: ");
        jLabel21.setToolTipText("");

        dataCadastroCampo1.setEditable(false);
        dataCadastroCampo1.setBackground(new java.awt.Color(51, 51, 51));
        dataCadastroCampo1.setForeground(new java.awt.Color(255, 255, 255));
        try {
            dataCadastroCampo1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataCadastroCampo1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Sexo: ");

        femininoJButton1.setBackground(new java.awt.Color(51, 55, 58));
        sexoGrupal.add(femininoJButton1);
        femininoJButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        femininoJButton1.setForeground(new java.awt.Color(255, 255, 255));
        femininoJButton1.setText("Feminino");

        masculinoJButton1.setBackground(new java.awt.Color(51, 55, 58));
        sexoGrupal.add(masculinoJButton1);
        masculinoJButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        masculinoJButton1.setForeground(new java.awt.Color(255, 255, 255));
        masculinoJButton1.setText("Masculino");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rgCampo1)
                    .addComponent(nomeCampo1)
                    .addComponent(cpfCampo1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(femininoJButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(masculinoJButton1))
                    .addComponent(dataCadastroCampo1)
                    .addComponent(nascimentoCampo1))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(nomeCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nascimentoCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(rgCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataCadastroCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22)
                    .addComponent(femininoJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masculinoJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(51, 55, 58));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)), "Dados de Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Email: ");

        emailCampo1.setBackground(new java.awt.Color(51, 51, 51));
        emailCampo1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        emailCampo1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Endereço 1: ");

        enderecoCampo1.setBackground(new java.awt.Color(51, 51, 51));
        enderecoCampo1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        enderecoCampo1.setForeground(new java.awt.Color(255, 255, 255));
        enderecoCampo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoCampo1ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Telefone: ");

        telefoneCampo1.setBackground(new java.awt.Color(51, 51, 51));
        telefoneCampo1.setForeground(new java.awt.Color(255, 255, 255));
        try {
            telefoneCampo1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneCampo1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Endereço 2: ");
        jLabel26.setToolTipText("");

        endereco2Campo1.setBackground(new java.awt.Color(51, 51, 51));
        endereco2Campo1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        endereco2Campo1.setForeground(new java.awt.Color(255, 255, 255));
        endereco2Campo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endereco2Campo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enderecoCampo1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(emailCampo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefoneCampo1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(endereco2Campo1))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(emailCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(enderecoCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(endereco2Campo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(51, 55, 58));
        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));

        exitButton1.setBackground(new java.awt.Color(51, 51, 51));
        exitButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/leave.png"))); // NOI18N
        exitButton1.setToolTipText("Sair");
        exitButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/leave1.gif"))); // NOI18N
        exitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton1ActionPerformed(evt);
            }
        });

        saveButton1.setBackground(new java.awt.Color(51, 51, 51));
        saveButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save1.png"))); // NOI18N
        saveButton1.setToolTipText("Salvar");
        saveButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save2.png"))); // NOI18N
        saveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saveButton1)
                    .addComponent(exitButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(76, 82, 86));
        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));

        jScrollPane2.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tabelaUsuarios1.setAutoCreateRowSorter(true);
        tabelaUsuarios1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tabelaUsuarios1.setForeground(new java.awt.Color(0, 0, 0));
        tabelaUsuarios1.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaUsuarios1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuarios1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaUsuarios1);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2)
                    .addContainerGap()))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 208, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Novo Hóspede", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuariosMouseClicked
        // TODO add your handling code here:

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
        deleteButton.setEnabled(true);

    }//GEN-LAST:event_tabelaUsuariosMouseClicked

    private void rgCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgCampoActionPerformed

    private void enderecoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoCampoActionPerformed

    private void endereco2CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endereco2CampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endereco2CampoActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        File f = arq.getFile();
        lista1 = arq.lerArquivo(f);

        if (arq.regravarDados(f, BufferHóspede.apagarCliente(lista1, idCampo.getText()))) {
            preencher();
            deleteButton.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Hóspede removido.", "Remoção", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(this, "Falha na remoção.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        editButton.setEnabled(false);
        cancelButton.setEnabled(false);        
        preencher();
        limpar();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        habilitarCampos();   
        saveButton.setEnabled(true);
        editButton.setEnabled(false);
        deleteButton.setEnabled(false);
    }//GEN-LAST:event_editButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
            // TODO add your handling code here:
        File arquivo = arq.getFile();
        lista1 = arq.lerArquivo(arquivo);
        String id = idCampo.getText();
        String nome = nomeCampo.getText();
        String cpf = cpfCampo.getText();
        String email = emailCampo.getText();
        String rg = rgCampo.getText();        
        String dataCadastro = dataCadastroCampo.getText();
        String dataNascimento = nascimentoCampo.getText();
        String contratoID = idContratoCampo.getText();
        String endereço = enderecoCampo.getText();
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
       
            if (!camposVazios()) {
                JOptionPane.showMessageDialog(this, "Impossível salvar!\nHá campos vazios", "Falha", JOptionPane.ERROR_MESSAGE);
            } else {
                //String idCliente = idCampo.getText();
                String clienteEditado =""+ id + ";" + nome+ ";" + sexo +";"
                +  telefone+ ";" + email+ ";" + rg + ";" 
                + cpf + ";"+ endereço + ";"+ endereço2 + ";" 
                + dataNascimento + ";"  + dataCadastro + ";" 
                + contratoID;
                
                
                lista1 = BufferHóspede.editarCliente(lista1, id, clienteEditado);
                if (arq.regravarDados(arquivo, lista1)) {
                    JOptionPane.showMessageDialog(this, "Editado", "Edição Salva", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Falha", "Edição Não salva", JOptionPane.ERROR_MESSAGE);
                }
            }

        
        preencher();
        preencher1();
        limpar();
        desabilitarCampos();
        cancelButton.setEnabled(false);
        saveButton.setEnabled(false);
        contractButton.setEnabled(false);
        deleteButton.setEnabled(false);
      
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        //id--;
        cancelButton.setEnabled(false);
        
        saveButton.setEnabled(false);
        editButton.setEnabled(false);
        deleteButton.setEnabled(false);
        limpar();
        desabilitarCampos();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void rgCampo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgCampo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgCampo1ActionPerformed

    private void enderecoCampo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoCampo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoCampo1ActionPerformed

    private void endereco2Campo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endereco2Campo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endereco2Campo1ActionPerformed

    private void exitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitButton1ActionPerformed

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
        // TODO add your handling code here:
        
        File arquivo = arq.getFile();
        lista1 = arq.lerArquivo(arquivo);
        //String id = idCampo1.getText();
        String nome = nomeCampo1.getText();
        String cpf = cpfCampo1.getText();
        String email = emailCampo1.getText();
        String rg = rgCampo1.getText();        
        //String dataCadastro = dataCadastroCampo1.getText();
        String dataNascimento = nascimentoCampo1.getText();
        //String contratoID = idContratoCampo1.getText();
        String endereço = enderecoCampo1.getText();
        String endereço2 = endereco2Campo1.getText();
        
    
        char sexo = 'F';
        if (femininoJButton1.isSelected()) {
            sexo = 'F';
        } else {
            if (masculinoJButton1.isSelected()) {
                sexo = 'M';
            }
        }

        String telefone = telefoneCampo1.getText();
       
            if (camposVazios1()){
            
            c.setNome(nome);
            c.setCpf(cpf);
            c.setRg(rg);
            c.setSexo(sexo);
            c.setEmail(email);
            c.setTelefone(telefone);
            c.setDataNascimento(dataNascimento);
            c.setEndereço(endereço);
            c.setEndereço2(endereço2);
            c.setContrato(BufferContrato.idNovoContrato(listac));
            
           

            if (arq.novoDado(arquivo, c.toString())) {
                JOptionPane.showMessageDialog(this, "Salvo", "Novo usuario", JOptionPane.INFORMATION_MESSAGE);
                saveButton1.setEnabled(false);
                limpar1();
                preencher1();
                preencher();
                jTabbedPane1.setSelectedIndex(0);
                
                //dispose();
                //new ListarClientesGUI(null,true).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Falha", "Novo usuario", JOptionPane.ERROR_MESSAGE);
                
                limpar1();
                preencher();
                preencher1();
                saveButton1.setEnabled(true);

            }
        } else {

            JOptionPane.showMessageDialog(this, "Impossível salvar!\nHá campos vazios", "Falha", JOptionPane.ERROR_MESSAGE);
            saveButton1.setEnabled(true);

        }

        
        preencher1();
        preencher();
        
        
        //saveButton1.setEnabled(false);
       
        
      
    }//GEN-LAST:event_saveButton1ActionPerformed

    private void tabelaUsuarios1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuarios1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaUsuarios1MouseClicked

    private void contractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contractButtonActionPerformed
        // TODO add your handling code here:
        //Contratos.addContrato(BufferContrato.idNovoContrato(listac), );
        File arquivo = arq.getFile();
        lista1 = arq.lerArquivo(arquivo);
        String id = idCampo.getText();
        String nome = nomeCampo.getText();
        String cpf = cpfCampo.getText();
        String email = emailCampo.getText();
        String rg = rgCampo.getText();        
        //String dataCadastro = dataCadastroCampo.getText();
        String dataNascimento = nascimentoCampo.getText();
        String contratoID = idContratoCampo.getText();
        String endereço = enderecoCampo.getText();
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
            c.setContrato4edit(Integer.parseInt(contratoID));
            System.out.println("----------"+c.getCode());
            
            if(c.getContrato().getEstadoDoContrato().equalsIgnoreCase("Aberto")){
                JOptionPane.showMessageDialog(this, "Edição de contrato aberto.", "Contrato aberto", JOptionPane.INFORMATION_MESSAGE);   
                c.getContrato().setCode((Integer.parseInt(contratoID)));
                new EditarContratos(null,true,c.getContrato()).setVisible(true);
                //NEW EDITARCONTRATO(CONTRATO)
            }else if(!(c.getContrato().getEstadoDoContrato().equalsIgnoreCase("Fechado")) || c.getContrato()==null || c.getContrato().isEstadoDoContrato()==true){
                JOptionPane.showMessageDialog(this, "Contrato anterior fechado, abrindo novo contrato.", "Contrato fechado", JOptionPane.INFORMATION_MESSAGE);
                //NEW ID
                c.setContrato(Integer.parseInt(contratoID));
                new EditarContratos(null,true,c.getContrato()).setVisible(true);
                //NEW EDITARCONTRATO(CONTRATO (NEW ID))
            }
            //ABRIR JDIALOG DE EDIÇÃO DE CONTRATO, A PARTIR DO ID 
       }
    }//GEN-LAST:event_contractButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EditarHóspede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarHóspede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarHóspede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarHóspede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditarHóspede dialog = new EditarHóspede(new javax.swing.JFrame(), true,0);
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
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton contractButton;
    private javax.swing.JFormattedTextField cpfCampo;
    private javax.swing.JFormattedTextField cpfCampo1;
    private javax.swing.JFormattedTextField dataCadastroCampo;
    private javax.swing.JFormattedTextField dataCadastroCampo1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField emailCampo;
    private javax.swing.JTextField emailCampo1;
    private javax.swing.JTextField endereco2Campo;
    private javax.swing.JTextField endereco2Campo1;
    private javax.swing.JTextField enderecoCampo;
    private javax.swing.JTextField enderecoCampo1;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitButton1;
    private javax.swing.JRadioButton femininoJButton;
    private javax.swing.JRadioButton femininoJButton1;
    private javax.swing.JLabel idCampo;
    private javax.swing.JLabel idCampo1;
    private javax.swing.JLabel idContratoCampo;
    private javax.swing.JLabel idContratoCampo1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton masculinoJButton;
    private javax.swing.JRadioButton masculinoJButton1;
    private javax.swing.JFormattedTextField nascimentoCampo;
    private javax.swing.JFormattedTextField nascimentoCampo1;
    private javax.swing.JTextField nomeCampo;
    private javax.swing.JTextField nomeCampo1;
    private javax.swing.JTextField rgCampo;
    private javax.swing.JTextField rgCampo1;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton saveButton1;
    private javax.swing.ButtonGroup sexoGrupal;
    private javax.swing.JTable tabelaUsuarios;
    private javax.swing.JTable tabelaUsuarios1;
    private javax.swing.JFormattedTextField telefoneCampo;
    private javax.swing.JFormattedTextField telefoneCampo1;
    // End of variables declaration//GEN-END:variables
}
