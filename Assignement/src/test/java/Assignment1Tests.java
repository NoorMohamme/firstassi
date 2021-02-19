
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileSystemUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author STUDENT_NAME //TODO
 *
 */
public class Assignment1Tests {

	/**
	 * This will prepare the environment to run all tests
	 */
	@BeforeClass
	public static void initialSetup() {
		System.out.println("Initialising the start running the tests tests ");
	}

	/**
	 * This will test .....
	 */
	@Test
	public void test1() {
		System.out.println("running test1");
	}

	/**
	 * This will test the free space
	 * @throws IOException
	 */
	@Test
	public void test9() throws IOException {
		int sizeInMB = (int) (FileSystemUtils.freeSpaceKb("C:") / 1024);
		int sizeInKB = (int) FileSystemUtils.freeSpaceKb("C:");
		assertEquals(sizeInKB / 1024, sizeInMB);
	}

	/**
	 * This will test making a directory
	 */
	@Test
	public void test10() {
		File file = new File("my Folder");
		boolean isCreated = file.mkdir();
		assertTrue(isCreated);
	}
}

