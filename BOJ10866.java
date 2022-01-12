import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10866 {
	
	public static int[] deque;
	public static int size = 0;
	public static int start = 0;
	
	//정수 X를 덱의 앞에 넣는다.
	public static void push_front(int X) {
		
		if(size == 0) {
			deque[0] = X;
			size++;
		}
		else {
			for(int i=size+start; i>start; i--) {
				deque[i] = deque[i-1]; 
			}
			deque[start] = X;
			size++;		
		}	
	}
	
	//정수 X를 덱의 뒤에 넣는다.
	public static void push_back(int X) {
		
		if(size == 0) {
			deque[0] = X;
			size++;
		}
		else {
			deque[size+start] = X;
			size++;		
		}
		
	}
	
	//덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static int pop_front() {
		
		if(size == 0) {
			return -1;
		}
		else {
			int answer = deque[start];
			deque[start] = 0;
			size--;
			if(size == 0) {
				start = 0;
			}else {
				start++;
			}
			return answer; 
		}
	}
	
	//덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static int pop_back() {
		
		if(size == 0) {
			return -1;
		}
		else {
			int answer = deque[size-1+start];
			deque[size-1+start] = 0;
			size--;
			if(size == 0) {
				start = 0;
			}
			return answer;
		}
		
	}
	
	//덱에 들어있는 정수의 개수를 출력한다.
	public static int size() {
		return size;
		
	}
	
	//덱이 비어있으면 1을, 아니면 0을 출력한다.
	public static int empty() {
		if(size == 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	//덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static int front() {
		
		if(size == 0) {
			return -1;
		}
		else {
			return deque[start];
		}
	}
	
	//덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static int back() {
		
		if(size == 0) {
			return -1;
		}
		else {
			return deque[size - 1 + start];
		}
		
	}

	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		deque = new int[N];
		
		for(int i=0;i<N;i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
			switch(st.nextToken()) {
			
				case "push_front":
					push_front(Integer.parseInt(st.nextToken()));
					break;
					
				case "push_back":
					push_back(Integer.parseInt(st.nextToken()));
					break;
					
				case "pop_front":
					sb.append(pop_front()).append('\n');
					break;
					
				case "pop_back":
					sb.append(pop_back()).append('\n');
					break;
					
				case "size":
					sb.append(size()).append('\n');
					break;
					
				case "empty":
					sb.append(empty()).append('\n');
					break;
					
				case "front":
					sb.append(front()).append('\n');
					break;
					
				case "back":
					sb.append(back()).append('\n');
					break;
					
			}
		}
		
		System.out.print(sb);
		
		
	}

}
