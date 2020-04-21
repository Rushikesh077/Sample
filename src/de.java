
public class de {
	static int j=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
        de p = new de();
        p.amethod(i);
        System.out.println(i);
        System.out.println(j);
        }
        public void amethod(int x){
        x=x*2;
        j=j*2;
        System.out.println("value of x:"+x);
        }
		
	
      
	}


