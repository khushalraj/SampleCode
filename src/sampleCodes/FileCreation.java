package sampleCodes;

import PackageExample.PartyDo;



public class FileCreation {
	public static void main(String[] args) throws Exception {

FileUtil.createFile("D:\\0.Training\\Java\\","test.txt", "file created successfully!!");
           PartyDo partyDo = new PartyDo();
           System.out.println(partyDo.name);
           System.out.println(partyDo.date);
	}
}
