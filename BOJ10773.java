import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10773 {
	
	public static int arr[];
	public static int size = 0;
	
	public static void push(int X) {
		arr[size] = X;
		size++;
	}
	
	public static void pop() {
		arr[size-1] = 0;
		size--;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int K = Integer.parseInt(br.readLine());
		
		arr = new int[K];
		
		for(int i=0;i<K;i++) {
			
			int num = Integer.parseInt(br.readLine());
			
			if(num == 0) {
				pop();
			}
			else {
				push(num);
			}
			
		}
		
		int sum = 0;
		
		while(K-- > 0) {
			sum += arr[K];
		}
		System.out.println(sum);
	}

}
