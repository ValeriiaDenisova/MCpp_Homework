
public class Exercise_3_2 {

	public static void main(String[] args) {
		String[] srt_array = {"Happy", "Birthday", "to", "you", "", "my", "friend"};
		for(int i = 0; i < srt_array.length; i++){
			char [] ch = srt_array[i].toCharArray();
			ch[ch.length - 3] = '$';
			ch[ch.length - 2] = '$';
			ch[ch.length - 1] = '$';
			System.out.println(ch);
		}
		
	}
	
	String[] change3LastSimbol(String[] massString, int length) {
		if (massString == null) {
			throw new NullPointerException();
		}
		for (int i = 0; i < massString.length; i++) {
			if (massString[i].length() == length)
				massString[i] = massString[i].replaceAll("...$", "\\$");
		}
		return massString;
	}

}
