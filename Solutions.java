import java.util.Scanner;
public class Solutions{
	
	//problem 705A - Hulk
	public void hulk(){
		Scanner kbd = new Scanner(System.in);
		int num  =  Integer.parseInt(kbd.nextLine());
		
		String output = "";
		for(int i = 1; i <= num; i++){
		 	if(i%2 != 0)
				output += "I hate ";
			else
				output += "I love ";
			if (i == num)
				output += "it";
			else
				output += "that ";
		}
		
		System.out.println(output);	
	}// end of hulk
	
	//problem 706B - Interesting Drink
	public void interestingDrink(){
		Scanner kbd = new Scanner(System.in);
		
		int storeCount = Integer.parseInt(kbd.nextLine());
		int[] price = new int[storeCount];
		
		for(int i=0; i<price.length; i++)
			price[i] = Integer.parseInt(kbd.next());

		int days = Integer.parseInt(kbd.next());		
		for(int i = 1; i <= days; i++){
			int count = 0;
			int coins = Integer.parseInt(kbd.next());
			for(int x = 0; x < storeCount; x++){
				if(coins >= price[x])
					count++;
			}
		System.out.println(count+"");
		}
	}// end of interestingDrink
	
	//problem 702A - Maximum Increase
	public void maxInc(){
		Scanner scan = new Scanner (System.in);
		int length = scan.nextInt();
		int[] arr = new int[length];
		for(int i=0;i<length;i++){
			arr[i]=scan.nextInt();
		}
		int max=1;
		int sum=1;
		for(int i=0;i<length-1;i++){
			if(arr[i+1]>arr[i])
				{max++; if(max>sum) sum=max;}
			else max=1;

		}
		System.out.println(sum);
	}//end of maxInc
	
	//problem 703A - Mishka and Game
	public void mishka(){
		Scanner scan=new Scanner (System.in);
		int round = scan.nextInt();

		int mishka = 0;
		int chris = 0;
		for(int z=0;z<round;z++){
			int a=scan.nextInt();
			int b=scan.nextInt();
				if(a>b) mishka++;
				if(b>a) chris++;
		}
		if(mishka>chris) System.out.println("Mishka");
		if(chris>mishka) System.out.println("Chris");
		if(chris==mishka) System.out.println("Friendship is magic!^^");
	}//end of mishka
	
	//problem 719A - Vitya in the City
	public void vitya(){
		Scanner kbd = new Scanner(System.in);
		int nights = Integer.parseInt(kbd.nextLine());
		int[] sequence = new int[nights];
		
		for(int i=0; i<nights; i++)
			sequence[i] = Integer.parseInt(kbd.next());
		
		if(sequence[nights-1] == 0)
			System.out.println("UP");
		else if(sequence[nights-1] == 15)
			System.out.println("DOWN");
		else if(nights==1)
			System.out.println(-1);
		else{
			if(sequence[nights-1]>sequence[nights-2])
				System.out.println("UP");
			else
				System.out.println("DOWN");	
		}
	}// end of vitya
	
	//problem 709A - Juicer
	public void juicer(){
		Scanner kbd = new Scanner(System.in);
		int number = Integer.parseInt(kbd.next());
		int maxSize = Integer.parseInt(kbd.next());
		int maxCapacity = Integer.parseInt(kbd.next());
			
		int[] sequence = new int[number];
		
		for(int i=0; i<number; i++)
			sequence[i] = Integer.parseInt(kbd.next());
			
		int sum=0;
		int count=0;
		
		for(int i=0; i<number; i++){
			sum = sum + sequence[i];
			if(sequence[i]<=maxSize);
			else 
				sum = sum-sequence[i];
				
			if (sum>maxCapacity){		
				count++;
				sum=0;
			}
		}
		System.out.println(count+"");
	}//end of juicer
	
	//problem 710A - King Moves
	public void kingMoves(){
		Scanner keyboard = new Scanner(System.in);
		String position = keyboard.nextLine();
		
		char d = position.charAt(0);
		char c = position.charAt(1);
		
		int moves = 0;
		
		if ( position.equals("a8") ||
			 position.equals("a1") ||
			 position.equals("h8") ||
			 position.equals("h1") )
			moves = 3;
			 
		else if (d == 'a' || d == 'h' ||
				 c == '1' || c == '8')
			moves=5;
		else 
			moves=8; 
		
		System.out.println(moves+"");
	}//end of kingMoves
	
}// end of class