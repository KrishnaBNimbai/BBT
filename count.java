package basic.java;

public class Count {
public static void main(String[] args) {
    long num = 245136485873l; 
		int count = 0;
    if(num == 0) {
			System.out.println(1);
		}
		else {
			for(long j = num ; j > 0 ; j = j/10) {
				count ++;
			}
			System.out.println(count);
				
		}
		    

	}

}
