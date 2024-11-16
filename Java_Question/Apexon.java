package Java_Question;

public class Apexon {

	/**
	 * aabbb into a2b3 aaaa into a4 a into a1 aabbbaa a2b3a2
	 */
	public static void main(String[] args) {
		String _data = "aabbbaaccccaaaddmmmm";
		String _finalData = "";
		for (int i = 0; i < _data.length(); i++) {
			if(i>0 && _data.charAt(i) == _data.charAt(i-1)) {
				continue;
			}
			int _temp= 1;
			inner:for (int j = i+1; j < _data.length(); j++) {
				if(_data.charAt(i) == _data.charAt(j)) {
					_temp += 1;
				} else {
					break inner;
				}
			}
			_finalData += _data.charAt(i) + ""+_temp;
		}
		
		System.out.println("Final Output -> "+_finalData);
	}

}
