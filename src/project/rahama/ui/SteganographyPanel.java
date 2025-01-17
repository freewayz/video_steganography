/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project.rahama.ui;

import java.awt.Graphics;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import project.rahama.VideoPlayer;
import project.rahama.model.SteganographyModel;

/**
 *
 * @author root
 */
public class SteganographyPanel extends javax.swing.JPanel {

    private SteganographyModel sm = new SteganographyModel();

    /**
     * Creates new form SteganographyPanel
     */
    public SteganographyPanel() {
        initComponents();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/app_bg.png"));
        g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        file_chooser = new javax.swing.JFileChooser();
        panel_help = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btn_about = new javax.swing.JButton();
        panel_embeding_area = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_clear_msg = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_message = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btn_hide_info = new javax.swing.JButton();
        btn_open_video = new javax.swing.JButton();
        panel_configuration = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_key = new javax.swing.JTextField();
        btn_genrate_random_key = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_ouput_f_name = new javax.swing.JTextField();
        btn_output_file = new javax.swing.JButton();
        panel_retrieving_area = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_retrive_msg = new javax.swing.JTextArea();
        btn_clear_reveal_message = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_reveal_info = new javax.swing.JButton();
        btn_embed_file = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_file_name = new javax.swing.JTextField();
        progress_bar = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        btn_play = new javax.swing.JButton();

        file_chooser.setCurrentDirectory(new java.io.File("C:\\Users\\root\\Documents\\NetBeansProjects\\RahamaProject"));

        setOpaque(false);

        panel_help.setOpaque(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/help.png"))); // NOI18N
        jButton2.setText("HELP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpManual(evt);
            }
        });

