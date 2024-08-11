/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jpanell;

import javax.swing.JFrame;

/**
 *
 * @author abdie
 */
public class JPanell extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PanelFrame frame = new PanelFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,200);
        frame.setVisible(true);
    }
    
}
