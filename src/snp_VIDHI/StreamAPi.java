package snp_VIDHI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPi {
	public static void main(String[] args) {
		Auther au1=new Auther(1234, "Auther1");
		Auther au2=new Auther(1234, "Auther2");
		Auther au3=new Auther(124, "Auther3");
		List<Auther> autList=new ArrayList<>();
		autList.add(au1);
		autList.add(au2);
		autList.add(au3);
		
		autList.stream().collect(Collectors.groupingBy(Auther::getIsbnNumber)).forEach((i,j)->{
			System.out.println(i+" "+j.toString());
			
		});
	}
	@Override
	public String toString() {
		return "StreamAPi []";
	}
	static class Auther{
		@Override
		public String toString() {
			return "Auther [isbnNumber=" + isbnNumber + ", name=" + name + "]";
		}
		int isbnNumber;
		String name;
		
		public Auther(int isbnNumber, String name) {
			super();
			this.isbnNumber = isbnNumber;
			this.name = name;
		}
		
		public int getIsbnNumber() {
			return isbnNumber;
		}
		public void setIsbnNumber(int isbnNumber) {
			this.isbnNumber = isbnNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}

}
