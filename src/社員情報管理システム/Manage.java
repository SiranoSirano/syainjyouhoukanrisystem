package 社員情報管理システム;

public class Manage {
	void run() {
		this.printWelcomeMessage();
	}

	void printWelcomeMessage() {
		System.out.println("ようこそ社員情報管理システムへ");
	}

	public static void main(String[] args) {
		Manage mng = new Manage();
		mng.run();

	}

}
