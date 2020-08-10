public class Printer extends Thread {
	int id;
	
	public Printer(int id) {
		this.id = id;
	}
	
	public void run() {
		if(id == 1) {
			for(int i = 1; i <= 5; i++)
				System.out.println("*** Impressora 1:  - " + i);
		}
		else {
			for(int i = 5; i >= 1; i--)
				System.out.println("$$$$$$ Impressora 2:  - " + i);
		}
	}
}
