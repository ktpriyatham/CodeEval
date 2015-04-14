package moderate;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.nio.ByteOrder;

public class Endianness{
	public static void main(String[] args) {

		if(ByteOrder.nativeOrder().toString().equals(ByteOrder.BIG_ENDIAN.toString())){
			System.out.println("BigEndian");
			return;
		}
		System.out.println("LittleEndian");
	}
}