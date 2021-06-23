package com.mycompany.gui_pairwise_sequence_alignment;
import com.mongodb.BasicDBObject;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import javax.swing.JOptionPane;

public class LocalProcess extends javax.swing.JFrame {
    private char[] first_sequence;
    private char[] second_sequence;
    private int[][] direction;
    private double[][] matrix;
    private final double match=1;
    private final double miss_match=-1;
    private final double penalty=-1;
    private String alignment;
    private String str_date;
    private String str_matrix;
    
    public LocalProcess() {
        super( "Pairwise Sequence Alignment" );
        initComponents();
    }
    public LocalProcess(char[] first_sequence, char[] second_sequence) {  
        super( "Pairwise Sequence Alignment" );
        this.first_sequence=first_sequence;
        this.second_sequence=second_sequence;        
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
        str_date = dateFormat.format(date);  
        initComponents();       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().
            getImage("F:\\netbeans\\applications\\gui pairwise sequence alignment\\gui_pairwise_sequence_alignment\\src\\main\\java\\com\\mycompany\\gui_pairwise_sequence_alignment\\icon.png"));
        setResizable(false);

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

        jButton3.setBackground(new java.awt.Color(51, 153, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Local Alignment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 0));
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

        jButton6.setBackground(new java.awt.Color(51, 153, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 51));
        jButton6.setText("Save");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Local sequence alignment");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Executed date and time : "+str_date);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Score matrix of the local alignment :");

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText(new String(print_local_matrix()));
        jScrollPane7.setViewportView(jTextArea1);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea2.setRows(5);
        jTextArea2.setText(new String(sequence_local()));
        jScrollPane1.setViewportView(jTextArea2);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Sequence Alignment");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(257, 257, 257)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
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

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Search().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new LocalAlignment(new String(first_sequence),new String(second_sequence)).setVisible(true);          
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed
    protected void initialize_local_matrix() {
        matrix = new double[first_sequence.length + 1][second_sequence.length + 1];
        for (int i = 0; i < first_sequence.length + 1; i++) {
            for (int j = 0; j < second_sequence.length + 1; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    protected void initialize_local_direction() {
        direction = new int[first_sequence.length + 1][second_sequence.length + 1];
        for (int i = 0; i < first_sequence.length + 1; i++) {
            for (int j = 0; j < second_sequence.length + 1; j++) {
                direction[i][j] = 0;
            }
        }
    }

    protected void algorithm_local_matrix() {
       initialize_local_matrix();
       initialize_local_direction();
        double diagonal, left, top;
        for (int i = 1; i < first_sequence.length + 1; i++) {
            for (int j = 1; j < second_sequence.length + 1; j++) {
                if (first_sequence[i - 1] == second_sequence[j - 1])
                    diagonal = matrix[i - 1][j - 1] + match;
                else
                    diagonal = matrix[i - 1][j - 1] + miss_match;
                left = matrix[i][j - 1] + penalty;
                top = matrix[i - 1][j] + penalty;
                if (max_local_cell(diagonal, left, top) < 0)
                    matrix[i][j] = 0;
                else
                    matrix[i][j] = max_local_cell(diagonal, left, top);
                if(matrix[i][j] == 0)
                    direction[i][j]=0;
                else if (matrix[i][j] == diagonal)
                    direction[i][j] = 1;
                else if(matrix[i][j] == left)
                    direction[i][j] = 2;
                else
                    direction[i][j] = 3;
            }
        }
    }
    protected double[] max_local_matrix() {
        double[] mat = new double[3];
        double max = Double.MIN_VALUE;
        for (int row = matrix.length-1; row >=0 ; row--) {
            for (int col = matrix[row].length-1; col >=0 ; col--) {
                if (matrix[row][col] > max) {
                    max=matrix[row][col];
                    mat[0] = matrix[row][col];
                    mat[1] =row;
                    mat[2]=col;
                }
            }
        }
        return mat;
    }
    private String print_local_matrix() {   
        algorithm_local_matrix();
        String pdf="";
        for (double[] matrix1 : matrix) {
            for (int j = 0; j<matrix[0].length; j++) {
                pdf =  pdf+"  |  "+String.valueOf(matrix1[j]) ;
            }
            pdf = pdf +"  |  "+"\n" ;
        }
        str_matrix=pdf;
        return str_matrix;
    }
    protected String sequence_local() {
        if(max_local_matrix()[0]==0){
            alignment="Warnning! Cannot perform local alignment!";
        }                 
        else {
            List<char[]> sequence = new ArrayList<>();
            int b = 0;
            char top;
            char mid;
            char bottom;
            int row = (int) max_local_matrix()[1];
            int col = (int) max_local_matrix()[2];           
            while (direction[row][col] != 0) {
                switch (direction[row][col]) {
                    case 1:
                        top = first_sequence[row - 1];
                        mid = '|';
                        bottom = second_sequence[col - 1];
                        row = row - 1;
                        col = col - 1;
                        break;
                    case 2:
                        top = '_';
                        mid = ' ';
                        bottom = second_sequence[col - 1];
                        col = col - 1;
                        break;
                    default:
                        top = first_sequence[row - 1];
                        mid = ' ';
                        bottom = '_';
                        row = row - 1;
                        break;
                }
                sequence.add(new char[]{top, mid, bottom});
                b = b + 1;
            }       
        String pdf1="";
        //String pdf2="";
        String pdf3="";
        for (int j = b - 1; j >= 0; j--) {
                pdf1=pdf1+String.valueOf(sequence.get(j)[0]);
            } 
        /*for (int j = b - 1; j >= 0; j--) {
                pdf2=pdf2+String.valueOf(sequence.get(j)[1]);
            } */
        for (int j = b - 1; j >= 0; j--) {
                pdf3=pdf3+String.valueOf(sequence.get(j)[2]);
            }
        alignment=pdf1+"\n"+pdf3;
        }
        return alignment;
    }
    protected double max_local_cell(double diagonal, double left, double top) {
        return Math.max(Math.max(diagonal, left), top);
    }
    @SuppressWarnings("empty-statement")
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      try{
        BasicDBObject doc = new BasicDBObject();;
        doc.put("date_time", str_date);
        doc.put("type", "Local sequence alignment");
        doc.put("seq1", new String(first_sequence));
        doc.put("seq2", new String(second_sequence));
        doc.put("score_matrix", str_matrix);
        doc.put("align", alignment);   
      Connector.con.insert(doc);
      JOptionPane.showMessageDialog(null,"Saved the data in to the database!"); 
      }
      catch(NullPointerException e){
         JOptionPane.showMessageDialog(null,"An error occured while connecting to the database!","Error",
                        JOptionPane.ERROR_MESSAGE); 
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
            java.util.logging.Logger.getLogger(LocalProcess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new LocalProcess().setVisible(true);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
