public class Test{

  private int a = 0;
  private int b = 0;
  public void add(int a,int b){
    a = a+b;
    b = a-b;
  }

  public int getA()
  {
    return a;
  }

  public int getB()
  {
    return b;ss
  }

  public static void main(String[] args){
    
    Test a = new Test();
    a.add(2,5);
    System.out.println(a.getA()+":"+a.getB());
  }

}
