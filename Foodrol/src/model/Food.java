package model;

public class Food {

	//	フィールド
	private int id;
	private String name;
	private String category;
	private String strBestByDate;
	private String strUseByDate;

	//	コンストラクタ
	public Food(int id, String name, String category, String strBestByDate, String strUseByDate) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.strBestByDate = strBestByDate;
		this.strUseByDate = strUseByDate;
	}

	//	ゲッタ、セッタ
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStrBestByDate() {
		return strBestByDate;
	}

	public void setStrBestByDate(String strBestByDate) {
		this.strBestByDate = strBestByDate;
	}

	public String getStrUseByDate() {
		return strUseByDate;
	}

	public void setStrUseByDate(String strUseByDate) {
		this.strUseByDate = strUseByDate;
	}

}
