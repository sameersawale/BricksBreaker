/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bricksbraker;

import javax.swing.JFrame;

/**
 *
 * @author tf
 */
public class BricksBraker {

    public static void main(String[] args) {
        JFrame obj=new JFrame();
        GamePlay gameplay=new GamePlay();
        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("BreakBraker");
        obj.setLocationRelativeTo(null);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
        
    }
}
