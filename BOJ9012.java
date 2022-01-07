import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ9012 {
	
	public static void main(String[] args) throws IOException{
		
		// 짝이 맞아야함 (= open과 close의 갯수가 같아야함)
		// () 이 경우에만 되고 )( 이런 경우에는 안되겠지
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			
			String[] arr = br.readLine().split("");
			
			int open = 0;
			int close = 0;
			
			for(int j=0;j<arr.length;j++) {
	        	
				if(arr[j].equals("(")) {
					open++;
				}
				else {
					close++;
					if(close > open) {
						System.out.println("NO");
						break;
					}
				}
			}
				
				if(open == close) {
					System.out.println("YES");
				}
				
				if(open > close) {
					System.out.println("NO");
				}
				
		}
	}

}
