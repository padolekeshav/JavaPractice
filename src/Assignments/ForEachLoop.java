package Assignments;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int i[] = {10,20,30,40};
		for(int j:i)
		{
			System.out.println(j);
		}
		System.out.println("--------------");
		String browser[] = {"chrome", "Edge", "Firefox", "safari"  };
		for(String br : browser)
		{
			System.out.println(br);
			
			if(br.equals("Firefox"))
			{
				System.out.println("Launch firefox browser..");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
