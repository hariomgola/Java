package Java_Leet_Code_Easy;

public class _58_length_of_last_word {

	public static void main(String[] args) {
		_58_length_of_last_word cs = new _58_length_of_last_word();
		cs.lengthOfLastWord("Hello World");
		cs.lengthOfLastWord("   fly me   to   the moon  ");
		cs.lengthOfLastWord("luffy is still joyboy");

	}

	public int lengthOfLastWord(String s) {
		String[] _input = s.split("\\s+");
		return _input[_input.length - 1].length();
	}

}