        btn_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/about.png"))); // NOI18N
        btn_about.setText("ABOUT");
        btn_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_actionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_helpLayout = new javax.swing.GroupLayout(panel_help);
        panel_help.setLayout(panel_helpLayout);
        panel_helpLayout.setHorizontalGroup(
            panel_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_helpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_about, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_helpLayout.setVerticalGroup(
            panel_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_helpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton2)
                .addComponent(btn_about))
        );

        panel_embeding_area.setBackground(new java.awt.Color(154, 154, 154));
        panel_embeding_area.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encrypting Side", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Perpetua Titling MT", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setText("ENTER THE MESSAGE TO HIDE");

        btn_clear_msg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit_clear.png"))); // NOI18N
        btn_clear_msg.setBorderPainted(false);
        btn_clear_msg.setDoubleBuffered(true);
        btn_clear_msg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear_msgActionPerformed(evt);
            }
        });

        txt_message.setColumns(20);
        txt_message.setLineWrap(true);
        txt_message.setRows(5);
        jScrollPane1.setViewportView(txt_message);

        jPanel2.setOpaque(false);

        btn_hide_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/embed.png"))); // NOI18N
        btn_hide_info.setText("Hide Information");
        btn_hide_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hide_infoActionPerformed(evt);
            }
        });

        btn_open_video.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/opn_file.png"))); // NOI18N
        btn_open_video.setText("Open a Video");
        btn_open_video.setOpaque(false);
        btn_open_video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_open_videoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_hide_info)
                .addGap(18, 18, 18)
                .addComponent(btn_open_video)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_hide_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_open_video, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_embeding_areaLayout = new javax.swing.GroupLayout(panel_embeding_area);
        panel_embeding_area.setLayout(panel_embeding_areaLayout);
        panel_embeding_areaLayout.setHorizontalGroup(
            panel_embeding_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_embeding_areaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_embeding_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panel_embeding_areaLayout.createSequentialGroup()
                        .addGroup(panel_embeding_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_embeding_areaLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_clear_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_embeding_areaLayout.setVerticalGroup(
            panel_embeding_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_embeding_areaLayout.createSequentialGroup()
                .addGroup(panel_embeding_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_embeding_areaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
                    .addComponent(btn_clear_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        panel_configuration.setOpaque(false);
        panel_configuration.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("OR");

        btn_genrate_random_key.setText("Generate Key");
        btn_genrate_random_key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/key.png"))); // NOI18N
        jLabel3.setText(" KEY ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("OUTPUT FILE NAME");

        btn_output_file.setText("Output");
        btn_output_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenOutputFile(evt);
            }
        });

        javax.swing.GroupLayout panel_configurationLayout = new javax.swing.GroupLayout(panel_configuration);
        panel_configuration.setLayout(panel_configurationLayout);
        panel_configurationLayout.setHorizontalGroup(
            panel_configurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_configurationLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panel_configurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGroup(panel_configurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_configurationLayout.createSequentialGroup()
                        .addComponent(txt_key, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_configurationLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(txt_ouput_f_name, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panel_configurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_configurationLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_genrate_random_key))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_configurationLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btn_output_file, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_configurationLayout.setVerticalGroup(
            panel_configurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_configurationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_configurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_key, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btn_genrate_random_key, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_configurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txt_ouput_f_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_output_file, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        panel_retrieving_area.setBackground(new java.awt.Color(154, 154, 154));
        panel_retrieving_area.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RETRIVE HIDDEN INFORMATION", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Perpetua Titling MT", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setText("HIDDEN MESSAGE");

        txt_retrive_msg.setColumns(20);
        txt_retrive_msg.setLineWrap(true);
        txt_retrive_msg.setRows(5);
        jScrollPane2.setViewportView(txt_retrive_msg);

        btn_clear_reveal_message.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit_clear.png"))); // NOI18N
        btn_clear_reveal_message.setToolTipText("Wipe Message");
        btn_clear_reveal_message.setDoubleBuffered(true);
        btn_clear_reveal_message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearRevealMessage(evt);
            }
        });

        jPanel3.setOpaque(false);

        btn_reveal_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/retrieve.png"))); // NOI18N
        btn_reveal_info.setText("Reveal Information");
        btn_reveal_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reveal_infoActionPerformed(evt);
            }
        });

        btn_embed_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/opn_file.png"))); // NOI18N
        btn_embed_file.setText("EmbedFile");
        btn_embed_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_embed_fileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_reveal_info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_embed_file, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reveal_info)
                    .addComponent(btn_embed_file))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_retrieving_areaLayout = new javax.swing.GroupLayout(panel_retrieving_area);
        panel_retrieving_area.setLayout(panel_retrieving_areaLayout);
        panel_retrieving_areaLayout.setHorizontalGroup(
            panel_retrieving_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_retrieving_areaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_retrieving_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(panel_retrieving_areaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_clear_reveal_message, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panel_retrieving_areaLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panel_retrieving_areaLayout.setVerticalGroup(
            panel_retrieving_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_retrieving_areaLayout.createSequentialGroup()
                .addGroup(panel_retrieving_areaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_retrieving_areaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(btn_clear_reveal_message, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setOpaque(false);

        txt_file_name.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progress_bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_file_name))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_file_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progress_bar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo.jpg"))); // NOI18N

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exit.png"))); // NOI18N
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitApp(evt);
            }
        });

        btn_play.setText("Play");
        btn_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayVideo(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(panel_help, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_embeding_area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_configuration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel_retrieving_area, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_play)
                        .addGap(66, 66, 66)
                        .addComponent(btn_exit)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(panel_configuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_embeding_area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_retrieving_area, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_help, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hide_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hide_infoActionPerformed
        // TODO add your handling code here:

        String key = txt_key.getText();
        String outputFile = txt_ouput_f_name.getText();

        try {
            if (key.trim().equalsIgnoreCase("")) {
                displayInfo("Please insert key");

                txt_key.setFocusable(true);
                return;
            }
            if (outputFile.trim().equalsIgnoreCase("")) {
                displayInfo("Please enter the ouput file name");
                txt_ouput_f_name.setFocusable(true);
                return;
            }
            if (!(outputFile.endsWith(".flv"))) {
                displayInfo("Please output file must ends with .flv");

            } else {
                int keyValue = Integer.parseInt(key);
//                    long keyValue = Long.decode(key);
                
                sm.setEmbededFilename(outputFile.trim());
                sm.embedFile(txt_message.getText(), sm.getTemporaryFile(), keyValue);
                JOptionPane.showMessageDialog(this, "Password is " + keyValue + "\nThe Video name is " + outputFile , 
                        "Embeded Successfully", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ERROR) {
            displayInfo("Error embding the file");
        }


    }//GEN-LAST:event_btn_hide_infoActionPerformed

    private void btn_open_videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_open_videoActionPerformed
        // TODO add your handling code here:
        String name = "";
        int openfiledailog = file_chooser.showOpenDialog(this);
        sm.setTemporaryFile(file_chooser.getSelectedFile());

        //check if the user closes the dailog without chooosing any file
        if (openfiledailog == JFileChooser.CANCEL_OPTION) {
            displayInfo("No File Selected!!!");
        } else {
            //set the open filename 
            sm.setFileName(sm.getTemporaryFile().getName());

            name = sm.getFileName();

            if (!(name.endsWith(".flv"))) {
                displayInfo("Please only flv videos!!!");
            } else {
                txt_file_name.setText(name);

            }

        }
    }//GEN-LAST:event_btn_open_videoActionPerformed

    private void btn_clear_msgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clear_msgActionPerformed
        // TODO add your handling code here:
        txt_message.setText(" ");
    }//GEN-LAST:event_btn_clear_msgActionPerformed

    private void btn_reveal_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reveal_infoActionPerformed
        // TODO add your handling code here:
        String userKey = txt_key.getText();

        try {
            if (userKey.equalsIgnoreCase("") && userKey.trim().equals("")) {
                displayInfo("Please enter key to retreive message");
                txt_key.setFocusable(true);
            } else {

                int key = Integer.parseInt(userKey);
//                long key = Long.decode(userKey);
                sm.retriveFile(sm.getTemporaryFile(), key);
                txt_retrive_msg.setText(" ");
                txt_retrive_msg.setText(sm.getDecryptedMessage());
            }
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }

    }//GEN-LAST:event_btn_reveal_infoActionPerformed

    private void btn_embed_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_embed_fileActionPerformed
        // TODO add your handling code here:
        btn_open_videoActionPerformed(evt);

        sm.setEmbededFilename(txt_file_name.getText());
    }//GEN-LAST:event_btn_embed_fileActionPerformed

    
    
    private void about_actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_actionPerformed
        // TODO add your handling code here:
        String about_the_program
                = "Developed by Rahama Ahmed Abubarka\n"
                + "BUK 2015, Final Project";

        JOptionPane.showMessageDialog(this, about_the_program, "ABOUT", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_about_actionPerformed

    private void exitApp(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitApp
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitApp

    private void helpManual(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpManual
        // TODO add your handling code here:
        String helpUser = "\t\tEMBEDING INFORMATION\n\n"
                + "1. Select the video you want to use\n"
                + "2. The video must be in FLV format\n"
                + "3. Type the output file information in \nthe TextBox for output filename\n"
                + "4. The filename must have a .flv extension\n"
                + "5. Enter the password used for encryption\n"
                + "6. Click on Hide Information  Button\n\n"
                + "\t\tREVEALING AN INFORMATION\n"
                + "1. Open the hidden file video\n"
                + "2. Enter the key used for encryption\n"
                + "3 Click the Reveal Info Button";

        JOptionPane.showMessageDialog(this, helpUser, "HELP", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_helpManual

    private void clearRevealMessage(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearRevealMessage
        // TODO add your handling code here:
        txt_retrive_msg.setText("");
    }//GEN-LAST:event_clearRevealMessage

    private void btnOpenOutputFile(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenOutputFile
        // TODO add your handling code here:
        openFile();
    }//GEN-LAST:event_btnOpenOutputFile

    private void btnPlayVideo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayVideo
        // TODO add your handling code here:
         SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VideoPlayer(sm.getFileName()).initAndShowGUI();
            }
        });
    }//GEN-LAST:event_btnPlayVideo

    private void btngenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerateActionPerformed
        // TODO add your handling code here:
        Random r = new Random();
        int numb = r.nextInt(3700) + 1000;
        txt_key.setText(String.valueOf(numb));
    }//GEN-LAST:event_btngenerateActionPerformed

    
    
    
    
    void openFile(){
        String name = "";
        int openfiledailog = file_chooser.showOpenDialog(this);

        //check if the user closes the dailog without chooosing any file
        if (openfiledailog == JFileChooser.CANCEL_OPTION) {
            displayInfo("No File Selected!!!");
        } else {
            

            name = file_chooser.getSelectedFile().getName();

            if (!(name.endsWith(".flv"))) {
                displayInfo("Please only flv videos!!!");
            } else {
                txt_ouput_f_name.setText(name);

            }

        }
    }
    private void displayInfo(String messageToDisplay) {
        JOptionPane.showMessageDialog(this, messageToDisplay, "WARNING!!!", JOptionPane.ERROR_MESSAGE);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_clear_msg;
    private javax.swing.JButton btn_clear_reveal_message;
    private javax.swing.JButton btn_embed_file;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_genrate_random_key;
    private javax.swing.JButton btn_hide_info;
    private javax.swing.JButton btn_open_video;
    private javax.swing.JButton btn_output_file;
    private javax.swing.JButton btn_play;
    private javax.swing.JButton btn_reveal_info;
    private javax.swing.JFileChooser file_chooser;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel_configuration;
    private javax.swing.JPanel panel_embeding_area;
    private javax.swing.JPanel panel_help;
    private javax.swing.JPanel panel_retrieving_area;
    private javax.swing.JProgressBar progress_bar;
    private javax.swing.JTextField txt_file_name;
    private javax.swing.JTextField txt_key;
    private javax.swing.JTextArea txt_message;
    private javax.swing.JTextField txt_ouput_f_name;
    private javax.swing.JTextArea txt_retrive_msg;
    // End of variables declaration//GEN-END:variables
}
