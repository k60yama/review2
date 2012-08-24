package jp.co.dhw.review2;

public class Students extends User{

	//メインメソッド
	public static void main(String[] args){
	
		//インスタンス生成
		User[] user = {
			new Students(1,"憲隆","武田"),
			new Students(2,"香","高木"),
			new Students(3,"伊織","柴田"),
			new Students(4,"有希子","長尾"),
			new Students(5,"真悟","酒見"),
			new Students(6,"憲和","武末"),
			new Students(7,"宏治","國崎"),
			new Students(8,"洋介","割鞘"),
			new Students(9,"大悟","榎枝"),
			new Students(10,"尭","今田"),
			new Students(11,"恭子","松隈"),
			new Students(12,"恒一","花田"),
			new Students(13,"初美","内藤"),
			new Students(14,"清司","原田"),
			new Students(15,"修平","永野"),
			new Students(16,"純一","奈木野"),
			new Students(17,"洋平","山之内"),
			new Students(18,"耕治","鐘ヶ江"),
			new Students(19,"龍真","野口"),
			new Students(20,"兼治","山野"),
			new Students(21,"洋介","皆川"),
			new Teacher(23,"大輔","長澤","デザイン"),
			new Teacher(24,"ジェイソン","ラディ","デザイン"),
			new Teacher(25,"隆","薄井","Web/アプリ"),
			new Teacher(26,"浩司","山本","3DCG"),
			new Teacher(27,"ノブユキ","ハナブサ","デザイン"),
			new Teacher(28,"ヨシツグ","コヌマ","Web/アプリ"),
			new Teacher(29,"昇治","渡部","Web/アプリ")
		};

		//ループ処理
		for(int i = 0; i < user.length; i++){
			
			//コンソール出力
			System.out.print("氏名→");

			//インスタンスメソッド実行
			user[i].showName();
		}
	}
	
	//コンストラクタ
	public Students(Integer _id, String _firstName, String _lastName){
		
		//Userクラスのコンストラクタ実行
		super(_id,_firstName,_lastName);
	}
}