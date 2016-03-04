package geometrija;

import java.awt.Color;
import java.awt.Graphics;



public abstract class PovrsinskiOblik extends Oblik{
	protected String bojaUnutrasnjosti = "zelena";
	protected Color areaColor=Color.GREEN;
	
	public abstract void popuni(Graphics g);
	private boolean popunjen;
	public abstract boolean sadrzi(int x, int y);
	public abstract double obim();
	public abstract double povrsina();

	public String getBojaUnutrasnjosti() {
		return bojaUnutrasnjosti;
	}
	public Color getAreaColor(){
		return areaColor;
	}
	

	public void setBojaUnutrasnjosti(String bojaUnutrasnjosti) {
		this.bojaUnutrasnjosti = bojaUnutrasnjosti;
	}
	
	public void setBojaUnutrasnjosti(Color bojaUnutr) {
		this.areaColor = bojaUnutr;
	}
	
	public boolean isPopunjen(){
		return popunjen;
	}
	
	public void setPopunjen(boolean popunjen){
		this.popunjen=popunjen;
	}
	
}
