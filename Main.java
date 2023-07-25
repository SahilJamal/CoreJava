import java.util.*;
public class Main {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n1, n2, lcm;
	sop("Enter your first value");
	n1=sc.nextInt();
	sop("Enter your second value");
	n2=sc.nextInt();
    // maximum number between n1 and n2 is stored in lcm
    lcm = (n1 > n2) ? n1 : n2;

    // Always true
    while(true) {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
        break;
      }
      ++lcm;
    }
  }
}
