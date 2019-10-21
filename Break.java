
package break_continue;


public class Break {
    
    public void BreakExample(){
        
        int sum=0;
        int number=0;
        
        while(number<20){
            number++;
            sum+=number;
            if(sum>=100)
                break;
        }
            System.out.println("The number is " + number);
            System.out.println("The sum is " + sum);
    }
}