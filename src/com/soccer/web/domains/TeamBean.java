package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;

@Data

public class TeamBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String teamId, regionName, eTeamName, origY, zip1, zip2, address, ddd, tel, fax, homepage, owner, teamName;
}
