package com.infly.carparking.bis;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateNptNum {

	public int createNum() {
		List<String> numList = new ArrayList<String>();
		String num = "";
		for (int i = 0; i < 10; i++) {
			num += createOne(numList);
		}
		num = num.substring(3);
		return Integer.parseInt(num);
	}

	public String createOne(List<String> numList) {
		String oneNumString = "";
		Random r = new Random();
		Integer oneNumInt = r.nextInt(10);
		if (!numList.contains(oneNumInt.toString())) {
			oneNumString = oneNumInt.toString();
			numList.add(oneNumString);
		} else {
			oneNumString = createOne(numList);
		}
		return oneNumString;
	}
}
