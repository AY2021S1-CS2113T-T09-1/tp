package seedu.duke.commands.member;

import seedu.duke.commands.Command;
import seedu.duke.project.ProjectList;
import seedu.duke.member.TeamMemberList;

public class ListTeamMembersCommand extends Command {

    private String name;

    public ListTeamMembersCommand() {
    }

    public String executeCommand(ProjectList projects) {
        return TeamMemberList.listTeamMembers();
    }

    public Boolean isExit() {
        return false;
    }
}
