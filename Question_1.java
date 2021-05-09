public class Question_1 {
	static String starString(int n) {

		String result = "";

		if(0<=n) {
			long stringLength = 1;
			for (; 0<n ; --n) {
				stringLength *= 2;
			}
			while(result.length() < stringLength){
				result = result.concat("*");
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(starString(2));
	}
}