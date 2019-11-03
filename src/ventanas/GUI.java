package ventanas;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

public class GUI extends javax.swing.JFrame {
    PanamaHitek_Arduino ino = new PanamaHitek_Arduino();
    
    int i = 1;
    
    SerialPortEventListener listener = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            try {
                if(ino.isMessageAvailable()){
                    procedimiento(Float.parseFloat(ino.printMessage()));
                }} catch (SerialPortException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ArduinoException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
    public GUI() {
        initComponents();
        comportamiento.setLineWrap(true);
        comportamiento.setWrapStyleWord(true);
        discapacidad.setLineWrap(true);
        discapacidad.setWrapStyleWord(true);
        
        try {
            ino.arduinoRXTX("COM3",9600,listener);
        } catch (ArduinoException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        this.setLocationRelativeTo(null); //centramos ventana
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        comportamiento = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        discapacidad = new javax.swing.JTextArea();
        porcentaje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Simulacion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 90, -1));

        comportamiento.setColumns(20);
        comportamiento.setRows(5);
        jScrollPane2.setViewportView(comportamiento);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 220, 100));

        discapacidad.setColumns(20);
        discapacidad.setRows(5);
        jScrollPane1.setViewportView(discapacidad);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 220, 100));

        porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentajeActionPerformed(evt);
            }
        });
        getContentPane().add(porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 220, 90));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONCENTRACION DE ALCOHOL:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 220, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DISCAPACIDAD:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 220, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("COMPORTAMIENTO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 220, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 90, -1));

        jLabel2.setPreferredSize(new java.awt.Dimension(200, 200));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 390, 380));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Wallpaper.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_porcentajeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        switch(i){
            case 1:
                procedimiento((float) 0.36);
                i++;
                break;
            case 2:
                procedimiento((float) 0.95);
                i++;
                break;
            case 3:
                 procedimiento((float) 1.95);
                i++;
                break;
            case 4:
                procedimiento((float) 2.95);
                i++;
                break;
            case 5:
                procedimiento((float) 3.95);
                i++;
                break;
            case 6:
                procedimiento((float) 4.95);
                i++;
                break;                
            case 7:
                procedimiento((float) 5.00);
                i = 1;
                break;        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
                
            }
        });
        
    }
    
    public void procedimiento(float valor){
        String cadena = Float.toString(valor);
        ImageIcon imagen;
        Icon icono;
        if(valor <= 0.29){
            porcentaje.setText(cadena);
            comportamiento.setText("El individio promedio se ve normal");
            discapacidad.setText("Con exámenes especiales se pueden detectar algunos efectos sutiles");
            imagen = new ImageIcon("src/imagenes/010_029.png");
            icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(), Image.SCALE_DEFAULT));
            jLabel2.setIcon(icono);
            this.repaint();
        }
        if (valor >= 0.30 && valor <= 0.59 ){
            porcentaje.setText(cadena);
            comportamiento.setText("Euforia suave\n" + "Relajación\n" + "Alegría\n" + "Locuacidad\n" + "Disminución de la inhibición");
            discapacidad.setText("Concentración");
            imagen = new ImageIcon("src/imagenes/030_059.png");
            icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(), Image.SCALE_DEFAULT));
            jLabel2.setIcon(icono);
            this.repaint();            
        }
        if (valor >= 0.60 && valor <= 0.99 ){
            porcentaje.setText(cadena);
            comportamiento.setText("Sentimientos mitigados\n" + "Desinhibición\n" + "Extroversión");
            discapacidad.setText("Razonamiento\n" + "Percepción profunda\n" + "Visión periférica\n" + "Recuperación de la vista después del deslumbramiento");
            imagen = new ImageIcon("src/imagenes/060_099.png");
            icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(), Image.SCALE_DEFAULT));
            jLabel2.setIcon(icono);
            this.repaint();            
        }
        if (valor >= 1.00 && valor <= 1.99 ){
            porcentaje.setText(cadena);
            comportamiento.setText("Exceso de expresión\n" + "Vaivenes emocionales\n" + "Enojo o tristeza\n" + "Bullicio\n" + "Disminución de la libido");
            discapacidad.setText("Reflejos\n" + "Aumento del tiempo de reacción\n" + "Motricidad fina\n" + "Tambaleo, titubeo\n" + "Dificultad para hablar\n" + "Disfunción eréctil temporal\n" + "Posibilidad de intoxicación temporal");
            imagen = new ImageIcon("src/imagenes/100_199.png");
            icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(), Image.SCALE_DEFAULT));
            jLabel2.setIcon(icono);
            this.repaint();            
        }
        if (valor >= 2.00 && valor <= 2.99 ){
            porcentaje.setText(cadena);
            comportamiento.setText("Estupor\n" + "Pérdida de la comprensión\n" + "Deterioro de sensaciones\n" + "Posibilidad de caer inconsciente");
            discapacidad.setText("Deficiencia motora grave\n" + "Pérdida de la conciencia\n" + "Amnesia");
            imagen = new ImageIcon("src/imagenes/200_299.png");
            icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(), Image.SCALE_DEFAULT));
            jLabel2.setIcon(icono);
            this.repaint();            
        }
        if (valor >= 3.00 && valor <= 3.99 ){
            porcentaje.setText(cadena);
            comportamiento.setText("Depresión grave del sistema nervioso central\n" + "Pérdida del conocimiento\n" + "Posibilidad de muerte");
            discapacidad.setText("Funcionamiento de la vejiga\n" + "Hipoventilación\n" + "Desequilibrio\n" + "Bradicardia (disminución de la frecuencia cardíaca).");
            imagen = new ImageIcon("src/imagenes/300_399.png");
            icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(), Image.SCALE_DEFAULT));
            jLabel2.setIcon(icono);
            this.repaint();            
        }
        if (valor >= 4.00 && valor <= 4.99 ){
            porcentaje.setText(cadena);
            comportamiento.setText("Falta general de comportamiento\n" + "Pérdida del conocimiento\n" + "Posibilidad de muerte");
            discapacidad.setText("Respiración\n" + "Frecuencia cardíaca\n" + "Nistagmo (movimiento involuntario e incontrolable de los ojos) posicional debido al alcohol");
            imagen = new ImageIcon("src/imagenes/400_499.png");
            icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(), Image.SCALE_DEFAULT));
            jLabel2.setIcon(icono);
            this.repaint();            
        }
        if (valor >= 5.00){
            porcentaje.setText(cadena);
            comportamiento.setText("Alto riesgo de intoxicación\n" + "Posibilidad de muerte");
            discapacidad.setText("");
            imagen = new ImageIcon("src/imagenes/500.png");
            icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel2.getWidth(),jLabel2.getHeight(), Image.SCALE_DEFAULT));
            jLabel2.setIcon(icono);
            this.repaint();            
        }
    }
    
    //Metodo para poner icono a la App
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icon.png"));
        return retValue;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea comportamiento;
    private javax.swing.JTextArea discapacidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField porcentaje;
    // End of variables declaration//GEN-END:variables
}
