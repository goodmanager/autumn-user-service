package com.autumn.user.test;

import lombok.Data;

/**
 * 球员表现
 * 
 * @author felix
 */

@Data
public class Member {
	int personNum;
	String personName;
	String personPosition;
	int personType;
	int goals;
	int assists;
	int keyPass;
	int shots;
	int passes;
	int tackles;
	int tacklesConceded;
	int fouls;
	int foulsConceded;
	int offsides;
	int saves;
	int redCard;
	int yellowCard;
}
