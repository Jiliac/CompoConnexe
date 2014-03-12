import java.util.ArrayList;

public interface Cross {
	public int getX();

	public int getY();

	public ArrayList<Cross> getVoisin(Cross cross, Cross[][] tab);

	public int getNb();

	public void setNb(int nb);
}
