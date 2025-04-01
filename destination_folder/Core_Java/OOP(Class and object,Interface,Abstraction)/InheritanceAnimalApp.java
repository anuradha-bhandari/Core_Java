abstract class Animal
{
 abstract void makeSound();
}
class Dog extends Animal
{
  void makeSound()
  {
   System.out.println("Dog------->Bark");
  }
}
class Cat extends Animal
{
void makeSound()
  {
   System.out.println("Cat-------> mau");
  }
}
public class InheritanceAnimalApp
{
public static void main(String x[])
{
  Dog a=new Dog();
  a.makeSound();
  
  Cat c=new Cat();
  c.makeSound();
}
}