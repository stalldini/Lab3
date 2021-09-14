import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int beg, end = 0;
		Scanner S = new Scanner(System.in);
    System.out.println("Enter a number to count down or up from: ");
    beg = S.nextInt();

		System.out.println("Beginning Countdown In ... \n");
			if(beg<end){
					
				do{
					System.out.println(beg);
					beg++; }
				while(beg<=end);
				}		
			else if (end<beg){
				
				do{
					System.out.println(beg);
					beg--; }
				while(end<=beg);
				}
		System.out.println("\nBlast Off");
  }
}