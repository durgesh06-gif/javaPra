package Encapsulation;

import OOPS.Abstraction.AC;
import OOPS.Abstraction.DGboard;
import OOPS.Abstraction.Device;
import OOPS.Polymorphism.Sbi;

public class praa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Device  a= new DGboard();
		a.start();
		

		Device device = new AC() {
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("laptop start");
				
			}
		};
		device.start();
		device.precu();
	}

}
