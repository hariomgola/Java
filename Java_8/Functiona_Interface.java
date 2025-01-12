package Java_8;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface CalculateSquare {
	int calculate(int x);
}

public class Functiona_Interface {
	public static void main(String[] args) {
		// before Java 8
		beforeJavaFunctionalInteface();
		// Inbuild functional interface
		// consumer
		// predicate
		// function
		// supplier
		functional_Consumer();
		function_Predicate();
		functional_supplier();
		functional_function();
	}

	public static void beforeJavaFunctionalInteface() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("This Function is Running before Java 8 Features");
			}
		}).start();
	}

	public static void functional_Consumer() {
		// consumer interface represents an operation that takes a single input argument
		// of type t and return no result (void)
		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
		printUpperCase.accept("hariom gola");
	}

	public static void function_Predicate() {
		// predicate interface represents a boolean-value function that takes one
		// argument
		// of type t and returns the boolean value, its typically used for testing and
		// Filtration
		Predicate<Integer> isEven = num -> num % 2 == 0;
		System.out.println(isEven.test(4));
		System.out.println(isEven.test(5));
	}

	public static void functional_supplier() {
		// supplier interface represents a function that takes no arguments and returns
		// a result of type t. Its used where you need to supply a value
		Supplier<String> stringSupplier = () -> "Hello World";
		System.out.println(stringSupplier.get());
	}

	public static void functional_function() {
		int a = 10;
		// Defining the expression for calculate square
		CalculateSquare s = (int x) -> x * x;

		int answer = s.calculate(a);
		System.out.println("Square Using Functional Interface - " + answer);
	}
}
