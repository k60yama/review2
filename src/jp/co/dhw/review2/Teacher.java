package jp.co.dhw.review2;

public class Teacher extends User{

	public String subject;

	public static void main(String[] args){

		//インスタンス化
		Teacher nagasawa_t = new Teacher(1, "長澤", "大輔", "デザイン");
		nagasawa_t.showName();

		Teacher raddi_t = new Teacher(2, "ラディ", "ジェイソン", "デザイン");
		raddi_t.showName();

		Teacher usui_t = new Teacher(3, "薄井", "隆", "Web/アプリ");
		usui_t.showName();

		Teacher yamamoto_t = new Teacher(4, "山本", "浩司", "3DCG");
		yamamoto_t.showName();

		Teacher hanabusa_t = new Teacher(5, "ハナブサ", "ノブユキ", "デザイン");
		hanabusa_t.showName();

		Teacher konuma_t = new Teacher(6, "コヌマ", "ヨシツグ", "Web/アプリ");
		konuma_t.showName();

		Teacher watanabe_t = new Teacher(7, "渡部", "昇治", "Web/アプリ");
		watanabe_t.showName();
	}

	public void Teacher(Integer num, String fName, String lName, String sub){

		this.id = num;
		this.firstName = fName;
		this.lastName = lName;
		this.subject = sub;
	}

	public String getSubject(){

		return this.subject;
	}

	@Override
	public void showName(){

		System.out.println("氏名" + this.firstName + ":" + this.lastName + "教科" + this.subject);
	}
}