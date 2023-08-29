package aggregation;
class Car
{
	int carId;
	String modelName;
	long modelNo;
	String companyName;
	
	//car HAS-A MusicSystem
	MusicSystem musicSystem; //entity reference occurs for a class
	
	public Car(int carId,String modelName,long modelNo,String companyName, MusicSystem musicSystem) 
	{
		super();
		// TODO Auto-generated constructor stub
		this.carId = carId;
		this.modelName = modelName;
		this.modelNo = modelNo;
		this.companyName = companyName;
		this.musicSystem = musicSystem;
	}
	
	@Override
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Car [carId=");
		builder.append(carId);
		builder.append(", modelName=");
		builder.append(modelName);
		builder.append(", modelNo=");
		builder.append(modelNo);
		builder.append(", companyName=");
		builder.append(companyName);
		builder.append("]");
		return builder.toString();
	}

	public int getCarId() 
	{
		return carId;
	}
	public void setCarId(int carId) 
	{
		this.carId = carId;
	}
	public String getModelName() 
	{
		return modelName;
	}
	public void setModelName(String modelName) 
	{
		this.modelName = modelName;
	}
	public long getModelNo() 
	{
		return modelNo;
	}
	public void setModelNo(long modelNo) 
	{
		this.modelNo = modelNo;
	}
	public String getCompanyName() 
	{
		return companyName;
	}
	public void setCompanyName(String companyName) 
	{
		this.companyName = companyName;
	}
	public MusicSystem getMusicSystem() 
	{
		return musicSystem;
	}
	public void setMusicSystem(MusicSystem musicSystem) 
	{
		this.musicSystem = musicSystem;
	}
	public Car()
	{
		super();
	}
}

public class AggregationDemo1 
{
	public static void main(String[] args)
	{
		MusicSystem m1 = new MusicSystem(1, "af004e", "Sony");
		MusicSystem m2 = new MusicSystem(2, "bf8904t", "JBL");
		MusicSystem m3 = new MusicSystem(3, "af5604e", "Boat");
		
		Car c1 = new Car(3456, "Eon", 87900, "Hyundi", m1);
		Car c2 = new Car(6789, "I10", 78945, "Hyunday", m3);
		Car c3 = new Car(6459, "I20", 776545, "Hyunday", m2);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}