package day_23_ArrayIntroduction;

public class StringReplace {
	
	public static void main(String[] args) {
		
	  String sentence="We are learning java";
	  System.out.println(sentence);
	
	 sentence=sentence.replace("java", "C#");
	
	 System.out.println(sentence);
	
	 //can u replaace word 'learning' - 'practicing'
	
	 sentence.replace("learning","practicing");// with this form learning not gonna changed
	  
	 System.out.println(sentence);
	
	 sentence=sentence.replace("learning","practicing");//first you have to assigned to variable 
	
	 System.out.println(sentence);
	 sentence = sentence.replace("Phython", "Java");
		
		System.out.println(sentence);
		
		sentence = sentence.replace("a", "A");
		
		System.out.println(sentence);
		
		String word = "abcdefg java selenium";
		
		System.out.println(word.replace("ava", "unit"));
		System.out.println(word);
		
		String result = "123,456,001 results";
		//remove ' results' and commas
		result = result.replace("results", "").replace(",", "");
		System.out.println(result);
		
		
	
	}

}
