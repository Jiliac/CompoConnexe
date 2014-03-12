import java.util.ArrayList;

public class CompoConnexe {

	ArrayList<ArrayList<Cross>> retour;
	Cross[][] tab;

	public CompoConnexe(Cross[][] tab) {
		this.tab = tab;
	}

	public CompoConnexe(ArrayList<Cross> list, int maxX, int maxY) {
		Cross tab[][] = new Cross[maxX][maxY];
		for (Cross cross : list) {
			tab[cross.getX()][cross.getY()] = cross;
		}
	}

	public ArrayList<ArrayList<Cross>> getCompo() {
		int maxY = tab.length;
		int maxX = tab[0].length;
		
		int maxNb = 0;
		for (int y = 0; y < maxY; y++) {
			for (int x = 0; x < maxX; x++) {
				Cross cross = tab[x][y];
				cross.setNb(maxNb);
				
				ArrayList<Cross> voisins = cross.getVoisin(cross, tab);
				for(Cross voisin : voisins){
					if(voisin.getNb()!=-1)
				}
			}
		}

		return null;
	}
}
