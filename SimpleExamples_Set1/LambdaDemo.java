package SimpleExamples;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*Game football=new Game(){
		 * public void play(){
				System.out.println("Football");}};*/
		Game football=()->
				System.out.println("Play Football");
		football.play();
		
		List<String> players=Arrays.asList("Sachin","Dhoni","Dravid","Sehwag");
		for(String player:players)
			if(player.equals("Sachin"))
			{
				System.out.println("Yes.in the team");
			}
		players.stream().filter(player->player.equals("Sachin")).forEach(player->System.out.println("in team"));
	}				
}
	interface Game
	{
		void play();
	}

