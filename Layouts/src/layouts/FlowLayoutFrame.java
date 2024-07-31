/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package layouts;

/**
 *
 * @author Aluno
 */
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame {
    
    private JButton leftButton;
    private JButton centerButton;
    private JButton rigthButton;
    private FlowLayout layout;
    private Container container;
    
    public FlowLayoutFrame(){
        super ("FlowLayout demo");
        
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);
        
        leftButton = new JButton("esquerda");
        add(leftButton);
        leftButton.addActionListener(
            new ActionListener(){
                    public void actionPerformed(ActionEvent event){
                        layout.setAlignment(FlowLayout.LEFT);
                        
                        layout.layoutContainer(container);
                    }
                } 
        );
        
        centerButton = new JButton("Centro");
        add(centerButton);
        centerButton.addActionListener(
                
                new ActionListener(){
                    public void actionPerformed(ActionEvent event){
                        layout.setAlignment(FlowLayout.CENTER);
                        
                        layout.layoutContainer(container);
                    }
                }
        );
        
        rigthButton = new JButton("Direita");
        add(rigthButton);
        rigthButton.addActionListener(
                
                new ActionListener(){
                    public void actionPerformed(ActionEvent event){
                        layout.setAlignment(FlowLayout.RIGHT);
                        
                        layout.layoutContainer(container);
                    }
                }
        );
    }
}
