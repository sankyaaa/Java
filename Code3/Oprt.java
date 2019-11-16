package d2t3;

public class Oprt {
int base=2,power=3,number=1;

		public void power(int base, int index)
			{
			int i=1,temp=1;
				for(;i <= index; i++)
					temp*=base;
				System.out.println("result is " + temp);
			}

		public void findFactorial(int number)
		{
			int temp=1;
		while(number != 0)
				{
					temp=temp * (number--);
				}
		System.out.println("Factorial is "+ temp);
			
		}
		
		public void findTable(int number)
		{
			int i=1;
				while(i < 11) 
				{
					System.out.println(number*(i++));
				}
		}	
				
		public void findPrime(int number)
		{

				int i=2,flag=0;
			
							if(number == 1)
								{
									System.out.println(number+"is not prime!!!!!!!!");
									}
							
							else
								{
									for(;i<(number/2);++i)
										{
										if((number%i)==0)
											flag=1;
										
										}
								if(flag==1) {
									System.out.println(number+"is a not prime number");
								flag=0;}
								
								else
									System.out.println(number+"is  a prime number");
								}		
		}

}
