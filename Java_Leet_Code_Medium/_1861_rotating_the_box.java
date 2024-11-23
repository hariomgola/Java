package Java_Leet_Code_Medium;

public class _1861_rotating_the_box {

	public static void main(String[] args) {
		_1861_rotating_the_box cs = new _1861_rotating_the_box();
		cs.rotateTheBox(new char[][] { { '#', '.', '#' } });
		cs.rotateTheBox(new char[][] { { '#', '#', '*', '.', '*', '.' }, { '#', '#', '#', '*', '.', '.' },
				{ '#', '#', '#', '.', '#', '.' } });
	}

	public char[][] rotateTheBox(char[][] box) {
		for (int i = 0; i < box.length; i++) {
			char[] boxs = box[i];
			for (int j = 0; j < boxs.length; j++) {
				for (int k = 0; k < boxs.length - 1; k++) {
					if (boxs[k] == '#' && boxs[k + 1] == '.') {
						boxs[k] = '.';
						boxs[k + 1] = '#';
					}
				}
			}
		}
		char[][] _cs = new char[box[0].length][box.length];
		for (int i = 0; i < box[0].length; i++) {
			for (int j = 0; j < box.length; j++) {
				_cs[i][j] = box[box.length - j - 1][i];
			}
		}
		return _cs;
	}

}
