package jp.co.dhw.review2;

public class User{

	//インスタンス変数宣言
	public Integer id;
	public String firstName;
	public String lastName;

	//メインメソッド
	public static void main(String[] args){
		
		//インスタンス生成
		User[] user = {
			new User(1,"憲隆","武田"),
			new User(2,"香","高木"),
			new User(3,"伊織","柴田"),
			new User(4,"有希子","長尾"),
			new User(5,"真悟","酒見"),
			new User(6,"憲和","武末"),
			new User(7,"宏治","国崎"),
			new User(8,"洋介","割鞘"),
			new User(9,"大悟","榎枝"),
			new User(10,"尭","今田")
		};

		//ループ処理
		for(int i = 0; i < user.length; i++){
			//表示するインスタンスメソッド実行
			user[i].show();
		}
	}

	//インスタンスメソッド
	public void showName(){
		
		//コンソール出力
		System.out.println(this.lastName + ":" + this.firstName);
	}

	//インスタンスメソッド
	public void show(){

		//コンソール出力
		System.out.println("ｉｄ→" + this.id);
		System.out.println("氏名→" + this.lastName + this.firstName);
	}

	//コンストラクタ
	public User(Integer _id, String _firstName, String _lastName){
		
		//インスタンス変数初期化
		this.id = _id;
		this.firstName = _firstName;
		this.lastName = _lastName;
	}

}