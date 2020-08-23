package com.autumn.user.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 球员表现
 * 
 * @author felix
 *
 */
public class Test1 {

	public static void main(String[] args) {
		String jsonStr = "{\"code\":\"00000\",\"data\":{\"list\":[{\"personNum\":5,\"personName\":\"张琳芃\",\"personPosition\":\"后卫\",\"personType\":1,\"goals\":0,\"assists\":0,\"keyPass\":0,\"shots\":1,\"passes\":22,\"tackles\":1,\"tacklesConceded\":0,\"fouls\":1,\"foulsConceded\":2,\"offsides\":0,\"saves\":0,\"redCard\":1,\"yellowCard\":0},{\"personNum\":36,\"personName\":\"何超\",\"personPosition\":\"中场\",\"personType\":1,\"goals\":0,\"assists\":0,\"keyPass\":0,\"shots\":0,\"passes\":27,\"tackles\":0,\"tacklesConceded\":0,\"fouls\":3,\"foulsConceded\":2,\"offsides\":0,\"saves\":0,\"redCard\":0,\"yellowCard\":1},{\"personNum\":32,\"personName\":\"刘殿座\",\"personPosition\":\"门将\",\"personType\":1,\"goals\":0,\"assists\":0,\"keyPass\":0,\"shots\":0,\"passes\":15,\"tackles\":0,\"tacklesConceded\":0,\"fouls\":0,\"foulsConceded\":0,\"offsides\":0,\"saves\":3,\"redCard\":0,\"yellowCard\":0},{\"personNum\":26,\"personName\":\"塔利斯卡\",\"personPosition\":\"中场\",\"personType\":1,\"goals\":0,\"assists\":0,\"keyPass\":1,\"shots\":1,\"passes\":25,\"tackles\":0,\"tacklesConceded\":0,\"fouls\":2,\"foulsConceded\":2,\"offsides\":0,\"saves\":0,\"redCard\":0,\"yellowCard\":0},{\"personNum\":3,\"personName\":\"梅方\",\"personPosition\":\"后卫\",\"personType\":1,\"goals\":0,\"assists\":0,\"keyPass\":0,\"shots\":0,\"passes\":39,\"tackles\":1,\"tacklesConceded\":0,\"fouls\":1,\"foulsConceded\":1,\"offsides\":0,\"saves\":0,\"redCard\":0,\"yellowCard\":1},{\"personNum\":25,\"personName\":\"邓涵文\",\"personPosition\":\"后卫\",\"personType\":2,\"goals\":0,\"assists\":0,\"keyPass\":0,\"shots\":0,\"passes\":24,\"tackles\":2,\"tacklesConceded\":1,\"fouls\":0,\"foulsConceded\":0,\"offsides\":0,\"saves\":0,\"redCard\":0,\"yellowCard\":0},{\"personNum\":2,\"personName\":\"蒋光太\",\"personPosition\":\"后卫\",\"personType\":1,\"goals\":0,\"assists\":0,\"keyPass\":0,\"shots\":0,\"passes\":41,\"tackles\":2,\"tacklesConceded\":0,\"fouls\":1,\"foulsConceded\":1,\"offsides\":0,\"saves\":0,\"redCard\":0,\"yellowCard\":0},{\"personNum\":10,\"personName\":\"郑智\",\"personPosition\":\"中场\",\"personType\":2,\"goals\":0,\"assists\":0,\"keyPass\":0,\"shots\":0,\"passes\":20,\"tackles\":0,\"tacklesConceded\":0,\"fouls\":1,\"foulsConceded\":1,\"offsides\":0,\"saves\":0,\"redCard\":0,\"yellowCard\":0},{\"personNum\":19,\"personName\":\"费南多\",\"personPosition\":\"前锋\",\"personType\":2,\"goals\":0,\"assists\":0,\"keyPass\":0,\"shots\":0,\"passes\":7,\"tackles\":0,\"tacklesConceded\":2,\"fouls\":2,\"foulsConceded\":2,\"offsides\":0,\"saves\":0,\"redCard\":0,\"yellowCard\":0},{\"personNum\":8,\"personName\":\"保利尼奥\",\"personPosition\":\"中场\",\"personType\":1,\"goals\":1,\"assists\":0,\"keyPass\":2,\"shots\":3,\"passes\":38,\"tackles\":3,\"tacklesConceded\":6,\"fouls\":2,\"foulsConceded\":1,\"offsides\":1,\"saves\":0,\"redCard\":0,\"yellowCard\":0},{\"personNum\":15,\"personName\":\"严鼎皓\",\"personPosition\":\"中场\",\"personType\":1,\"goals\":0,\"assists\":0,\"keyPass\":0,\"shots\":0,\"passes\":39,\"tackles\":0,\"tacklesConceded\":0,\"fouls\":3,\"foulsConceded\":0,\"offsides\":0,\"saves\":0,\"redCard\":0,\"yellowCard\":0},{\"personNum\":27,\"personName\":\"吴少聪\",\"personPosition\":\"后卫\",\"personType\":2,\"goals\":0,\"assists\":0,\"keyPass\":0,\"shots\":0,\"passes\":0,\"tackles\":0,\"tacklesConceded\":0,\"fouls\":0,\"foulsConceded\":0,\"offsides\":0,\"saves\":0,\"redCard\":0,\"yellowCard\":0},{\"personNum\":33,\"personName\":\"钟义浩\",\"personPosition\":\"中场\",\"personType\":2,\"goals\":0,\"assists\":0,\"keyPass\":0,\"shots\":1,\"passes\":3,\"tackles\":0,\"tacklesConceded\":0,\"fouls\":0,\"foulsConceded\":0,\"offsides\":0,\"saves\":0,\"redCard\":0,\"yellowCard\":0},{\"personNum\":23,\"personName\":\"朴志洙\",\"personPosition\":\"后卫\",\"personType\":1,\"goals\":0,\"assists\":0,\"keyPass\":0,\"shots\":0,\"passes\":41,\"tackles\":0,\"tacklesConceded\":0,\"fouls\":1,\"foulsConceded\":2,\"offsides\":0,\"saves\":0,\"redCard\":0,\"yellowCard\":1},{\"personNum\":9,\"personName\":\"艾克森\",\"personPosition\":\"前锋\",\"personType\":1,\"goals\":1,\"assists\":0,\"keyPass\":1,\"shots\":2,\"passes\":30,\"tackles\":2,\"tacklesConceded\":2,\"fouls\":0,\"foulsConceded\":3,\"offsides\":0,\"saves\":0,\"redCard\":0,\"yellowCard\":0},{\"personNum\":17,\"personName\":\"杨立瑜\",\"personPosition\":\"前锋\",\"personType\":1,\"goals\":0,\"assists\":0,\"keyPass\":1,\"shots\":1,\"passes\":29,\"tackles\":1,\"tacklesConceded\":0,\"fouls\":0,\"foulsConceded\":2,\"offsides\":0,\"saves\":0,\"redCard\":0,\"yellowCard\":0}]},\"message\":\"\"}";

		JSONObject jsonObject = JSON.parseObject(jsonStr);
		JSONObject jsonObject1 = jsonObject.getJSONObject("data");
		List<Member> members = JSON.parseArray(jsonObject1.getJSONArray("list").toJSONString(), Member.class);

		List<Member> memberList = members.stream().sorted(Comparator.comparing(Member::getPersonNum))
				.collect(Collectors.toList());
		System.err.println(JSON.toJSONString(memberList));
	}
}
