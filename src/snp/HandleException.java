package snp;

@FunctionalInterface
public interface HandleException<Target,ExeObj extends Exception> {
	void test(Target tarObject) throws ExeObj;
}
