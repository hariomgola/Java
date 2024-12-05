package Java_Question;

import java.util.Arrays;
import java.util.HashMap;

public class ADP_Question {

	public static void main(String[] args) {
		String data = "interviewatADPD".toLowerCase();
		String[] _dataArr = data.split("");
		HashMap<String, Integer> _hs = new HashMap<String, Integer>();
		
		Arrays.stream(_dataArr).forEach(_data->{
			_hs.put(_data, _hs.get(_data) == null ? 1 :_hs.get(_data)+1 );
		});
		
		System.out.println(_hs);
		
		
		outer:for(int i=_dataArr.length-1;i>=0;i--) {
			if(_hs.get(_dataArr[i]) >1) {
				System.out.println(_dataArr[i]);
				break outer;
			}
		}

	}

}
