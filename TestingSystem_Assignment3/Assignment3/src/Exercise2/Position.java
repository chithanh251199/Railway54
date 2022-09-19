package Exercise2;

public class Position {
	public int id;

	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + "]";
	}

	public PositionName name;

	public enum PositionName {
		Dev, Test, Scrum_Master, PM
	}
}
