public class PCClass extends GameSystems
{
	public PCClass(String p)
	{
		super(p);
	}
	public PCClass()
	{
		super();
	}
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	public String getPlatform()
	{
		return "PC";
	}
	public String toString()
	{
		return "Platform: " + this.getPlatform() + "\nSerial #: " + this.getSerialNo() + "\nSystem Input: " + this.systemInput();
	}
}
