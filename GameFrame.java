import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame{

	Painel panel;
	
	GameFrame(){
		panel = new Painel();
		this.add(panel);
		this.setTitle("Pong Game");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}