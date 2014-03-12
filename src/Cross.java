import java.util.ArrayList;

public interface Cross {
	public int getX();

	public int getY();
	
	/*
	 * les voisuins devriont etre initialises 
	 * ET etre de la meme categorie
	 */
	public ArrayList<Cross> getVoisin(Cross cross, Cross[][] tab);

	public int getNb();

	public void setNb(int nb);
}
