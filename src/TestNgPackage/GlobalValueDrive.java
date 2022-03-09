  package TestNgPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValueDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//to read/drive the values from ".Properties file"
//first need to create "properties()" class file object 
// than you need to give knowledge of ".properties file" that is where it is present location
//right click on ".properties file" go to properties -copy the location
//to give the knowledge of file location we hhave to use class called "FileInputStream()"
	//inside FileInputStream() class provide/paste that ".properties file" location as arguments in "double coat and \\ back slash"
//now we provided the location of ".properties file" ,now to give that knowledge to properties file object "p"
// we have method in properties class i,e "load()"==p.load(fis)" provide the loaction stofed object in "load()"method as argument
// that is here 'fis' stores the location of ".properties file'
	//now to "Retrive the value from ".Properties file" we have method in "properties class called "getProperty()"
//in get property() bracket you need to mention which property you want to retrive 
	//like ex:browser=== p.getProperty("browser") === give property in "doublr coat" because property has "String values"
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\TestNgTutorial\\src\\data.properties");
		p.load(fis);
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("url"));
//to modify or change the properties values use method called " setProperty() " in properties class
//in setProperty() method excepts =key ,value
// here key=property name i,e browser and  value == value of property =firefox 
		p.setProperty("browser", "FireFox");
		System.out.println(p.getProperty("browser"));
//it will moddify in code only to "change value in properties file as well'
// use "FileOutputStream()" class this class is use to write the valuesinto the file
// FileOutputStream here also provide the location of file where you want to add it
//than we provided the location of "file where we want to add modified value" and stored in object called "fos"
// to put that value into the file we have method called "store()" in properties class
// store() method excepts outStream out i,e "fos " the location of path, than it except comment if you have you can give otherwise make it as "null"
		FileOutputStream fos=new FileOutputStream("C:\\Users\\ASUS\\eclipse-workspace\\TestNgTutorial\\src\\data.properties");
		p.store(fos, null);
		
		

	}

}
