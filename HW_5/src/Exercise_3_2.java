
public class Exercise_3_2 {

	public static void main(String[] args) {
		String[] srt_array = {"Tanned", "cancel", "canvas", "bangle"};
		for(int i = 0; i < srt_array.length; i++){
			char [] ch = srt_array[i].toCharArray();
			ch[ch.length - 3] = '$';
			ch[ch.length - 2] = '$';
			ch[ch.length - 1] = '$';
			System.out.println(ch);
		}
		
	}

}
