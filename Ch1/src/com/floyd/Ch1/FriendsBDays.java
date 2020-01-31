package com.floyd.Ch1;


import com.floyd.Ch1.Friends;
public class FriendsBDays {
	
	//Kevin
	//Eric
	//Calvin
	//Rick
	//Andrew
	
	public static void main(String[] args) {
		Friends [] friends = new Friends[5];
		
		friends[0] = new Friends("Kevin", "August 15th");
		friends[1] = new Friends("Eric", "December 10th");
		friends[2] = new Friends("Calvin", "July 23rd");
		friends[3] = new Friends("Rick", "February 2nd");
		friends[4] = new Friends("Andrew", "April 5th");
		
		for(int i = 0; i < friends.length; i++){
			friends[i].print();
		}
	}

}
