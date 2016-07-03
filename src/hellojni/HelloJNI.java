package hellojni;

import java.util.Enumeration;
import java.util.Properties;

public class HelloJNI {
   static {
      System.loadLibrary("hello"); // Load native library at runtime
                                   // hello.dll (Windows) or libhello.so (Unixes)
   }
 
   // Declare a native method sayHello() that receives nothing and returns void
   private native void sayHello();
 
   // Test Driver
   public static void main(String[] args) {
	   Properties p = System.getProperties();
	   Enumeration keys = p.keys();
	   while (keys.hasMoreElements()) {
		   String key = (String)keys.nextElement();
		   String value = (String)p.get(key);
		   System.out.println(key + ": " + value);
	   }
      new HelloJNI().sayHello();  // invoke the native method
   }
   
}