package net.setafac;

import javax.swing.*;
import java.awt.*;

public class MainScreen extends JFrame
{
    TextArea area = new TextArea();
    TextField field = new TextField();

    public MainScreen()
    {
        InitializeComponents();
    }

    private void InitializeComponents()
    {
        this.setTitle("Wizard Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.black);
        this.setSize(350, 200);
        this.setLayout(new BorderLayout());

        area.setName("main_area");
        area.setBackground(Color.black);
        area.setForeground(Color.WHITE);

        field.setName("main_field");
        field.setBackground(Color.black);
        field.setForeground(Color.WHITE);

        this.add(area);
        this.add(field);

        this.setVisible(true);
    }

    public void PrintInConsole(String text)
    {

    }
}
