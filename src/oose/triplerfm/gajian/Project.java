package oose.triplerfm.gajian;

import java.util.Date;

public class Project {
	private String id;
	private String name;
	private String description;
	private int progress;
	private int durationOpen;
	private Date startProject;
	private Date endProject;
	
	public Project(){
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public int getDurationOpen() {
		return durationOpen;
	}

	public void setDurationOpen(int durationOpen) {
		this.durationOpen = durationOpen;
	}

	public Date getStartProject() {
		return startProject;
	}

	public void setStartProject(Date startProject) {
		this.startProject = startProject;
	}

	public Date getEndProject() {
		return endProject;
	}

	public void setEndProject(Date endProject) {
		this.endProject = endProject;
	}
	
	
	
}
