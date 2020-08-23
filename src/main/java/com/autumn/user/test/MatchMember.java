package com.autumn.user.test;

import lombok.Data;

/**
 * 本场阵容
 * 
 * @author felix
 */
@Data
public class MatchMember {

	int personId;
	String personNameCn;
	String personNameEn;
	int personNum;
	int personType;
	String position;
	int positionX;
	int positionY;
	int teamId;
	int goal;
	String eventTime;
	int changeDown;
	int changeUp;
	int yellowCard;
	int redCard;
	String changeUpTime;
	String changeDownTime;
}
