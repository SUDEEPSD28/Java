public class ThirdPgm{
	public static void main (String[] args) {
		System.out.println(args.length);
		int sum = 0;
		for(int i=0;i<args.length ;i++ ) {
			sum = sum + Integer.parseInt(args[i]);

		}
		System.out.println(sum);
		/*System.out.println(args[0]+ args[1]+ args[2]);
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		System.out.println(a + b + c);*/
	}

}