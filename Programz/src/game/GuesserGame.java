package game;

import java.util.Scanner;
class  Guesser
{
	int gnum;
	int guessNum()
	{
		System.out.println("Guesser enter number:");
		Scanner scan=new Scanner(System.in);
		gnum=scan.nextInt();
		return gnum;
	}
}
class Player
{
	
	int pnum;
	int guessNum()
	{
		System.out.println("Player enter number");
		Scanner scan=new Scanner(System.in);
		pnum=scan.nextInt();
		return pnum;
	}
}
class Umpire
{
	int nofromguesser;
	int nofromplayer1;
	int nofromplayer2;
	int nofromplayer3;
	void guesserNum()
	{
		Guesser g=new Guesser();
		nofromguesser=g.guessNum();
	}
	void playerNum()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		nofromplayer1=p1.guessNum();
		nofromplayer2=p2.guessNum();
		nofromplayer3=p3.guessNum();
	}
	void compare()
	{
		if(nofromguesser==nofromplayer1)
		{
			System.out.println("Player1 won");
		}
		else if(nofromguesser==nofromplayer2)
		{
			System.out.println("Player2 won");
		}
		else if(nofromguesser==nofromplayer3)
		{
			System.out.println("Player3 won");
		}
		else
		{
			System.out.println("Game lost,try again");
		}
	}
}
class GuesserGame
{
	public static void main(String[] args) 
	{
		Umpire u=new Umpire();
		u.guesserNum();
		u.playerNum();
		u.compare();
	}
}