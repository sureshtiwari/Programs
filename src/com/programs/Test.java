package com.programs;

public class Test {

	public static void main(String[] args) {
		try{// TODO Auto-generated method stub
		String abort = "-1";
		String key = "1234";
		int operation = 2;
		String message = "Oppeeennnn";

		String result = "";
		int[] keyArray = new int[key.length()];
		for (int i = 0; i < key.length(); i++)
			keyArray[i] = key.charAt(i) - '0';

		int indexofkey = 0;
		if (operation == 2) {
			int i = 0;
			while (indexofkey < key.length() && i < message.length()) {
				char character = message.charAt(i);
				result = result + String.valueOf(character);
				int increment = keyArray[indexofkey];
				i = i + increment;
				indexofkey++;
			}
			if (i < message.length() && i>key.length()) {
				for(;i<message.length();i++)
					result = result + message.charAt(i);
			}
		}
		System.out.println(result);
		}catch (Exception e) {
			// TODO: handle exception
			String abort = "-1";
			return abort;
		}
	}

}
