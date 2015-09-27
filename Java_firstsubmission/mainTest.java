package test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileReader;


public class mainTest {

	public static void main(String[] args) throws  IOException
	{
        BufferedReader reader = null;
        PrintWriter outputStream = null;
        ArrayList<String> rows = new ArrayList<String>();

        try {
            reader  = new BufferedReader(new FileReader("unsortedfile.txt"));
            outputStream = new PrintWriter(new FileWriter("sortedAndUnique.txt"));

            String file_prev_content = "";
            int totalLineContent;
            totalLineContent = Integer.parseInt(reader.readLine());
            while (!(totalLineContent<=0)){
                rows.add(reader .readLine());
                totalLineContent--;                
            }
            Collections.sort(rows);
            String[] strArr= rows.toArray(new String[0]);
            for (String cur : strArr){
            	if(!cur.equalsIgnoreCase(file_prev_content))
            	{outputStream.println(cur);}
            	file_prev_content = cur;
            }
                
        } finally {
            if (reader  != null) {
                reader.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
	
}


//String file;
//(file = reader .readLine()) != null) {
