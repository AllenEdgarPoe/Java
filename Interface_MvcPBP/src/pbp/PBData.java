package pbp;

public class PBData{
    private String name;
    private String number;
    private String birth;
    
    public PBData(String name, String number, String birth){
        this.name = name;
        this.number = number;
        this.birth = birth;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
}
