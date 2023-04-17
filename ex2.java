package day7;
import org.testng.Assert;
import org.testng.annotations.Test;
public class ex2 {
	int a=3,b=2,c=1;

	  @Test(priority=1)
	public void Product() {
		int product=a*b*c;
		System.out.println("Multiplication : "+ product);
		Assert.assertEquals(6, product);
	}
	  @Test(priority=4)
	public void Addition() {
		int add=a+b+c;
		System.out.println("Addition : "+ add);
		Assert.assertEquals(6, add);
	}
	  @Test(priority=3)
	public void Subtraction() {
		int sub=a-b-c;
		System.out.println("Subtract : "+ sub);
		Assert.assertEquals(0, sub);
	}
  @Test(priority=2)
  public void Division() {
		int div=(a+b)/c;
		System.out.println("Division : "+ div);
		Assert.assertEquals(5, div);
  }
}
