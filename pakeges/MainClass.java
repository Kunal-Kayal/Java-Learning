package pakeges;

import pakeges.*;
import pakeges.equipments.Ball;
import pakeges.players.FootballPlayer;

public class MainClass {

	public static void main(String[] args) {
		FootballPlayer player1 = new FootballPlayer();
		player1.name = "Kunal";
		player1.setHight(5.6f);
		System.out.println(player1.getHight());
	}

}
