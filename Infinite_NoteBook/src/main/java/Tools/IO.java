/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;
import java.io.*;
import java.util.ArrayList;
import Start.*;
import java.nio.charset.Charset;
import java.lang.System;

/**
 *
 * @author gzy
 */
public class IO {
    // file IO
    // ArrayList
    public boolean saveArrayList(String fileName, ArrayList list) throws FileNotFoundException {
        FileOutputStream fout= new FileOutputStream (fileName);
        ObjectOutputStream outputStream;
        try{
             outputStream = new ObjectOutputStream(fout);
        }
        catch(IOException e){
            return false;
        }
        try{
            outputStream.writeObject(list);
        }
        catch(IOException e){
            return false;
        }
        try{
            fout.close();
        }
        catch(IOException e){
            return true;
        }
        return true;
    }
    
    public ArrayList<MainWindow.BlockDocument> readBlockDocuments(String fileName) throws FileNotFoundException {
        FileInputStream fin= new FileInputStream (fileName);
        ObjectInputStream inputStream;
        ArrayList<MainWindow.BlockDocument> res;
        try{
            inputStream = new ObjectInputStream(fin);
        }
        catch(IOException e){
            return null;
        }
        try{
            res = (ArrayList<MainWindow.BlockDocument>)inputStream.readObject();
        }
        catch(Exception e){
            return null;
        }
        try{
            fin.close();
        }
        catch(IOException e){
            return res;
        }
        return res;
    }
    
    // terminal IO
    public static String getRunCmd(String cmdpath, String cmd) 
    {
	String result="";
	File dir = new File(cmdpath);
	try {
            Process ps = Runtime.getRuntime().exec(cmd, null, dir);
            BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream(), Charset.forName("GBK")));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
		result+=line+"\n";
            }
            br.close();
            ps.waitFor();
            return result;
	} catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
	}
	return null;
    }
}
