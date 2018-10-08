package org.liferayasif.accessspecifier;
 
public class ProtectedClassEx {

	protected class ProctectedClss{
	
		private int i = 20;
		
		private void fun(){
			System.out.println("fun i shahbaz changes: "+i);
		}
		
		private void gum(){
			fun();
		}
		
		public void fff(){
			System.out.println("hi: ");
			gum();
		}
	}
	
	public static void main(String [] args) 
    {
        int I = 1;
        do 
        	for(int i = 0 ; i<10 ; i++)
        System.out.println("I is " + i);
        
       
        while ( I > 1 ) ;
    }
}

