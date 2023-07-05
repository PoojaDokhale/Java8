package snp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("123", "455", "xy");
		List<Integer> itrList = Arrays.asList(10, 50, 6, 0);
		strList.forEach(
				handleUnCheckedException(i -> System.out.println(Integer.parseInt(i)), NumberFormatException.class));
		itrList.forEach(handleUnCheckedException(i -> System.out.println(10 / i), ArithmeticException.class));

		itrList.forEach(handlecheckedException(i -> {
			Thread.sleep(i);
			System.out.println(i);
		}));

	}

	private static Consumer<? super String> handle() {
		return i -> {
			try {
				System.out.println(Integer.parseInt(i));
			} catch (Exception e) {
				System.out.println("Exception Occure" + e.getMessage());
			}

		};
	}

	private static <Target, ExeObject extends Exception> Consumer<Target> handleUnCheckedException(
			Consumer<Target> targetObject, Class<ExeObject> ex) {
		return obj -> {
			try {
				targetObject.accept(obj);
			} catch (Exception e) {
				try {
					ExeObject exm = ex.cast(e);
					System.out.println(exm.getMessage());
				} catch (ClassCastException e2) {
					throw e2;
				}
			}
		};
	}

	private static <Target> Consumer<Target> handlecheckedException(HandleException<Target, Exception> targetObj) {
		return obj -> {
			try {
				targetObj.test(obj);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		};
	}

}
