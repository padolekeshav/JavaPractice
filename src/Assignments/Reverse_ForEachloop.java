package Assignments;

public class Reverse_ForEachloop {

public static void main(String[] args) {
	
	int i[] = {10,20,30,40,50};
// Recomended approach...	
	int count = i.length-1;
	for(int j : i)
	{
		j=count;
		System.out.println(i[j]); // 50 40 30 20 10 
		count--;
	}
System.out.println("--------------");
// 
	for(int k : i)
	{
		System.out.println(i[k]);  //AIOB
		k--;
	}
	
		
}
}
