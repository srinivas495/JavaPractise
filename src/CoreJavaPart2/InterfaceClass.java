package CoreJavaPart2;

public class InterfaceClass implements InterfaceAggement,InterfaceAggement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		InterfaceAggement ia = new InterfaceClass();
		ia.greenGo();
		ia.redStop();
		ia.yellowWaitt();
		InterfaceClass ic = new InterfaceClass();
		ic.greenGo();
		
		
		
	}
	
	public void goWalk() {
		System.out.println("it implemented goWalk");
		
	}
	@Override
	public void greenGo() {
		System.out.println("it implemented green Go");
		
	}

	@Override
	public void redStop() {
		System.out.println("it implemented red Stop");
		
	}

	@Override
	public void yellowWaitt() {
		System.out.println("it implemented yello Waitting");
		
	}

	@Override
	public void TraingreenGo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TrainredStop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TrainyellowWaitt() {
		// TODO Auto-generated method stub
		
	}

}
