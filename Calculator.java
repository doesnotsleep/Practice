
package Practice;

import java.util.Scanner;


public class Calculator {
   static Scanner scan = new Scanner(System.in);
    
    
        
        public static int getnumber(){
        System.out.println("Введите  число: ");
        int a;
        if (scan.hasNextInt()){
        a = scan.nextInt();
        }
        else {
            System.out.println("Ошибка при вводе, попробуйте еще раз ");
        scan.next();
       a = getnumber();}
       
       return a;
  }
       public static char getdoit (){
           System.out.println("Ведите арефметическое действие ");
           char doit;
           if(scan.hasNext()){
           doit = scan.next().charAt(0);
           }
           else{
               System.out.println("Вы ввели не корректное действие, попробуйте снова ");
           scan.next();
           doit = getdoit(); }
           return doit;
       }
       public static int count(int a1, int a2, char doit){
       int result;
       switch(doit){
           case '+':
                result = a1 + a2;
                break;
           case '-':
               result = a1 - a2;
               break;
           case '*':
               result = a1 * a2;
               break;
           case '/':
               result = a1 / a2;
               break;
           
           default:
                          
               System.out.println("Вы допустили ошибку при вводе, попробуйте повторить ввод.");
               result = count (a1, a2, getdoit());
              }
       return result;
       }
   
}     
class CalculatorTest{
  
    public static void main(String[] args) {
  
    do{ 
        int a1 = Calculator.getnumber();
      int a2 = Calculator.getnumber();
      char doit = Calculator.getdoit();
      int result = Calculator.count(a1, a2, doit);
        System.out.println("Результат дествий над введенныи вами числами равен: " + result);
              
      
      
    }
    while (true );
    
}

}
    

