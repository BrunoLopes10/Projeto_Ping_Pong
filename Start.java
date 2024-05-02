import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start extends JFrame {

    private JButton startButton;
    private JButton exitButton;
    private JLabel titleLabel;

    public Start() {
        setTitle("Pong Game");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setLayout(new BorderLayout());

        titleLabel = new JLabel("Ping Pong", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        startButton = new JButton("Start Game");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                GameFrame frame = new GameFrame();
            }
        });
        add(startButton, BorderLayout.CENTER);

        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton, BorderLayout.SOUTH);

        setVisible(true);
    }
        
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Start();
            }
        });
    }
}

