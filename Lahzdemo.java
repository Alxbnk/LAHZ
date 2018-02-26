public class Lahzdemo{

   public static void main(String[] args){
   
      //Make characters
      Animaldemo snake = new Animaldemo();
      Animaldemo rabbit = new Animaldemo();
   
      //Snake
      snake.setName("Snake");
      //snake.getSound();
   
      //Rabbit
      rabbit.setName("Rabbit");
      //rabbit.tell();
   
      //Here we call the methods the animals perform
      snake.moveX();
      snake.setY(9);
      snake.tell();
   
      rabbit.setX(2);
      rabbit.setY(2);
      rabbit.tell();
      
      snake.setX(8);
      snake.setY(8);
      snake.tell();
   
      rabbit.setX(3);
      rabbit.setY(3);
      rabbit.tell();
      
      snake.setX(7);
      snake.setY(7);
      snake.tell();
   
      rabbit.setX(4);
      rabbit.setY(4);
      rabbit.tell();
      
      snake.setX(6);
      snake.setY(6);
      snake.tell();
   
      rabbit.setX(5);
      rabbit.setY(5);
      rabbit.tell();
      
      rabbit.setSound("Rabbit: Noooo please dont eat me!");
      rabbit.getSound();
      
      snake.setX(5);
      snake.setY(5);
      snake.tell();
      
      snake.setSound("Snake: Ahhrrrr im eating you ha ha!");
      snake.getSound();
      
   
   }
   
}