package Java_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Optum_Question {
	static String final_data;
	public static void main(String[] args) {
		String[] data_string = "aabcddt".split("");
		
		
		List<String> _list = new ArrayList<String>();
		
		 for(int i=0;i<data_string.length-1;i++) {
			 if(data_string[i] == "0") {
				 continue;
			 }
			 String temp = data_string[i];
			  for(int j=i;j<data_string.length-1;j++) {
				  if(data_string[j] == temp) {
					  data_string[j] = "0";
				  }
			  }
			  _list.set(i, temp);
		 }
		 
		 System.out.print(_list);
	}

}
