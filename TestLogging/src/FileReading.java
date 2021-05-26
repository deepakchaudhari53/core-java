import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileReading {

	public static void main(String[] args) throws IOException {
		readFile();
	}

	private static void readFile() throws IOException {
		FileReader fileReader = new FileReader(new File("new.txt"));
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String s = null;
		String s1 = null;
		while ((s = bufferedReader.readLine()) != null) {

			StringTokenizer tokenizer = new StringTokenizer(s, "-");
			s1 = tokenizer.nextToken();
			if (s1 != null&&!s1.isEmpty()&& !s1.equals(" ")) {
				System.out.println("Emp id exists");
			}

		}

	}
}