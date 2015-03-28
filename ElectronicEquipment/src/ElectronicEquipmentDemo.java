public class ElectronicEquipmentDemo 
{
	public static void main(String[] args) 
	{
		Monitor newMonitor = new Monitor();
		newMonitor.randomElectronicEquipment();
		newMonitor.randomMonitor();
		System.out.println(newMonitor);
		
		Computer newComputer = new Computer();
		newComputer.randomElectronicEquipment();
		newComputer.randomComputer();
		System.out.println(newComputer);
	}
}