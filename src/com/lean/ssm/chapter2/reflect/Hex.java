package com.lean.ssm.chapter2.reflect;

import java.io.File;
import java.util.*;

import net.mindview.util.BinaryFile;

public class Hex {

	public static String format(byte[] data){
		StringBuilder result=new StringBuilder();
		int n=0;
		for(byte b : data){
			if(n%16==0)
				result.append(String.format("%05X: ", n));
			result.append(String.format("%02X: ", n));
			n++;
			if(n%16==0) result.append("\n");
		}
		result.append("\n");
		return result.toString();
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		if(args.length==0)
			System.out.println(format(BinaryFile.read("Hex.class")));
		else
			System.out.println(format(BinaryFile.read(new File(args[0]))));
	}

}
