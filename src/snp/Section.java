package snp;

import java.util.List;

class Section{
	String secName;
    List<Student> stdsList ;

	
    @Override
	public String toString() {
		return "Section [secName=" + secName + ", stdsList=" + stdsList + "]";
	}
	public Section(String secName, List<Student> stdsList) {
		super();
		this.secName = secName;
		this.stdsList = stdsList;
	}
	public String getSecName() {
		return secName;
	}
	public void setSecName(String secName) {
		this.secName = secName;
	}
	public List<Student> getStdsList() {
		return stdsList;
	}
	public void setStdsList(List<Student> stdsList) {
		this.stdsList = stdsList;
	}
	}
