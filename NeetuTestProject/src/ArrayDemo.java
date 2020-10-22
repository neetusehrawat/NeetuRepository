public class ArrayDemo {

	public static void main(String[] args) {
		
		// code to read two dimensional array
		int data[][]= {{100,200,300},{256,123,455,456},{45,6685,565,455,454}};
		for (int row=0;row<data.length;row++) {
			for(int column=0;column<data[row].length;column++) {
				
				System.out.println(data[row][column]);
				
			}
		}
	
		 // reverse of array
		
		int arraylength= data.length;
		System.out.println(arraylength);
		for (int row=data.length-1;row<data.length;row--) {
			 if (row<=-1) {
				 break;
			 }
			for(int column=(data[row].length)-1;column<data[row].length;column--) {
				 if (column<=-1) {
					 break;
				 }
				
				System.out.println(data[row][column]);
				
			}
			 }
		
		// to get prime number from array
		int dataPrime[]= {1,89,47,45,101,78};
		int cnt	;
		
		for( int i=0;i<dataPrime.length;i++) {
			
			cnt=0;
			for(int num=1;num<=dataPrime[i];num++) {
				if(dataPrime[i]%num==0) {
					cnt=cnt+1;	
				
				}
			}
		
				if (cnt==2) {
					System.out.println(dataPrime[i] + " is Prime number");
				
			}
			
		}
		
				 
			 
		 }
	
	}



 
	
	
			



