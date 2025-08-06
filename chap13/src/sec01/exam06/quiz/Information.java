package sec01.exam06.quiz;

public class Information {
	private String phone;
	private int salsry;
	
	public Information() {
	}

	public Information(String phone, int salsry) {
		super();
		this.phone = phone;
		this.salsry = salsry;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSalsry() {
		return salsry;
	}

	public void setSalsry(int salsry) {
		this.salsry = salsry;
	}

	@Override
	public String toString() {
		return "[전화번호=" + phone + ", 월급=" + salsry + "]";
	}
}
