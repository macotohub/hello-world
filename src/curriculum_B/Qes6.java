package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// ・条件演算子を使用すること　※普通のif文は使用不可
		// ・Switch文内でテレビとディスプレイは続けて書くようにしてください、条件演算子で出力される値を変更してください
		// ・テレビとディスプレイは同じ商品扱いとし、ディスプレイが出た場合は最大個数の11個からランダムで出た数字を引いて出力してください 
		// ・例：テレビと受け取った場合、→「テレビの残り台数は〇〇台です」※〇〇はランダムで出た数字
		
		
		// 家電をhomeApplianceに格納
		//String homeAppliance[] = {"パソコン","冷蔵庫","扇風機","洗濯機","加湿器","テレビ","ディスプレイ"};
		
		for(;;) {
			Scanner scanner = new Scanner(System.in);
			String text = scanner.next();
			String[] array = {text};
			array = text.split("、");
			
			
			for(String str:array) {
				switch(str) {
					case "パソコン":
						System.out.println("パソコンの残り台数は"+remaining()+"台です");
						break;
					case "冷蔵庫":
						System.out.println("冷蔵庫の残り台数は"+remaining()+"台です");
						break;
					case "扇風機":
						System.out.println("扇風機の残り台数は"+remaining()+"台です");
						break;
					case "洗濯機":
						System.out.println("洗濯機の残り台数は"+remaining()+"台です");
						break;
					case "加湿器":
						System.out.println("加湿器の残り台数は"+remaining()+"台です");
						break;
					case "テレビ":
						System.out.println("テレビの残り台数は"+remaining()+"台です");
						break;
					case "ディスプレイ":
						System.out.println("ディスプレイの残り台数は"+remaining()+"台です");
						break;
						
					// 指定の家電以外が入力されたらエラー文を表示させる	
					default:
						System.out.println("『"+str+"』は指定の商品ではありません");
					}	
			};
		}
		
		
	}
	
	
	// 残数をランダムに出すメソッド
	public static int remaining() {
		Random rand = new Random();
		// 0~11でランダムに出た値を返す
		return rand.nextInt(11);
	};
}
