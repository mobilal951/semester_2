//Lab 5:Solution
//Name : Muhammad bilal
//Roll no : 034-BSCS-19-B



import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
public class WordCount {
	
	public static void main(String[] args) throws Exception {
		HashSet<String> hs=new HashSet<>();
		
		BufferedReader br=new BufferedReader(new FileReader("test.txt"));
        int totalLines=0;
        int totalWords=0;
		String line=br.readLine();
		while(line!=null) {
			if(!line.trim().equals("")) {
				String[] words=line.split(" ");
				totalWords=totalWords+words.length;
				
				for(String word:words) {
					uniqueWords=word.toLowerCase()
							.replace(".","")
							.replace(":", "")
							.replace("/", "")
							.replace(",","");
				hs.add(uniqueWords);
				}
			}
			totalLines++;
			line=br.readLine();
		}

		System.out.println("Total words:"+totalWords);
		System.out.println("size of Hashset:"+hs.size());
	}
	
	
	
	
}
