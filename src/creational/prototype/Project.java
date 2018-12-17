package creational.prototype;

public class Project implements Copyable {
    private int id;
    private String projectName;
    private String source;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Project(int id, String projectName, String source) {
        this.id = id;
        this.projectName = projectName;
        this.source = source;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", source='" + source + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        Project p = new Project(id, projectName, source);
        return p;
    }
}
