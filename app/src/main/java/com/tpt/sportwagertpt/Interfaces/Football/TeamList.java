package com.tpt.sportwagertpt.Interfaces.Football;

import com.tpt.sportwagertpt.Models.Football.TeamDetails;

import java.util.List;

public interface TeamList {
    List<TeamDetails> handleTeamListResult(List<TeamDetails> teamDetails);
}
