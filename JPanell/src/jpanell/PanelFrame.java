/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanell;

/**
 *
 * @author abdie
 */
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelFrame extends JFrame{
    private JPanel buttonJPanel;
    private JButton[] buttons;
    
    public PanelFrame(){
        super("Demo de Painel");
        buttons = new JButton[5];
        buttonJPanel = new JPanel();
        buttonJPanel.setLayout(new GridLayout(1,buttons.length));
        
        for(int count = 0; count < buttons.length; count++){
            buttons[count] = new JButton("Botão" +(count + 1));
            buttonJPanel.add(buttons[count]);
        }
        add(buttonJPanel,BorderLayout.SOUTH);
    }
}
