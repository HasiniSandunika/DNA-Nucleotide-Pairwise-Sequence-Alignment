
package com.mycompany.gui_pairwise_sequence_alignment;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Display extends javax.swing.JFrame {
    private String first_sequence;
    private String second_sequence;
    private String alignment;
    private String str_date;
    private String str_matrix;
    private String type;
    private static int count_glo;
    private static int count_loc;
    
    public Display() {
        super( "Pairwise Sequence Alignment" );
        initComponents();
    }

    Display(String type,String str_date,String first_sequence,String second_sequence,String str_matrix,String alignment) {
        super( "Pairwise Sequence Alignment" );
        this.type=type;
        this.str_date=str_date;
        this.first_sequence=first_sequence;
        this.second_sequence=second_sequence;
        this.str_matrix=str_matrix;
        this.alignment=alignment;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().
            getImage("F:\\netbeans\\applications\\gui pairwise sequence alignment\\gui_pairwise_sequence_alignment\\src\\main\\java\\com\\mycompany\\gui_pairwise_sequence_alignment\\icon.png"));
        setResizable(false);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Global Alignment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Local Alignment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 51));
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setBackground(new java.awt.Color(51, 153, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 51));
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText(type);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Executed date and time : "+str_date);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Score matrix of the global alignment :");

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText(str_matrix);
        jScrollPane7.setViewportView(jTextArea1);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea2.setRows(5);
        jTextArea2.setText(alignment);
        jScrollPane1.setViewportView(jTextArea2);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Sequence Alignment");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("First sequence : ");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Second sequence : ");

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea4.setRows(5);
        jTextArea4.setText(second_sequence);
        jScrollPane2.setViewportView(jTextArea4);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea3.setRows(5);
        jTextArea3.setText(first_sequence);
        jScrollPane3.setViewportView(jTextArea3);

        jButton6.setBackground(new java.awt.Color(51, 153, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setText("Create PDF");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2))))
                        .addContainerGap(119, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(147, 147, 147))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)))
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(575, 575, 575)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jScrollPane4.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1043, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new GlobalAlignment().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new LocalAlignment().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Search().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        if("Global sequence alignment".equals(type)){
            try { 
           int i;      
          String data = null;
                String path="G:/projects/pairwise sequence alignment/pdf_results/global/count_glo.txt";
          try (FileReader fr = new FileReader(path);Scanner scan = new Scanner(fr)) {
              while (scan.hasNextLine()) {
                  data = scan.nextLine();
                  System.out.println(data);
              }
          }
            if(data==null){
               i=0; 
            }
            else{ 
                i=Integer.parseInt(data);
            } 
                count_glo=i+1;
                String st="G:/projects/pairwise sequence alignment/"
                        + "pdf_results/global/glo_"+String.valueOf(count_glo)+".pdf";                
            Document doc = new Document();
            PdfWriter.getInstance(doc,new FileOutputStream(st));
            doc.open();  
            doc.add( Chunk.NEWLINE );
            doc.add(new Paragraph("Pairwise global sequence lignment with Needleman-Wunshu algorithm",
                    new Font(Font.FontFamily.HELVETICA,18.0f,Font.BOLD,BaseColor.BLACK))); 
            doc.add( Chunk.NEWLINE );
            doc.add(new Paragraph("Executed date and time :",new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
            doc.add(new Paragraph(str_date,new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
            doc.add( Chunk.NEWLINE );
            doc.add(new Paragraph("First sequence :",new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
            doc.add(new Paragraph(first_sequence,new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
            doc.add( Chunk.NEWLINE );
            doc.add(new Paragraph("Second sequence :",new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
            doc.add(new Paragraph(second_sequence,new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
            doc.add( Chunk.NEWLINE );
            doc.add(new Paragraph("Score matrix :",new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
            doc.add(new Paragraph(str_matrix,new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
            doc.add( Chunk.NEWLINE );
            doc.add(new Paragraph("Sequence alignment :",new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
            doc.add(new Paragraph(alignment,new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));           
            doc.close();
            PrintWriter ptr = new PrintWriter (path);
          ptr.write(String.valueOf(count_glo));
          ptr.close();
          File f =new File(st);
          Desktop.getDesktop().open(f);     
        }catch( IOException | DocumentException e ){
            JOptionPane.showMessageDialog(null,"Cannot perform this action!","Warning",
                   JOptionPane.WARNING_MESSAGE);
        } 
        }
        else{
            try {      
          int i;      
          String data = null;
                String path="G:/projects/pairwise sequence alignment/pdf_results/local/count_loc.txt";
          try (FileReader fr = new FileReader(path);Scanner scan = new Scanner(fr)) {
              while (scan.hasNextLine()) {
                  data = scan.nextLine();
                  System.out.println(data);
              }
          }
            if(data==null){
                i=0;
            } 
            else{ 
                i=Integer.parseInt(data);
            }
                count_loc=i+1;
                String st="G:/projects/pairwise sequence alignment/"
                        + "pdf_results/local/loc_"+String.valueOf(count_loc)+".pdf";        
                Document doc = new Document();
                PdfWriter.getInstance(doc,new FileOutputStream(st));
                doc.open();
                doc.add( Chunk.NEWLINE );
                doc.add(new Paragraph("Pairwise local sequence lignment with Smith-Waterman algorithm",
                        new Font(Font.FontFamily.HELVETICA,18.0f,Font.BOLD,BaseColor.BLACK))); 
                doc.add( Chunk.NEWLINE );
                doc.add(new Paragraph("Executed date and time :",new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
                doc.add(new Paragraph(str_date,new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
                doc.add( Chunk.NEWLINE );
                doc.add(new Paragraph("First sequence :",new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
                doc.add(new Paragraph(first_sequence,new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
                doc.add( Chunk.NEWLINE );
                doc.add(new Paragraph("Second sequence :",new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
                doc.add(new Paragraph(second_sequence,new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
                doc.add( Chunk.NEWLINE );
                doc.add(new Paragraph("Score matrix :",new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
                doc.add(new Paragraph(str_matrix,new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
                doc.add( Chunk.NEWLINE );
                doc.add(new Paragraph("Sequence alignment :",new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));
                doc.add(new Paragraph(alignment,new Font(Font.FontFamily.HELVETICA,12.0f,Font.NORMAL,BaseColor.BLACK)));           
                doc.close();
          PrintWriter ptr = new PrintWriter (path);
          ptr.write(String.valueOf(count_loc));
          ptr.close();
          File f =new File(st);
          Desktop.getDesktop().open(f);               
        }catch( IOException | DocumentException e){              
                JOptionPane.showMessageDialog(null,"Cannot perform this action!","Warning!",
                        JOptionPane.WARNING_MESSAGE);
        }  
        }
    }//GEN-LAST:event_jButton6ActionPerformed
  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Display().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
