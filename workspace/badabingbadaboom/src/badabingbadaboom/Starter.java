package badabingbadaboom;

public class Starter 
{
	public void shoot()
	{
		boolean weHaveBullets = true;
		int bulletAmount = 8;
		
		while (weHaveBullets == true)
		{
			bulletAmount = bulletAmount -1;
			System.out.println(bulletAmount);
			
			if (bulletAmount == 0)
			{
				weHaveBullets = false;
			}
			
		}
		
	}
}
