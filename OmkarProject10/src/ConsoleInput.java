
public class ConsoleInput {
public static String getString() {
try {
byte [] arrInput = new byte [100];
int length =System.in.read(arrInput);
byte [] arrFinal = new byte[length - 2];
System.arraycopy(arrInput, 0, arrFinal, 0, length-2);//without -2 error bex arrey is null
String data=new String(arrFinal);
return data;
}
catch(Exception e) {
e.printStackTrace();
}
return null;
}
//public static int getInteger() {             //as pn karata yetey
// String data=getString();
// int intData=Integer.parseInt(data);
// return intData;
//}

public static int getInteger() {
return Integer.parseInt(getString());      //as pn shoutcut karta yetey
}

//public static float getFloat() {
// return Float.parseFloat(getString());     //as pn karta yetey float asel tr
//}
}
