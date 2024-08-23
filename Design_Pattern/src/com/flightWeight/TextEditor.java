package com.flightWeight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Flyweight interface
interface CharacterFlyweight {
	void draw(int x, int y);
}

//Concrete Flyweight class
class CharacterConcreteFlyweight implements CharacterFlyweight {
	private String font;
	private int size;
	private String color;

	public CharacterConcreteFlyweight(String font, int size, String color) {
		this.font = font;
		this.size = size;
		this.color = color;
	}

	@Override
	public void draw(int x, int y) {
		System.out.println("Drawing character at (" + x + ", " + y + ") with font=" + font + ", size=" + size
				+ ", color=" + color);
	}
}

//Flyweight factory class
class CharacterFlyweightFactory {
	private static Map<String, CharacterFlyweight> flyweights = new HashMap<>();

	public static CharacterFlyweight getFlyweight(String font, int size, String color) {
		String key = font + "_" + size + "_" + color;
		if (!flyweights.containsKey(key)) {
			flyweights.put(key, new CharacterConcreteFlyweight(font, size, color));
		}
		return flyweights.get(key);
	}
}

//Client class
public class TextEditor {

	private List<CharacterFlyweight> characters = new ArrayList<>();

	public void addCharacter(int x, int y, String font, int size, String color) {
		CharacterFlyweight flyweight = null;

		try {
			flyweight = CharacterFlyweightFactory.getFlyweight(font, size, color);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		characters.add(flyweight);
		flyweight.draw(x, y);
	}

	public static void main(String[] args) {
		TextEditor textEditor = new TextEditor();
		textEditor.addCharacter(10, 20, "Arial", 12, "black");
		textEditor.addCharacter(30, 40, "Arial", 12, "black");
		textEditor.addCharacter(50, 60, "Times New Roman", 14, "red");
	}
}
