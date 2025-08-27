package Java_Question;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class R_System_Question {
	
	public static void main(String[] args) {
		List<String> _ls = new ArrayList<String>();
		_ls.add("a");
		_ls.add("b");
		_ls.add("c");
		
		_ls.stream().forEach(_data->{
			System.out.print(_data);
			_ls.add("hola");
		});
	}

}
