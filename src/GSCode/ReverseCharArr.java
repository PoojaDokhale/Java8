package GSCode;

public class ReverseCharArr {
	public static void main(String[] args) {
		String str="abc.xyz-pqr";
		char []strarr=str.toCharArray();
		int l=strarr.length;
		char []t=new char[l];
		int x=0;
		for(int i=0;i<l;i++) {
			if(strarr[i]>='a' && strarr[i]<='z' ||
					strarr[i]>='A' && strarr[i]<='Z') {
				t[x]=strarr[i];
				x++;
			}
		}
		rev(t, 0,x);
		x=0;
		for(int i=0;i<l;i++) {
			if(strarr[i]>='a' && strarr[i]<='z' ||
					strarr[i]>='A' && strarr[i]<='Z') {
				strarr[i]=t[x];
				x++;
			}
		}
		String s=new String(strarr);
		System.out.println(s);
	}

	private static void rev(char[] strarr,int r, int l) {
		for (int i=r;i<l/2;i++ ) {
			char temp=strarr[i];
			strarr[i]=strarr[l-1-i];
			strarr[l-1-i]=temp;
		}
		String s=new String(strarr);
	}

}
