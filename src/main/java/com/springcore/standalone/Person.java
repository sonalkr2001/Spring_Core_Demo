package com.springcore.standalone;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> friend;
	private Map<String,String> feestructure;
	public Map<String, String> getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(Map<String, String> feestructure) {
		this.feestructure = feestructure;
	}

	public List<String> getFriend() {
		return friend;
	}

	public void setFriend(List<String> friend) {
		this.friend = friend;
	}

	@Override
	public String toString() {
		return "Person [friend=" + friend + ", feestructure=" + feestructure + "]";
	}
}
