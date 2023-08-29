package aggregation;

public class MusicSystem 
{
	int id;
	String modelName;
	String companyName;
	public MusicSystem(int id, String modelName, String companyName)
	{
		super();
		this.id = id;
		this.modelName = modelName;
		this.companyName = companyName;
	}
	@Override
	public String toString() 
	{
		StringBuilder builder = new StringBuilder();
		builder.append("MusicSystem [id=");
		builder.append(id);
		builder.append(", modelName=");
		builder.append(modelName);
		builder.append(", companyName=");
		builder.append(companyName);
		builder.append("]");
		return builder.toString();
	}
}