public class CreditCard {

   Money balance;
   Money creditLimit;
   Person owner;

   public CreditCard(Person newCardHolder, Money limit)
   {
	   	creditLimit = limit;
	   	owner = newCardHolder;
	   	balance = new Money(0);
   }
   
   public Money getBalance()
   {
   		return new Money(balance);
   }

   public Money getCreditLimit()
   {
   		return new Money(creditLimit);
   }

   public String getPersonals()
   {
   		return owner.toString();
   }

   public void charge(Money amount)
   {
	   Money money = new Money(balance.add(amount));
	   if(money.compareTo(creditLimit) > 0)
	   {
	   		System.out.println("Exceeds credit limit");
	   }
	   else {
		   balance = money;
		   System.out.println("Charge: " + amount);
	   }
   }
   
   public void payment(Money amount)
   {
	   System.out.println("Payment: " + amount);
	   balance = balance.subtract(amount);
   }
}
