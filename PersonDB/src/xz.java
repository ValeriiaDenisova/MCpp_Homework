import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

public class xz {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		PersonDAO pd = null;
		// pd = new PersonDAO_H2();
		// pd = new PersonDAO_Mock();
		pd = new PersonDAO_MySQL();

		Person p = new Person(91, "Basik", "Kenov", 99);
		Person update_p = new Person(91, "NEW_FNAME", "NEW_LNAME", 100);

		// pd.create(p);
		List<Person> pp = pd.read();
		// System.out.println("Creat Basik Kenov");
		// print(pp);
		//
		// pd.update(update_p);
		// List<Person> pup = pd.read();
		// System.out.println("Update Basik Kenov");
		// print(pup);
		//
		// pd.delete(p);
		// List<Person> pdel = pd.read();
		// System.out.println("Delete Basik Kenov");
		// print(pdel);

		// saveFile_CSV(pp);
		// saveFile_JSON(pp);
		// saveFile_XML(pp);

		load_CSV();
		load_JSON();
		load_XML();

		printJSON(pp);
		printCSV(pp);
		printXML(pp);
	}

	public static void print(List<Person> pp) {
		for (Person p : pp) {
			System.out.println(p);
		}
	}

	public static void printJSON(List<Person> pp) {
		Gson gson = new Gson();
		String str = gson.toJson(pp);
		System.out.println(str);
	}
	
	public static void printCSV(List<Person> pp) {
		Gson gson = new Gson();
		String str = gson.toJson(pp);
		System.out.println(str);
	}
	
	public static void printXML(List<Person> pp) {
		Gson gson = new Gson();
		String str = gson.toJson(pp);
		System.out.println(str);
	}

	public static void saveFile_XML(List<Person> pp) {
		BufferedWriter bw = null;
		try {
			File file = new File("F:/workGit/File/MyFile.xml");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			for (Person p : pp) {
				bw.write(p.toXML());
			}
			bw.close();
			fw.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public static void saveFile_JSON(List<Person> pp) {
		BufferedWriter bw = null;
		try {
			File file = new File("F:/workGit/File/MyFile.json");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			for (Person p : pp) {
				bw.write(p.toJSON());
			}
			bw.close();
			fw.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public static void saveFile_CSV(List<Person> pp) {
		BufferedWriter bw = null;
		try {
			File file = new File("F:/workGit/File/MyFile.csv");
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			for (Person p : pp) {
				bw.write(p.toCSV());
			}
			bw.close();
			fw.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public static ArrayList<Person> load_XML() throws IOException {
		ArrayList<Person> pp = new ArrayList<Person>();
		Scanner scan = new Scanner(new File("F:/workGit/File/MyFile.xml"));
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
//ToDo
//			Person p = new Person(Integer.parseInt(lineArray[0]), lineArray[1], lineArray[2], Integer.parseInt(lineArray[3]));
//			pp.add(p);
		}
		scan.close();
		return pp;
	}

	public static ArrayList<Person> load_JSON() throws IOException {

		ArrayList<Person> pp = new ArrayList<Person>();
		Scanner scan = new Scanner(new File("F:/workGit/File/MyFile.json"));
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			line = line.substring(1, line.length() - 1);
			String[] lineArray = line.split(", ");
			for(int i = 0; i < lineArray.length; i++){
				lineArray[i] = lineArray[i].substring(lineArray[i].indexOf(" ") + 1);
			}
			Person p = new Person(Integer.parseInt(lineArray[0]), lineArray[1], lineArray[2], Integer.parseInt(lineArray[3]));
			pp.add(p);
		}
		scan.close();
		return pp;
	}

	public static ArrayList<Person> load_CSV() throws IOException {
		ArrayList<Person> pp = new ArrayList<Person>();
		Scanner scan = new Scanner(new File("F:/workGit/File/MyFile.csv"));
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] lineArray = line.split(", ");
			Person p = new Person(Integer.parseInt(lineArray[0]), lineArray[1], lineArray[2], Integer.parseInt(lineArray[3]));
			pp.add(p);
		}
		scan.close(); 
		return pp;
	}
}
