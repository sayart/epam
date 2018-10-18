package com.gmail.slartua.toys.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.gmail.slartua.toys.entity.*;

public class GameRoomModel<E extends Toy> {
	private ArrayList<E> gameRoom;

	public GameRoomModel() {
		super();
	}

	public ArrayList<E> getGameRoom() {
		return gameRoom;
	}

	public void setGameRoom(ArrayList<E> gameRoom) {
		this.gameRoom = gameRoom;
	}

	public ArrayList<E> sortFromAge(int age) {
		ArrayList<E> temp = new ArrayList<>();
		for (int i = 0; i < gameRoom.size(); i++) {
			if (gameRoom.get(i).getAgeFrom() >= age) {
				temp.add(gameRoom.get(i));
			}
		}
		Collections.sort(temp, new Comparator<E>() {
			@Override
			public int compare(E toyOne, E toyTwo) {
				if (toyOne != null && toyTwo == null) {
					return 1;
				}
				if (toyOne == null && toyTwo != null) {
					return -1;
				}
				if (toyOne == null && toyTwo == null) {
					return 0;
				}
				return (toyOne.getPrice() > toyTwo.getPrice()) ? -1 : 1;
			}

		});
		return temp;
	}

	public double totalPrice() {
		double totalPrice = 0;
		for (E e : gameRoom) {
			totalPrice += e.getPrice();
		}
		return totalPrice;
	}

	public ArrayList<E> sortByPrice(int from, int to) {
		ArrayList<E> temp = new ArrayList<>();
		for (E e : gameRoom) {
			if (e.getPrice() >= from && e.getPrice() <= to) {
				temp.add(e);
			}
		}
		return temp;
	}

}
