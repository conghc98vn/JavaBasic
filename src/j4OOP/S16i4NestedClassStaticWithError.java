package j4OOP;

class MotherBoard164 {
	String model;

	public MotherBoard164(String model) {
		this.model = model;
	}

	// static nested class
	static class USB {
		int usb2 = 2;
		int usb3 = 1;

//		int getTotalPorts() {
//			// accessing the variable model of the outer classs
//			if (MotherBoard164.this.model.equals("MSI")) { // Không gọi được các thuộc tính của class ngoài bơi vì class hiện tại là static
//				return 4;
//			} else {
//				return usb2 + usb3;
//			}
//		}
	}
}

public class S16i4NestedClassStaticWithError {
	public static void main(String[] args) {

//	       // create an object of the static nested class
//	       MotherBoard.USB usb = new MotherBoard.USB();
//	       System.out.println("Total Ports = " + usb.getTotalPorts());
	   }
}
