package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 下記9個をローカル変数として宣言のみしてください
		// それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		// 初期化をしたそれぞれの変数に下記の値を代入してください
		
		// バイト型
		byte i;
		i = 0;
		i = 10;
		
		// 短整数型
		short i1;
		i1 = 0;
		i1 = 100;
		
		// 整数型
		int i2;
		i2 = 0;
		i2 = 1000;
		
		// 長整数型
		long i3;
		i3 = 0;
		i3 = 10000;
		
		// 単精度浮動小数点数型
		float i4;
		i4 = 0.0f;
		i4 = 9.5f;
		
		// 倍精度浮動小数点数型
		double i5;
		i5 = 0.0d;
		i5 = 10.5d;
		
		// 文字型
		char i6;
		i6 = '\u0000';
		i6 = 'a';
		
		// 文字列型
		String i7;
		i7 = null;
		i7 = "ハロー";
		
		// ブーリアン型
		boolean i8;
		i8 = false;
		i8 = true;
		
		
		// 下記の通りにコンソール出力されるようにしてください
		// 上記で作成した変数を必ず使用すること
		// 11110
		System.out.println(i3 + i2 + i1 + i);
		// 20
		System.out.println(i * 2);
		// a ハロー true
		System.out.println(i6 + i7 + i8);
		// 11130　数字を全て足す
		System.out.println(i + i1 + i2 + i3 + i4 + i5);
		// 10000000000　小数点以外の数字を全てかける
		System.out.println(i * i1 * i2 * i3);
		// 0.015　10.5割る100をする
		System.out.println(i5 / i1);
		// -90　10引く100をする
		System.out.println(i - i1);
		
		// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		// 「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		String num="20";
		int num1=23;
		// Stringクラスをint型に変換する
		int number = Integer.parseInt(num);
		
		System.out.println("ハローJAVA"+(number+num1));
		
		// 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		// ローカル変数に代入し○○に入れてください
		// 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		
		// ↓↓format↓↓
		// 「初めまして○○です」
		// 「年齢は○○歳です」
		// 「身長は○○cmです」
		// 「体重は○○kgです」
		// 「好きな食べ物は○○です」
		
		String name = "山田太郎";
		int age = 18;
		float height = 170.5f;
		float weight = 62.2f;
		String food = "寿司";
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		System.out.println("好きな食べ物は" + food + "です");
		
		
	}

}
