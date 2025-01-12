package Java_8;

public class inheritance_concept {
	private interface inheritance_concept_1 {
		void some_function();
	}
	
	private class inheritance_concept_2 implements inheritance_concept_1{
		@Override
		public void some_function() {
			System.out.println(">> - Hi I am from the inheritance_concept_2 class");	
		}
	}
	
	private class inheritance_concept_3 extends inheritance_concept {
		public void some_function() {
			System.out.println("-> Hi I am from the inheritance_concept_2 class");	
		}
	}
	
	public static void main(String[] args) {
		inheritance_concept ic = new inheritance_concept();
		inheritance_concept_2 ic_2 = ic.new inheritance_concept_2();
		inheritance_concept_2 ic_3 = ic.new inheritance_concept_2();
	}
}
