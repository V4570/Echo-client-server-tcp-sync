public class Count {
	private static volatile int anum;
	
	public Count () {
		anum = 0;
	}

	public /*synchronized*/ void increment() {
	    	int temp;
            	temp = anum;
            	System.out.println("Thread is "+ Thread.currentThread().getName()+" n =" +temp);
        	try {
         	 	Thread.sleep((int)(Math.random()*50));
        	} catch (InterruptedException e) { }
               	anum = temp + 1;
		System.out.println("Thread is "+ Thread. currentThread().getName()+" n <=" +(temp+1));
        }

        public /*synchronized*/ String print () {
	    return String.valueOf(anum);
        }
}