package jp.co.dhw.review2;

public class Teacher extends User{
	
	//インスタンス変数宣言
	public String subject;
	
	//コンストラクタ
	public Teacher(Integer _id, String _firstName, String _lastName, String _subject){
		
		//Userクラスのコンストラクタ実行
		super(_id,_firstName,_lastName);
		
		//インスタンス変数初期化
		this.subject = _subject;
	}

	//インスタンスメソッド
	public String getSubject(){
		
		//戻り値
		return this.subject;
	}

	//オーバーライド
	@Override
	public void showName(){
		
		//UserクラスのshowName()実行
		super.showName();

		//コンソール出力
		System.out.println("教科：" + this.getSubject());
	}
}