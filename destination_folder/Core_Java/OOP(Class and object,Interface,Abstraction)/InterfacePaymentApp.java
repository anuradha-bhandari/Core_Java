/*Q2. Create an interface Payment with a method pay(). Implement this interface in CreditCardPayment and PaypalPayment classes.*/

import java.util.*;
interface Payment
{
  String pay();
}

class CreditCardPayment implements Payment
{
   public String pay()
   {
	  return "Pay by Your Credit card";
   }
}

class PaypalPayment implements Payment
{
   public String pay()
   {
	  return "Pay by Your Paypal";
   }
}

public class InterfacePaymentApp
{
	public static void main(String x[])
	{
		Payment p;
		p=new CreditCardPayment();
		System.out.println(p.pay());
		
		p=new PaypalPayment();
		System.out.println(p.pay());

	}
}