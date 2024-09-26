package Java_LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class GuessTheWord {
	public static void main(String[] args) {
		String[] _data1 = { "acckzz", "ccbazz", "eiowzz", "abcczz", "acckzz" };
		String[] _data2 = { "gaxckt", "trlccr", "jxwhkz", "ycbfps", "peayuf", "yiejjw", "ldzccp", "nqsjoa", "qrjasy",
				"pcldos", "acrtag", "buyeia", "ubmtpj", "drtclz", "zqderp", "snywek", "caoztp", "ibpghw", "evtkhl",
				"bhpfla", "ymqhxk", "qkvipb", "tvmued", "rvbass", "axeasm", "qolsjg", "roswcb", "vdjgxx", "bugbyv",
				"zipjpc", "tamszl", "osdifo", "dvxlxm", "iwmyfb", "wmnwhe", "hslnop", "nkrfwn", "puvgve", "rqsqpq",
				"jwoswl", "tittgf", "evqsqe", "aishiv", "pmwovj", "sorbte", "hbaczn", "coifed", "hrctvp", "vkytbw",
				"dizcxz", "arabol", "uywurk", "ppywdo", "resfls", "tmoliy", "etriev", "oanvlx", "wcsnzy", "loufkw",
				"onnwcy", "novblw", "mtxgwe", "rgrdbt", "ckolob", "kxnflb", "phonmg", "egcdab", "cykndr", "lkzobv",
				"ifwmwp", "jqmbib", "mypnvf", "lnrgnj", "clijwa", "kiioqr", "syzebr", "rqsmhg", "sczjmz", "hsdjfp",
				"mjcgvm", "ajotcx", "olgnfv", "mjyjxj", "wzgbmg", "lpcnbj", "yjjlwn", "blrogv", "bdplzs", "oxblph",
				"twejel", "rupapy", "euwrrz", "apiqzu", "ydcroj", "ldvzgq", "zailgu", "xgqpsr", "wxdyho", "alrplq",
				"brklfk" };
		findSecretWord(_data2);
		String solution_2 = "hbaczn";
	}

	static void findSecretWord(String[] words) {
		// Using Streams
		HashSet<HashSet<String>> hash_set_unique = new HashSet<HashSet<String>>();

		Arrays.stream(words).map(_data -> {
			HashSet<String> _hash = new HashSet<String>();

			Arrays.stream(_data.split("")).forEach(_char -> {
				_hash.add(_char);
			});
			hash_set_unique.add(_hash);
			// return _hash;
			return _data;
		}).filter(_data -> {
			return true;
		}).forEach(_data -> {
			// System.out.println(_data);
		});
		System.out.println(hash_set_unique);
	}
}
