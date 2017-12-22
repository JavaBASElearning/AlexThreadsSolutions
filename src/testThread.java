
public class testThread  implements Runnable {
	
	
	public int testval;
	public  int sum;
	private DelegateOfSomeOperation delegate;
	
	
	 
	
	public void setDelegate(DelegateOfSomeOperation delegate) {
		this.delegate = delegate;
		}
	
	
/*	public int getval () {
		
	int	s = this.testval;
		return s;
			
	}
	
	public void setval (int y) {
		
		this.testval = y;
			
				
		}*/
	
	 
	 @Override
	    public void run() {
	           
		 sum = (sum +2) * 2;
		 delegate.modifystate(sum);   	       
	        
	    }
	    

}
