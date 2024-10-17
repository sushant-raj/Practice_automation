package Aggregation;

public class Application {

	Customer c;
	public void appMethod(Customer c)
	{
		this.c = c;
	}
	private String appName;
	private int appSize;
	
	Application(String appName, int appSize){
		
		setAppName(appName);
		setAppSize(appSize);
		
	}
	
	public void setAppName(String appName)
	{
		this.appName = appName;
	}
	public String getAppName()
	{
		return appName;
	}
	
	public void setAppSize(int appSize)
	{
		this.appSize = appSize;
	}
	public int getAppSize()
	{
		return appSize;
	}
}
