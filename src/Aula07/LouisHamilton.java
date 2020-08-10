public class LouisHamilton extends Thread {
	
	private int totalTime;

	public void run() {
		totalTime = 0;
		
		for(int i = 0; i < 5; i++) {
			double timeLap = Math.floor(Math.random() * 1000);
			
			try {
				sleep((int)timeLap);
			} catch(InterruptedException e) {}
			totalTime += timeLap;
			System.out.println("Tempo do Carro 2:  na volta " + (i + 1) + " - " + timeLap);
		}
	}
	
	public int getTotalTime() {
		return totalTime;
	}
}