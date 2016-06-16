package chemicalcompounds.view;

import chemicalcompounds.configuration.AppConfig;
import chemicalcompounds.domain.Chemicals;
import chemicalcompounds.service.ChemicalsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.List;

public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {

        context = new AnnotationConfigApplicationContext(AppConfig.class);
        chemicalsService = context.getBean("chemicalsServiceImpl", ChemicalsService.class);
        initComponents();
        fill();
        fillCBRegType();
        fillCBSubType();
        fillCBTotalTonnageBand();
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lR = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lL = new javax.swing.JLabel();
        bPrev = new javax.swing.JButton();
        bNext = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbWith = new javax.swing.JComboBox();
        bExit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfEC = new javax.swing.JFormattedTextField();
        tfCasNum = new javax.swing.JTextField();
        cbRegType = new javax.swing.JComboBox();
        cbTotalTonnageBand = new javax.swing.JComboBox();
        cbSubType = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        bFind = new javax.swing.JButton();
        bReset = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        mMenu = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        miDocumentation = new javax.swing.JMenuItem();
        miInstruction = new javax.swing.JMenuItem();
        miGantt = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        mEdit = new javax.swing.JMenu();
        miEdit = new javax.swing.JMenuItem();
        miDelete = new javax.swing.JMenuItem();
        miAdd = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new DefaultTableModel(new Object[][]{

        },
                columnNames));
        jScrollPane1.setViewportView(jTable1);

        lR.setText("0");

        jLabel2.setText("z");

        lL.setText("0");

        bPrev.setText("<");
        bPrev.addActionListener(this::bPrevActionPerformed);

        bNext.setText(">");
        bNext.addActionListener(this::bNextActionPerformed);

        jLabel4.setText("Ilość rekordów na stronie: ");

        cbWith.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "25", "50", "75", "100", "150", "200" }));
        cbWith.setSelectedIndex(1);
        cbWith.addItemListener(this::cbWithItemStateChanged);

        bExit.setText("Wyjście");
        bExit.addActionListener(this::bExitActionPerformed);

        jLabel5.setText("Name:");

        jLabel6.setText("EC / List Number:");

        jLabel7.setText("Cas Number:");

        jLabel8.setText("Registration Type:");

        jLabel9.setText("Submission Type:");

        jLabel10.setText("Total tonnage Band:");

        tfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNameKeyPressed(evt);
            }
        });


        javax.swing.text.MaskFormatter mask = null;
        try {
            mask = new javax.swing.text.MaskFormatter("###-###-#");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            e.printStackTrace();
        }

        tfEC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mask));
        tfEC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfECKeyPressed(evt);
            }
        });

        tfCasNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCasNumKeyTyped(evt);
            }
        });

        cbRegType.addItemListener(this::cbRegTypeItemStateChanged);

        cbSubType.addItemListener(this::cbSubTypeItemStateChanged);

        cbTotalTonnageBand.addItemListener(this::cbTotalTonnageBandItemStateChanged);

        bFind.setText("Szukaj");
        bFind.addActionListener(this::bFindActionPerformed);

        bReset.setText("Resetuj");
        bReset.addActionListener(this::bResetActionPerformed);

        mMenu.setText("Menu");

        miDocumentation.setText("Dokumentacja");
        mMenu.add(miDocumentation);

        miInstruction.setText("Instrukcja");
        miInstruction.addActionListener(this::miInstructionActionPerformed);
        mMenu.add(miInstruction);

        miGantt.setText("Gantt");
        mMenu.add(miGantt);

        miExit.setText("Wyjście");
        miExit.addActionListener(this::miExitActionPerformed);

        mMenu.add(miExit);

        jMenuBar1.add(mMenu);

        mEdit.setText("Edycja");

        miEdit.setText("Edytuj");
        mEdit.add(miEdit);

        miDelete.setText("Usuń");
        mEdit.add(miDelete);

        miAdd.setText("Dodaj");
        miAdd.addActionListener(this::miAddActionPerformed);
        mEdit.add(miAdd);

        jMenuBar1.add(mEdit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel7))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tfEC)
                                                        .addComponent(tfName)
                                                        .addComponent(tfCasNum))
                                                .addGap(15, 15, 15))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(21, 21, 21)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(jLabel9)
                                                                        .addComponent(jLabel10))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(cbRegType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(cbTotalTonnageBand, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(cbSubType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(9, 9, 9))
                                                        .addComponent(jSeparator2)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(bReset, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(bFind, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(57, 57, 57)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSeparator1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbWith, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(145, 145, 145)
                                                .addComponent(bPrev)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lR)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bNext)
                                                .addGap(218, 218, 218)
                                                .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(tfEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(tfCasNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(20, 20, 20)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(cbRegType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel9)
                                                                        .addComponent(cbSubType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(52, 52, 52))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(cbTotalTonnageBand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel10)))
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(bFind)
                                                        .addComponent(bReset))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lR)
                                        .addComponent(jLabel2)
                                        .addComponent(lL)
                                        .addComponent(bPrev)
                                        .addComponent(bNext)
                                        .addComponent(jLabel4)
                                        .addComponent(cbWith, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bExit))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    // Variables declaration - do not modify
    private javax.swing.JButton bExit;
    private javax.swing.JButton bFind;
    private javax.swing.JButton bNext;
    private javax.swing.JButton bPrev;
    private javax.swing.JButton bReset;
    private javax.swing.JComboBox cbRegType;
    private javax.swing.JComboBox cbSubType;
    private javax.swing.JComboBox cbTotalTonnageBand;
    private javax.swing.JComboBox cbWith;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lL;
    private javax.swing.JLabel lR;
    private javax.swing.JMenu mMenu;
    private javax.swing.JMenu mEdit;
    private javax.swing.JMenuItem miDocumentation;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miGantt;
    private javax.swing.JMenuItem miInstruction;
    private javax.swing.JMenuItem miAdd;
    private javax.swing.JMenuItem miDelete;
    private javax.swing.JMenuItem miEdit;
    private javax.swing.JTextField tfCasNum;
    private javax.swing.JFormattedTextField tfEC;
    private javax.swing.JTextField tfName;
    // End of variables declaration

    // Action perform methods
    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void bNextActionPerformed(java.awt.event.ActionEvent evt) {
        if (nextPageWithRecords()) {
            fillTable(chemicalsService.getChemicalsRangeId(maxId + 1, Integer.valueOf(cbWith.getSelectedItem().toString())));
            maxId += Integer.valueOf(cbWith.getSelectedItem().toString());
        }

    }

    private void bPrevActionPerformed(java.awt.event.ActionEvent evt) {
        if (previousPageWithRecords()) {
            int cbW = Integer.valueOf(cbWith.getSelectedItem().toString());
            maxId -= (2 * cbW);
            fillTable(chemicalsService.getChemicalsRangeId(maxId + 1, cbW));
            maxId += cbW;
        }
    }

    private void cbWithItemStateChanged(java.awt.event.ItemEvent evt) {
        fillTable(chemicalsService.getChemicalsRangeId(1, Integer.valueOf(cbWith.getSelectedItem().toString())));
        setLabelsLeftAndRight();
    }

    private void tfNameKeyPressed(java.awt.event.KeyEvent evt) {
        if (tfName.getText().length() > 2) {
            fillTable(chemicalsService.getChemicalByName(tfName.getText()));
        } else {
            fill();
        }
    }

    private void tfECKeyPressed(java.awt.event.KeyEvent evt) {
        if (!tfEC.getText().contains("_")) {
            fillTable(chemicalsService.getChemicalsByEC(tfEC.getText()));
        } else {
            fill();
        }
    }

    private void tfCasNumKeyTyped(java.awt.event.KeyEvent evt) {
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            fillTable(chemicalsService.getChemicalsByCasNumber(tfCasNum.getText()));
        } else {
            if (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                fill();
            } else {
                if (!(Character.isDigit(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_DELETE || evt.getKeyChar() == KeyEvent.VK_MINUS)) {
                    getToolkit().beep();
                    evt.consume();
                }
            }
        }
    }

    private void cbTotalTonnageBandItemStateChanged(ItemEvent itemEvent) {
        if (cbTotalTonnageBand.getSelectedIndex() != 0)
            fillTable(chemicalsService.getChemicalsByTotalTonnageBand(cbTotalTonnageBand.getSelectedItem().toString()));
    }

    private void cbSubTypeItemStateChanged(ItemEvent itemEvent) {
        if (cbSubType.getSelectedIndex() != 0)
            fillTable(chemicalsService.getChemicalsBySubmissionType(cbSubType.getSelectedItem().toString()));
    }

    private void cbRegTypeItemStateChanged(ItemEvent itemEvent) {
        if (cbRegType.getSelectedIndex() != 0)
            fillTable(chemicalsService.getChemicalsByRegistrationType(cbRegType.getSelectedItem().toString()));
    }

    private void miInstructionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void bFindActionPerformed(ActionEvent evt) {

        if (cbTotalTonnageBand.getSelectedIndex() != 0 || cbRegType.getSelectedIndex() != 0 || cbSubType.getSelectedIndex() != 0) {
            StringBuilder sql = new StringBuilder("SELECT * FROM Chemicals WHERE ");

            if (cbRegType.getSelectedIndex() != 0) {
                sql.append("Chemicals.registration_type LIKE '");
                sql.append(cbRegType.getSelectedItem());
                sql.append("' AND ");
            }

            if (cbSubType.getSelectedIndex() != 0) {
                sql.append("Chemicals.submission_type LIKE '");
                sql.append(cbSubType.getSelectedItem());
                sql.append("' AND ");
            }

            if (cbTotalTonnageBand.getSelectedIndex() != 0) {
                sql.append("Chemicals.total_tonnage_band LIKE '");
                sql.append(cbTotalTonnageBand.getSelectedItem());
                sql.append("'");
            } else {
                sql.delete(sql.lastIndexOf(" AND"), sql.length());
            }

            fillTable(chemicalsService.getChemicalsByFilter(sql.toString()));
        }


    }

    private void bResetActionPerformed(ActionEvent actionEvent) {
        fill();
        cbRegType.setSelectedIndex(0);
        cbSubType.setSelectedIndex(0);
        cbTotalTonnageBand.setSelectedIndex(0);
    }

    private void miAddActionPerformed(ActionEvent actionEvent) {
        EventQueue.invokeLater(() -> new AddingFrame(chemicalsService).setVisible(true));
    }

    // End of action perform method


    // My methods declaration
    @SuppressWarnings("unchecked")
    private void fillCBRegType() {
        cbRegType.addItem("<Wybierz>");

        for (String regType :
                chemicalsService.getRegistrationType()) {
            cbRegType.addItem(regType);
        }
    }

    @SuppressWarnings("unchecked")
    private void fillCBTotalTonnageBand() {

        cbTotalTonnageBand.addItem("<Wybierz>");
        for (String tonnageBand :
                chemicalsService.getTotalTonnageBand()) {
            cbTotalTonnageBand.addItem(tonnageBand);
        }
    }

    @SuppressWarnings("unchecked")
    private void fillCBSubType() {

        cbSubType.addItem("<Wybierz>");
        for (String subType :
                chemicalsService.getSubmissionType()) {
            cbSubType.addItem(subType);
        }
    }

    private void setLabelsLeftAndRight() {
        labelLeft = "1";
        lL.setText(labelLeft);
        labelRight = String.valueOf((int) (chemicalsService.count() / Double.valueOf(cbWith.getSelectedItem().toString()) + 0.999));
        lR.setText(labelRight);
    }

    private boolean nextPageWithRecords() {
        int left = Integer.valueOf(labelLeft);
        int right = Integer.valueOf(labelRight);

        if (left < right) {
            labelLeft = String.valueOf(++left);
            lL.setText(labelLeft);
            return true;
        }

        return false;
    }

    private boolean previousPageWithRecords() {
        int left = Integer.valueOf(labelLeft);

        if (left > 1) {
            labelLeft = String.valueOf(--left);
            lL.setText(labelLeft);
            return true;
        }

        return false;
    }

    private DefaultTableModel tmpTableModel() {
        return new DefaultTableModel(new Object[][]{

        },
                columnNames);
    }

    private void fillTable(List<Chemicals> listOfChemicals) {
        DefaultTableModel tmpTableModel = tmpTableModel();

        jTable1.setModel(tmpTableModel);

        for (Chemicals chemicals :
                listOfChemicals) {
            tmpTableModel.addRow(new Object[]{chemicals.getId(), chemicals.getName(), chemicals.getEc(), chemicals.getCasNumber(), chemicals.getRegistrationType(), chemicals.getSubmissionType(), chemicals.getTotalTonnageBand()});
        }

    }

    private void fill() {
        fillTable(chemicalsService.getChemicalsRangeId(1, 50));
        setLabelsLeftAndRight();
    }

    // End of my methods declaration

    // My variables declaration
    private String[] columnNames = {
            "id", "Nazwa", "Numer EC", "Numer CAS", "Rodzaj rejestracji", "Typ złożenia", "Zakres obrotu"
    };
    private ApplicationContext context;
    private ChemicalsService chemicalsService;
    private String labelLeft;
    private String labelRight;
    private int maxId = 50;

    // End of variables declaration
}
