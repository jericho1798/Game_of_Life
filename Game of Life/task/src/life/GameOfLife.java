package life;

import javax.swing.*;
import java.awt.*;

public class GameOfLife extends JFrame {
    public static JLabel GenerationLabel;
    public JLabel AliveLabel;
    public JToggleButton button1;
    public JButton button2;
    public static Graphics g;
    public static Graphics2D g2;
    public static MyPanel p;
    public GameOfLife() {
        super("GameOfLife");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);

        JLabel GenLabe = new JLabel();
        GenLabe.setText("Generation #");
        GenLabe.setBounds(10, 10, 80, 30);
        add(GenLabe);

        GenerationLabel = new JLabel();
        GenerationLabel.setName("GenerationLabel");
        GenerationLabel.setBounds(85, 10, 100, 30);
        add(GenerationLabel);

        JLabel AlLabel = new JLabel();
        AlLabel.setText("Alive: ");
        AlLabel.setBounds(10, 30, 100, 30);
        add(AlLabel);

        AliveLabel = new JLabel();
        AliveLabel.setName("AliveLabel");
        AliveLabel.setBounds(45, 30, 100, 30);
        add(AliveLabel);
       // setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        GenerationLabel.setText(String.valueOf(Universe.gen));
        AliveLabel.setText(String.valueOf(Universe.Alive));

        button1 = new JToggleButton();
        button1.setName("PlayToggleButton");
        button1.setText("P/P");
        button1.setBounds(100,10,80,30);
        add(button1);

        button2 = new JButton();
        button2.setName("ResetButton");
        button2.setText("Reset");
        button2.setBounds(200,10,80,30);
        add(button2);
        setLayout(null);
        setVisible(true);
    }
    public void update() {
        repaint();
        GenerationLabel.setText(String.valueOf(Universe.gen));
        AliveLabel.setText(String.valueOf(Universe.Alive));
        p = new MyPanel();
        p.setBounds(0,55,400,400);
        add(p);
    }
    public static class MyPanel extends JPanel {
        // custom painting is performed by the paintComponent method
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g2 = (Graphics2D) g;
            g2.setColor(Color.black); // sets Graphics2D color
            for(int i = 0; i < Main.N; i++) {
                for(int j = 0; j < Main.N; j++) {
                    if(Universe.arr_curr[i][j] == 'O') {
                        g2.drawRect(20 * j,20 * i,20,20);
                        g2.fillRect(20 * j,20 * i,20,20);
                    }
                    if(Universe.arr_curr[i][j] == ' ') {
                        g2.drawRect(20 * j,20 * i,20,20);
                    }
                }
            }
        }
    }

}

