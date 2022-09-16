import java.util.StringTokenizer;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="Welcome to Wiley,This gives you a great oppurtunity!!!";
		String[] words=data.split(" ");
		for(String word:words) {
			System.out.println(word);
		}
		
		StringTokenizer tokens=new StringTokenizer("Welcome to java programming"," ");
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
		
		String complicatedString="Hi all!! I am Poojitha:)U can call me @ Pooji_poojitha";
		String[] meaningfulwords=complicatedString.split("[!,?.*_'@\\\\ ]+");
		for(String word:meaningfulwords) {
			System.out.println(word);
		}
		
	}
}
	