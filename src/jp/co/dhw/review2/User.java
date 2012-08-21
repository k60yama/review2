package jp.co.dhw.review2;

public class User{

	public Integer id;
	public String firstName;
	public String lastName;

	public static void main(String[] args){

		//インスタンス生成
		User yamanouchi = new User(1,"山之内","洋平");
		yamanouchi.showName();

		User yamano = new User(2,"山野","兼治");
		yamano.showName();

		User matuguma = new User(3,"松隈","京子");
		matuguma.showName();

		User minagawa = new User(4,"皆川","洋介");
		minagawa.showName();

		User shibata = new User(5,"柴田","伊織");
		shibata.showName();

		User tokunaga = new User(6,"徳永","祐介");
		tokunaga.showName();

		User noguchi = new User(7,"野口","龍真");
		noguchi.showName();

		User hanada = new User(8,"花田","恒一");
		hanada.showName();

		User kanegai = new User(9,"鐘々江","耕治");
		kanegai.showName();

		User nagino = new User(10,"奈木野","純一");
		nagino.showName();
	}

	//コンストラクタ
	public void User(Integer num, String fName, String lName){
		
		this.id = num;
		this.firstName = fName;
		this.lastName = lName;
	}

	//インスタンスメソッド
	public void showName(){

		System.out.println("氏名" + this.firstName + ":" + this.lastName);
	}

}