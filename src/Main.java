
public class Main implements DelegateOfSomeOperation{
	public  int mySum;

	
		public void met (){
			
			
			testThread writeToFile = new testThread();
			writeToFile.setDelegate(this);
		       // System.out.println("Стартуем thread потоки");
		        Thread t1 = new Thread(writeToFile);  
		        t1.start();
		        try {
					t1.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        System.out.println(mySum);
			
		}
		
		
	        
		
	
	
	public static void main(String[] args)  {
		
		 
	Main m = new Main ();
	m.met();
	  
		
	        
	       
	        
	
	}
	
	
	public void modifystate(int i) {
		
		mySum = i;	
		System.out.println("Я вызвалась");
	}
	

}
