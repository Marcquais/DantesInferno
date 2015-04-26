package di.game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable, KeyListener {

	private static final long SerialVerionUID = 1L;
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	private Thread thread;
	private boolean isRunning;
	
	private int FPS = 60;
	private long targetTime = 1000 / FPS;
	
	public GamePanel(){
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		
		start();
	}
	
	private void start(){
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public void run(){
		long start, elapsed, wait;
		while(isRunning){
			start = System.nanoTime();
			
			tick();
			repaint();
			
			elapsed = System.nanoTime()-start;
			wait = targetTime - elapsed/1000000;
			
			if(wait<=0){
				wait = 5;
			}
			
			try{
				Thread.sleep(wait);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public void tick(){
		//System.out.println("Running");
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
	}

	public void keyPressed(KeyEvent arg0) {
		
	}

	public void keyReleased(KeyEvent arg0) {
		
	}

	public void keyTyped(KeyEvent arg0) {
		
	}
	
}