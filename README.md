# Competitive Coding - Java

This File contains few example of competitive coding in Java and made for Education purpose only.
Any further Use of these program is criminal offence.

# Made with :heart:

Portfolio :computer: https://hariomgola.github.io/

# Java 8 Features

<details>
    <summary>Functional Interface</summary>

    # Functional Interface
     - Functional interface is an interface that has excatly one abstract menthod.
     - Since functional interface only have single functional it can easily implement using lambda.
     - @FunctionalInterface - Its need to be shown at the interface class level.
     - Above mentioned anotation is optional can be used or cannot be.
     - Some Build in functional interface in java belongs to [java.util.function]
     - Predicate<T>, Function<T, R>, Supplier<T>, Consumer<T>

</details>

<details>
    <summary>Lambda Expression</summary>

    # Lambda Expression
     * parameter -> expression
     * (parameter1, parameter2) -> { code block }
     * Labda express also store in the variable name [Consumer] and you can use the reference

</details>

<details>
<summary>Collection Sort Logic for Object based</summary>
    
    Collections.sort(user, new Comparator<User>() {
    	@Override
    	public int compare(User a, User b) {
    		if (a.getSalary() > b.getSalary()) {
    			return -1; // Here -1 for placing the object before
    		} else if (a.getSalary() < b.getSalary()) {
    			return 1; // Here +1 for placing the object after
    		}
    		return 0; // Here 0 no change
    	}
    });

</details>

<details>
<summary>Stream API</summary>

    # Stream Api
     * syntax for stream - Stream<T> stream;
     * Stream is not a data structure instead it takes input from the collections.
     * Stream don't change the actual daya structure, They only provide the result for pipeline menthod.
     * Each intermediate operation is lazily executed and return a stream as a result.
     * Hence various intermediate opertaions can be pipelined.
     * Terminal opertaions mark the end of the stream and return the result.

    # Types of Streams Opertaion
     * Intermediate Operations
       - map()
       - filter()
       - sorted()
       - flatMap()
       - distinct()
       - peek()
     * Terminate Operations
       - collect()
       - forEach()
       - reduce()
       - count()
       - findFirst()
       - allMatch()
       - anyMatch()

    import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.List;
    import java.util.Set;
    import java.util.stream.Stream;

    public class StreamAPI {
    	private static List<User> user = new ArrayList<User>();

    	// Once this Runs data will be available
    	static {
    		user.add(new User(1, "H", 5.25));
    		user.add(new User(2, "Ha", 14.50));
    		user.add(new User(3, "Har", 22.02));
    		user.add(new User(4, "Hari", 16.50));
    		user.add(new User(5, "Hario", 24.00));
    	}

    	public static void main(String[] args) {
    		Stream<User> userStream;

    		user.stream().map(_user -> {
    			_user.setId(_user.getId() * 2);
    			return _user;
    		}).forEach(_user -> {
    			System.out.println(_user.getId());
    		});
    	}
    }

</details>
