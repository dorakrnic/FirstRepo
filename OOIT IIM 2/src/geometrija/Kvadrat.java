package geometrija;

import java.awt.Color;
import java.awt.Graphics;

public class Kvadrat extends PovrsinskiOblik implements Comparable{
	private Tacka goreLevo;
	private int stranica;


	public Kvadrat(){

	}

	public Kvadrat(Tacka goreLevo, int stranica){
		this.goreLevo = goreLevo;
		this.stranica = stranica;
	}

	public Kvadrat(Tacka goreLevo, int stranica,String boja){
		this.goreLevo = goreLevo;
		this.stranica = stranica;
		this.boja = boja;
	}
	
	public Kvadrat(Tacka goreLevo, int stranica,Color boja){
		this.goreLevo = goreLevo;
		this.stranica = stranica;
		this.color = boja;
	}
	
	public Kvadrat(Tacka goreLevo, int stranica, Color boja, Color bojaUnutr){
		this.goreLevo = goreLevo;
		this.stranica = stranica;
		this.color = boja;
		this.setBojaUnutrasnjosti(bojaUnutrasnjosti);
	}
	
	public int compareTo(Object o) {
		Kvadrat novi = (Kvadrat) o;
		return (int)(this.stranica - novi.stranica);
	}

	
	public void selektovan(Graphics g){
		g.setColor(Color.BLUE);
		new Linija(getGoreLevo(), new Tacka(getGoreLevo().getX()+stranica, getGoreLevo().getY())).selektovan(g);
		new Linija(getGoreLevo(), new Tacka(getGoreLevo().getX(), getGoreLevo().getY()+stranica)).selektovan(g);
		new Linija(new Tacka(getGoreLevo().getX()+stranica, getGoreLevo().getY()), dijagonalaKvadrata().getKrajnja()).selektovan(g);
		new Linija(new Tacka(getGoreLevo().getX(), getGoreLevo().getY()+stranica), dijagonalaKvadrata().getKrajnja()).selektovan(g);

	}

	public void popuni(Graphics g) {
		g.setColor(pronadjiBoju(getAreaColor()));
		g.fillRect(getGoreLevo().getX()+1, getGoreLevo().getY()+1, getStranica()-1, stranica-1);
		
	}

	public void promeniIvicu(Graphics g){
		g.setColor(pronadjiBoju(getColor()));
	}
	
	public boolean sadrzi(int x, int y) {
		if(   (goreLevo.getX() < x && goreLevo.getX() + stranica > x)    &&
				goreLevo.getY() < y && goreLevo.getY() + stranica > y)
		return true;
		else
			return false;
	}
	
	public String toString(){
		String kvadrat = "Gornji levi ugao = (" + goreLevo.getX() + "," + goreLevo.getY() + "), stranica = " + getStranica();
		return kvadrat;
	}
	public String typeToString(){
		return "Kvadrat";
	}
	
	public void crtajSe(Graphics g){
		//g.setColor(pronadjiBoju(getColor()));
		g.drawRect(getGoreLevo().getX(), getGoreLevo().getY(), getStranica(), stranica);
		
		if(isSelektovan())
			selektovan(g);
		if(isPopunjen()){
			popuni(g);
		}
		if(isPromeniIvicu()){
			promeniIvicu(g);
		}
		
	}
	
	public boolean equals(Object obj){
		if (obj instanceof Kvadrat){
			Kvadrat pomocni = (Kvadrat) obj;
			if (this.goreLevo.equals(pomocni.goreLevo) && this.stranica == pomocni.stranica)
				return true;
			else 
				return false;
		}
		else 
			return false;
	}

	public Linija dijagonalaKvadrata(){
		return new Linija(goreLevo, new Tacka(goreLevo.getX() + stranica,goreLevo.getY() + stranica));
	}

	public Tacka centarKvadrata(){
		return dijagonalaKvadrata().sredinaLinije();
	}

	public double povrsina(){
		return stranica*stranica;
	}

	public double obim(){
		return 4*stranica;
	}

	public void pomeriNa(int x,int y){
		goreLevo.pomeriNa(x, y);
	}

	public void pomeriZa(int x,int y){
		goreLevo.pomeriZa(x, y);
	}

	public Tacka getGoreLevo() {
		return goreLevo;
	}
	public int getStranica() {
		return stranica;
	}
	public void setGoreLevo(Tacka goreLevo) {
		this.goreLevo = goreLevo;
	}
	public void setStranica(int stranica) {
		this.stranica = stranica;
	}

	}
