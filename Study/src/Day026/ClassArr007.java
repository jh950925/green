package Day026;

import Day026_Class.ClassArr007_MyDictionary;
import Day026_Class.ClassArr007_MyDictionaryShow;
import Day026_Class.ClassArr007_dicQuestion;

public class ClassArr007 {

	public static void main(String[] args) {
		
		ClassArr007_MyDictionary [] words = new ClassArr007_MyDictionary[]
		{
			new ClassArr007_MyDictionary("television"), new ClassArr007_MyDictionary("computer"),
			new ClassArr007_MyDictionary("mouse"), new ClassArr007_MyDictionary("phone")
		};
		
		ClassArr007_dicQuestion question = new ClassArr007_dicQuestion();
		question.ClassArr007_dicQuestion(words);
		
		ClassArr007_MyDictionaryShow print = new ClassArr007_MyDictionaryShow();
		print.show(words);
	} 

}
