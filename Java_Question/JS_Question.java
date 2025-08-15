package Java_Question;

public class JS_Question {

	public static void main(String[] args) {
		String question_1 = """
				console.log('Start'); setTimeout(() => { console.log('Timeout'); }, 0);
				Promise.resolve().then(() => { console.log('Promise'); });
				(async () => { console.log('Async Start'); await null; console.log('Async
				End'); })();
				console.log('End');
					""";

	}
}