import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class IPAddress {

	public static void main(String[] args) {
		String ipAddress = "10.255.12548.122";

		boolean isValid = validateIPAddress(ipAddress);
		System.out.println(isValid);

	}

	private static boolean validateIPAddress(String ip) {
		StringTokenizer tokenizer = new StringTokenizer(ip, ".");
		int partNumber = 0;
		System.out.println(tokenizer.countTokens());
		if (tokenizer.countTokens() == 4) {

			while (tokenizer.hasMoreTokens()) {

				partNumber = Integer.parseInt(tokenizer.nextToken());

				if (partNumber < 0 || partNumber > 255) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}

}
