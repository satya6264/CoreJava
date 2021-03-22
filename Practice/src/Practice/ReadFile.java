package Practice;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		Account accounts[] = new Account[5];
		try {
			fr = new FileReader("src/Practice/account.txt");
			br = new BufferedReader(fr);

			String data = null;
			int index = 0;
			while ((data = br.readLine()) != null) {
				String[] dataArr = data.split(",");
				Account account = new Account();
				account.setAid(Integer.parseInt(dataArr[0]));
				account.setAname(dataArr[1]);
				account.setAbal(Double.parseDouble(dataArr[2]));
				accounts[index] = account;
				index++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i]);
		}
	}

}