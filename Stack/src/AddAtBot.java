import java.util.Stack;

public class AddAtBot {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.add(1);
		s.add(2);
		s.add(3);

		AddAtBot(5, s);
		while(! s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
	public static void AddAtBot(int data,Stack<Integer> s ) {
		
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		AddAtBot(data, s);
		s.push(top);
	
	}
}
