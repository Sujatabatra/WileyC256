package com.demo.copy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FrequencyMain {
	
	public static void main(String[] args) throws FileNotFoundException {
		Frequency f = new Frequency();
		try(FileWriter fileWriter=new FileWriter("FrequencyCount");){
			
			String str="If you're looking for random paragraphs, you've come to the right place. When a random word or a random sentence isn't quite enough, the next logical step is to find a random paragraph. We created the Random Paragraph Generator with you in mind. The process is quite simple. Choose the number of random paragraphs you'd like to see and click the button. Your chosen number of paragraphs will instantly appear.\r\n"
					+ "While it may not be obvious to everyone, there are a number of reasons creating random paragraphs can be useful. A few examples of how some people use this generator are listed in the following paragraphs.\r\n"
					+ "Generating random paragraphs can be an excellent way for writers to get their creative flow going at the beginning of the day. The writer has no idea what topic the random paragraph will be about when it appears. This forces the writer to use creativity to complete one of three common writing challenges. The writer can use the paragraph as the first one of a short story and build upon it. A second option is to use the random paragraph somewhere in a short story they create. The third option is to have the random paragraph be the ending paragraph in a short story. No matter which of these challenges is undertaken, the writer is forced to use creativity to incorporate the paragraph into their writing.\r\n"
					+ "";
			fileWriter.write(str);
			System.out.println("File Created");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedReader b = new BufferedReader(new FileReader("FrequencyCount"));
			String word = null;
			String wordArr[] =null;
			while((word = b.readLine())!=null) {
				wordArr=word.split(("[, . ' / * @ # $ % ^ & < > ? : ; | \\n \\r]+"));
				 for(String e:wordArr) {
					 f.insert(e);
				 }
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f.inorderTraversal();		

	}

}







//String file = "FrequencyCount";
//Scanner scanner = new Scanner(new File(file));
//scanner.useDelimiter(",|\\r\\n");
//
//while(scanner.hasNext()){
//  f.insert(scanner.next().split(" "));
//}
//scanner.close();
//f.inorderTraversal();