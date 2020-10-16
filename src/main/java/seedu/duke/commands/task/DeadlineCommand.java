package seedu.duke.commands.task;

import seedu.duke.commands.Command;
import seedu.duke.project.Project;
import seedu.duke.project.ProjectList;
import seedu.duke.task.Task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DeadlineCommand extends Command {
    private int projectIndex;
    private int taskIndex;
    private LocalDate date;

    public DeadlineCommand(int projectIndex, int taskIndex, LocalDate date) {
        this.projectIndex = projectIndex;
        this.taskIndex = taskIndex;
        this.date = date;
    }

    public String executeCommand(ProjectList projects) {
        Project project = projects.getProject(projectIndex);
        Task task = project.getTask(taskIndex);
        task.addDeadline(date);
        return "Deadline " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + " added to Task " + task.getDescription();
    }

    public Boolean isExit() {
        return false;
    }
}