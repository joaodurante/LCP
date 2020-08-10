public class Ex01 extends Thread {
	
	public static void main(String[] args) throws InterruptedException {
		FernandoAlonso c1 = new FernandoAlonso();
		LouisHamilton  c2 = new LouisHamilton();
		
		c1.start();
		c2.start();
		
		c1.join();
		c2.join();
		
		System.out.println("Tempo final do carro 1: - " + c1.getTotalTime());
		System.out.println("Tempo final do carro 2: - " + c2.getTotalTime());
		
		if(c1.getTotalTime() < c2.getTotalTime())
			System.out.println("Carro 1 venceu: " + c1.getTotalTime());
		else if(c1.getTotalTime() > c2.getTotalTime())
			System.out.println("Carro 2 venceu: " + c2.getTotalTime());
		else
			System.out.println("Empate!");
	}
}
