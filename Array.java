package simple;

public class Array {

	public static void main(String[] args) {
	  int a[]=new int[5];
      a[0]=10;
      a[1]=20;
      a[2]=30;
      a[3]=40;
      a[4]=50;
      a[5]=60;
      int b[]= {10,4,8,2,9};
      for(int i=0; i<a.length; i++)
      {
    	  System.out.println("Traversing array:"+a[i]);
      }
      for(int j:b)
      {
    	System.out.println("printing array using for-each loop:"+j);  
      }
	}

}
