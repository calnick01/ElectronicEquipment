import java.util.Random;
import java.util.Scanner;
public class ElectronicEquipment
{
	private int weight;
	private int cost;
	private int powerUsage;
	private String manufacturer;
	private static String[] randomNames={"Sony", "Macintosh", "Microsoft", "Dell"};
	Scanner keyboard = new Scanner(System.in); 

	public ElectronicEquipment() 
	{ 
		weight= 0;
		cost= 0;
		powerUsage= 0;
		manufacturer= "";
	}	
	
	public int getWeight() 
	{		return weight;	}
	public void setWeight(int weight) 
	{		this.weight = weight;	}
	public int getCost() 
	{		return cost;	}
	public void setCost(int cost) 
	{		this.cost = cost;	}
	public int getPowerUsage() 
	{		return powerUsage;	}
	public void setPowerUsage(int powerUsage) 
	{		this.powerUsage = powerUsage;	}
	public String getManufacturer() 
	{		return manufacturer;	}
	public void setManufacturer(String manufacturer)
	{		this.manufacturer = manufacturer;	} 
	
	public String toString() 
	{
		return "\nElectronic Equipment: "
				+ "\n Weight: " + weight + " pounds."
				+ "\n Cost: " + cost + " dollars."
				+ "\n Power Usage: " + powerUsage + "W."
				+ "\n Manufacturer: " + manufacturer + ".";
	}
	public void randomElectronicEquipment()
	{
		System.out.println("\nRandom values will be used for the information."); 
		Random randomNumber = new Random();
		int random = (randomNumber.nextInt(9)*50)+400;
		int random2 = randomNumber.nextInt(10)+5;
		int random3 = (randomNumber.nextInt(40)*5)+50;
		int random4 = randomNumber.nextInt(4);
		weight=random2;
		cost=random3;
		powerUsage=random;
		manufacturer=randomNames[random4];
	}	
	public void customElectronicEquipment() 
	{	System.out.println("The weight?"); 
		weight = keyboard.nextInt(); 			
		System.out.println("The cost?");
		cost = keyboard.nextInt();
		System.out.println("The power usage?");
		powerUsage=keyboard.nextInt();
		System.out.println("The manufacturer?");
		manufacturer=keyboard.nextLine();
	}	
}

class Computer extends ElectronicEquipment
{
	private int usbSlots;
	private int cpuPower;
	private int ramSlots;
	private int ramPower;
	
	public Computer()
	{
		usbSlots=0;
		cpuPower=0;
		ramSlots=0;
		ramPower=0;
	}
	
	public int getUsbSlots()
	{		return usbSlots;	}
	public void setUsbSlots(int usbSlots) 
	{		this.usbSlots = usbSlots;
	}	public int getCpuPower()
	{		return cpuPower;	}
	public void setCpuPower(int cpuPower)
	{		this.cpuPower = cpuPower;	}
	public int getRamSlots() 
	{		return ramSlots;	}
	public void setRamSlots(int ramSlots) 
	{		this.ramSlots = ramSlots;	}
	public int getRamPower()
	{		return ramPower;	}
	public void setRamPower(int ramPower) 
	{		this.ramPower = ramPower;	}	
	
	public void randomComputer()
	{
		Random randomNumber = new Random();		
		System.out.println("Random values will be used for computer stats."); 
		int random = randomNumber.nextInt(5) + 4;
		int random2 = 2*(randomNumber.nextInt(3) + 1);
		int random3 = randomNumber.nextInt(4) + 1;
		int random4 = 2*(randomNumber.nextInt(3) + 1);
		usbSlots=random;
		cpuPower=random2;
		ramSlots=random3;
		ramPower=random4;
	}
	public void customComputer() 
	{	
		System.out.println("How many USB Slots?"); 
		usbSlots = keyboard.nextInt();	
		System.out.println("How much CPU Power?");
		cpuPower = keyboard.nextInt();
		System.out.println("How many Ram Slots?"); 
		ramSlots = keyboard.nextInt();
		System.out.println("How much Ram Power?");
		ramPower = keyboard.nextInt();
	}	
	public String toString() 
	{
		return super.toString() 
				+ "\nComputer info: "
				+ "\n USB Slots: " + usbSlots + " slots."
				+ "\n CPU Power: " + cpuPower + " ghz."
				+ "\n Ram Slots: " + ramSlots + " slots."
				+ "\n Ram Power: " + ramPower + " gigabytes.";
	}
}

class Monitor extends ElectronicEquipment
{
	private int screenSize;
	private String resolutionSize;
	private static String[] randomSizes={"800 x 600","1024 x 768","1280 x 960","1400 x 1050","1600 x 1200","1920 x 1080","2560 x 1440"};
	
	public Monitor()
	{
		screenSize=0;
		resolutionSize="";
	}
	
	public int getScreenSize()
	{		return screenSize;	}
	public void setScreenSize(int screenSize) 
	{		this.screenSize = screenSize;	}	
	public String getResolutionSize()
	{		return resolutionSize;	}
	public void setResolutionSize(String resolutionSize)
	{		this.resolutionSize = resolutionSize;	}
	
	public void randomMonitor()
	{
		Random randomNumber = new Random();		
		System.out.println("Random values will be used for Monitor stats."); 
		int random = randomNumber.nextInt(13) + 10;
		int random2 = randomNumber.nextInt(7);
		screenSize=random;
		resolutionSize=randomSizes[random2];
	}
	public void customMonitor() 
	{	
		System.out.println("How many inches is the Monitor?"); 
		screenSize = keyboard.nextInt();	
		System.out.println("How big is your Resolution Size?");
		resolutionSize = keyboard.nextLine();
	}	
	public String toString() 
	{
		return super.toString() 
				+ "\nMonitor info: "
				+ "\n Monitor Size: " + screenSize + " inches."
				+ "\n Resolution Size: " + resolutionSize+".";
	}
}