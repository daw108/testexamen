package modelo;

import java.util.Random;

public class Dado {

	private int cara;
	private int testAleatorio[] = { 0, 0, 0, 0, 0, 0, 0 };
	private int numerotiradas;
	
	public Dado() {

	}

	public int getCara() {
		return cara;
	}

	public void setCara(int cara) {
		this.cara = cara;
		
	}

	public int lanzarDado() {
		Random random = new Random();
		cara = random.nextInt(6) + 1;
		return cara;
	}
	
	public void realizarTest(int numerotiradas){
		for(int i=0;i<testAleatorio.length;i++){
			
			
			if(testAleatorio[i]==1){
				numerotiradas++;
			}else if(testAleatorio[i]==2){
				numerotiradas++;
			}else if (testAleatorio[i]==3){
				numerotiradas++;
			
			}else if (testAleatorio[i]==4){
				numerotiradas++;
				
			}else if (testAleatorio[i]==5){
				numerotiradas++;
			}else if (testAleatorio[i]==6)
				numerotiradas++;
		}
	}

	public int getNumerotiradas() {
		return numerotiradas;
	}

	public void setNumerotiradas(int numerotiradas) {
		this.numerotiradas = numerotiradas;
	}
	
	

}
