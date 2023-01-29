package com.codurance.training.tasks.customClass;

public class ProjectExist {
    private Boolean projectExistValue;

    public ProjectExist(boolean projectExistValue) {
        this.projectExistValue = projectExistValue;
    }

    public boolean equals(ProjectExist otherProjectExist) {
        if (this.projectExistValue.compareTo(otherProjectExist.projectExistValue) == 0) {
            return true;
        }
        return false;
    }
}
