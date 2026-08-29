package model;

import java.time.LocalDate;

public class Food {

	//	フィールド
	private int id;
	private String name;
	private String category;
	private LocalDate bestByDate;
	private LocalDate useByDate;

	//	コンストラクタ
	public Food(int id, String name, String category, LocalDate bestByDate, LocalDate useByDate) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.bestByDate = bestByDate;
		this.useByDate = useByDate;
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

	public LocalDate getBestByDate() {
		return bestByDate;
	}

	public void setBestByDate(LocalDate bestByDate) {
		this.bestByDate = bestByDate;
	}

	public LocalDate getUseByDate() {
		return useByDate;
	}

	public void setUseByDate(LocalDate useByDate) {
		this.useByDate = useByDate;
	}

}
