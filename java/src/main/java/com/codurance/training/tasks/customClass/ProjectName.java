package com.codurance.training.tasks.customClass;

public class ProjectName {
    private String value;

    public ProjectName(String value) {
        this.value = value;    
    }

    public String toString() {
        return this.value;
    }

    public boolean equals(ProjectName otherProjectName) {
        return this.value == otherProjectName.value;
    }


}
