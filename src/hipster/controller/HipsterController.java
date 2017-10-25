package hipster.controller;

public class HipsterController
{
	private String [] words = { "Ryan", "Mason", "Sheradon", "Preston" };
	private int [] numbers;
	
	public HipsterController()
	{
		words = new String [22];
		numbers = new int [10];
		
	}
	
	public void start()
	{
		System.out.println("My name is Sheradon, and I am a hipster");
		System.out.println(words);
		System.out.print(numbers);
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		// ... keep on going
		//or use a loop
		words = new String [] { "Brandon","Zane","Amber","Brittany","Jeran","Dylan" };
		
		for (int index =0; index < numbers.length; index += 1)
		{
			numbers[index] = index + 1;
		}
		
		
		showLoopWithArray();
	}
	
//	public ArrayList <String> getWords1()
//	{
//		return words1;
//	}
//
//	public void setWords1(ArrayList <String> words1)
//	{
//		this.words1 = words1;
//	}
//	private ArrayList <String> words1;
	
	private void showLoopWithArray()
	{
		for (String current : words)
		{
			System.out.println(current);
		}
		
		for (int index = 0; index < numbers.length; index += 1)
		{
			System.out.println(numbers[index]);
		}
	}
}



