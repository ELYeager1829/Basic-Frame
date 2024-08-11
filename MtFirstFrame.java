/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author lenovo
 */
public class MtFirstFrame extends JFrame {

    public MtFirstFrame() {
        setTitle("L's GUI");
        setSize(200, 250);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.blue);
        setVisible(true);
    }  
}
