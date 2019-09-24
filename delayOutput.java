import java.util.concurrent.TimeUnit;
class delayOutput
{
	public static void main(String args[])
	{
		
		int timeToWait = 10;
		System.out.print("Scanning");
		try{
			for(int i=0; i<timeToWait; i++){
				Thread.sleep(1000);
				System.out.print(".");
			}
		}catch (InterruptedException ie)
		{
			Thread.currentThread().interrupted();
		}
	}
}