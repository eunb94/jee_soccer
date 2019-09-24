package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;

@Data

public class PlayerBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String pId, pName, ePlayerName, nickName, joinY, position, nation, solar, height, weight, backNo, bDate, teamId;

}
