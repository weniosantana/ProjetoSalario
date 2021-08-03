package salary;

public class descontos {
	public double inss;
	public double vt;
	public double vr;
	public double cust;
	public double salariobruto;
	public double descont;
	public double descontoadiant;
	public double ajudacust;
	
	public void descontoInss(double porcentagem) {
		
		salariobruto -= salariobruto * porcentagem / 100.00; 
	}
	
	public void descontoVr(double porcentagem) {
		salariobruto -= salariobruto * porcentagem / 100.00; 
	}
	
	public void descontoVt(double porcentagem) {
			
			descont = salariobruto * porcentagem / 100.00;
			salariobruto -= descont;
			
	}
	
	public void descontoCust(int ajuda) {
			if(ajuda == 1) {
			salariobruto = salariobruto + ajudacust + descont;
			}
			else {
				
			}
	}
	
	public void descontoAdiant(int adiant) {
		
		if(adiant == 1) {
			salariobruto = salariobruto - descontoadiant;
		}
		else {
			
		}
}
	public String toString() {
		
		return String.format("Salario Final: R$ %.2f ",salariobruto);
	}
}
