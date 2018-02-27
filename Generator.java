public class Generator 
{
 int a = 1;
   public void move()
   {
     while(a <= 100)
      {
         int x = (int) (Math.random() * 9 + 1);
         int y = (int) (Math.random() * 9 + 1);
         int m = (int) (Math.random() * 9 + 1);
         int t = (int) (Math.random() * 9 + 1);
         System.out.println("Im the Rabbit and im standing on: " + x + ", " + m);
         System.out.println("Im the Snake and im standing on: " + y + ", " + l + "\n");
       
         if(((x + 1) == y || (x - 1) == y) && ((m + 1) == t || (m - 1) == t))
         {
         System.out.println("Rabbit: The Snake is getting close, get me out of here!\n");
         
         }
         a++;
         if(x == y && m == t){
         
         System.out.println("Rabbit: Noooo, please dont eat me!");
         System.out.println("Snake: Ahhrrrr im going to eat you ha ha!");
         
            break;
            

         }
         
         
      
      }
         System.out.println("If you played as the Snake its GAME OVER!");
         }
   
   }



