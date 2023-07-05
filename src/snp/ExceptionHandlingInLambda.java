package snp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandlingInLambda {

	public static void main(String[] args) {
		List<String> strList=Arrays.asList("123","336","are");
		List<Integer> itrList=Arrays.asList(10,7,0);
		//strList.forEach(i->convertList(i));
		strList.forEach(handleGenricException(s->System.out.println(Integer.parseInt(s)), NumberFormatException.class));
		itrList.forEach(handleGenricException((i->System.out.println(10/i)), ArithmeticException.class));
		itrList.forEach(handleCheckedException(Thread::sleep));
	}

	private static void convertList(String i) {
		try {
			System.out.println(Integer.parseInt(i));
		} catch (NumberFormatException e) {
			System.out.println("Illeagle state "+e.getMessage());
			
		}
	}
	
	private static <Target,ExeObj extends Exception> Consumer<Target>  handleGenricException(Consumer<Target> targetOb,Class<ExeObj> ex){
		return obj->{
			try {
				targetOb.accept(obj);
			} catch (Exception e) {
				try {
				ExeObj exe=ex.cast(e);
				System.out.println("Exception occur"+exe.getMessage());
				}catch(ClassCastException exp) {
					throw exp;
				}
			}
		};
	}
	
	private static <Target> Consumer<Target>  handleCheckedException(HandleException<Target,Exception> fIn){
		return obj->{
		 try {
			fIn.test(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		};
	}
}
