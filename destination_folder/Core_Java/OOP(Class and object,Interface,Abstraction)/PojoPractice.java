import java.util.*;
class Student
{
   int id,per;
   String name;
   double totalfees;
   
  void setId(int id)
  {
	this.id=id; 
  }  
  
  int getId()
  {
	return id;  
  }  
   void setName(String name)
  {
	this.name=name; 
  }  
  
  String getName()
  {
	return name;  
  }  
  
  void setPer(int per)
  {
	this.per=per; 
  }  
  
  int getPer()
  {
	return per;  
  } 

 void setTotalfees(double totalfees)
 {
	this.totalfees=totalfees; 
 }
  double getTotalfees()
  {
	 return totalfees; 
  }  
}
class Discountfees
{
	Student []st;
	double actualf,dis;
	void setStudent(Student ...st)
	{
	 this.st=st;	
	}
 
   void checkEligibility()
   {
	for(int i=0;i<st.length;i++)
    { 
    
	 actualf=st[i].getTotalfees();
     if(st[i].getPer()>60)
	 {
		dis=st[i].getTotalfees()*0.3;
         actualf=st[i].getTotalfees()-dis;		
	 }
   System.out.println("id is: "+st[i].getId()+"\nname is: "+st[i].getName()+"\npercentage: "+st[i].getPer()+"\ntotal fees: "+st[i].getTotalfees()+"\nactual fees: "+actualf+"\ndiscount: "+dis);	 
   }
  }
}
 public class PojoPractice
 {
  public static void main(String x[])
  {
	Discountfees d=new Discountfees();
	Student s=new Student();
	s.setId(1);
	s.setName("anu");
	s.setPer(40);
	s.setTotalfees(40000);
	
	
	Student s1=new Student();
	s.setId(2);
	s.setName("sejal");
	s.setPer(80);
	s.setTotalfees(40000);
	d.setStudent(s,s1);
	d.checkEligibility();
	
	
  
 }
}