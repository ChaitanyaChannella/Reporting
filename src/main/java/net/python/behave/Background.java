package net.python.behave;

import net.python.behave.util.Util;

/**
 * Created by JALASOFT\paolo^lizarazu on 09-01-14.
 */
public class Background {
    private int totalScenarios;
    private int totalScenariosPassed;
    private int totalScenariosFailed;
    private int totalSteps;
    private int totalStepsPassed;
    private int totalStepsFailed;
    private int totalStepsSkipped;
    private int totalStepsPending;
    private double totalDuration;

    public Background() {
        totalScenarios = 0;
        totalScenariosPassed = 0;
        totalScenariosFailed = 0;
        totalSteps = 0;
        totalStepsPassed = 0;
        totalStepsFailed = 0;
        totalStepsSkipped = 0;
        totalStepsPending = 0;
        totalDuration = 0;
    }

    public int getTotalScenarios() {
        return totalScenarios;
    }
    public int addTotalScenarios(int add) {
        return totalScenarios+=add;
    }

    public int getTotalScenariosPassed() {
        return totalScenariosPassed;
    }

    public void addTotalScenariosPassed(int totalScenariosPassed) {
        this.totalScenariosPassed += totalScenariosPassed;
    }

    public int getTotalScenariosFailed() {
        return totalScenariosFailed;
    }

    public void addTotalScenariosFailed(int totalScenariosFailed) {
        this.totalScenariosFailed += totalScenariosFailed;
    }

    public int getTotalSteps() {
        return totalSteps;
    }

    public void addTotalSteps(int totalSteps) {
        this.totalSteps += totalSteps;
    }

    public int getTotalStepsPassed() {
        return totalStepsPassed;
    }

    public void addTotalStepsPassed(int totalStepsPassed) {
        this.totalStepsPassed += totalStepsPassed;
    }

    public int getTotalStepsFailed() {
        return totalStepsFailed;
    }

    public void addTotalStepsFailed(int totalStepsFailed) {
        this.totalStepsFailed += totalStepsFailed;
    }

    public int getTotalStepsSkipped() {
        return totalStepsSkipped;
    }

    public void addTotalStepsSkipped(int totalStepsSkipped) {
        this.totalStepsSkipped += totalStepsSkipped;
    }

    public int getTotalStepsPending() {
        return totalStepsPending;
    }

    public void addTotalStepsPending(int totalStepsPending) {
        this.totalStepsPending += totalStepsPending;
    }

    public String getTotalFormattedDuration() {
        return Util.formatDuration(totalDuration);
    }
    public double getTotalDuration() {
        return totalDuration;
    }

    public void addTotalDuration(Double totalDuration) {
        this.totalDuration += totalDuration;
    }
}
