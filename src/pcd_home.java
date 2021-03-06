import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Cacing
 */
public class pcd_home extends javax.swing.JFrame {
    static Image image;
    static Dimension size;
    static BufferedImage prosesImage;
    static BufferedImage prosesImage3;
    static BufferedImage prosesImage2;
    static pcd_ctrl Gambar;
    //static grayscale gs_process;
    static pcd_process pcd;
    /**
     * Creates new form pcd_home
     */
    public pcd_home() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fc = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollBar2 = new javax.swing.JScrollBar();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PCD HOME");
        setResizable(false);

        jLabel1.setText("Nilai Thresholding :");

        jLabel2.setText("C :");

        jLabel3.setText("Y :");

        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("RGB -> GS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Binary");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Invers");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Invers Log");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Trans Power");

        jButton6.setText("Threshold");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("....");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Histogram");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jScrollBar1.setMaximum(50);
        jScrollBar1.setMinimum(-50);
        jScrollBar1.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        jScrollBar1.setVisibleAmount(1);

        jScrollBar2.setMaximum(50);
        jScrollBar2.setMinimum(-50);
        jScrollBar2.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        jScrollBar2.setVisibleAmount(1);

        jButton9.setText("Brightness");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Contrast");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel6.setText("Noise :");

        jTextField5.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N

        jLabel7.setText("jLabel7");

        jLabel8.setText("SNR");

        jLabel9.setText("SNR2");

        jLabel10.setText("...");

        jMenu1.setText("File");

        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Open in New Window");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem22.setText("Tester");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem22);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Grayscale");

        jMenuItem3.setText("a. x = 0.5r + 0.2g + 0.3b");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("b. x = 0.2r + 0.5g + 0.3b");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("c. x = 0.2r + 0.3g + 0.5b");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("d. x = 0.5r + 0.5g + 0b");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("e. x = 0.5r + 0g + 0.5b");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("LPF");

        jMenuItem8.setText("3x3 rata2");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("3x3 koef");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("3x3 koef2");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("HPF");

        jMenuItem11.setText("HPF 1");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("HPF 2");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Task");

        jMenuItem13.setText("5x5 P1 L2");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem13);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Noise");

        jMenuItem14.setText("Noise Uniform");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenuItem15.setText("Noise Salt & Pepper");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem15);

        jMenuItem16.setText("Noise Speckel");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem16);
        jMenu7.add(jSeparator1);

        jMenuItem18.setText("[JPG] Noise Uniform");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem18);

        jMenuItem19.setText("[JPG] Noise Salt & Pepper");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem19);

        jMenuItem20.setText("[JPG] Noise Speckel");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem20);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Reduksi Noise");

        jMenuItem17.setText("Filter Rata-rata");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem17);

        jMenuItem21.setText("Filter Rata-rata [5x5]");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem21);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField5)
                            .addComponent(jTextField6))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                            .addComponent(jScrollBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jButton4)
                        .addComponent(jButton9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int open = fc.showOpenDialog(jPanel2);
        if (open == JFileChooser.APPROVE_OPTION) {
            pcd_ctrl.setGambar(fc.getSelectedFile().getPath());
            jLabel5.setIcon(new ImageIcon(new ImageIcon(pcd_ctrl.getGambar()).getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT))); 
        }
        System.out.println(pcd_ctrl.getGambar());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int open = fc.showOpenDialog(jPanel2);
        if (open == JFileChooser.APPROVE_OPTION) {
            pcd_ctrl.setGambar(fc.getSelectedFile().getPath());
            new pcd_ctrl().start();
        }  
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel4.setIcon(new ImageIcon(new ImageIcon(pcd.get_grayscale()).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabel4.setIcon(new ImageIcon(new ImageIcon(pcd_process.get_bin()).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
        static_size();  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jLabel5.setIcon(new ImageIcon(new ImageIcon(pcd_process.get_gs_auto()).getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT)));
        jLabel4.setIcon(new ImageIcon(new ImageIcon(pcd_process.get_inv()).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
        static_size();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        pcd_ctrl.setC(Integer.parseInt(jTextField2.getText()));
        jLabel5.setIcon(new ImageIcon(new ImageIcon(pcd_process.get_gs_auto()).getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT)));
        jLabel4.setIcon(new ImageIcon(new ImageIcon(pcd_process.get_inv_log()).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (jTextField1.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Masukkan Nilai Threshold!");
        } else {
            image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
            size = new Dimension();
            size.width = image.getWidth(null);
            size.height = image.getHeight(null);
            setPreferredSize(size);  
            prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
            prosesImage3 = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
            Graphics g = prosesImage.getGraphics();
            g.drawImage(image, 0, 0, null);
            int th = Integer.parseInt(jTextField1.getText());
            int a;

            for (int x = 0; x < size.width; x++) {
                for (int y = 0; y < size.height; y++) {
                    int RGB = prosesImage.getRGB(x, y);
                    int alpha = (RGB << 24) & 0xFF;
                    int red = (RGB >> 16) >> 0xFF;
                    int green = (RGB >> 8) & 0xFF;
                    int blue = (RGB >>0) & 0xFF;
                    int avg = (red + green + blue) / 3;
                    a = (int) (256 / th);
                    avg = a * (int) (avg / a);
                    int gray = alpha | avg << 16 | avg << 8 | avg;
                    prosesImage.setRGB(x, y, gray);
                    static_size();
                }
            }
        //jLabel5.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT)));
        jLabel4.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
        static_size();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        System.out.println(jLabel5.getWidth()+" & "+ jLabel5.getHeight());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jLabel4.setIcon(new ImageIcon(new ImageIcon(pcd_process.get_gs(0.5, 0.2, 0.3)).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jLabel4.setIcon(new ImageIcon(new ImageIcon(pcd_process.get_gs(0.2, 0.5, 0.3)).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jLabel4.setIcon(new ImageIcon(new ImageIcon(pcd_process.get_gs(0.2, 0.3, 0.5)).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        jLabel4.setIcon(new ImageIcon(new ImageIcon(pcd_process.get_gs(0.5, 0.5, 0)).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        jLabel4.setIcon(new ImageIcon(new ImageIcon(pcd_process.get_gs(0.5, 0, 0.5)).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
        size = new Dimension();
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        setPreferredSize(size);  
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);

        for (int x = 0; x < size.width; x++) {
            for (int y = 0; y < size.height; y++) {
                int RGB = prosesImage.getRGB(x, y);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) & 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue = (RGB >>0) & 0xFF;
                int avg = (red + green + blue)/3;
                int gray = alpha | avg << 16 | avg << 8 | avg;
                prosesImage.setRGB(x, y, gray);
                static_size();
            }
        }
        jLabel4.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
        drawHistogram(prosesImage);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
        int add = jScrollBar2.getValue();
        size = new Dimension();
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        setPreferredSize(size);
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        prosesImage2 = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);

        for (int x = 0; x < size.width; x++){
            for (int y = 0; y < size.height; y++){
                int RGB = prosesImage.getRGB(x, y);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) & 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue = (RGB >> 0) & 0xFF;
                int avg = (red + green + blue ) / 3;
                red = red + add;
                green = green + add;
                blue = blue + add;
                if (red < 0 ){
                    red=0;
                }
                if (green < 0){
                    green=0;
                }
                if (blue < 0){
                    blue=0;
                }
                if (red > 255){
                    red=255;
                }
                if (green > 255){
                    green=255;
                }
                if (blue > 255){
                    blue=255;
                }
                int rgb2 = (alpha >> 24) | (red << 16) |(green << 8) | blue;
                prosesImage.setRGB(x, y, rgb2);
                static_size();
            }
        }
        jLabel4.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
        drawHistogram(prosesImage);
        drawHistogram();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
         image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
        int add = jScrollBar2.getValue();
        size = new Dimension();
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        setPreferredSize(size);
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        prosesImage2 = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);

        for (int x = 0; x < size.width; x++){
            for (int y = 0; y < size.height; y++){
                int RGB = prosesImage.getRGB(x, y);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) & 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue = (RGB >> 0) & 0xFF;
                int avg = (red + green + blue ) / 3;
                red = red * add;
                green = green * add;
                blue = blue * add;
                if (red < 0 ){
                    red=0;
                }
                if (green < 0){
                    green=0;
                }
                if (blue < 0){
                    blue=0;
                }
                if (red > 255){
                    red=255;
                }
                if (green > 255){
                    green=255;
                }
                if (blue > 255){
                    blue=255;
                }
                int rgb2 = (alpha >> 24) | (red << 16) |(green << 8) | blue;
                prosesImage.setRGB(x, y, rgb2);
                static_size();
            }
        }
        jLabel4.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
        drawHistogram(prosesImage);
        drawHistogram();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
        size = new Dimension();
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        setPreferredSize(size);
        prosesImage3 = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        for (int x = 0; x < size.width; x++) {
            for (int y = 0; y < size.height; y++) {
                int RGB = prosesImage.getRGB(x, y);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) & 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue =(RGB >> 0) & 0xFF;
                int avg = (red + green + blue) / 3;
                int gray = alpha | avg << 16 | avg << 8 | avg;
                prosesImage.setRGB(x, y, gray);
                static_size();
            }
        }
        
        for (int v = 1; v <= size.height - 2; v++) {
            for (int u = 1; u <= size.width - 2; u++) {
                int sum = 0;
                int temp = 0;
                for (int j = -1; j <= 1; j++) {
                    for (int i = -1; i <= 1; i++) {
                        int RGB = prosesImage.getRGB(u + i, v + j);
                        int alpha = (RGB << 24) & 0xFF;
                        int red = (RGB >> 16) & 0xFF;
                        temp = alpha;
                        sum = sum + red;
                    }
                }
                int q = (int) Math.round(sum / 9.0);
                int gray2 = temp | q << 16 | q << 8 | q;
                prosesImage3.setRGB(u, v, gray2);
                static_size();
            }
        }
        jLabel5.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT)));
        jLabel4.setIcon(new ImageIcon(new ImageIcon(prosesImage3).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
        size = new Dimension();
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        setPreferredSize(size);
        prosesImage3 = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        double filter[][] = {
            {0.075, 0.125, 0.075},
            {0.125, 0.200, 0.125},
            {0.075, 0.125, 0.075}
        };
        
        for (int x = 0; x < size.width; x++) {
            for (int y = 0; y < size.height; y++) {
                int RGB = prosesImage.getRGB(x, y);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) & 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue =(RGB >> 0) & 0xFF;
                int avg = (red + green + blue) / 3;
                int gray = alpha | avg << 16 | avg << 8 | avg;
                prosesImage.setRGB(x, y, gray);
                static_size();
            }
        }
        
        for (int v = 1; v <= size.height - 2; v++) {
            for (int u = 1; u <= size.width - 2; u++) {
                int sum = 0;
                int temp = 0;
                for (int j = -1; j <= 1; j++) {
                    for (int i = -1; i <= 1; i++) {
                        int RGB = prosesImage.getRGB(u + i, v + j);
                        int alpha = (RGB << 24) & 0xFF;
                        int red = (RGB >> 16) & 0xFF;
                        temp = alpha;
                        double c = filter[j + 1][i + 1];
                        sum =(int) (sum + c * red);
                    }
                }
                int q = (int) Math.round(sum);
                int gray2 = temp | q << 16 | q << 8 | q;
                prosesImage3.setRGB(u, v, gray2);
                static_size();
            }
        }
        jLabel5.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT)));
        jLabel4.setIcon(new ImageIcon(new ImageIcon(prosesImage3).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));     
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
         image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
        size = new Dimension();
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        setPreferredSize(size);
        prosesImage3 = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        double filter[][] = {
            {1, 1, 1},
            {1, 4, 1},
            {1, 1, 1}
        };
        
        for (int x = 0; x < size.width; x++) {
            for (int y = 0; y < size.height; y++) {
                int RGB = prosesImage.getRGB(x, y);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) & 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue =(RGB >> 0) & 0xFF;
                int avg = (red + green + blue) / 3;
                int gray = alpha | avg << 16 | avg << 8 | avg;
                prosesImage.setRGB(x, y, gray);
                static_size();
            }
        }
        
        for (int v = 1; v <= size.height - 2; v++) {
            for (int u = 1; u <= size.width - 2; u++) {
                int sum = 0;
                int temp = 0;
                for (int j = -1; j <= 1; j++) {
                    for (int i = -1; i <= 1; i++) {
                        int RGB = prosesImage.getRGB(u + i, v + j);
                        int alpha = (RGB << 24) & 0xFF;
                        int red = (RGB >> 16) & 0xFF;
                        temp = alpha;
                        double c = filter[j + 1][i + 1];
                        sum =(int) (sum + c * red);
                    }
                }
                int q = (int) Math.round(sum/12);
                int gray2 = temp | q << 16 | q << 8 | q;
                prosesImage3.setRGB(u, v, gray2);
                static_size();
            }
        }
        jLabel5.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT)));
        jLabel4.setIcon(new ImageIcon(new ImageIcon(prosesImage3).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
         image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
        size = new Dimension();
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        setPreferredSize(size);
        prosesImage3 = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        double filter[][] = {
            {0, -1, 0},
            {-1, 5, -1},
            {0, -1, 0}
        };
        
        for (int x = 0; x < size.width; x++) {
            for (int y = 0; y < size.height; y++) {
                int RGB = prosesImage.getRGB(x, y);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) & 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue =(RGB >> 0) & 0xFF;
                int avg = (red + green + blue) / 3;
                int gray = alpha | avg << 16 | avg << 8 | avg;
                prosesImage.setRGB(x, y, gray);
                static_size();
            }
        }
        
        for (int v = 1; v <= size.height - 2; v++) {
            for (int u = 1; u <= size.width - 2; u++) {
                int sum = 0;
                int temp = 0;
                for (int j = -1; j <= 1; j++) {
                    for (int i = -1; i <= 1; i++) {
                        int RGB = prosesImage.getRGB(u + i, v + j);
                        int alpha = (RGB << 24) & 0xFF;
                        int red = (RGB >> 16) & 0xFF;
                        temp = alpha;
                        double c = filter[j + 1][i + 1];
                        sum =(int) (sum + c * red);
                    }
                }
                int q = (int) Math.round(sum);
                int gray2 = temp | q << 16 | q << 8 | q;
                prosesImage3.setRGB(u, v, gray2);
                static_size();
            }
        }
        jLabel5.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT)));
        jLabel4.setIcon(new ImageIcon(new ImageIcon(prosesImage3).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));     
    
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
         image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
        size = new Dimension();
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        setPreferredSize(size);
        prosesImage3 = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        double filter[][] = {
            {0, -1, 0},
            {-1, 4, -1},
            {0, -1, 0}
        };
        
        for (int x = 0; x < size.width; x++) {
            for (int y = 0; y < size.height; y++) {
                int RGB = prosesImage.getRGB(x, y);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) & 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue =(RGB >> 0) & 0xFF;
                int avg = (red + green + blue) / 3;
                int gray = alpha | avg << 16 | avg << 8 | avg;
                prosesImage.setRGB(x, y, gray);
                static_size();
            }
        }
        
        for (int v = 1; v <= size.height - 2; v++) {
            for (int u = 1; u <= size.width - 2; u++) {
                int sum = 0;
                int temp = 0;
                for (int j = -1; j <= 1; j++) {
                    for (int i = -1; i <= 1; i++) {
                        int RGB = prosesImage.getRGB(u + i, v + j);
                        int alpha = (RGB << 24) & 0xFF;
                        int red = (RGB >> 16) & 0xFF;
                        temp = alpha;
                        double c = filter[j + 1][i + 1];
                        sum =(int) (sum + c * red);
                    }
                }
                int q = (int) Math.round(sum);
                int gray2 = temp | q << 16 | q << 8 | q;
                prosesImage3.setRGB(u, v, gray2);
                
            }
        }
        static_size();
        jLabel5.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT)));
        jLabel4.setIcon(new ImageIcon(new ImageIcon(prosesImage3).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));     
    
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        image = new ImageIcon(pcd_ctrl.getGambar()).getImage();
        size = new Dimension();
        size.width = image.getWidth(null);
        size.height = image.getHeight(null);
        setPreferredSize(size);
        prosesImage3 = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        prosesImage = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics g = prosesImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        
        for (int x = 0; x < size.width; x++) {
            for (int y = 0; y < size.height; y++) {
                int RGB = prosesImage.getRGB(x, y);
                int alpha = (RGB << 24) & 0xFF;
                int red = (RGB >> 16) & 0xFF;
                int green = (RGB >> 8) & 0xFF;
                int blue =(RGB >> 0) & 0xFF;
                int avg = (red + green + blue) / 3;
                int gray = alpha | avg << 16 | avg << 8 | avg;
                prosesImage.setRGB(x, y, gray);
                static_size();
            }
        }
        
        for (int v = 1; v <= size.height - 4; v++) {
            for (int u = 1; u <= size.width - 4; u++) {
                int sum = 0;
                int temp = 0;
                for (int j = -1; j <= 3; j++) {
                    for (int i = -1; i <= 3; i++) {
                        int RGB = prosesImage.getRGB(u + i, v + j);
                        int alpha = (RGB << 24) & 0xFF;
                        int red = (RGB >> 16) & 0xFF;
                        temp = alpha;
                        sum = sum + red;
                    }
                }
                int q = (int) Math.round(sum / 25.0);
                int gray2 = temp | q << 16 | q << 8 | q;
                prosesImage3.setRGB(u, v, gray2);
                static_size();
            }
        }
        jLabel5.setIcon(new ImageIcon(new ImageIcon(prosesImage).getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_DEFAULT)));
        jLabel4.setIcon(new ImageIcon(new ImageIcon(prosesImage3).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));     
    
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        pcd_ctrl.setNoise(Double.parseDouble(jTextField4.getText()));
        jLabel4.setIcon(new ImageIcon(new ImageIcon(pcd_process.get_noise_uniform()).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
        pcd_process.saveImg_png(pcd_filter.prosesImage, "Noise_Uniform.png");
        static_size();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        pcd_ctrl.setNoise(Double.parseDouble(jTextField4.getText()));
        jLabel4.setIcon(new ImageIcon(new ImageIcon(pcd_process.get_noise_salt_pepper()).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
        pcd_process.saveImg_png(pcd_filter.prosesImage, "Noise_Salt_Pepper.png");
        static_size();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        pcd_ctrl.setNoise(Double.parseDouble(jTextField4.getText()));
        jLabel4.setIcon(new ImageIcon(new ImageIcon(pcd_process.get_noise_speckel()).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
        pcd_process.saveImg_png(pcd_filter.prosesImage, "Noise_speckel.png");
        static_size();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        pcd_ctrl.setNoise(Double.parseDouble(jTextField4.getText()));
        pcd_ctrl.set_noise_reduc(pcd_process.get_noise_reduct(3));
        new pcd_ctrl().noise_reduc();
        jTextField5.setText(Double.toString(pcd_filter.getSnr()));
        jTextField6.setText(Double.toString(pcd_filter.getSnr2()));
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        pcd_ctrl.setNoise(Double.parseDouble(jTextField4.getText()));
        jLabel4.setIcon(new ImageIcon(new ImageIcon(pcd_process.get_noise_uniform()).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
        pcd_process.saveImg_jpg(pcd_filter.prosesImage, "Noise_Uniform.jpg");
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        pcd_ctrl.setNoise(Double.parseDouble(jTextField4.getText()));
        jLabel4.setIcon(new ImageIcon(new ImageIcon(pcd_process.get_noise_salt_pepper()).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
        pcd_process.saveImg_jpg(pcd_filter.prosesImage, "Noise_Salt_Pepper.jpg");
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        pcd_ctrl.setNoise(Double.parseDouble(jTextField4.getText()));
        jLabel4.setIcon(new ImageIcon(new ImageIcon(pcd_process.get_noise_speckel()).getImage().getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_DEFAULT)));
        pcd_process.saveImg_jpg(pcd_filter.prosesImage, "Noise_speckel.jpg");
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        pcd_ctrl.setNoise(Double.parseDouble(jTextField4.getText()));
        pcd_ctrl.set_noise_reduc(pcd_process.get_noise_reduct(5));
        new pcd_ctrl().noise_reduc();
        jTextField5.setText(Double.toString(pcd_filter.getSnr()));
        jTextField6.setText(Double.toString(pcd_filter.getSnr2()));
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        pcd_ctrl.setNoise(Double.parseDouble(jTextField4.getText()));
        pcd_ctrl.set_noise_reduc(pcd_process.get_noise_reduct(3));
        new pcd_ctrl().noise_reduc();
        jTextField5.setText(Double.toString(pcd_filter.getSnr()));
        jTextField6.setText(Double.toString(pcd_filter.getSnr2()));
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void static_size(){
        if (jLabel4.getWidth() >= 370) {
            jLabel4.setSize(370, 270);
            jLabel5.setSize(370, 270);
        }
    }
    
    public void drawHistogram(BufferedImage test){
        int width = test.getWidth();
        int height = test.getHeight();
        int count[][] = new int[4][0x100];
        int RED = 0;
        int BLUE = 1;
        int GREEN = 2;
        int total = width * height;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int color = test.getRGB(i, j);
                int cRed = (color & 0x00ff0000) >> 16;
                int cGreen = (color & 0x0000ff00) >> 8;
                int cBlue = color & 0x000000ff;
                int gry = (cRed + cGreen + cBlue)/3;
                count[RED][cRed]++;
                count[GREEN][cGreen]++;
                count[BLUE][cGreen]++;
                count[3][gry]++;
                //System.out.println(count[i][j]);
            }
        }
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for (int f = 0; f < 0x100; f++) {
            dataset.addValue(count[0][f], "Red" , new Integer(f));
            dataset.addValue(count[1][f], "Green", new Integer(f));
            dataset.addValue(count[2][f], "Blue" , new Integer(f));
            dataset.addValue(count[3][f], "Black", new Integer(f));
        }
        
        try {
            JFreeChart chart = ChartFactory.createBarChart("Histogram RGB", "Nilai", "Frekuensi", dataset,PlotOrientation.VERTICAL,false,true,false);
            ChartFrame frame = new ChartFrame("Lihat Histogram", chart);
            chart.setBackgroundPaint(Color.WHITE);
            final CategoryPlot plot = (CategoryPlot) chart.getPlot();
            plot.setBackgroundPaint(Color.WHITE);
            plot.setRangeGridlinePaint(Color.RED);
            frame.setSize(500, 350);
            frame.setVisible(true);
            frame.setLocation(380, 200);
            frame.setTitle(pcd_ctrl.getGambar());
            String status = frame.getTitle();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void drawHistogram(){
        BufferedImage test2 = null ;
        try {
            test2 = ImageIO.read(new File(pcd_ctrl.getGambar()));
        } catch (Exception e) {
            System.out.println(e);
        }
        int width = test2.getWidth();
        int height = test2.getHeight();
        int count[][] = new int[4][0x100];
        int RED = 0;
        int BLUE = 1;
        int GREEN = 2;
        int total = width * height;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int color = test2.getRGB(i, j);
                int cRed = (color & 0x00ff0000) >> 16;
                int cGreen = (color & 0x0000ff00) >> 8;
                int cBlue = color & 0x000000ff;
                int gry = (cRed + cGreen + cBlue)/3;
                count[RED][cRed]++;
                count[GREEN][cGreen]++;
                count[BLUE][cGreen]++;
                count[3][gry]++;
                //System.out.println(count[i][j]);
            }
        }
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for (int f = 0; f < 0x100; f++) {
            dataset.addValue(count[0][f], "Red" , new Integer(f));
            dataset.addValue(count[1][f], "Green", new Integer(f));
            dataset.addValue(count[2][f], "Blue" , new Integer(f));
            dataset.addValue(count[3][f], "Black", new Integer(f));
        }
        
        try {
            JFreeChart chart = ChartFactory.createBarChart("Histogram RGB", "Nilai", "Frekuensi", dataset,PlotOrientation.VERTICAL,false,true,false);
            ChartFrame frame = new ChartFrame("Lihat Histogram", chart);
            chart.setBackgroundPaint(Color.WHITE);
            final CategoryPlot plot = (CategoryPlot) chart.getPlot();
            plot.setBackgroundPaint(Color.WHITE);
            plot.setRangeGridlinePaint(Color.RED);
            frame.setSize(500, 350);
            frame.setVisible(true);
            frame.setLocation(380, 200);
            frame.setTitle(pcd_ctrl.getGambar());
            String status = frame.getTitle();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ((("Windows".equals(info.getName()))||("GTK+".equals(info.getName())))) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pcd_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pcd_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pcd_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pcd_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new pcd_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
