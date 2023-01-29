package com.codurance.training.tasks.customClass;

public class ProjectExist {
    private boolean projectExistValue;

    public ProjectExist(boolean projectExistValue) {
        this.projectExistValue = projectExistValue;
    }

    public boolean equals(ProjectExist otherProjectExist) {
        return this.projectExistValue == otherProjectExist.projectExistValue;
    }
}
