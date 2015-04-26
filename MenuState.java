package di.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class MenuState extends GameState {

	private String[] options = {"Play","Help","Quit"};
	private int currentSelection = 0;
	
	public MenuState(GameStateManager gsm) {
		super(gsm);
		
	}

	public void init() {
		
		
	}


	public void tick() {
		
		
	}


	public void draw(Graphics g) {
		
		g.setColor(new Color(150,100,50));
		g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
		
		for(int i=0;i<options.length;i++){
			if(i == currentSelection){
				g.setColor(Color.ORANGE);
			} else{
				g.setColor(Color.WHITE);
			}
			
			//g.drawLine(GamePanel.WIDTH /2, 0, GamePanel.WIDTH /2 , GamePanel.HEIGHT);
			//g.drawLine(GamePanel.WIDTH /4, 0, GamePanel.WIDTH /4 , GamePanel.HEIGHT);
			//g.drawLine(3*GamePanel.WIDTH /4, 0, 3*GamePanel.WIDTH /4 , GamePanel.HEIGHT);
			//g.drawLine(0, GamePanel.HEIGHT /2, GamePanel.WIDTH, GamePanel.HEIGHT /2);
			g.setFont(new Font("Arial",Font.PLAIN,72));
			g.drawString(options[i],GamePanel.WIDTH/2 -75, 150+i *150 );
			
		}
		
	}

	
	public void keyPressed(int k) {
		
		
	}

	
	public void keyReleased(int k) {
		
		
	}

	
	
}
