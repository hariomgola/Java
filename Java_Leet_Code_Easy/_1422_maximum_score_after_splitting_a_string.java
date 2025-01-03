package Java_Leet_Code_Easy;

public class _1422_maximum_score_after_splitting_a_string {

	public static void main(String[] args) {
		_1422_maximum_score_after_splitting_a_string cs = new _1422_maximum_score_after_splitting_a_string();
		cs.maxScore("011101");
		cs.maxScore("00111");
		cs.maxScore("1111");
	}

	public int maxScore(String s) {
		String[] _str = s.split("");
		int oneData = s.replace("0", "").length();
		int zeroData = 0;
		int _finalData = 0;
		for (int i = 0; i < _str.length - 1; i++) {
			if (_str[i].equals("0")) {
				zeroData += 1;
			} else {
				oneData -= 1;
			}
			_finalData = zeroData + oneData > _finalData ? zeroData + oneData : _finalData;
		}
		return _finalData;
	}

}
