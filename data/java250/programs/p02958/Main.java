import java.util.*;

public class Main {
	private static final String TEST = "7 1 2 3 4 5 6 7";
	Scanner sc;
	
	int N;
	int[] p;
	

	public Main() {
		sc = new Scanner(System.in);
	}
	public Main(String input) {
		sc = new Scanner(input);
	}
	

	void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	public void exec() throws Exception {
		N = sc.nextInt();
		p = new int[N];
		for (int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
		}
		
		int[] descendIndex = new int[3];
		int descendCnt = 0;
		
		for (int i = 0; i < N-1; i++) {
			if (p[i] > p[i+1]) { 
				descendIndex[descendCnt++] = i;
				if (descendCnt > 2) break;
			}
		}








		
		int i, j;
		switch (descendCnt) {
		
		case 0:
			out("YES");
			break;
		
		case 1:	
			i = descendIndex[0];
			
			if (i != 0) { 
				if (p[i-1] > p[i+1]) {
					out("NO"); 
					return;
				}
			}
			if (i < N-2) { 
				if (p[i] > p[i+2]) {
					out("NO");
					return;
				}
			}
			out("YES");
			return;
		
		case 2: 
			i = descendIndex[0];
			j = descendIndex[1]; 
			
			
			
			if (i != 0) {
				if (p[i-1] > p[j+1]) {
					out("NO");
					return;
				}
			}
			if (p[j+1] > p[i+1]) {
				out("NO");
				return;
			}
			if (j+1 < N-1) {
				if (p[i] > p[j+2]) {
					out("NO");
					return;
				}
			}
			if (p[j] > p[i]) {
				out("NO");
				return;
			}
			out("YES");
			return;
		
		default:	
			out("NO");
			return;
		}
	}
	

	public static void main(String[] args) throws Exception {
		Main m = new Main();
		m.exec();
	}
}

	