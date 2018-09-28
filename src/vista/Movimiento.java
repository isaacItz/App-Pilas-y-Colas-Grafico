package vista;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Movimiento extends JFrame {

	private int xInicio, yInicio, xFin, yFin;
	private Color color;

	public static void main(String[] args) {
		 new Movimiento();
	}
	
	public Movimiento() {

		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		xInicio = 100;
		xFin = 800;
		yInicio = 200;
		yFin = 400;
		color = new Color(200, 100, 50);
		mover();
	}

	public void mover() {
		for (; xInicio <= xFin; xInicio++) {
			try {
				Thread.sleep(20);
			} catch (Exception e) {
				e.printStackTrace();
			}
			repaint();
		}
	}

	@Override
	public void update(Graphics g) {
		g.setColor(color);
		
		g.clearRect(xInicio - 4, yInicio, 100, 100);
		g.fillRect(xInicio, yInicio, 100, 100);
	}
	
	@Override
	public void paint(Graphics arg0) {
		update(arg0);
	}
}
