package Java_Leet_Code_Medium;

import java.util.HashMap;
import java.util.HashSet;

public class _1930_unique_length_3_palindromic_subsequences {

	public static void main(String[] args) {
		_1930_unique_length_3_palindromic_subsequences cs = new _1930_unique_length_3_palindromic_subsequences();
		cs.countPalindromicSubsequence("aabca");
		cs.countPalindromicSubsequence("bbcbaba");
		cs.countPalindromicSubsequence(
				"vdjlhrpfaehcvikmrcoexjlgmfgbtrciozpovvknwmwmcxsnxurqdtezzvdlzlzqvgxxbkkihlwuqnkkdptyyochnikjmpahdpsbxigtxxavhhmscwdzlvhkqefvttwvneindwwafvvglxshvnqdajpewpjextrhkeozwqrgkautaxqpaguhzqljjgmrvkcnrvjqphcbzqwgsxhdtxuuprrsrzgkkasoesfnuxrnvvwecdgvtericjthuighwmwpybxnwjhbwdfkoxlisumqeqahtetmtcpqkzjafjaiverqgsidjpevhhspixzixjeyxkfsdtpejqawgnbzrqarkjomdsqhrrhpdvcsdccffgnfshbmfyiarxvrdcnscggzhmcebhuitctbwrejlqwcvekzhkwuqucsbyekpurejjarvzdxckbgisrtoozrinscrgirkvozbqewwwbmgzbfqkglulwldmqckoacpqhnfryjbfloqmrsctfivzhnsbedsscpeyklusckyvpulrydmnbyvmnxepsdkpwnkzxthzzldksthswsyqfqhirzqynsidjmorktvhwvnadrftehgvrhtavcwtwtoguuhrykyzioagquwvxsqtopuzhereenjlodpgisedibyqrmojuifeb");
	}

	public int countPalindromicSubsequence(String s) {
		String[] _arr = s.split("");
		HashMap<String, Integer> _hs = new HashMap<String, Integer>();
		for (int i = 0; i < _arr.length; i++) {
			_hs.put(_arr[i], _hs.get(_arr[i]) == null ? 1 : _hs.get(_arr[i]) + 1);
		}

		System.out.println(_hs.toString());
		return _hs.size();
	}

}
