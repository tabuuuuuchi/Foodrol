package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serialize {

	public static void seri(ArrayList<Food> list) {
		try {
			ObjectOutputStream objOutStream = new ObjectOutputStream(
					new FileOutputStream("src/model/Food.bin"));

			objOutStream.writeObject(list);
			objOutStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Food> deseri() {
		List<Food> list = new ArrayList<Food>();
		try {
			ObjectInputStream objInStream = new ObjectInputStream(
					new FileInputStream("src/model/Food.bin"));

			List<Food> list2 = (ArrayList<Food>) objInStream.readObject();
			list = list2;
			objInStream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return (ArrayList<Food>) list;
	}

}
