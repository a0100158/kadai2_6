import java.util.Scanner;

public class kadai2_6 {
	public static void main(String args[]){
		System.out.println("うるう年かどうかを判定します。");
		System.out.println("整数を入力してください。");
		Scanner scan = new Scanner(System.in);
		int intSeisu = scan.nextInt();

		if(intSeisu % 400 == 0){
			System.out.println( intSeisu + "年はうるう年です。" );
		}else if(intSeisu % 100 == 0){
			System.out.println( intSeisu + "年はうるう年ではありません。" );
		}else if(intSeisu % 4 == 0){
			System.out.println( intSeisu + "年はうるう年です。" );
		}else{
			System.out.println( intSeisu + "年はうるう年ではありません。" );
		}
	}

}
