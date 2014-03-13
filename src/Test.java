import java.util.ArrayList;

public abstract class Test {

	public static void main(String[] args) {
		Point tab[][] = new Point[5][5];
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < 5; x++) {
				tab[x][y] = new Point(x, y, 1);
			}
		}
		for (int x = 0; x < 5; x++)
			tab[x][2] = new Point(x, 2, 2);

		CompoConnexe analyse = new CompoConnexe(tab);
		ArrayList<ArrayList<Cross>> cc = analyse.getCompo();
		System.out.println(cc);
	}

}
