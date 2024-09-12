import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tesst {
	@BeforeClass
	public static void tc01() {
		System.out.println("Method 1");
	}

	@AfterClass
	public static void tc02() {
		System.out.println("Method 2");
	}

	@BeforeClass
	public static void tc03() {
		System.out.println("Method 3");
	}

	@AfterClass
	public static void tc04() {
		System.out.println("Method 4");
	}

	@Test
	public static void tc05() {
		System.out.println("Method 5");
	}

	@Test
	public static void tc06() {
		System.out.println("Method 6");
	}

	public static void tc07() {
		System.out.println("Method 7");
	}

}
