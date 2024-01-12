
package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;


public class InterGrafica extends javax.swing.JFrame {
    private List<JTextField> Tablero;
    
    public InterGrafica() {
        initComponents();
        this.Adv1.setVisible(false);
        this.Adv2.setVisible(false);
        this.Adv3.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JLabel();
        A1 = new javax.swing.JTextField();
        A2 = new javax.swing.JTextField();
        A3 = new javax.swing.JTextField();
        A4 = new javax.swing.JTextField();
        A5 = new javax.swing.JTextField();
        A6 = new javax.swing.JTextField();
        A7 = new javax.swing.JTextField();
        A8 = new javax.swing.JTextField();
        A9 = new javax.swing.JTextField();
        A10 = new javax.swing.JTextField();
        A11 = new javax.swing.JTextField();
        A12 = new javax.swing.JTextField();
        A13 = new javax.swing.JTextField();
        A14 = new javax.swing.JTextField();
        A15 = new javax.swing.JTextField();
        A16 = new javax.swing.JTextField();
        A17 = new javax.swing.JTextField();
        A18 = new javax.swing.JTextField();
        A19 = new javax.swing.JTextField();
        A20 = new javax.swing.JTextField();
        A21 = new javax.swing.JTextField();
        A22 = new javax.swing.JTextField();
        A23 = new javax.swing.JTextField();
        A24 = new javax.swing.JTextField();
        A25 = new javax.swing.JTextField();
        A26 = new javax.swing.JTextField();
        A27 = new javax.swing.JTextField();
        A28 = new javax.swing.JTextField();
        A29 = new javax.swing.JTextField();
        A30 = new javax.swing.JTextField();
        A31 = new javax.swing.JTextField();
        A32 = new javax.swing.JTextField();
        A33 = new javax.swing.JTextField();
        A34 = new javax.swing.JTextField();
        A35 = new javax.swing.JTextField();
        A36 = new javax.swing.JTextField();
        A37 = new javax.swing.JTextField();
        A38 = new javax.swing.JTextField();
        A39 = new javax.swing.JTextField();
        A40 = new javax.swing.JTextField();
        A41 = new javax.swing.JTextField();
        A42 = new javax.swing.JTextField();
        A43 = new javax.swing.JTextField();
        A44 = new javax.swing.JTextField();
        A45 = new javax.swing.JTextField();
        A46 = new javax.swing.JTextField();
        A47 = new javax.swing.JTextField();
        A48 = new javax.swing.JTextField();
        A49 = new javax.swing.JTextField();
        A50 = new javax.swing.JTextField();
        A51 = new javax.swing.JTextField();
        A52 = new javax.swing.JTextField();
        A53 = new javax.swing.JTextField();
        A54 = new javax.swing.JTextField();
        A55 = new javax.swing.JTextField();
        A56 = new javax.swing.JTextField();
        A57 = new javax.swing.JTextField();
        A58 = new javax.swing.JTextField();
        A59 = new javax.swing.JTextField();
        A60 = new javax.swing.JTextField();
        A61 = new javax.swing.JTextField();
        A62 = new javax.swing.JTextField();
        A63 = new javax.swing.JTextField();
        A64 = new javax.swing.JTextField();
        A65 = new javax.swing.JTextField();
        A66 = new javax.swing.JTextField();
        A67 = new javax.swing.JTextField();
        A68 = new javax.swing.JTextField();
        A69 = new javax.swing.JTextField();
        A70 = new javax.swing.JTextField();
        A71 = new javax.swing.JTextField();
        A72 = new javax.swing.JTextField();
        A73 = new javax.swing.JTextField();
        A74 = new javax.swing.JTextField();
        A75 = new javax.swing.JTextField();
        A76 = new javax.swing.JTextField();
        A77 = new javax.swing.JTextField();
        A78 = new javax.swing.JTextField();
        A79 = new javax.swing.JTextField();
        A80 = new javax.swing.JTextField();
        A81 = new javax.swing.JTextField();
        btnSolucionar1 = new javax.swing.JLabel();
        Adv3 = new javax.swing.JLabel();
        Adv1 = new javax.swing.JLabel();
        Adv2 = new javax.swing.JLabel();
        btnProblema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("RESUELVETELO");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 15, 305, -1));

        btnReiniciar.setBackground(new java.awt.Color(18, 112, 144));
        btnReiniciar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.setOpaque(true);
        btnReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReiniciarMouseClicked(evt);
            }
        });
        jPanel1.add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 155, 38));

        A1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 45, 45));

        A2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 45, 45));

        A3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 1, 1, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 45, 45));

        A4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 2, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 45, 45));

        A5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 45, 45));

        A6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 1, 1, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 45, 45));

        A7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 2, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 45, 45));

        A8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 45, 45));

        A9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A9.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 1, 1, 3, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 45, 45));

        A10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 45, 45));

        A11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 45, 45));

        A12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 45, 45));

        A13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 45, 45));

        A14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 45, 45));

        A15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A15.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 45, 45));

        A16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A16.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 45, 45));

        A17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A17.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 45, 45));

        A18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A18.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 3, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 45, 45));

        A19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A19.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 2, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 45, 45));

        A20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A20.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 45, 45));

        A21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A21.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 45, 45));

        A22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A22.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 2, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 45, 45));

        A23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A23.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 45, 45));

        A24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A24.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 45, 45));

        A25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A25.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 2, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A25, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 45, 45));

        A26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A26.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A26, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 45, 45));

        A27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A27.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 3, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A27, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 45, 45));

        A28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A28.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 3, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 45, 45));

        A29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A29.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 45, 45));

        A30.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A30.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A30, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 45, 45));

        A31.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A31.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A31, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 45, 45));

        A32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A32.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A32, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 45, 45));

        A33.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A33.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A33, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 45, 45));

        A34.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A34.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A34, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 45, 45));

        A35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A35.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A35, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 45, 45));

        A36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A36.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 3, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A36, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 45, 45));

        A37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A37.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 45, 45));

        A38.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A38.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A38, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 45, 45));

        A39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A39.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A39, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 45, 45));

        A40.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A40.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A40, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 45, 45));

        A41.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A41.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A41, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 45, 45));

        A42.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A42.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A42, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 45, 45));

        A43.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A43.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A43, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 45, 45));

        A44.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A44.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A44, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 45, 45));

        A45.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A45.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 3, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A45, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 45, 45));

        A46.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A46.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 2, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 45, 45));

        A47.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A47.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A47, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 45, 45));

        A48.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A48.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A48, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 45, 45));

        A49.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A49.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 2, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A49, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 45, 45));

        A50.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A50.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A50, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 45, 45));

        A51.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A51.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A51, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 45, 45));

        A52.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A52.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 2, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A52, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 45, 45));

        A53.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A53.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A53, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 45, 45));

        A54.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A54.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 3, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A54, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 45, 45));

        A55.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A55.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 3, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 45, 45));

        A56.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A56.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A56, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 45, 45));

        A57.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A57.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A57, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 45, 45));

        A58.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A58.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A58, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 45, 45));

        A59.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A59.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A59, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 45, 45));

        A60.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A60.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A60, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 45, 45));

        A61.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A61.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A61, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 45, 45));

        A62.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A62.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A62, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 45, 45));

        A63.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A63.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 1, 1, 3, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A63, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 45, 45));

        A64.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A64.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A64, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 45, 45));

        A65.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A65.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A65.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A65, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 45, 45));

        A66.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A66.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A66, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 45, 45));

        A67.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A67.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A67.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A67, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 45, 45));

        A68.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A68.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A68.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A68, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 45, 45));

        A69.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A69.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A69.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A69, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 45, 45));

        A70.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A70.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A70.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A70, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 45, 45));

        A71.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A71.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A71.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A71, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 45, 45));

        A72.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A72.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A72.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 3, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A72, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 45, 45));

        A73.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A73.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A73.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 3, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A73, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 45, 45));

        A74.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A74.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A74.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A74, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 45, 45));

        A75.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A75.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A75.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A75, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 45, 45));

        A76.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A76.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A76.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 3, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A76, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 45, 45));

        A77.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A77.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A77.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A77, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 45, 45));

        A78.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A78.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A78.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 2, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A78, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 45, 45));

        A79.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A79.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A79.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 3, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A79, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 45, 45));

        A80.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A80.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A80.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A80, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 45, 45));

        A81.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        A81.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        A81.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 3, new java.awt.Color(0, 142, 199)));
        jPanel1.add(A81, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 45, 45));

        btnSolucionar1.setBackground(new java.awt.Color(18, 112, 144));
        btnSolucionar1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnSolucionar1.setForeground(new java.awt.Color(255, 255, 255));
        btnSolucionar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSolucionar1.setText("Solucionar");
        btnSolucionar1.setOpaque(true);
        btnSolucionar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSolucionar1MouseClicked(evt);
            }
        });
        jPanel1.add(btnSolucionar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 155, 38));

        Adv3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Adv3.setForeground(new java.awt.Color(255, 0, 0));
        Adv3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Adv3.setText("¡Verifiquelo!");
        jPanel1.add(Adv3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 170, -1));

        Adv1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Adv1.setForeground(new java.awt.Color(255, 0, 0));
        Adv1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Adv1.setText("Ha colocado valores");
        jPanel1.add(Adv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        Adv2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Adv2.setForeground(new java.awt.Color(255, 0, 0));
        Adv2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Adv2.setText("incorrectos");
        jPanel1.add(Adv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 170, -1));

        btnProblema.setBackground(new java.awt.Color(18, 112, 144));
        btnProblema.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnProblema.setForeground(new java.awt.Color(255, 255, 255));
        btnProblema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProblema.setText("Problema de clase");
        btnProblema.setOpaque(true);
        btnProblema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProblemaMouseClicked(evt);
            }
        });
        jPanel1.add(btnProblema, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 200, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReiniciarMouseClicked
        for(JTextField campo: Tablero){
            campo.setBorder(BorderFactory.createMatteBorder(((MatteBorder)campo.getBorder()).getBorderInsets().top,
                            ((MatteBorder)campo.getBorder()).getBorderInsets().left,
                            ((MatteBorder)campo.getBorder()).getBorderInsets().bottom,
                            ((MatteBorder)campo.getBorder()).getBorderInsets().right, 
                            new java.awt.Color(0, 142, 199)));
            campo.setText("");
            campo.setForeground(Color.BLACK);
        }
        
        this.Adv1.setVisible(false);
        this.Adv2.setVisible(false);
        this.Adv3.setVisible(false);
        this.btnSolucionar1.setVisible(true);
        this.btnProblema.setVisible(true);
    }//GEN-LAST:event_btnReiniciarMouseClicked

    private void btnSolucionar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSolucionar1MouseClicked
        this.Adv1.setVisible(false);
        this.Adv2.setVisible(false);
        this.Adv3.setVisible(false);
        this.btnProblema.setVisible(false);
    }//GEN-LAST:event_btnSolucionar1MouseClicked

    private void btnProblemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProblemaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProblemaMouseClicked

    public void agregarCamposAlTablero(){
        Tablero = new ArrayList<>();
        Component[] components = this.jPanel1.getComponents();

        for (int i = 0; i < components.length; i++) {
            if (components[i] instanceof JTextField){
                Tablero.add((JTextField)components[i]);
            }
                
        }
    }
    
    class ActionCampo implements ActionListener{
        
        private int campo;
        
        ActionCampo(int campo){
            this.campo = campo;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            String text = Tablero.get(campo).getText();
            try {
                int number = Integer.parseInt(text);
                if (number > 9 || number < 0) {
                    Tablero.get(campo).setForeground(Color.RED);
                } else {
                    Tablero.get(campo).setForeground(Color.BLACK);
                }
            } catch (NumberFormatException ex) {
                // Manejar la excepción si el texto no es un número válido
                Tablero.get(campo).setForeground(Color.ORANGE);
            }
        }
        
    }
    
    
    public List<JTextField> getTablero() {
        return Tablero;
    }

    public JLabel getBtnReiniciar() {
        return btnReiniciar;
    }

    public JLabel getBtnSolucionar1() {
        return btnSolucionar1;
    }

    public JLabel getAdv1() {
        return Adv1;
    }

    public JLabel getAdv2() {
        return Adv2;
    }

    public JLabel getAdv3() {
        return Adv3;
    }

    public JLabel getBtnProblema() {
        return btnProblema;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A1;
    private javax.swing.JTextField A10;
    private javax.swing.JTextField A11;
    private javax.swing.JTextField A12;
    private javax.swing.JTextField A13;
    private javax.swing.JTextField A14;
    private javax.swing.JTextField A15;
    private javax.swing.JTextField A16;
    private javax.swing.JTextField A17;
    private javax.swing.JTextField A18;
    private javax.swing.JTextField A19;
    private javax.swing.JTextField A2;
    private javax.swing.JTextField A20;
    private javax.swing.JTextField A21;
    private javax.swing.JTextField A22;
    private javax.swing.JTextField A23;
    private javax.swing.JTextField A24;
    private javax.swing.JTextField A25;
    private javax.swing.JTextField A26;
    private javax.swing.JTextField A27;
    private javax.swing.JTextField A28;
    private javax.swing.JTextField A29;
    private javax.swing.JTextField A3;
    private javax.swing.JTextField A30;
    private javax.swing.JTextField A31;
    private javax.swing.JTextField A32;
    private javax.swing.JTextField A33;
    private javax.swing.JTextField A34;
    private javax.swing.JTextField A35;
    private javax.swing.JTextField A36;
    private javax.swing.JTextField A37;
    private javax.swing.JTextField A38;
    private javax.swing.JTextField A39;
    private javax.swing.JTextField A4;
    private javax.swing.JTextField A40;
    private javax.swing.JTextField A41;
    private javax.swing.JTextField A42;
    private javax.swing.JTextField A43;
    private javax.swing.JTextField A44;
    private javax.swing.JTextField A45;
    private javax.swing.JTextField A46;
    private javax.swing.JTextField A47;
    private javax.swing.JTextField A48;
    private javax.swing.JTextField A49;
    private javax.swing.JTextField A5;
    private javax.swing.JTextField A50;
    private javax.swing.JTextField A51;
    private javax.swing.JTextField A52;
    private javax.swing.JTextField A53;
    private javax.swing.JTextField A54;
    private javax.swing.JTextField A55;
    private javax.swing.JTextField A56;
    private javax.swing.JTextField A57;
    private javax.swing.JTextField A58;
    private javax.swing.JTextField A59;
    private javax.swing.JTextField A6;
    private javax.swing.JTextField A60;
    private javax.swing.JTextField A61;
    private javax.swing.JTextField A62;
    private javax.swing.JTextField A63;
    private javax.swing.JTextField A64;
    private javax.swing.JTextField A65;
    private javax.swing.JTextField A66;
    private javax.swing.JTextField A67;
    private javax.swing.JTextField A68;
    private javax.swing.JTextField A69;
    private javax.swing.JTextField A7;
    private javax.swing.JTextField A70;
    private javax.swing.JTextField A71;
    private javax.swing.JTextField A72;
    private javax.swing.JTextField A73;
    private javax.swing.JTextField A74;
    private javax.swing.JTextField A75;
    private javax.swing.JTextField A76;
    private javax.swing.JTextField A77;
    private javax.swing.JTextField A78;
    private javax.swing.JTextField A79;
    private javax.swing.JTextField A8;
    private javax.swing.JTextField A80;
    private javax.swing.JTextField A81;
    private javax.swing.JTextField A9;
    private javax.swing.JLabel Adv1;
    private javax.swing.JLabel Adv2;
    private javax.swing.JLabel Adv3;
    private javax.swing.JLabel btnProblema;
    private javax.swing.JLabel btnReiniciar;
    private javax.swing.JLabel btnSolucionar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}


