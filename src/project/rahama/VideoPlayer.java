/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.rahama;

/**
 *
 * @author root
 */
import java.io.File;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javax.swing.JFrame;

public class VideoPlayer {

    String videoName;

    public VideoPlayer(String v_n) {
        this.videoName = v_n;
    }

    public void initAndShowGUI() {
        // This method is invoked on the EDT thread
//        JDialog frame = new JDialog();
        JFrame frame = new JFrame("Swing and JavaFX");
        final JFXPanel fxPanel = new JFXPanel();
        frame.add(fxPanel);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                initFX(fxPanel);
            }
        });
    }

    public void initFX(JFXPanel fxPanel) {
//        File f = new File("C:\\Users\\root\\Documents\\NetBeansProjects\\RahamaProject\\oracle.flv");
        File f = new File(videoName);
        Media m = new Media(f.toURI().toString());
//        Media m = new Media(videoName);

        MediaPlayer mp = new MediaPlayer(m);
        MediaView mv = new MediaView(mp);
        mp.setAutoPlay(true);
        StackPane root = new StackPane();
        root.getChildren().add(mv);
        Scene scene = new Scene(root, Color.BLACK);
        fxPanel.setScene(scene);
//        mp.play();
    }

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
////                String uri = "http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv";
//                new VideoPlayer("C:\\Users\\root\\Documents\\NetBeansProjects\\RahamaProject\\oracle.flv").initAndShowGUI();
////                new VideoPlayer(uri).initAndShowGUI();
//
//            }
//        });
//    }
}
