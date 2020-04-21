import java.util.Scanner;

public class StringRevesrRecursion {

	public String Reverse(String str)
	{
		String s="";
		if(str.length()==1)
		{
			return str;
		}
		else
		{
			s+=str.charAt(str.length()-1)+Reverse(str.substring(0,str.length()-1));
			return s;
		}
	}



	//CODE FOR WITHOUT ALTERNATING POSITION


	public String reverseWordByWord(String str){
		int strLeng = str.length()-1;
		String reverse = "", temp = "";
		System.out.println(strLeng);

		for(int i = 0; i <= strLeng; i++){
			temp += str.charAt(i);
			System.out.print(str.charAt(i));
			if((str.charAt(i) == ' ') || (i == strLeng)){
				for(int j = temp.length()-1; j >= 0; j--){
					reverse += temp.charAt(j);
					if((j == 0) && (i != strLeng))
						reverse += " ";
				}
				temp = "";
			}
		}
		System.out.println(reverse);
		return reverse;

	}




	public static void main(String[] args) {

		StringRevesrRecursion s=new StringRevesrRecursion();
		Scanner sr=new Scanner(System.in);
		System.out.println("PLEASE ENTER STRING");
		String st=sr.nextLine();
		System.out.println("Reverse"+"  "+s.Reverse(st));
		//	s.reverseWordByWord(st);
	/*	String words[]=st.split(" ");

		String reverse = "";
		for (int i = 0; i < words.length; i++) {
			for (int j = words[i].length() - 1; j >= 0; j--) {
				reverse += words[i].charAt(j);
			}
			System.out.print(reverse + " ");
			reverse = "";*/
		//}
	}

}
