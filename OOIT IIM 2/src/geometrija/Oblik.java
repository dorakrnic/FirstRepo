package geometrija;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JColorChooser;

public abstract class Oblik implements Pomerljiv {
	
	protected String boja;
	private boolean selektovan;
	private boolean promeniIvicu;
	protected static Color color;
	public abstract boolean sadrzi(int x, int y) ;
	private int stranica;
	private int visina;
	private int radius;
	private String type;
	private double duzina;
	
	public abstract void crtajSe(Graphics g);
	
	public static Color pronadjiBoju(String boja){
		if(boja.equalsIgnoreCase("bela")||boja.equalsIgnoreCase("white")||boja.equalsIgnoreCase("WhiteSmoke"))
			return Color.white;
		else if(boja.equalsIgnoreCase("zuta")||boja.equalsIgnoreCase("yellow"))
			return Color.yellow;
		else if(boja.equalsIgnoreCase("zelena")||boja.equalsIgnoreCase("green") || boja.equalsIgnoreCase("ForestGreen"))
			return Color.green;
		else if(boja.equalsIgnoreCase("YellowGreen")||boja.equalsIgnoreCase("Lime")||boja.equalsIgnoreCase("SpringGreen"))
			return Color.green.brighter();
		else if(boja.equalsIgnoreCase("crvena")||boja.equalsIgnoreCase("red"))
			return Color.red;
		else if(boja.equalsIgnoreCase("plava")||boja.equalsIgnoreCase("blue"))
			return Color.blue;
		else if(boja.equalsIgnoreCase("roza")||boja.equalsIgnoreCase("magenta"))
			return Color.magenta;
		else if(boja.equalsIgnoreCase("ljubicasta")||boja.equalsIgnoreCase("violet")||boja.equalsIgnoreCase("darkviolet") || boja.equalsIgnoreCase("Fuchsia"))
			return Color.magenta.darker();
		else if(boja.equalsIgnoreCase("DarkTurquoise")|| boja.equalsIgnoreCase("Turquoise"))
			return Color.cyan;
		else if(boja.equalsIgnoreCase("DarkCyan") || boja.equalsIgnoreCase("Teal"))
			return Color.cyan.darker();
		else if(boja.equalsIgnoreCase("Aquamarine"))
			return Color.cyan.brighter();
		else if(boja.equalsIgnoreCase("Gray")|| boja.equalsIgnoreCase("DarkGray"))
			return Color.gray;
		else if(boja.equalsIgnoreCase("LightGray") || boja.equalsIgnoreCase("Silver"))
			return Color.gray.brighter();
		else if(boja.equalsIgnoreCase("Olive"))
			return Color.green.darker();
		else if(boja.equalsIgnoreCase("Orange")|| boja.equalsIgnoreCase("narandzasta"))
			return Color.orange;
		else
			return Color.black;
	}
	
	public static Color pronadjiBoju(Color boja){
		color=new JColorChooser(boja).getColor();
		//color=boja;
		return color;
	}

	public String getBoja() {
		return boja;
	}
	
	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	public Color getColor(){
		return color;
	}

	public void setColor(Color boja){
		this.color=boja;
	}
	

	public boolean isSelektovan() {
		return selektovan;
	}

	public void setSelektovan(boolean selektovan) {
		this.selektovan = selektovan;
	}
	
	public boolean isPromeniIvicu(){
		return promeniIvicu;
	}
	
	public void setPromeniIvicu(boolean promeniIvicu){
		this.promeniIvicu=promeniIvicu;
	}
	
	public int getStranica(){
		return stranica;
	}
	public void setStranica(int stranica){
		this.stranica=stranica;
	}
	public int getRadius(){
		return stranica;
	}
	public void setRadius(int stranica){
		this.radius=stranica;
	}
	public int getVisina(){
		return visina;
	}
	public void setVisina(int visina){
		this.visina=visina;
	}
	
	public String typeToString(){
		return type;
	}
	
	public double duzina(){
		return duzina;
	}
	public void setDuzina(int duzina){
		this.duzina=duzina;
	}

}
