package in.kodewala.stream11.fstNonRepeat;

import java.util.Optional;


public class First_Non_Repeating_Char {

	public static void main(String[] args) {

		String word = "swiss";
		
		Optional<Character> firstNonRepeatChar = word.chars()
				                                     .mapToObj(ch -> (char) ch)
				                                     .filter(ch -> word.indexOf(ch) == word.lastIndexOf(ch))
				                                     .findFirst();

		System.out.println("First non-repeating character from a given string :: " + firstNonRepeatChar.get());
		/*		"swiss"
		|
		v
		chars()
		|
		v
		[115,119,105,115,115]
		|
		v
		mapToObj()
		|
		v
		[s,w,i,s,s]
		|
		v
		filter(indexOf == lastIndexOf)
		|
		v
		[w,i]
		|
		v
		findFirst()
		|
		v
		Optional[w]
		|
		v
		get()
		|
		v
		w*/
	}
}
