
public class Pattern1 {

	public static void main(String[] args) {
		int row=7,col=6,i,j;
		char x;
		for(i=0;i<row;i++){
			x='A';
			for(j=col;j>=i;j--){
				if(i==0 && j==0){
					x++;
					continue;
				}
					
				System.out.print(x++);
			}
			for(j=1;j<=i;j++) {
				
				System.out.print(" ");
			}
			
				
			x--;
			for(j=0;j<i-1;j++){
				System.out.print(" ");
			}
			for(j=col;j>i-1;j--){
				System.out.print(x--);
			}
			System.out.println(" ");
		}
		
	}
		
		
	}


