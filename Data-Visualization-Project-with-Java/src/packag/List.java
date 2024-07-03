/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packag;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Hp
 */
public class List extends JFrame
{
    JButton button;
    
    public List()
    {
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 250);
        
        
        button = new JButton("Click me");
        button.addActionListener(new listener());
        button.setMnemonic(KeyEvent.VK_C);
        button.setToolTipText("Press the button");
        setLayout(new FlowLayout());
        add(button);
        
        setVisible(true);
    }
    
    
    private class listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, "Key pressed");
        }
    }
    public static void main(String[] args)
    {
        new List();
    }
}
